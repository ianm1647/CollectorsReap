package net.brdle.collectorsreap.data.pack;

import net.brdle.collectorsreap.CollectorsReap;
import net.brdle.collectorsreap.common.entity.CREntities;
import net.brdle.collectorsreap.data.CRBiomeTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public class CRBiomeModifiers {
	public static final ResourceKey<BiomeModifier> CHIEFTAIN_CRAB;
	public static final ResourceKey<BiomeModifier> CLAM;
	public static final ResourceKey<BiomeModifier> PLATINUM_BASS;
	public static final ResourceKey<BiomeModifier> TIGER_PRAWN;
	public static final ResourceKey<BiomeModifier> URCHIN;

	public static final ResourceKey<BiomeModifier> DRAGON_FRUIT;
	public static final ResourceKey<BiomeModifier> LIME_BUSH;
	public static final ResourceKey<BiomeModifier> POMEGRANATE;
	public static final ResourceKey<BiomeModifier> PORTOBELLO;

	public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		var biomes = context.lookup(Registries.BIOME);

		context.register(CHIEFTAIN_CRAB, new BiomeModifiers.AddSpawnsBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.CHIEFTAIN_CRAB_SPAWNS),
			List.of(new MobSpawnSettings.SpawnerData(CREntities.CHIEFTAIN_CRAB.get(), 5, 1, 3))));
		context.register(CLAM, new BiomeModifiers.AddSpawnsBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.CLAM_SPAWNS),
			List.of(new MobSpawnSettings.SpawnerData(CREntities.CLAM.get(), 1, 1, 1))));
		context.register(PLATINUM_BASS, new BiomeModifiers.AddSpawnsBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.PLATINUM_BASS_SPAWNS),
			List.of(new MobSpawnSettings.SpawnerData(CREntities.PLATINUM_BASS.get(), 1, 1, 2))));
		context.register(TIGER_PRAWN, new BiomeModifiers.AddSpawnsBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.TIGER_PRAWN_SPAWNS),
			List.of(new MobSpawnSettings.SpawnerData(CREntities.TIGER_PRAWN.get(), 2, 1, 2))));
		context.register(URCHIN, new BiomeModifiers.AddSpawnsBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.URCHIN_SPAWNS),
			List.of(new MobSpawnSettings.SpawnerData(CREntities.URCHIN.get(), 5, 1, 2))));

		context.register(DRAGON_FRUIT, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.DRAGON_FRUIT_SPAWNS),
			HolderSet.direct(placedFeatures.getOrThrow(CRPlacedFeatures.PATCH_DRAGON_FRUIT)),
			GenerationStep.Decoration.VEGETAL_DECORATION));
		context.register(LIME_BUSH, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.LIME_SPAWNS),
			HolderSet.direct(placedFeatures.getOrThrow(CRPlacedFeatures.PATCH_LIME_BUSH)),
			GenerationStep.Decoration.VEGETAL_DECORATION));
		context.register(POMEGRANATE, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.POMEGRANATE_SPAWNS),
			HolderSet.direct(placedFeatures.getOrThrow(CRPlacedFeatures.PATCH_POMEGRANATE)),
			GenerationStep.Decoration.VEGETAL_DECORATION));
		context.register(PORTOBELLO, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(CRBiomeTags.PORTOBELLO_SPAWNS),
			HolderSet.direct(placedFeatures.getOrThrow(CRPlacedFeatures.PATCH_PORTOBELLO)),
			GenerationStep.Decoration.VEGETAL_DECORATION));
	}

	static {
		CHIEFTAIN_CRAB = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "add_spawn/chieftain_crab"));
		CLAM = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "add_spawn/clam"));
		PLATINUM_BASS = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "add_spawn/platinum_bass"));
		TIGER_PRAWN = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "add_spawn/tiger_prawn"));
		URCHIN = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "add_spawn/urchin"));

		DRAGON_FRUIT = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "patch_dragon_fruit"));
		LIME_BUSH = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "patch_lime_bush"));
		POMEGRANATE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "patch_pomegranate"));
		PORTOBELLO = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CollectorsReap.MODID, "patch_portobello"));
	}
}
