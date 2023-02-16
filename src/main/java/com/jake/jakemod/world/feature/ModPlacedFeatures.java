package com.jake.jakemod.world.feature;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> EBONY_CHECKED_KEY = createKey("ebony_checked");
    public static final ResourceKey<PlacedFeature> EBONY_PLACED_KEY = createKey("ebony_placed");

    public static final ResourceKey<PlacedFeature> RUBY_PLACED_KEY = createKey("ruby_placed");
    public static final ResourceKey<PlacedFeature> SALT_PLACED_KEY = createKey("salt_placed");
    public static final ResourceKey<PlacedFeature> NETHER_COAL_PLACED_KEY = createKey("nether_coal_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_PLACED_KEY = createKey("nether_sulfur_placed");
    public static final ResourceKey<PlacedFeature> BRIMSTONE_PLACED_KEY = createKey("brimstone_placed");
    public static final ResourceKey<PlacedFeature> ABYSSON_PLACED_KEY = createKey("abysson_placed");
    public static final ResourceKey<PlacedFeature> GRIMSTONE_PLACED_KEY = createKey("grimstone_placed");

    public static final ResourceKey<PlacedFeature> CYAN_ROSE_PLACED_KEY = createKey("cyan_rose_placed");
    public static final ResourceKey<PlacedFeature> RED_ROSE_PLACED_KEY = createKey("red_rose_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, EBONY_CHECKED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EBONY_KEY),
                List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.EBONY_SAPLING.get())));
        register(context, EBONY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EBONY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1)));

        register(context, RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        register(context, SALT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SALT_ORE_KEY),
                commonOrePlacement(2, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(130))));

        register(context, NETHER_COAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COAL_ORE_KEY),
                commonOrePlacement(30, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128))));

        register(context, SULFUR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SULFUR_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(40))));

        register(context, BRIMSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRIMSTONE_KEY),
                commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(10))));


        register(context, ABYSSON_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ABYSSON_ORE_KEY),
                commonOrePlacement(30, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128))));

        register(context, GRIMSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRIMSTONE_KEY),
                commonOrePlacement(2, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128))));


        register(context, CYAN_ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYAN_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, RED_ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_){
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(JakeMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
