package net.brdle.collectorsreap.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.CommonTags;

import java.util.function.Supplier;

public class EffectCakeBlock extends CakeBlock {

	private final Supplier<Item> slice;

	public EffectCakeBlock(Properties prop, Supplier<Item> slice) {
		super(prop);
		this.slice = slice;
	}

	public static void addEatEffect(ItemStack pFood, Level pLevel, Player p) {
		Item item = pFood.getItem();
		if (item.getDefaultInstance().getComponents().has(DataComponents.FOOD) && pFood.getFoodProperties(p) != null) {
			for (FoodProperties.PossibleEffect effect : pFood.getFoodProperties(p).effects()) {
				if (!pLevel.isClientSide && effect.effect() != null && pLevel.random.nextFloat() < effect.probability()) {
					p.addEffect(new MobEffectInstance(effect.effect()));
				}
			}
		}
	}

	public Item getSlice() {
		return slice.get();
	}

	@Override
	public @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
		ItemStack itemstack = player.getItemInHand(hand);
		if (
			itemstack.is(ItemTags.CANDLES) &&
				state.getValue(BITES) == 0 &&
				Block.byItem(itemstack.getItem()) instanceof CandleBlock candle &&
				EffectCandleCakeBlock.exists(this, candle)
		) {
			if (!player.isCreative()) {
				itemstack.shrink(1);
			}
			level.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1F, 1F);
			level.setBlockAndUpdate(pos, EffectCandleCakeBlock.byCakeCandle(this, candle));
			level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
			player.awardStat(Stats.ITEM_USED.get(itemstack.getItem()));
			return ItemInteractionResult.SUCCESS;
		}
		if (level.isClientSide()) {
			if (itemstack.is(CommonTags.Items.TOOLS_KNIFE)) {
				return cutSlice(level, pos, state, player);
			}
			if (eatSlice(level, pos, state, player).consumesAction()) {
				return ItemInteractionResult.SUCCESS;
			}
			if (itemstack.isEmpty()) {
				return ItemInteractionResult.CONSUME;
			}
		}
		if (itemstack.is(CommonTags.Items.TOOLS_KNIFE)) {
			return cutSlice(level, pos, state, player);
		}
		return ItemInteractionResult.SKIP_DEFAULT_BLOCK_INTERACTION;
	}

	@Override
	protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
		return eatSlice(level, pos, state, player);
	}

	/**
	 * Eats a slice from the pie, feeding the player.
	 */
	public InteractionResult eatSlice(Level level, BlockPos pos, BlockState state, Player player) {
		if (!player.canEat(false)) {
			return InteractionResult.PASS;
		}
		player.awardStat(Stats.EAT_CAKE_SLICE);
		Item slice = this.getSlice();
		ItemStack sliceStack = slice.getDefaultInstance();
		FoodProperties food = sliceStack.getFoodProperties(player);
		if (food != null) {
			player.getFoodData().eat(food);
		}
		EffectCakeBlock.addEatEffect(sliceStack, level, player);
		level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
		int bites = state.getValue(BITES);
		if (bites < 6) {
			level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
		} else {
			level.removeBlock(pos, false);
			level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
		}
		return InteractionResult.SUCCESS;
	}

	/**
	 * Cuts off a bite and drops a slice item, without feeding the player.
	 */
	public ItemInteractionResult cutSlice(Level level, BlockPos pos, BlockState state, Player player) {
		int bites = state.getValue(BITES);
		if (bites < 6) {
			level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
		} else {
			level.removeBlock(pos, false);
		}
		Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), this.getSlice().getDefaultInstance());
		level.playSound(null, pos, SoundEvents.WOOL_BREAK, SoundSource.PLAYERS, 0.8F, 0.8F);
		return ItemInteractionResult.SUCCESS;
	}
}