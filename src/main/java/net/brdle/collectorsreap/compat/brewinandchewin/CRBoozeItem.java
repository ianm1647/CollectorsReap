package net.brdle.collectorsreap.compat.brewinandchewin;

import net.minecraft.world.level.material.Fluid;
import umpaz.brewinandchewin.common.item.BoozeItem;

import java.util.function.Supplier;

public class CRBoozeItem extends BoozeItem {
	public CRBoozeItem(Fluid fluid, Properties properties) {
		super((Supplier<Fluid>) fluid, properties);
	}
}