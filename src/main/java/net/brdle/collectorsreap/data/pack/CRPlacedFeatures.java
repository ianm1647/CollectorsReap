package net.brdle.collectorsreap.data.pack;

import net.brdle.collectorsreap.CollectorsReap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class CRPlacedFeatures {
	private static String MODID = CollectorsReap.MODID;

	public static ResourceKey<PlacedFeature> PATCH_DRAGON_FRUIT;
	public static ResourceKey<PlacedFeature> PATCH_LIME_BUSH;
	public static ResourceKey<PlacedFeature> PATCH_POMEGRANATE;
	public static ResourceKey<PlacedFeature> PATCH_PORTOBELLO;

	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
	}

	static {
		PATCH_DRAGON_FRUIT = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_dragon_fruit"));
		PATCH_LIME_BUSH = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_lime_bush"));
		PATCH_POMEGRANATE = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_pomegranate"));
		PATCH_PORTOBELLO = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, "patch_portobello"));
	}
}
