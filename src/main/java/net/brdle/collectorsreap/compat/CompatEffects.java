package net.brdle.collectorsreap.compat;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class CompatEffects {
	public static Holder<MobEffect> getCaffeinated() {
		return Modid.FR.effect("caffeinated", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getSpitting() {
		return Modid.AT.effect("spitting", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getPersistence() {
		return Modid.AT.effect("persistence", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getRelief() {
		return Modid.AT.effect("relief", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getStuffed() {
		return Modid.SEAS.effect("stuffed", MobEffects.CONFUSION.value());
	}

	public static Holder<MobEffect> getThornResistance() {
		return Modid.SEAS.effect("thorn_resistance", MobEffects.FIRE_RESISTANCE.value());
	}

	public static Holder<MobEffect> getRooted() {
		return Modid.SEAS.effect("rooted", MobEffects.DAMAGE_RESISTANCE.value());
	}

	public static Holder<MobEffect> getVitality() {
		return Modid.RF.effect("vitality", MobEffects.DIG_SPEED.value());
	}

	public static Holder<MobEffect> getTenacity() {
		return Modid.RF.effect("tenacity", MobEffects.DAMAGE_RESISTANCE.value());
	}

	public static Holder<MobEffect> getMaturity() {
		return Modid.RF.effect("maturity", getCaffeinated().value());
	}

	public static Holder<MobEffect> getTipsy() {
		return Modid.BC.effect("tipsy", getCaffeinated().value());
	}

	public static Holder<MobEffect> getIntoxication() {
		return Modid.BC.effect("intoxication", getCaffeinated().value());
	}

	public static Holder<MobEffect> getRaging() {
		return Modid.BC.effect("raging", getCaffeinated().value());
	}

	public static Holder<MobEffect> getSweetHeart() {
		return Modid.BC.effect("sweet_heart", getCaffeinated().value());
	}

	public static Holder<MobEffect> getTracer() {
		return Modid.COS.effect("tracer", MobEffects.GLOWING.value());
	}

	public static Holder<MobEffect> getExuberant() {
		return Modid.COS.effect("exuberant", ModEffects.COMFORT.value());
	}

	public static Holder<MobEffect> getCarotene() {
		return Modid.COS.effect("carotene", MobEffects.NIGHT_VISION.value());
	}

	public static Holder<MobEffect> getSpite() {
		return Modid.SOB.effect("spite", MobEffects.FIRE_RESISTANCE.value());
	}

	public static Holder<MobEffect> getToughness() {
		return Modid.SOB.effect("toughness", MobEffects.DAMAGE_RESISTANCE.value());
	}

	public static Holder<MobEffect> getReach() {
		return Modid.SOB.effect("reach", MobEffects.DAMAGE_BOOST.value());
	}

	public static Holder<MobEffect> getPeace() {
		return Modid.NIRV.effect("peace", MobEffects.GLOWING.value());
	}

	public static Holder<MobEffect> getFrostResistance() {
		return Modid.WS.effect("frost_resistance", MobEffects.FIRE_RESISTANCE.value());
	}
}