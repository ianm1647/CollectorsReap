package net.brdle.collectorsreap.proxy;

import net.brdle.collectorsreap.common.CRParticleTypes;
import net.brdle.collectorsreap.common.block.CRBlocks;
import net.brdle.collectorsreap.common.event.CRCreativeTab;
import net.brdle.collectorsreap.common.event.CRSoundEvents;
import net.brdle.collectorsreap.common.event.CommonEvents;
import net.brdle.collectorsreap.common.event.ModEvents;
import net.brdle.collectorsreap.common.effect.CREffects;
import net.brdle.collectorsreap.common.entity.CREntities;
import net.brdle.collectorsreap.common.fluid.CRFluids;
import net.brdle.collectorsreap.common.item.CRItems;
import net.brdle.collectorsreap.common.loot.CRLootItemConditions;
import net.brdle.collectorsreap.common.loot.CRLootModifiers;
import net.brdle.collectorsreap.compat.Modid;
import net.brdle.collectorsreap.data.gen.Generators;
import net.brdle.collectorsreap.data.pack.CRFoliagePlacerTypes;
import net.minecraft.world.item.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import org.jetbrains.annotations.NotNull;

public class CommonProxy {
	private static @NotNull List<Item> hiddenItems = Collections.emptyList();

	public void start(IEventBus bus) {
		NeoForge.EVENT_BUS.register(new CommonEvents());
		bus.register(new ModEvents());
		bus.register(new Generators());
		CRBlocks.create(bus);
		CRItems.create(bus);
		CRFluids.create(bus);
		CREntities.create(bus);
		CRParticleTypes.create(bus);
		CREffects.create(bus);
		CRCreativeTab.create(bus);
		CRLootItemConditions.create(bus);
		CRLootModifiers.create(bus);
		CRSoundEvents.create(bus);
		CRFoliagePlacerTypes.create(bus);

//		hiddenItems = new ArrayList<>();
//		if (!Modid.FR.loaded()) {
//			hiddenItems.addAll(List.of(
//				CRItems.STRONG_LIMEADE.get(),
//				CRItems.LIME_GREEN_TEA.get(),
//				CRItems.POMEGRANATE_BLACK_TEA.get(),
//				CRItems.VERNAL_PURGE.get(),
//				CRItems.STRONG_VERNAL_PURGE.get(),
//				CRItems.LIMBO_BREW.get(),
//				CRItems.LONG_LIMBO_BREW.get(),
//				CRItems.STRONG_LIMBO_BREW.get(),
//				CRItems.SWEET_RECOVERY.get(),
//				CRItems.LONG_SWEET_RECOVERY.get(),
//				CRItems.STRONG_SWEET_RECOVERY.get()
//			));
//		}
//		if (!Modid.BC.loaded()) {
//			hiddenItems.addAll(List.of(
//				CRItems.DEIFIC_BLOOD.get(),
//				CRItems.HERMITS_SOUR.get(),
//				CRItems.ROSE_MOON.get(),
//				CRItems.REANIMATORS_GARDEN.get(),
//				CRItems.HEAVENS_CREAM.get()
//			));
//		}
//		if (!Modid.WW.loaded()) {
//			hiddenItems.addAll(List.of(
//				CRBlocks.LUCUMA_BEEHIVE.get().asItem(),
//				CRBlocks.LUCUMA_LADDER.get().asItem(),
//				CRBlocks.LUCUMA_BOOKSHELF.get().asItem(),
//				CRBlocks.CHISELED_LUCUMA_BOOKSHELF.get().asItem(),
//				CRBlocks.LUCUMA_BOARDS.get().asItem(),
//				CRBlocks.LUCUMA_CHEST.get().asItem(),
//				CRBlocks.TRAPPED_LUCUMA_CHEST.get().asItem()
//			));
//		}
	}

	public static @NotNull List<Item> getHiddenItems() {
		return hiddenItems;
	}
}