package com.jake.jakemod.world.feature;

import com.google.common.base.Suppliers;
import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.ModBlocks;
import io.netty.bootstrap.BootstrapConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_SPAWN_KEY = registerKey("ebony_spawn");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("overworld_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SALT_ORE_KEY = registerKey("salt_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ABYSSON_ORE_KEY = registerKey("abysson_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRIMSTONE_KEY = registerKey("grimstone");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRIMSTONE_KEY = registerKey("brimstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SULFUR_ORE_KEY = registerKey("sulfur_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_ROSE_KEY = registerKey("cyan_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_ROSE_KEY = registerKey("red_rose");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EBONY_LOG.get()),
                new ForkingTrunkPlacer(3, 4, 3),
                BlockStateProvider.simple(ModBlocks.EBONY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, EBONY_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        placedFeatures.getOrThrow(ModPlacedFeatures.EBONY_CHECKED_KEY),
                        0.5F)), placedFeatures.getOrThrow(ModPlacedFeatures.EBONY_CHECKED_KEY)));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 5));
        register(context, OVERWORLD_SALT_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SALT_ORES.get(), 65));
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_COAL_ORES.get(), 15));
        register(context, SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(SULFUR_ORES.get(), 15));
        register(context, BRIMSTONE_KEY, Feature.ORE, new OreConfiguration(BRIMSTONE_BLOCKS.get(), 9));
        register(context, ABYSSON_ORE_KEY, Feature.ORE, new OreConfiguration(ABYSSON_ORES.get(), 15));
        register(context, GRIMSTONE_KEY, Feature.ORE, new OreConfiguration(GRIMSTONES.get(), 65));

        register(context, CYAN_ROSE_KEY, Feature.FLOWER,new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CYAN_ROSE.get()))))
                );

        register(context, RED_ROSE_KEY, Feature.FLOWER,new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_ROSE.get())))));
    }
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RUBY_ORE.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SALT_ORES =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SALT_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.SALT_BLOCK.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_COAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.BASE_STONE_NETHER), ModBlocks.NETHER_COAL_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> SULFUR_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.BASE_STONE_NETHER), ModBlocks.SULFUR_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> BRIMSTONE_BLOCKS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.BASE_STONE_NETHER), ModBlocks.BRIMSTONE_BLOCK.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ABYSSON_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ABYSSON_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> GRIMSTONES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.GRIMSTONE.get().defaultBlockState())));


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(JakeMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
