package net.brdle.collectorsreap.data.pack;

import net.brdle.collectorsreap.common.block.CRBlocks;
import net.brdle.collectorsreap.common.item.CRItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class CRDataMaps extends DataMapProvider {
	public CRDataMaps(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	protected void gather(HolderLookup.@NotNull Provider provider) {
		this.builder(NeoForgeDataMaps.COMPOSTABLES)
			.add(CRBlocks.PORTOBELLO.get().asItem().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.PORTOBELLO_COLONY.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.BAKED_PORTOBELLO_CAP.get().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.STUFFED_PORTOBELLO_CAP.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.PORTOBELLO_QUICHE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.PORTOBELLO_QUICHE_SLICE.get().builtInRegistryHolder(), new Compostable(0.85f), false)

			.add(CRItems.LIME.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.LIME_SLICE.get().builtInRegistryHolder(), new Compostable(0.2f), false)
			.add(CRItems.LIME_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.LIME_COOKIE.get().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.POTATO_FRITTERS.get().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.LIME_PIE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.LIME_PIE_SLICE.get().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.LIME_CAKE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.LIME_CAKE_SLICE.get().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.PANETTONE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.PANETTONE_SLICE.get().builtInRegistryHolder(), new Compostable(0.85f), false)

			.add(CRItems.POMEGRANATE.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.POMEGRANATE_SLICE.get().builtInRegistryHolder(), new Compostable(0.2f), false)
			.add(CRItems.POMEGRANATE_SEEDS.get().builtInRegistryHolder(), new Compostable(0.1f), false)
			.add(CRItems.POMEGRANATE_CAKE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.POMEGRANATE_CAKE_SLICE.get().builtInRegistryHolder(), new Compostable(0.65f), false)

			.add(CRBlocks.DRAGON_BUSH.get().asItem().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.PINK_DRAGON_FRUIT.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.DRAGON_FRUIT_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.DRIED_PINK_DRAGON_FRUIT.get().builtInRegistryHolder(), new Compostable(0.5f), false)
			.add(CRItems.PINK_DRAGON_FRUIT_CAKE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.PINK_DRAGON_FRUIT_CAKE_SLICE.get().builtInRegistryHolder(), new Compostable(0.65f), false)

			.add(CRItems.LUCUMA.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRItems.LUCUMA_BREAD.get().builtInRegistryHolder(), new Compostable(0.65f), false)
			.add(CRItems.LUCUMA_CAKE.get().builtInRegistryHolder(), new Compostable(1f), false)
			.add(CRItems.LUCUMA_CAKE_SLICE.get().builtInRegistryHolder(), new Compostable(0.65f), false)

			.add(CRBlocks.DAMSELFLOWER.get().asItem().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.DAMSELFLOWER_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRBlocks.MOONTEAR.get().asItem().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.MOONTEAR_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRBlocks.SKULL_LILY.get().asItem().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.SKULL_LILY_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRBlocks.BULBOUS_ROSE.get().asItem().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.BULBOUS_ROSE_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false)
			.add(CRBlocks.HEARTPETALS.get().asItem().builtInRegistryHolder(), new Compostable(0.85f), false)
			.add(CRItems.HEARTPETALS_SEEDS.get().builtInRegistryHolder(), new Compostable(0.3f), false);

	}
}
