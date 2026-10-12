package net.brdle.collectorsreap.compat.letfishlove;

import com.chinaex123.letfishlove.items.RoeItem;
import net.minecraft.world.level.block.Block;
import java.util.function.Supplier;

public class CRRoeItem extends RoeItem {
	public CRRoeItem(Supplier<Block> roeBlock) {
		super(roeBlock);
	}
}