package net.brdle.collectorsreap.common.loot;

import net.brdle.collectorsreap.common.entity.CREntities;
import net.brdle.collectorsreap.common.item.CRItems;
import net.minecraft.advancements.critereon.DamageSourcePredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.TagPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.DamageSourceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public class CREntityLoot extends EntityLootSubProvider {
	private static final LootItemCondition.Builder ENTITY_ON_FIRE =
		LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS,
			EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true)));


	public CREntityLoot(HolderLookup.Provider registries) {
		super(FeatureFlags.REGISTRY.allFlags(), registries);
	}

	@Override
	public void generate() {
		this.add(CREntities.TIGER_PRAWN.get(), LootTable.lootTable()
			.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1F)).add(LootItem.lootTableItem(CRItems.TIGER_PRAWN.get())
				.apply(SmeltItemFunction.smelted().when(ENTITY_ON_FIRE)))));
		this.add(CREntities.PLATINUM_BASS.get(), LootTable.lootTable()
			.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1F)).add(LootItem.lootTableItem(CRItems.PLATINUM_BASS.get())
				.apply(SmeltItemFunction.smelted().when(ENTITY_ON_FIRE)))));
		this.add(CREntities.URCHIN.get(), LootTable.lootTable()
			.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1F)).add(LootItem.lootTableItem(CRItems.URCHIN.get()))));
		this.add(CREntities.CHIEFTAIN_CRAB.get(), LootTable.lootTable());
		this.add(CREntities.CLAM.get(), LootTable.lootTable()
			.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1F)).add(LootItem.lootTableItem(CRItems.CLAM.get()))));
	}

	@Override
	public @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
		return CREntities.ENTITIES.getEntries().stream().map(Supplier::get);
	}
}