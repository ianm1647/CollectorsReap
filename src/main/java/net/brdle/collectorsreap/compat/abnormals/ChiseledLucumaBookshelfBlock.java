package net.brdle.collectorsreap.compat.abnormals;

import com.teamabnormals.blueprint.common.block.BlueprintChiseledBookShelfBlock;
import net.minecraft.world.phys.Vec2;

import java.util.OptionalInt;

public class ChiseledLucumaBookshelfBlock extends BlueprintChiseledBookShelfBlock {
	public ChiseledLucumaBookshelfBlock(Properties properties) {
		super(properties);
	}

	@Override
	public OptionalInt getHitSlot(Vec2 vec2) {
		int i = vec2.x <= 0.5F ? 0 : 1;
		int j = getSection(vec2.y) * 2;
		return OptionalInt.of(j + i);
	}

	public static int getSection(float y) {
		return (
			y < 0.25F ? 2 : // Bottom Shelf
			y < 0.6875F ? 1 : // Middle Shelf
			0 // Top Shelf
		);
	}
}