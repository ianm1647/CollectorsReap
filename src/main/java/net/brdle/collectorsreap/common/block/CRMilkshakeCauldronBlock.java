package net.brdle.collectorsreap.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

public class CRMilkshakeCauldronBlock extends LayeredCauldronBlock {
	public CRMilkshakeCauldronBlock(CauldronInteraction.InteractionMap map) {
		super(Biome.Precipitation.NONE, map, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON).requiresCorrectToolForDrops().noOcclusion());
	}

	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, Player player) {
		return new ItemStack(Items.CAULDRON);
	}
}