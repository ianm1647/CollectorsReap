package net.brdle.collectorsreap.common.block;

import com.teamabnormals.neapolitan.core.other.NeapolitanCauldronInteractions;
import net.brdle.collectorsreap.CollectorsReap;
import net.brdle.collectorsreap.Util;
import net.brdle.collectorsreap.common.item.CRItems;
import net.minecraft.core.cauldron.CauldronInteraction;

public class CRCauldronInteractions {
	public static CauldronInteraction.InteractionMap LIME_MILKSHAKE = CauldronInteraction.newInteractionMap(Util.rl(CollectorsReap.MODID, "lime_milkshake").toString());
	public static CauldronInteraction.InteractionMap POMEGRANATE_MILKSHAKE = CauldronInteraction.newInteractionMap(Util.rl(CollectorsReap.MODID, "pomegranate_milkshake").toString());
	public static CauldronInteraction.InteractionMap PINK_DRAGON_FRUIT_MILKSHAKE = CauldronInteraction.newInteractionMap(Util.rl(CollectorsReap.MODID, "pink_dragon_fruit_milkshake").toString());
	public static CauldronInteraction.InteractionMap LUCUMA_MILKSHAKE = CauldronInteraction.newInteractionMap(Util.rl(CollectorsReap.MODID, "lucuma_milkshake").toString());

	public static void registerCauldronInteractions() {
		NeapolitanCauldronInteractions.addMilkshakeInteractions(CRItems.LIME_MILKSHAKE.get(), CRBlocks.LIME_MILKSHAKE_CAULDRON.get(), CRItems.LIME_ICE_CREAM.get(), LIME_MILKSHAKE.map());
		NeapolitanCauldronInteractions.addMilkshakeInteractions(CRItems.POMEGRANATE_MILKSHAKE.get(), CRBlocks.POMEGRANATE_MILKSHAKE_CAULDRON.get(), CRItems.POMEGRANATE_ICE_CREAM.get(), POMEGRANATE_MILKSHAKE.map());
		NeapolitanCauldronInteractions.addMilkshakeInteractions(CRItems.PINK_DRAGON_FRUIT_MILKSHAKE.get(), CRBlocks.PINK_DRAGON_FRUIT_MILKSHAKE_CAULDRON.get(), CRItems.PINK_DRAGON_FRUIT_ICE_CREAM.get(), PINK_DRAGON_FRUIT_MILKSHAKE.map());
		NeapolitanCauldronInteractions.addMilkshakeInteractions(CRItems.LUCUMA_MILKSHAKE.get(), CRBlocks.LUCUMA_MILKSHAKE_CAULDRON.get(), CRItems.LUCUMA_ICE_CREAM.get(), LUCUMA_MILKSHAKE.map());
	}
}