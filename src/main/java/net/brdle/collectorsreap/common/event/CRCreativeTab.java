package net.brdle.collectorsreap.common.event;

import net.brdle.collectorsreap.CollectorsReap;
import net.brdle.collectorsreap.Util;
import net.brdle.collectorsreap.common.item.CRItems;
import net.brdle.collectorsreap.common.item.IConfigured;
import net.brdle.collectorsreap.common.item.StrawBrushItem;
import net.brdle.collectorsreap.proxy.CommonProxy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CRCreativeTab {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CollectorsReap.MODID);

	public static final Supplier<CreativeModeTab> TAB_COLLECTORS_REAP = TABS.register(CollectorsReap.MODID, () ->
		CreativeModeTab.builder()
			.title(Component.translatable("itemGroup." + CollectorsReap.MODID))
			.icon(() -> Util.getStack(CRItems.POMEGRANATE))
			.displayItems((params, output) ->
				CRItems.ITEMS.getEntries().stream()
					.filter(object -> !CommonProxy.getHiddenItems().contains(object))
					.map(Supplier::get)
					.filter(item -> !(item instanceof IConfigured configured) || configured.enabled())
					.forEach(item -> handleItem(item, output))
			).build());

	private static void handleItem(Item item, CreativeModeTab.Output output) {
		if (item instanceof StrawBrushItem brush) {
			output.accept(brush);
			output.accept(StrawBrushItem.getPollinatedStack());
			return;
		}
		output.accept(item);
	}

	public static void create(IEventBus bus) {
		TABS.register(bus);
	}
}