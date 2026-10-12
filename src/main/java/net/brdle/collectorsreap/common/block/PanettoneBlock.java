package net.brdle.collectorsreap.common.block;

import net.brdle.collectorsreap.common.config.CRConfig;
import net.brdle.collectorsreap.data.CRMobEffectTags;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.event.EventHooks;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.utility.ItemUtils;
import java.util.List;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public class PanettoneBlock extends Block {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 3);
	protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);

	public final Supplier<Item> slice;

	public PanettoneBlock(Properties properties, Supplier<Item> slice) {
		super(properties);
		this.slice = slice;
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(FACING, Direction.NORTH)
			.setValue(BITES, 0)
		);
	}

	public ItemStack getSliceItem() {
		return new ItemStack(this.slice.get());
	}

	public int getMaxBites() {
		return 4;
	}

	@Override
	public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
		return SHAPE;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, BITES);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
	}

	@Override
	public @NotNull ItemInteractionResult useItemOn(ItemStack stack, @NotNull BlockState state, Level level, @NotNull BlockPos pos, Player player, InteractionHand hand, @NotNull BlockHitResult hit) {
		ItemStack heldStack = player.getItemInHand(hand);
		if (level.isClientSide()) {
			if (heldStack.is(CommonTags.Items.TOOLS_KNIFE)) {
				return cutSlice(level, pos, state, player);
			}
			if (this.consumeBite(level, pos, state, player) == InteractionResult.SUCCESS) {
				return ItemInteractionResult.SUCCESS;
			}
			if (heldStack.isEmpty()) {
				return ItemInteractionResult.CONSUME;
			}
		}
		if (heldStack.is(CommonTags.Items.TOOLS_KNIFE)) {
			return cutSlice(level, pos, state, player);
		}
		return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
	}

	@Override
	public @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult result) {
		return consumeBite(level, pos, state, player);
	}

	/**
	 * Eats a slice from the panettone, feeding the player.
	 */
	protected InteractionResult consumeBite(Level level, BlockPos pos, BlockState state, Player player) {
		if (!player.canEat(false)) {
			return InteractionResult.PASS;
		} else {
			ItemStack sliceStack = this.getSliceItem();
			ItemStack sliceCopy = sliceStack.copy();
			FoodProperties sliceFood = sliceStack.getFoodProperties(player);
			if (sliceFood != null) {
				player.getFoodData().eat(sliceFood);
			}
			// Fire an event for food-tracking mods like Spice of Life, but ignore the result.
			EventHooks.onItemUseFinish(player, sliceCopy, 0, ItemStack.EMPTY);
			if (this.getSliceItem().getItem().getDefaultInstance().getComponents().has(DataComponents.FOOD) && sliceFood != null) {
				for (FoodProperties.PossibleEffect effect : sliceFood.effects()) {
					if (
						!level.isClientSide()
					) {
						effect.effect();
						if (level.getRandom().nextFloat() < effect.probability()) {
							player.addEffect(new MobEffectInstance(effect.effect()));
						}
					}
				}
			}

			int bites = state.getValue(BITES);
			if (bites < getMaxBites() - 1) {
				level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
			} else {
				level.removeBlock(pos, false);
			}
			level.playSound(null, pos, SoundEvents.GENERIC_EAT, SoundSource.PLAYERS, 0.8F, 0.8F);
			return InteractionResult.SUCCESS;
		}
	}

	/**
	 * Cuts off a bite and drops a slice item, without feeding the player.
	 */
	protected ItemInteractionResult cutSlice(Level level, BlockPos pos, BlockState state, Player player) {
		int bites = state.getValue(BITES);
		if (bites < getMaxBites() - 1) {
			level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
		} else {
			level.removeBlock(pos, false);
		}
		final Direction direction = player.getDirection().getOpposite();
		ItemUtils.spawnItemEntity(
			level,
			this.getSliceItem(),
			pos.getX() + 0.5,
			pos.getY() + 0.3,
			pos.getZ() + 0.5,
			direction.getStepX() * 0.15, 0.05,
			direction.getStepZ() * 0.15
		);
		level.playSound(null, pos, SoundEvents.WOOL_BREAK, SoundSource.PLAYERS, 0.8F, 0.8F);
		return ItemInteractionResult.SUCCESS;
	}

	@Override
	public @NotNull BlockState updateShape(@NotNull BlockState stateIn, @NotNull Direction facing, @NotNull BlockState facingState, @NotNull LevelAccessor level, @NotNull BlockPos currentPos, @NotNull BlockPos facingPos) {
		return facing == Direction.DOWN && !stateIn.canSurvive(level, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
	}

	@Override
	public boolean canSurvive(@NotNull BlockState state, LevelReader level, BlockPos pos) {
		return level.getBlockState(pos.below()).isSolid();
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, @NotNull Level level, @NotNull BlockPos pos) {
		return getMaxBites() - blockState.getValue(BITES);
	}

	@Override
	public boolean hasAnalogOutputSignal(@NotNull BlockState state) {
		return true;
	}

	@Override
	public boolean isPathfindable(@NotNull BlockState state, @NotNull PathComputationType type) {
		return false;
	}

	public static void addRandomBuff(@NotNull LivingEntity consumer) {
		if (!consumer.level().isClientSide()) {
			final int BUFF_LENGTH = CRConfig.PANETTONE_DURATION.get(); // Length in seconds
			if (BUFF_LENGTH > 0) {
				final List<MobEffect> buffs = BuiltInRegistries.MOB_EFFECT.stream()
					.filter(effect -> (
						!BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect).is(CRMobEffectTags.UNOBTAINABLE_FROM_PANETTONE) &&
						!consumer.hasEffect(BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect)) &&
						effect.isBeneficial() &&
						!effect.isInstantenous()
					)).toList();
				if (buffs.isEmpty()) {
					consumer.heal(1F);
				} else {
					consumer.addEffect(new MobEffectInstance(
						BuiltInRegistries.MOB_EFFECT.wrapAsHolder(buffs.get(consumer.getRandom().nextInt(buffs.size()))),
						BUFF_LENGTH * 20,
						0
					));
				}
			}
		}
	}
}