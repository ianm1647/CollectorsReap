package net.brdle.collectorsreap.common;

import net.brdle.collectorsreap.CollectorsReap;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CRParticleTypes {
	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(Registries.PARTICLE_TYPE, CollectorsReap.MODID);

	public static final Supplier<SimpleParticleType> ACID = PARTICLE_TYPES.register("acid", () -> new SimpleParticleType(true));
	public static final Supplier<SimpleParticleType> SHOCKWAVE = PARTICLE_TYPES.register("shockwave", () -> new SimpleParticleType(true));
	public static final Supplier<SimpleParticleType> SURGE = PARTICLE_TYPES.register("surge", () -> new SimpleParticleType(true));

	public static void create(IEventBus bus) {
		PARTICLE_TYPES.register(bus);
	}
}