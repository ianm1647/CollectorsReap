package net.brdle.collectorsreap.client;

import net.brdle.collectorsreap.Util;
import net.brdle.collectorsreap.client.model.*;
import net.brdle.collectorsreap.client.particle.AcidParticle;
import net.brdle.collectorsreap.client.particle.ShockwaveParticle;
import net.brdle.collectorsreap.client.particle.SurgeParticle;
import net.brdle.collectorsreap.client.renderer.*;
import net.brdle.collectorsreap.common.CRParticleTypes;
import net.brdle.collectorsreap.common.block.CRBlocks;
import net.brdle.collectorsreap.common.entity.CREntities;
import net.brdle.collectorsreap.common.item.CRItems;
import net.brdle.collectorsreap.common.item.StrawBrushItem;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ClientEvents {
	private static final List<Supplier<Block>> FOLIAGE_COLOR_BLOCKS = Arrays.asList(CRBlocks.LUCUMA_LEAVES, CRBlocks.LUCUMA_LEAF_PILE);
	private static final List<Supplier<Block>> GRASS_COLOR_BLOCKS = Collections.emptyList();

	@SubscribeEvent
	public void setupClient(FMLClientSetupEvent e){
		e.enqueueWork(() -> {
			ItemProperties.register(
				CRItems.STRAW_BRUSH.get(),
				Util.cr("pollinated"),
				(stack, level, entity, seed) ->
					StrawBrushItem.isPollinated(stack) ? 1.0F : 0.0F
			);
		});
	}

	@SubscribeEvent
	public void registerBlockColors(RegisterColorHandlersEvent.Block event) {
		if (!FOLIAGE_COLOR_BLOCKS.isEmpty()) {
			FOLIAGE_COLOR_BLOCKS.forEach(block ->
				event.register((x, level, pos, u) -> level != null && pos != null
					? BiomeColors.getAverageFoliageColor(level, pos) : FoliageColor.get(0.5D, 1.0D), block.get())
			);
		}
		if (!GRASS_COLOR_BLOCKS.isEmpty()) {
			GRASS_COLOR_BLOCKS.forEach(block -> event.register((x, level, pos, u) -> level != null && pos != null
				? BiomeColors.getAverageGrassColor(level, pos) : GrassColor.getDefaultColor(), block.get())
			);
		}
	}

	@SubscribeEvent
	public void registerItemColors(RegisterColorHandlersEvent.Item event) {
		if (!FOLIAGE_COLOR_BLOCKS.isEmpty()) {
			FOLIAGE_COLOR_BLOCKS.forEach(item -> event.register((color, items) -> items > 0 ? -1
					: FoliageColor.get(0.5D, 1.0D), item.get())
			);
		}
	}

	@SubscribeEvent
	public void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions e) {
		e.registerLayerDefinition(TigerPrawnRenderer.LAYER_LOCATION, TigerPrawnModel::createBodyLayer);
		e.registerLayerDefinition(UrchinRenderer.LAYER_LOCATION, UrchinModel::createBodyLayer);
		e.registerLayerDefinition(PlatinumBassRenderer.LAYER_LOCATION, PlatinumBassModel::createBodyLayer);
		e.registerLayerDefinition(ChieftainCrabRenderer.LAYER_LOCATION, ChieftainCrabModel::createBodyLayer);
		e.registerLayerDefinition(ClamRenderer.LAYER_LOCATION, ClamModel::createBodyLayer);
	}


	@SubscribeEvent
	public void registerEntityRenders(EntityRenderersEvent.RegisterRenderers e) {
		e.registerEntityRenderer(CREntities.TIGER_PRAWN.get(), TigerPrawnRenderer::new);
		e.registerEntityRenderer(CREntities.URCHIN.get(), UrchinRenderer::new);
		e.registerEntityRenderer(CREntities.PLATINUM_BASS.get(), PlatinumBassRenderer::new);
		e.registerEntityRenderer(CREntities.CHIEFTAIN_CRAB.get(), ChieftainCrabRenderer::new);
		e.registerEntityRenderer(CREntities.CLAM.get(), ClamRenderer::new);
		e.registerEntityRenderer(CREntities.URCHIN_DART.get(), UrchinDartRenderer::new);
		e.registerEntityRenderer(CREntities.SHIMMERING_PEARL.get(), ThrownItemRenderer::new);
	}

	@SubscribeEvent
	public void registerParticles(RegisterParticleProvidersEvent e) {
		e.registerSpriteSet(CRParticleTypes.ACID.get(), AcidParticle.Provider::new);
		e.registerSpriteSet(CRParticleTypes.SHOCKWAVE.get(), ShockwaveParticle.Provider::new);
		e.registerSpriteSet(CRParticleTypes.SURGE.get(), SurgeParticle.Provider::new);
	}
}