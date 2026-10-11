package net.brdle.collectorsreap.compat.abnormals;

import net.brdle.collectorsreap.compat.Modid;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

public class NeapolitanCompat {
	public static SoundEvent getIceCreamEatSound() {
		return (
			Modid.N.loaded() ?
			NeapolitanUtils.ICE_CREAM_EAT.get() :
			SoundEvents.GENERIC_EAT
		);
	}

	public static Holder<MobEffect> getAgility() {
		return Modid.N.effect("agility", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getVanillaScent() {
		return Modid.N.effect("vanilla_scent", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getSugarRush() {
		return Modid.N.effect("sugar_rush", MobEffects.MOVEMENT_SPEED.value());
	}

	public static Holder<MobEffect> getBerserking() {
		return Modid.N.effect("berserking", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getHarmony() {
		return Modid.N.effect("harmony", MobEffects.CONFUSION.value());
	}
}