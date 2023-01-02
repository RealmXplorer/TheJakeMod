package com.jake.jakemod.world.feature;

import com.jake.jakemod.JakeMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, JakeMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
    () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(),
    commonOrePlacement(7,
    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_COAL_ORE_PLACED = PLACED_FEATURES.register("nether_coal_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_COAL_ORE.getHolder().get(), commonOrePlacement(30, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128)))));

    public static final RegistryObject<PlacedFeature> ABYSSON_ORE_PLACED = PLACED_FEATURES.register("abysson_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ABYSSON_ORE.getHolder().get(), commonOrePlacement(30, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128)))));

    public static final RegistryObject<PlacedFeature> GRIMSTONE_PLACED = PLACED_FEATURES.register("grimstone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.GRIMSTONE.getHolder().get(), commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-1), VerticalAnchor.aboveBottom(128)))));

    public static final RegistryObject<PlacedFeature> CYAN_ROSE_PLACED = PLACED_FEATURES.register("cyan_rose_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CYAN_ROSE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> OAK_CARPET_PLACED = PLACED_FEATURES.register("oak_carpet_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.OAK_CARPET.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_){
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

}
