package net.brdle.collectorsreap.common.loot;

import com.mojang.serialization.MapCodec;
import net.brdle.collectorsreap.CollectorsReap;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class CRLootModifiers {
	private static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> GLM = DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, CollectorsReap.MODID);

	public static final Supplier<MapCodec<AddItemLootModifier>> ADD_ITEM = GLM.register("add_item", () -> AddItemLootModifier.CODEC);

	public static void create(IEventBus bus) {
		GLM.register(bus);
	}
}