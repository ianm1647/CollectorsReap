package net.brdle.collectorsreap.compat.abnormals;

import net.brdle.collectorsreap.compat.Modid;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

public class BuzzierBeesCompat {
	public static Holder<MobEffect> getSunny() {
		return Modid.BB.effect("sunny", MobEffects.DIG_SPEED.value());
	}
}