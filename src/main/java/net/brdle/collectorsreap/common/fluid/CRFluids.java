package net.brdle.collectorsreap.common.fluid;

import net.brdle.collectorsreap.CollectorsReap;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class CRFluids {
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, CollectorsReap.MODID);
	public static final DeferredRegister<FluidType> TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CollectorsReap.MODID);

	public static final Supplier<FluidType> LIME_JUICE_TYPE = TYPES.register("lime_juice_type",
		() -> new DrinkFluidType(0xFF7AD10D));
	public static final Supplier<Fluid> LIME_JUICE = FLUIDS.register("lime_juice",
		() -> new BaseFlowingFluid.Source(CRFluids.LIME_JUICE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_LIME_JUICE = FLUIDS.register("flowing_lime_juice",
		() -> new BaseFlowingFluid.Flowing(CRFluids.LIME_JUICE_PROPERTIES));
	public static final BaseFlowingFluid.Properties LIME_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
		LIME_JUICE_TYPE,
		LIME_JUICE,
		FLOWING_LIME_JUICE
	);

	public static final Supplier<FluidType> STRONG_LIME_JUICE_TYPE = TYPES.register("strong_lime_juice_type",
		() -> new DrinkFluidType(0xFF7AD10D));
	public static final Supplier<Fluid> STRONG_LIME_JUICE = FLUIDS.register("strong_lime_juice",
		() -> new BaseFlowingFluid.Source(CRFluids.STRONG_LIME_JUICE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_STRONG_LIME_JUICE = FLUIDS.register("flowing_strong_lime_juice",
		() -> new BaseFlowingFluid.Flowing(CRFluids.STRONG_LIME_JUICE_PROPERTIES));
	public static final BaseFlowingFluid.Properties STRONG_LIME_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
		STRONG_LIME_JUICE_TYPE,
		STRONG_LIME_JUICE,
		FLOWING_STRONG_LIME_JUICE
	);

	public static final Supplier<FluidType> BERRY_LIMEADE_TYPE = TYPES.register("berry_limeade_type",
		() -> new DrinkFluidType(0xFFE3552A));
	public static final Supplier<Fluid> BERRY_LIMEADE = FLUIDS.register("berry_limeade",
		() -> new BaseFlowingFluid.Source(CRFluids.BERRY_LIMEADE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_BERRY_LIMEADE = FLUIDS.register("flowing_berry_limeade",
		() -> new BaseFlowingFluid.Flowing(CRFluids.BERRY_LIMEADE_PROPERTIES));
	public static final BaseFlowingFluid.Properties BERRY_LIMEADE_PROPERTIES = new BaseFlowingFluid.Properties(
		BERRY_LIMEADE_TYPE,
		BERRY_LIMEADE,
		FLOWING_BERRY_LIMEADE
	);

	public static final Supplier<FluidType> PINK_LIMEADE_TYPE = TYPES.register("pink_limeade_type",
		() -> new DrinkFluidType(0xFFFFAB99));
	public static final Supplier<Fluid> PINK_LIMEADE = FLUIDS.register("pink_limeade",
		() -> new BaseFlowingFluid.Source(CRFluids.PINK_LIMEADE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_PINK_LIMEADE = FLUIDS.register("flowing_pink_limeade",
		() -> new BaseFlowingFluid.Flowing(CRFluids.PINK_LIMEADE_PROPERTIES));
	public static final BaseFlowingFluid.Properties PINK_LIMEADE_PROPERTIES = new BaseFlowingFluid.Properties(
		PINK_LIMEADE_TYPE,
		PINK_LIMEADE,
		FLOWING_PINK_LIMEADE
	);

	public static final Supplier<FluidType> MINT_LIMEADE_TYPE = TYPES.register("mint_limeade_type",
		() -> new DrinkFluidType(0xFF57E94A));
	public static final Supplier<Fluid> MINT_LIMEADE = FLUIDS.register("mint_limeade",
		() -> new BaseFlowingFluid.Source(CRFluids.MINT_LIMEADE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_MINT_LIMEADE = FLUIDS.register("flowing_mint_limeade",
		() -> new BaseFlowingFluid.Flowing(CRFluids.MINT_LIMEADE_PROPERTIES));
	public static final BaseFlowingFluid.Properties MINT_LIMEADE_PROPERTIES = new BaseFlowingFluid.Properties(
		MINT_LIMEADE_TYPE,
		MINT_LIMEADE,
		FLOWING_MINT_LIMEADE
	);

	public static final Supplier<FluidType> LIME_GREEN_TEA_TYPE = TYPES.register("lime_green_tea_type",
		() -> new DrinkFluidType(0xFF95ac38));
	public static final Supplier<Fluid> LIME_GREEN_TEA = FLUIDS.register("lime_green_tea",
		() -> new BaseFlowingFluid.Source(CRFluids.LIME_GREEN_TEA_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_LIME_GREEN_TEA = FLUIDS.register("flowing_lime_green_tea",
		() -> new BaseFlowingFluid.Flowing(CRFluids.LIME_GREEN_TEA_PROPERTIES));
	public static final BaseFlowingFluid.Properties LIME_GREEN_TEA_PROPERTIES = new BaseFlowingFluid.Properties(
		LIME_GREEN_TEA_TYPE,
		LIME_GREEN_TEA,
		FLOWING_LIME_GREEN_TEA
	);

	public static final Supplier<FluidType> POMEGRANATE_BLACK_TEA_TYPE = TYPES.register("pomegranate_black_tea_type",
		() -> new DrinkFluidType(0xFF900f2f));
	public static final Supplier<Fluid> POMEGRANATE_BLACK_TEA = FLUIDS.register("pomegranate_black_tea",
		() -> new BaseFlowingFluid.Source(CRFluids.POMEGRANATE_BLACK_TEA_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_POMEGRANATE_BLACK_TEA = FLUIDS.register("flowing_pomegranate_black_tea",
		() -> new BaseFlowingFluid.Flowing(CRFluids.POMEGRANATE_BLACK_TEA_PROPERTIES));
	public static final BaseFlowingFluid.Properties POMEGRANATE_BLACK_TEA_PROPERTIES = new BaseFlowingFluid.Properties(
		POMEGRANATE_BLACK_TEA_TYPE,
		POMEGRANATE_BLACK_TEA,
		FLOWING_POMEGRANATE_BLACK_TEA
	);

	public static final Supplier<FluidType> VERNAL_PURGE_TYPE = TYPES.register("vernal_purge_type",
		() -> new DrinkFluidType(0xFF58421F));
	public static final Supplier<Fluid> VERNAL_PURGE = FLUIDS.register("vernal_purge",
		() -> new BaseFlowingFluid.Source(CRFluids.VERNAL_PURGE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_VERNAL_PURGE = FLUIDS.register("flowing_vernal_purge",
		() -> new BaseFlowingFluid.Flowing(CRFluids.VERNAL_PURGE_PROPERTIES));
	public static final BaseFlowingFluid.Properties VERNAL_PURGE_PROPERTIES = new BaseFlowingFluid.Properties(
		VERNAL_PURGE_TYPE,
		VERNAL_PURGE,
		FLOWING_VERNAL_PURGE
	);

	public static final Supplier<FluidType> STRONG_VERNAL_PURGE_TYPE = TYPES.register("strong_vernal_purge_type",
		() -> new DrinkFluidType(0xFF58421F));
	public static final Supplier<Fluid> STRONG_VERNAL_PURGE = FLUIDS.register("strong_vernal_purge",
		() -> new BaseFlowingFluid.Source(CRFluids.STRONG_VERNAL_PURGE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_STRONG_VERNAL_PURGE = FLUIDS.register("flowing_strong_vernal_purge",
		() -> new BaseFlowingFluid.Flowing(CRFluids.STRONG_VERNAL_PURGE_PROPERTIES));
	public static final BaseFlowingFluid.Properties STRONG_VERNAL_PURGE_PROPERTIES = new BaseFlowingFluid.Properties(
		STRONG_VERNAL_PURGE_TYPE,
		STRONG_VERNAL_PURGE,
		FLOWING_STRONG_VERNAL_PURGE
	);

	public static final Supplier<FluidType> LIMBO_BREW_TYPE = TYPES.register("limbo_brew_type",
		() -> new DrinkFluidType(0xFF3F1221));
	public static final Supplier<Fluid> LIMBO_BREW = FLUIDS.register("limbo_brew",
		() -> new BaseFlowingFluid.Source(CRFluids.LIMBO_BREW_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_LIMBO_BREW = FLUIDS.register("flowing_limbo_brew",
		() -> new BaseFlowingFluid.Flowing(CRFluids.LIMBO_BREW_PROPERTIES));
	public static final BaseFlowingFluid.Properties LIMBO_BREW_PROPERTIES = new BaseFlowingFluid.Properties(
		LIMBO_BREW_TYPE,
		LIMBO_BREW,
		FLOWING_LIMBO_BREW
	);

	public static final Supplier<FluidType> LONG_LIMBO_BREW_TYPE = TYPES.register("long_limbo_brew_type",
		() -> new DrinkFluidType(0xFF3F1221));
	public static final Supplier<Fluid> LONG_LIMBO_BREW = FLUIDS.register("long_limbo_brew",
		() -> new BaseFlowingFluid.Source(CRFluids.LONG_LIMBO_BREW_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_LONG_LIMBO_BREW = FLUIDS.register("flowing_long_limbo_brew",
		() -> new BaseFlowingFluid.Flowing(CRFluids.LONG_LIMBO_BREW_PROPERTIES));
	public static final BaseFlowingFluid.Properties LONG_LIMBO_BREW_PROPERTIES = new BaseFlowingFluid.Properties(
		LONG_LIMBO_BREW_TYPE,
		LONG_LIMBO_BREW,
		FLOWING_LONG_LIMBO_BREW
	);

	public static final Supplier<FluidType> STRONG_LIMBO_BREW_TYPE = TYPES.register("strong_limbo_brew_type",
		() -> new DrinkFluidType(0xFF3F1221));
	public static final Supplier<Fluid> STRONG_LIMBO_BREW = FLUIDS.register("strong_limbo_brew",
		() -> new BaseFlowingFluid.Source(CRFluids.STRONG_LIMBO_BREW_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_STRONG_LIMBO_BREW = FLUIDS.register("flowing_strong_limbo_brew",
		() -> new BaseFlowingFluid.Flowing(CRFluids.STRONG_LIMBO_BREW_PROPERTIES));
	public static final BaseFlowingFluid.Properties STRONG_LIMBO_BREW_PROPERTIES = new BaseFlowingFluid.Properties(
		STRONG_LIMBO_BREW_TYPE,
		STRONG_LIMBO_BREW,
		FLOWING_STRONG_LIMBO_BREW
	);

	public static final Supplier<FluidType> SWEET_RECOVERY_TYPE = TYPES.register("sweet_recovery_type",
		() -> new DrinkFluidType(0xFF98592A));
	public static final Supplier<Fluid> SWEET_RECOVERY = FLUIDS.register("sweet_recovery",
		() -> new BaseFlowingFluid.Source(CRFluids.SWEET_RECOVERY_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_SWEET_RECOVERY = FLUIDS.register("flowing_sweet_recovery",
		() -> new BaseFlowingFluid.Flowing(CRFluids.SWEET_RECOVERY_PROPERTIES));
	public static final BaseFlowingFluid.Properties SWEET_RECOVERY_PROPERTIES = new BaseFlowingFluid.Properties(
		SWEET_RECOVERY_TYPE,
		SWEET_RECOVERY,
		FLOWING_SWEET_RECOVERY
	);

	public static final Supplier<FluidType> LONG_SWEET_RECOVERY_TYPE = TYPES.register("long_sweet_recovery_type",
		() -> new DrinkFluidType(0xFF98592A));
	public static final Supplier<Fluid> LONG_SWEET_RECOVERY = FLUIDS.register("long_sweet_recovery",
		() -> new BaseFlowingFluid.Source(CRFluids.LONG_SWEET_RECOVERY_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_LONG_SWEET_RECOVERY = FLUIDS.register("flowing_long_sweet_recovery",
		() -> new BaseFlowingFluid.Flowing(CRFluids.LONG_SWEET_RECOVERY_PROPERTIES));
	public static final BaseFlowingFluid.Properties LONG_SWEET_RECOVERY_PROPERTIES = new BaseFlowingFluid.Properties(
		LONG_SWEET_RECOVERY_TYPE,
		LONG_SWEET_RECOVERY,
		FLOWING_LONG_SWEET_RECOVERY
	);

	public static final Supplier<FluidType> STRONG_SWEET_RECOVERY_TYPE = TYPES.register("strong_sweet_recovery_type",
		() -> new DrinkFluidType(0xFF98592A));
	public static final Supplier<Fluid> STRONG_SWEET_RECOVERY = FLUIDS.register("strong_sweet_recovery",
		() -> new BaseFlowingFluid.Source(CRFluids.STRONG_SWEET_RECOVERY_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_STRONG_SWEET_RECOVERY = FLUIDS.register("flowing_strong_sweet_recovery",
		() -> new BaseFlowingFluid.Flowing(CRFluids.STRONG_SWEET_RECOVERY_PROPERTIES));
	public static final BaseFlowingFluid.Properties STRONG_SWEET_RECOVERY_PROPERTIES = new BaseFlowingFluid.Properties(
		STRONG_SWEET_RECOVERY_TYPE,
		STRONG_SWEET_RECOVERY,
		FLOWING_STRONG_SWEET_RECOVERY
	);

	public static final Supplier<FluidType> DEIFIC_BLOOD_TYPE = TYPES.register("deific_blood_type",
		() -> new DrinkFluidType(0xFFac1927));
	public static final Supplier<Fluid> DEIFIC_BLOOD = FLUIDS.register("deific_blood",
		() -> new BaseFlowingFluid.Source(CRFluids.DEIFIC_BLOOD_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_DEIFIC_BLOOD = FLUIDS.register("flowing_deific_blood",
		() -> new BaseFlowingFluid.Flowing(CRFluids.DEIFIC_BLOOD_PROPERTIES));
	public static final BaseFlowingFluid.Properties DEIFIC_BLOOD_PROPERTIES = new BaseFlowingFluid.Properties(
		DEIFIC_BLOOD_TYPE,
		DEIFIC_BLOOD,
		FLOWING_DEIFIC_BLOOD
	);

	public static final Supplier<FluidType> HERMITS_SOUR_TYPE = TYPES.register("hermits_sour_type",
		() -> new DrinkFluidType(0xFFb5b55c));
	public static final Supplier<Fluid> HERMITS_SOUR = FLUIDS.register("hermits_sour",
		() -> new BaseFlowingFluid.Source(CRFluids.HERMITS_SOUR_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_HERMITS_SOUR = FLUIDS.register("flowing_hermits_sour",
		() -> new BaseFlowingFluid.Flowing(CRFluids.HERMITS_SOUR_PROPERTIES));
	public static final BaseFlowingFluid.Properties HERMITS_SOUR_PROPERTIES = new BaseFlowingFluid.Properties(
		HERMITS_SOUR_TYPE,
		HERMITS_SOUR,
		FLOWING_HERMITS_SOUR
	);

	public static final Supplier<FluidType> ROSE_MOON_TYPE = TYPES.register("rose_moon_type",
		() -> new DrinkFluidType(0xFF602848));
	public static final Supplier<Fluid> ROSE_MOON = FLUIDS.register("rose_moon",
		() -> new BaseFlowingFluid.Source(CRFluids.ROSE_MOON_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_ROSE_MOON = FLUIDS.register("flowing_rose_moon",
		() -> new BaseFlowingFluid.Flowing(CRFluids.ROSE_MOON_PROPERTIES));
	public static final BaseFlowingFluid.Properties ROSE_MOON_PROPERTIES = new BaseFlowingFluid.Properties(
		ROSE_MOON_TYPE,
		ROSE_MOON,
		FLOWING_ROSE_MOON
	);

	public static final Supplier<FluidType> REANIMATORS_GARDEN_TYPE = TYPES.register("reanimators_garden_type",
		() -> new DrinkFluidType(0xFFb32600));
	public static final Supplier<Fluid> REANIMATORS_GARDEN = FLUIDS.register("reanimators_garden",
		() -> new BaseFlowingFluid.Source(CRFluids.REANIMATORS_GARDEN_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_REANIMATORS_GARDEN = FLUIDS.register("flowing_reanimators_garden",
		() -> new BaseFlowingFluid.Flowing(CRFluids.REANIMATORS_GARDEN_PROPERTIES));
	public static final BaseFlowingFluid.Properties REANIMATORS_GARDEN_PROPERTIES = new BaseFlowingFluid.Properties(
		REANIMATORS_GARDEN_TYPE,
		REANIMATORS_GARDEN,
		FLOWING_REANIMATORS_GARDEN
	);

	public static final Supplier<FluidType> HEAVENS_CREAM_TYPE = TYPES.register("heavens_cream_type",
		() -> new DrinkFluidType(0xFFFACF6F));
	public static final Supplier<Fluid> HEAVENS_CREAM = FLUIDS.register("heavens_cream",
		() -> new BaseFlowingFluid.Source(CRFluids.HEAVENS_CREAM_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_HEAVENS_CREAM = FLUIDS.register("flowing_heavens_cream",
		() -> new BaseFlowingFluid.Flowing(CRFluids.HEAVENS_CREAM_PROPERTIES));
	public static final BaseFlowingFluid.Properties HEAVENS_CREAM_PROPERTIES = new BaseFlowingFluid.Properties(
		HEAVENS_CREAM_TYPE,
		HEAVENS_CREAM,
		FLOWING_HEAVENS_CREAM
	);

	public static final Supplier<FluidType> CREAM_CHEESE_TYPE = TYPES.register("cream_cheese_type",
		CreamCheeseFluidType::new);
	public static final Supplier<Fluid> CREAM_CHEESE = FLUIDS.register("cream_cheese",
		() -> new BaseFlowingFluid.Source(CRFluids.CREAM_CHEESE_PROPERTIES));
	public static final Supplier<Fluid> FLOWING_CREAM_CHEESE = FLUIDS.register("flowing_cream_cheese",
		() -> new BaseFlowingFluid.Flowing(CRFluids.CREAM_CHEESE_PROPERTIES));
	public static final BaseFlowingFluid.Properties CREAM_CHEESE_PROPERTIES = new BaseFlowingFluid.Properties(
		CREAM_CHEESE_TYPE,
		CREAM_CHEESE,
		FLOWING_CREAM_CHEESE
	);

	public static void create(IEventBus bus) {
		FLUIDS.register(bus);
		TYPES.register(bus);
	}
}