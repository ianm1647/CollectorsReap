package net.brdle.collectorsreap;

import net.brdle.collectorsreap.common.config.CRConfig;
import net.brdle.collectorsreap.proxy.ClientProxy;
import net.brdle.collectorsreap.proxy.CommonProxy;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CollectorsReap.MODID)
public class CollectorsReap {
	public static final String MODID = "collectorsreap";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static CommonProxy proxy;

	public CollectorsReap(IEventBus modEventBus, ModContainer modContainer) {
		modContainer.registerConfig(ModConfig.Type.COMMON, CRConfig.COMMON);
		proxy = FMLEnvironment.dist.isClient() ? new ClientProxy(): new CommonProxy();
		proxy.start(modEventBus);
		NeoForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
		LOGGER.info("Loading Collector's Reap");
	}
}