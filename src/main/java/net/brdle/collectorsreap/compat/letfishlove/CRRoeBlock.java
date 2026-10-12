package net.brdle.collectorsreap.compat.letfishlove;

import com.chinaex123.letfishlove.blocks.RoeBlock;
import com.chinaex123.letfishlove.init.LFLProperties;
import net.minecraft.world.entity.EntityType;
import java.util.function.Supplier;

public class CRRoeBlock extends RoeBlock {
	public CRRoeBlock(Supplier<EntityType<?>> fish) {
		super(fish, LFLProperties.roeBlockProperties());
	}
}