package net.brdle.collectorsreap.common.effect;

import net.brdle.collectorsreap.CollectorsReap;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CREffects {
	public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, CollectorsReap.MODID);

	public static final Holder<MobEffect> CORROSION = EFFECTS.register("corrosion",
		CorrosionEffect::new);
	public static final Holder<MobEffect> VOLATILITY = EFFECTS.register("volatility",
		VolatilityEffect::new);
	public static final Holder<MobEffect> SURGE = EFFECTS.register("surge",
		SurgeEffect::new);
	public static final Holder<MobEffect> REBOUND = EFFECTS.register("rebound",
		ReboundEffect::new);

	public static void create(IEventBus bus) {
		EFFECTS.register(bus);
	}
}