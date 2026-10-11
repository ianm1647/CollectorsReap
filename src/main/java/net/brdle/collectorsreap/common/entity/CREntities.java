package net.brdle.collectorsreap.common.entity;

import net.brdle.collectorsreap.CollectorsReap;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@EventBusSubscriber(modid = CollectorsReap.MODID)
public class CREntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, CollectorsReap.MODID);

	public static final Supplier<EntityType<TigerPrawn>> TIGER_PRAWN = ENTITIES.register("tiger_prawn",
		() -> EntityType.Builder.of(TigerPrawn::new, MobCategory.WATER_AMBIENT)
			.sized(0.7F, 0.35F)
			.clientTrackingRange(4)
			.build(CollectorsReap.MODID + ".tiger_prawn"));
	public static final Supplier<EntityType<Urchin>> URCHIN = ENTITIES.register("urchin",
		() -> EntityType.Builder.of(Urchin::new, MobCategory.WATER_AMBIENT)
			.sized(0.5F, 0.4F)
			.clientTrackingRange(4)
			.build(CollectorsReap.MODID + ".urchin"));
	public static final Supplier<EntityType<PlatinumBass>> PLATINUM_BASS = ENTITIES.register("platinum_bass",
		() -> EntityType.Builder.of(PlatinumBass::new, MobCategory.WATER_AMBIENT)
			.sized(1F, 0.6F)
			.clientTrackingRange(4)
			.build(CollectorsReap.MODID + ".platinum_bass"));
	public static final Supplier<EntityType<Clam>> CLAM = ENTITIES.register("clam",
		() -> EntityType.Builder.of(Clam::new, MobCategory.WATER_AMBIENT)
			.sized(0.6F, 0.5F)
			.clientTrackingRange(8)
			.build(CollectorsReap.MODID + ".clam"));
	public static final Supplier<EntityType<ChieftainCrab>> CHIEFTAIN_CRAB = ENTITIES.register("chieftain_crab",
	 	() -> EntityType.Builder.of(ChieftainCrab::new, MobCategory.WATER_AMBIENT)
			.sized(0.7F, 0.65F)
			.clientTrackingRange(10)
			.build(CollectorsReap.MODID + ".chieftain_crab"));
	public static final Supplier<EntityType<UrchinDart>> URCHIN_DART = ENTITIES.register("urchin_dart",
		() -> EntityType.Builder.<UrchinDart>of(UrchinDart::new, MobCategory.MISC)
			.sized(0.5F, 0.5F)
			.clientTrackingRange(4)
			.updateInterval(20)
			.build(CollectorsReap.MODID + ".urchin_dart"));
	public static final Supplier<EntityType<ThrownShimmeringPearl>> SHIMMERING_PEARL = ENTITIES.register("shimmering_pearl",
		() -> EntityType.Builder.<ThrownShimmeringPearl>of(ThrownShimmeringPearl::new, MobCategory.MISC)
			.sized(0.25F, 0.25F)
			.clientTrackingRange(4)
			.updateInterval(10)
			.build(CollectorsReap.MODID + ".shimmering_pearl"));

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TIGER_PRAWN.get(), TigerPrawn.createAttributes().build());
		event.put(URCHIN.get(), Urchin.createAttributes().build());
		event.put(PLATINUM_BASS.get(), PlatinumBass.createAttributes().build());
		event.put(CLAM.get(), Clam.createAttributes().build());
		event.put(CHIEFTAIN_CRAB.get(), ChieftainCrab.createAttributes().build());
	}

	@SubscribeEvent
	public static void registerEntitySpawnPlacements(RegisterSpawnPlacementsEvent event) {
		event.register(PLATINUM_BASS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, PlatinumBass::checkSurfaceWaterAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.AND);
		event.register(TIGER_PRAWN.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, TigerPrawn::checkSurfaceWaterAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.AND);
		event.register(URCHIN.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Urchin::checkWaterGroundSpawnRules, RegisterSpawnPlacementsEvent.Operation.AND);
		event.register(CLAM.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Clam::checkWaterGroundSpawnRules, RegisterSpawnPlacementsEvent.Operation.AND);
		event.register(CHIEFTAIN_CRAB.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.WORLD_SURFACE, ChieftainCrab::checkCrabSpawnRules, RegisterSpawnPlacementsEvent.Operation.AND);
	}

	public static void create(IEventBus bus) {
		ENTITIES.register(bus);
	}
}