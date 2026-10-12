package net.brdle.collectorsreap.common.event;

import net.brdle.collectorsreap.common.block.CRCauldronInteractions;
import net.brdle.collectorsreap.compat.Modid;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModEvents {
	@SubscribeEvent
	public void setup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			if (Modid.N.loaded()) {
				CRCauldronInteractions.registerCauldronInteractions();
			}
		});
	}
}