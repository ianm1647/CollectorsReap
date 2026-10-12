package net.brdle.collectorsreap;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.brdle.collectorsreap.common.config.CRConfig;
import net.brdle.collectorsreap.common.item.CRItemSubRegistryHelper;
import net.brdle.collectorsreap.proxy.ClientProxy;
import net.brdle.collectorsreap.proxy.CommonProxy;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;

@Mod(CollectorsReap.MODID)
public class CollectorsReap {
	public static final String MODID = "collectorsreap";
	public static final RegistryHelper REGISTRY_HELPER = RegistryHelper.create(MODID, helper -> {
		helper.putSubHelper(Registries.ITEM, new CRItemSubRegistryHelper(helper));
	});
	public static CommonProxy proxy;

	public CollectorsReap(IEventBus modEventBus, ModContainer modContainer) {
		REGISTRY_HELPER.register(modEventBus);

		proxy = FMLEnvironment.dist.isClient() ? new ClientProxy(): new CommonProxy();
		proxy.start(modEventBus);

		modContainer.registerConfig(ModConfig.Type.COMMON, CRConfig.COMMON);
		NeoForge.EVENT_BUS.register(this);
	}
}