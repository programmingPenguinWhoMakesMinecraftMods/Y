package net.programmingpenguin.prgpengsuite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.programmingpenguin.prgpengsuite.registry.BlockEntityRegistry;
import net.programmingpenguin.prgpengsuite.registry.BlockRegistry;
import net.programmingpenguin.prgpengsuite.registry.ScreenHandlerRegistry;

public class Main implements ModInitializer {

	private static ConfiguredFeature<?, ?> COPPER_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					BlockRegistry.COPPER_ORE.getDefaultState(),
					7)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0, // bottom offset
					0, // min y level
					64))) // max y level
			.spreadHorizontally()
			.repeat(10); // number of veins per chunk

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		BlockEntityRegistry.register();
		ScreenHandlerRegistry.register();
		//ORES
		RegistryKey<ConfiguredFeature<?, ?>> oreWoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("ores", "copper_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), COPPER_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolOverworld);
	}
}
