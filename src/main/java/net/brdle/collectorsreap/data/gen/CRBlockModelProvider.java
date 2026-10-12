package net.brdle.collectorsreap.data.gen;

import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.core.data.client.BlueprintItemModelProvider;
import net.brdle.collectorsreap.CollectorsReap;
import net.brdle.collectorsreap.Util;
import net.brdle.collectorsreap.common.block.*;
import net.brdle.collectorsreap.compat.Modid;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.block.PieBlock;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

public class CRBlockModelProvider extends BlockStateProvider {
	public CRBlockModelProvider(final PackOutput output, final ExistingFileHelper helper) {
		super(output, CollectorsReap.MODID, helper);
	}

	@Override
	protected void registerStatesAndModels() {
		this.pieBlock(CRBlocks.PORTOBELLO_QUICHE.get());
		this.pieBlock(CRBlocks.LIME_PIE.get());
		this.stageBlock(CRBlocks.PORTOBELLO_COLONY.get(), PortobelloColonyBlock.COLONY_AGE);
		this.cross(CRBlocks.PORTOBELLO.get());
		this.cross(CRBlocks.DRAGON_BUSH.get());
		this.crateBlock(CRBlocks.LIME_CRATE.get(), "lime", false);
		this.crateBlock(CRBlocks.POMEGRANATE_CRATE.get(), "pomegranate", true);
		this.crateBlock(CRBlocks.STYGIAN_POMEGRANATE_CRATE.get(), "stygian_pomegranate", true);
		this.crateBlock(CRBlocks.PINK_DRAGON_FRUIT_CRATE.get(), "pink_dragon_fruit", false);
		this.crateBlock(CRBlocks.LUCUMA_CRATE.get(), "lucuma", true);
		this.crateBlock(CRBlocks.GILDED_LUCUMA_CRATE.get(), "gilded_lucuma", true);
		this.customStageBlock(CRBlocks.BUDDING_PINK_DRAGON_FRUIT_CROP.get(), Util.rl(FarmersDelight.MODID, "crop_cross"), "cross", BuddingDragonFruitBlock.AGE, Arrays.asList(0, 1, 2, 3, 3));
		this.cakeBlock(CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.WHITE_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.ORANGE_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.MAGENTA_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_BLUE_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.YELLOW_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.LIME_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.PINK_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.GRAY_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_GRAY_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.CYAN_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.PURPLE_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.BLUE_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.BROWN_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.GREEN_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.RED_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.candleCakeBlock(CRBlocks.BLACK_CANDLE_LIME_CAKE, CRBlocks.LIME_CAKE);
		this.cakeBlock(CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.WHITE_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.ORANGE_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.MAGENTA_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_BLUE_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.YELLOW_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.LIME_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.PINK_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.GRAY_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_GRAY_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.CYAN_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.PURPLE_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.BLUE_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.BROWN_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.GREEN_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.RED_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.candleCakeBlock(CRBlocks.BLACK_CANDLE_POMEGRANATE_CAKE, CRBlocks.POMEGRANATE_CAKE);
		this.cakeBlock(CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.WHITE_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.ORANGE_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.MAGENTA_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_BLUE_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.YELLOW_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.LIME_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.PINK_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.GRAY_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_GRAY_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.CYAN_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.PURPLE_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.BLUE_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.BROWN_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.GREEN_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.RED_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.candleCakeBlock(CRBlocks.BLACK_CANDLE_PINK_DRAGON_FRUIT_CAKE, CRBlocks.PINK_DRAGON_FRUIT_CAKE);
		this.cakeBlock(CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.WHITE_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.ORANGE_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.MAGENTA_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_BLUE_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.YELLOW_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.LIME_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.PINK_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.GRAY_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.LIGHT_GRAY_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.CYAN_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.PURPLE_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.BLUE_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.BROWN_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.GREEN_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.RED_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.candleCakeBlock(CRBlocks.BLACK_CANDLE_LUCUMA_CAKE, CRBlocks.LUCUMA_CAKE);
		this.simpleBlock(CRBlocks.LIME_ICE_CREAM_BLOCK.get());
		this.simpleBlock(CRBlocks.POMEGRANATE_ICE_CREAM_BLOCK.get());
		this.simpleBlock(CRBlocks.PINK_DRAGON_FRUIT_ICE_CREAM_BLOCK.get());
		this.simpleBlock(CRBlocks.LUCUMA_ICE_CREAM_BLOCK.get());

		// Sniffer Plants
		this.stageBlock(CRBlocks.DAMSELFLOWER_CROP.get(), DamselflowerCropBlock.AGE);
		this.pottedPlant(CRBlocks.DAMSELFLOWER, CRBlocks.POTTED_DAMSELFLOWER);
		this.stageBlock(CRBlocks.MOONTEAR_CROP.get(), MoontearCropBlock.AGE);
		this.pottedPlant(CRBlocks.MOONTEAR, CRBlocks.POTTED_MOONTEAR);
		this.stageBlock(CRBlocks.SKULL_LILY_CROP.get(), SkullLilyCropBlock.AGE);
		this.pottedPlant(CRBlocks.SKULL_LILY, CRBlocks.POTTED_SKULL_LILY);
		this.tallPlant(CRBlocks.BULBOUS_ROSE);
		this.tallPlant(CRBlocks.HEARTPETALS);

		// Urchin Test
		this.simpleBlock(CRBlocks.URCHIN_TEST_BLOCK.get(), this.models().cubeBottomTop(
			"urchin_test_block",
			resourceBlock("urchin_test_block_side"),
			resourceBlock("urchin_test_block_bottom"),
			resourceBlock("urchin_test_block_top")
		));
		this.simpleBlock(CRBlocks.URCHIN_TEST_BRICKS.get());
		this.slab(CRBlocks.URCHIN_TEST_BRICK_SLAB, this.blockTexture(CRBlocks.URCHIN_TEST_BRICKS.get()));
		this.stairs(CRBlocks.URCHIN_TEST_BRICK_STAIRS, this.blockTexture(CRBlocks.URCHIN_TEST_BRICKS.get()));
		this.wall(CRBlocks.URCHIN_TEST_BRICK_WALL, this.blockTexture(CRBlocks.URCHIN_TEST_BRICKS.get()));
		this.simpleBlock(CRBlocks.URCHIN_TEST_TILES.get());
		this.slab(CRBlocks.URCHIN_TEST_TILE_SLAB, this.blockTexture(CRBlocks.URCHIN_TEST_TILES.get()));
		this.stairs(CRBlocks.URCHIN_TEST_TILE_STAIRS, this.blockTexture(CRBlocks.URCHIN_TEST_TILES.get()));
		this.wall(CRBlocks.URCHIN_TEST_TILE_WALL, this.blockTexture(CRBlocks.URCHIN_TEST_TILES.get()));
		this.simpleBlock(CRBlocks.CHISELED_URCHIN_TEST_BRICKS.get());

		// Lucuma
		this.pillar(CRBlocks.STRIPPED_LUCUMA_LOG);
		this.wood(CRBlocks.STRIPPED_LUCUMA_WOOD, this.blockTexture(CRBlocks.STRIPPED_LUCUMA_LOG.get()));
		this.pillar(CRBlocks.LUCUMA_LOG);
		this.wood(CRBlocks.LUCUMA_WOOD, this.blockTexture(CRBlocks.LUCUMA_LOG.get()));
		this.simpleBlock(CRBlocks.LUCUMA_PLANKS.get());
		this.slab(CRBlocks.LUCUMA_SLAB, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.stairs(CRBlocks.LUCUMA_STAIRS, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.fence(CRBlocks.LUCUMA_FENCE, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.fenceGate(CRBlocks.LUCUMA_FENCE_GATE, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.doorCutout(CRBlocks.LUCUMA_DOOR);
		this.trapdoorCutout(CRBlocks.LUCUMA_TRAPDOOR);
		this.pressurePlate(CRBlocks.LUCUMA_PRESSURE_PLATE, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.button(CRBlocks.LUCUMA_BUTTON, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));
		this.sign(CRBlocks.LUCUMA_SIGN, CRBlocks.LUCUMA_WALL_SIGN, CRBlocks.LUCUMA_PLANKS);
		this.hangingSignBlocks(CRBlocks.STRIPPED_LUCUMA_LOG, CRBlocks.LUCUMA_HANGING_SIGN, CRBlocks.LUCUMA_WALL_HANGING_SIGN);
		this.pottedPlant(CRBlocks.LUCUMA_SAPLING, CRBlocks.POTTED_LUCUMA_SAPLING);
		this.leavesBlock(CRBlocks.LUCUMA_LEAVES);
		this.leafPile(CRBlocks.LUCUMA_LEAF_PILE, this.blockTexture(CRBlocks.LUCUMA_LEAVES.get()), true);
		this.cabinetBlock(CRBlocks.LUCUMA_CABINET.get(), "lucuma");
		this.beehive(CRBlocks.LUCUMA_BEEHIVE);
		this.ladder(CRBlocks.LUCUMA_LADDER);
		this.bookshelf(CRBlocks.LUCUMA_BOOKSHELF, CRBlocks.LUCUMA_PLANKS);
		this.chiseledBookshelfBlock(CRBlocks.CHISELED_LUCUMA_BOOKSHELF, ALTERNATE_BOOKSHELF_POSITIONS);
		this.boards(CRBlocks.LUCUMA_BOARDS);
		this.chests(CRBlocks.LUCUMA_CHEST, CRBlocks.TRAPPED_LUCUMA_CHEST, this.blockTexture(CRBlocks.LUCUMA_PLANKS.get()));

		// Roe
		this.roeBlock(CRBlocks.PLATINUM_BASS_ROE.get());
		this.roeBlock(CRBlocks.TIGER_PRAWN_ROE.get());
	}

	private void stairs(Supplier<Block> stairs, ResourceLocation texture) {
		this.stairsBlock((StairBlock) stairs.get(), texture);
	}

	private void slab(Supplier<Block> slab, ResourceLocation texture) {
		this.slabBlock((SlabBlock) slab.get(), texture, texture);
	}

	private void wall(Supplier<Block> wall, ResourceLocation texture) {
		this.wallBlock((WallBlock) wall.get(), texture);
	}

	private void wood(Supplier<Block> log, ResourceLocation texture) {
		this.axisBlock((RotatedPillarBlock) log.get(), texture, texture);
	}

	private void pillar(Supplier<Block> pillar) {
		this.axisBlock((RotatedPillarBlock) pillar.get(), this.blockTexture(pillar.get()), this.modLoc("block/" + Util.name(pillar.get()) + "_top"));
	}

	private void fence(Supplier<Block> fence, ResourceLocation texture) {
		this.fenceBlock((FenceBlock) fence.get(), texture);
	}

	private void fenceGate(Supplier<Block> gate, ResourceLocation texture) {
		this.fenceGateBlock((FenceGateBlock) gate.get(), texture);
	}

	private void door(Supplier<Block> door) {
		String name = Util.name(door.get());
		this.doorBlock((DoorBlock) door.get(), name.replace("_door", ""), this.modLoc("block/" + name + "_bottom"), this.modLoc("block/" + name + "_top"));
	}

	private void doorCutout(Supplier<Block> door) {
		String name = Util.name(door.get());
		this.doorBlockWithRenderType((DoorBlock) door.get(), name.replace("_door", ""), this.modLoc("block/" + name + "_bottom"), this.modLoc("block/" + name + "_top"), "cutout");
	}

	private void trapdoor(Supplier<Block> trapdoor) {
		this.trapdoorBlock((TrapDoorBlock) trapdoor.get(), this.blockTexture(trapdoor.get()), true);
	}

	private void trapdoorCutout(Supplier<Block> trapdoor) {
		this.trapdoorBlockWithRenderType((TrapDoorBlock) trapdoor.get(), this.blockTexture(trapdoor.get()), true, "cutout");
	}

	private void pressurePlate(Supplier<Block> pressurePlate, ResourceLocation texture) {
		this.pressurePlateBlock((PressurePlateBlock) pressurePlate.get(), texture);
	}

	private void button(Supplier<Block> button, ResourceLocation texture) {
		this.buttonBlock((ButtonBlock) button.get(), texture);
	}

	private void sign(Supplier<Block> sign, Supplier<Block> wallSign, Supplier<Block> planks) {
		this.signBlock((StandingSignBlock) sign.get(), (WallSignBlock) wallSign.get(), this.blockTexture(planks.get()));
	}

	public void hangingSignBlocks(Supplier<Block> strippedLog, Supplier<Block> sign, Supplier<Block> wallSign) {
		ModelFile model = particle(sign, blockTexture(strippedLog.get()));
		this.simpleBlock(sign.get(), model);
		this.generatedItem(sign.get(), "item");
		this.simpleBlock(wallSign.get(), model);
	}

	private void leafPile(Supplier<Block> leafPile, ResourceLocation texture, boolean tinted) {
		ModelFile model = this.models().withExistingParent(Util.name(leafPile.get()), "blueprint:block/" + (tinted ? "tinted_" : "") + "leaf_pile").texture("all", texture).renderType("cutout");
		this.getMultipartBuilder(leafPile.get())
			.part().modelFile(model).uvLock(true).rotationX(270).addModel().condition(BlockStateProperties.UP, true).end()
			.part().modelFile(model).uvLock(true).rotationX(90).addModel().condition(BlockStateProperties.DOWN, true).end()
			.part().modelFile(model).addModel().condition(BlockStateProperties.NORTH, true).end()
			.part().modelFile(model).uvLock(true).rotationY(180).addModel().condition(BlockStateProperties.SOUTH, true).end()
			.part().modelFile(model).uvLock(true).rotationY(90).addModel().condition(BlockStateProperties.EAST, true).end()
			.part().modelFile(model).uvLock(true).rotationY(270).addModel().condition(BlockStateProperties.WEST, true).end();
	}

	public void leavesBlock(Supplier<Block> leaves) {
		this.simpleBlock(leaves.get(), models().getBuilder(name(leaves.get())).parent(new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace("block/leaves"))).texture("all", blockTexture(leaves.get())));
		this.blockItem(leaves);
	}

	private void tallPlant(Supplier<Block> flower) {
		String name = Util.name(flower.get());
		Function<String, ModelFile> model = s -> this.models().cross(name + "_" + s, this.modLoc("block/" + name + "_" + s)).renderType("cutout");
		this.itemModels().withExistingParent(name, "item/generated").texture("layer0", this.modLoc("block/" + name + "_top"));
		this.getVariantBuilder(flower.get())
			.partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(model.apply("top")))
			.partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(model.apply("bottom")));
	}

	private void pottedPlant(Supplier<Block> plant, Supplier<Block> pot) {
		this.pot(pot, this.blockTexture(plant.get()));
		this.simpleCross(plant);
	}

	private void pot(Supplier<Block> pot, ResourceLocation texture) {
		ModelFile model = this.models().withExistingParent(Util.name(pot.get()), "block/flower_pot_cross").texture("plant", texture).renderType("cutout");
		this.simpleBlock(pot.get(), model);
	}

	private void simpleCross(Supplier<Block> block) {
		this.simpleBlock(block.get(), this.models().cross(Util.name(block.get()), this.blockTexture(block.get())).renderType("cutout"));
	}

	private void crateBlock(Block block, String cropName, boolean customBottom) {
		this.simpleBlock(block, models().cubeBottomTop(
			Util.name(block),
			resourceBlock(cropName + "_crate_side"),
				customBottom ?
				resourceBlock(cropName + "_crate_bottom") :
				Util.rl(FarmersDelight.MODID, "block/crate_bottom"),
			resourceBlock(cropName + "_crate_top")
		));
	}

	public void cabinetBlock(Block block, String woodType) {
		this.horizontalBlock(block, state -> {
			String suffix = state.getValue(CabinetBlock.OPEN) ? "_open" : "";
			return models().orientable(Util.name(block) + suffix,
				resourceBlock(woodType + "_cabinet_side"),
				resourceBlock(woodType + "_cabinet_front" + suffix),
				resourceBlock(woodType + "_cabinet_top"));
		});
	}

	private void beehive(Supplier<Block> beehive) {
		String name = Util.name(beehive.get());
		ModelFile model = this.models().orientable(name, this.modLoc("block/" + name + "_side"), this.modLoc("block/" + name + "_front"), this.modLoc("block/" + name + "_end"));
		ModelFile model_honey = this.models().orientable(name + "_honey", this.modLoc("block/" + name + "_side"), this.modLoc("block/" + name + "_front_honey"), this.modLoc("block/" + name + "_end"));
		this.horizontalBlock(beehive.get(), s -> s.getValue(BeehiveBlock.HONEY_LEVEL) == 5 ? model_honey : model);
	}

	private void ladder(Supplier<Block> ladder) {
		ResourceLocation texture = this.blockTexture(ladder.get());
		this.horizontalBlock(ladder.get(), this.models().withExistingParent(Util.name(ladder.get()), "block/ladder").texture("particle", texture).renderType("cutout").texture("texture", texture));
	}

	private void bookshelf(Supplier<Block> bookshelf, Supplier<Block> planks) {
		this.simpleBlock(bookshelf.get(), this.models().cubeColumn(Util.name(bookshelf.get()), this.blockTexture(bookshelf.get()), this.blockTexture(planks.get())));
	}

	private void boards(Supplier<Block> boards) {
		ResourceLocation texture = this.blockTexture(boards.get());
		ModelFile boardsModel = this.models().getBuilder(Util.name(boards.get())).parent(new ModelFile.UncheckedModelFile(Modid.BP.rl("block/template_boards"))).texture("all", texture);
		ModelFile boardsHorizontalModel = this.models().getBuilder(Util.name(boards.get()) + "_horizontal").parent(new ModelFile.UncheckedModelFile(Modid.BP.rl("block/template_boards_horizontal"))).texture("all", texture);
		this.getVariantBuilder(boards.get())
			.partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).modelForState().modelFile(boardsModel).addModel()
			.partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).modelForState().modelFile(boardsHorizontalModel).addModel()
			.partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).modelForState().modelFile(boardsHorizontalModel).rotationY(270).addModel();
	}

	private void chests(Supplier<Block> chest, Supplier<Block> trapped, ResourceLocation texture) {
		ModelFile model = this.models().getBuilder(Util.name(chest.get())).texture("particle", texture);
		this.simpleBlock(chest.get(), model);
		this.simpleBlock(trapped.get(), model);
	}

	private ModelFile existingModel(String path) {
		return new ModelFile.ExistingModelFile(resourceBlock(path), models().existingFileHelper);
	}

	private void cross(Block block) {
		this.simpleBlock(block, models().cross("block/" + Util.name(block),
			CRBlockModelProvider.resourceBlock(Util.name(block))).renderType("cutout"));
	}
	// Adapted from: https://github.com/vectorwing/FarmersDelight/blob/1.20/src/main/java/vectorwing/farmersdelight/data/BlockStates.java
	public void customStageBlock(Block block, @Nullable ResourceLocation parent, String textureKey, IntegerProperty ageProperty, List<Integer> suffixes, Property<?>... ignored) {
		getVariantBuilder(block)
			.forAllStatesExcept(state -> {
				int ageSuffix = state.getValue(ageProperty);
				String stageName = Util.name(block) + "_stage";
				stageName += suffixes.isEmpty() ? ageSuffix : suffixes.get(Math.min(suffixes.size(), ageSuffix));
				if (parent == null) {
					return ConfiguredModel.builder()
						.modelFile(models().cross(stageName, resourceBlock(stageName)).renderType("cutout")).build();
				}
				return ConfiguredModel.builder()
					.modelFile(models().singleTexture(stageName, parent, textureKey, resourceBlock(stageName)).renderType("cutout")).build();
			}, ignored);
	}

	// Adapted from: https://github.com/vectorwing/FarmersDelight/blob/1.19/src/main/java/vectorwing/farmersdelight/data/BlockStates.java
	private void stageBlock(Block block, IntegerProperty ageProperty, Property<?>... ignored) {
		getVariantBuilder(block).forAllStatesExcept(state -> {
			String stageName = Util.name(block) + "_stage" + state.getValue(ageProperty);
			return ConfiguredModel.builder()
				.modelFile(models().cross(stageName, resourceBlock(stageName)).renderType("cutout")).build();
		}, ignored);
	}

	private void pomegranateBushBlock(Block block, IntegerProperty ageProperty, EnumProperty<DoubleBlockHalf> halfProperty) {
		getVariantBuilder(block).forAllStates(state -> {
			String halfStageName = Util.name(block) + "_" + state.getValue(halfProperty).getSerializedName() + "_stage" + state.getValue(ageProperty);
			String name = Util.name(block) + "_stage" + state.getValue(ageProperty);
			return ConfiguredModel.builder()
				.modelFile(models()
					.withExistingParent("block/" + halfStageName,
						Util.cr(Util.name(block) + "_" + state.getValue(halfProperty).getSerializedName()))
					.texture("0", resourceBlock(name))).build();
		});
	}

	// Adapted from: https://github.com/vectorwing/FarmersDelight/blob/1.19/src/main/java/vectorwing/farmersdelight/data/BlockStates.java
	private void pieBlock(Supplier<Block> block) {
		getVariantBuilder(block.get()).forAllStates(state -> {
				int bites = state.getValue(PieBlock.BITES);
				String name = Util.name(block.get());
				String suffix = bites > 0 ? "_slice" + bites : "";
				var mod = models()
					.withExistingParent("block/" + name + suffix, Util.rl(FarmersDelight.MODID, "template_pie" + suffix))
					.texture("top", resourceBlock(name + "_top"))
					.texture("bottom", resourceBlock(name + "_bottom"))
					.texture("side", resourceBlock(name + "_side"))
					.texture("particle", resourceBlock(name + "_top"));
				if (bites > 0) {
					mod.texture("inner", resourceBlock(name + "_inner"));
				}
				return ConfiguredModel.builder().modelFile(mod)
					.rotationY(((int) state.getValue(PieBlock.FACING).toYRot() + 180) % 360).build();
			}
		);
	}

	private void cakeBlock(Supplier<Block> block) {
		getVariantBuilder(block.get()).forAllStates(state -> {
				int bites = state.getValue(CakeBlock.BITES);
				String name = Util.name(block.get());
				String suffix = bites > 0 ? "_slice" + bites : "";
				var mod = models()
					.withExistingParent("block/" + name + suffix, Util.rl("minecraft", "cake" + suffix))
					.texture("top", resourceBlock(name + "_top"))
					.texture("bottom", resourceBlock(name + "_bottom"))
					.texture("side", resourceBlock(name + "_side"))
					.texture("particle", resourceBlock(name + "_side"));
				if (bites > 0) {
					mod.texture("inside", resourceBlock(name + "_inner"));
				}
				return ConfiguredModel.builder().modelFile(mod).build();
			}
		);
	}

	public void pieBlock(Block block) {
		this.getVariantBuilder(block).forAllStates((state) -> {
			int bites = (Integer)state.getValue(PieBlock.BITES);
			String suffix = bites > 0 ? "_slice" + bites : "";
			ConfiguredModel.Builder var10000 = ConfiguredModel.builder();
			String var10002 = this.blockName(block);
			return var10000.modelFile(this.existingModel(var10002 + suffix)).rotationY(((int)((Direction)state.getValue(PieBlock.FACING)).toYRot() + 180) % 360).build();
		});
	}

	private String blockName(Block block) {
		return BuiltInRegistries.BLOCK.getKey(block).getPath();
	}

	private void candleCakeBlock(Supplier<Block> block, Supplier<Block> cake) {
		getVariantBuilder(block.get()).forAllStates(state -> {
			String lit = state.getValue(AbstractCandleBlock.LIT) ? "_lit" : "";
			String name = Util.name(block.get());
			String cakeName = Util.name(cake.get());
			String candle = name.replace("_" + cakeName, "") + lit;
			return ConfiguredModel.builder().modelFile(models()
				.withExistingParent("block/" + name + lit, Modid.MC.rl("template_cake_with_candle"))
				.texture("bottom", resourceBlock(cakeName + "_bottom"))
				.texture("candle", vanillaBlock(candle))
				.texture("particle", resourceBlock(cakeName + "_side"))
				.texture("side", resourceBlock(cakeName + "_side"))
				.texture("top", resourceBlock(cakeName + "_top"))).build();
		});
	}

	private void roeBlock(Block block) {
		getVariantBuilder(block).forAllStates(state -> {
			String name = Util.name(block);
			return ConfiguredModel.builder().modelFile(models()
				.withExistingParent(name, vanillaBlock("frogspawn"))
				.texture("particle", resourceBlock(name))
				.texture("texture", resourceBlock(name))
				.renderType("translucent")
			).build();
		});
	}

	public static final String[] ALTERNATE_BOOKSHELF_POSITIONS = new String[]{"top_left", "top_right", "mid_left", "mid_right", "bottom_left", "bottom_right"};

	public void chiseledBookshelfBlock(Supplier<Block> registryObject, String[] parts) {
		chiseledBookshelfBlock(registryObject, parts, blockTexture(registryObject.get()));
	}

	public void chiseledBookshelfBlock(Supplier<Block> registryObject, String[] parts, ResourceLocation parent) {
		Block chiseledBookshelf = registryObject.get();
		String name = name(chiseledBookshelf);
		ResourceLocation texture = blockTexture(chiseledBookshelf);

		BlockModelBuilder model = this.models().withExistingParent(name, "block/chiseled_bookshelf").texture("top", texture + "_top").texture("side", texture + "_side");
		MultiPartBlockStateBuilder builder = getMultipartBuilder(chiseledBookshelf);
		for (Direction direction : Direction.Plane.HORIZONTAL) {
			int rotation = (int) (direction.toYRot() + 180) % 360;
			builder.part().modelFile(model).rotationY(rotation).uvLock(true).addModel().condition(HorizontalDirectionalBlock.FACING, direction);
			for (int i = 0; i < 6; i++) {
				String part = parts[i];
				BooleanProperty property = ChiseledBookShelfBlock.SLOT_OCCUPIED_PROPERTIES.get(i);
				ResourceLocation slot = suffix(parent, "_slot_" + part);

				builder.part().modelFile(this.models().withExistingParent(name + "_occupied_slot_" + part, slot).texture("texture", texture + "_occupied"))
					.rotationY(rotation).uvLock(true).addModel()
					.condition(HorizontalDirectionalBlock.FACING, direction).condition(property, true);
				builder.part().modelFile(this.models().withExistingParent(name + "_empty_slot_" + part, slot).texture("texture", texture + "_empty"))
					.rotationY(rotation).uvLock(true).addModel()
					.condition(HorizontalDirectionalBlock.FACING, direction).condition(property, false);
			}
		}

		this.simpleBlockItem(chiseledBookshelf, this.models().withExistingParent(name + "_inventory", "block/chiseled_bookshelf_inventory").texture("top", texture + "_top").texture("side", texture + "_side").texture("front", texture + "_empty"));
	}

	public void blockItem(Supplier<Block> block) {
		this.blockItem(block);
	}

	public void generatedItem(ItemLike item, String type) {
		this.generatedItem(item, item, type);
	}

	public void generatedItem(ItemLike item, ItemLike texture, String type) {
		this.generatedItem(item, prefix(type + "/", BlueprintItemModelProvider.key(texture)).toString());
	}

	public static String name(Block block) {
		return BuiltInRegistries.BLOCK.getKey(block).getPath();
	}

	public static ResourceLocation prefix(String prefix, ResourceLocation rl) {
		return ResourceLocation.fromNamespaceAndPath(rl.getNamespace(), prefix + rl.getPath());
	}

	public static ResourceLocation suffix(ResourceLocation rl, String suffix) {
		return ResourceLocation.fromNamespaceAndPath(rl.getNamespace(), rl.getPath() + suffix);
	}

	public ModelFile particle(Supplier<Block> block, ResourceLocation texture) {
		return this.particle(block, texture);
	}

	public static ResourceLocation resourceBlock(String path) {
		return Util.cr("block/" + path);
	}

	// Adapted from: https://github.com/vectorwing/FarmersDelight/blob/1.19/src/main/java/vectorwing/farmersdelight/data/BlockStates.java
	public static ResourceLocation vanillaBlock(String path) {
		return Modid.MC.rl("block/" + path);
	}
}