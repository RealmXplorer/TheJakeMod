package com.jake.jakemod;

import com.jake.jakemod.block.ModBlocks;
import com.jake.jakemod.block.entity.ModBlockEntities;
import com.jake.jakemod.item.ModItems;
import com.jake.jakemod.loot.ModLootModifiers;
import com.jake.jakemod.potion.ModPotions;
import com.jake.jakemod.recipe.ModRecipes;
import com.jake.jakemod.screen.ModMenuTypes;
import com.jake.jakemod.sound.ModSounds;
import com.jake.jakemod.util.BetterBrewingRecipe;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JakeMod.MOD_ID)
public class JakeMod
{
    public static final String MOD_ID = "jakemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JakeMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModSounds.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModPotions.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.INK_SAC, ModPotions.BLINDNESS_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.GLOW_INK_SAC, ModPotions.GLOWING_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.MUNDANE,
                    Items.PHANTOM_MEMBRANE, ModPotions.LEVITATION_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.MUNDANE,
                    Items.ROTTEN_FLESH, ModPotions.HUNGER_POTION.get()));

            ComposterBlock.COMPOSTABLES.put(ModItems.MINT.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(ModItems.GHAST_BERRY.get(), 0.85f);
            ComposterBlock.COMPOSTABLES.put(ModItems.MINT_SEEDS.get(), 0.30F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CYAN_ROSE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_ROSE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(Items.POISONOUS_POTATO, 0.01F);

            DispenserBlock.registerBehavior(ModItems.NETHERITE_SHEARS.get(), new ShearsDispenseItemBehavior());
            DispenserBlock.registerBehavior(ModItems.GOLD_SHEARS.get(), new ShearsDispenseItemBehavior());
            DispenserBlock.registerBehavior(ModItems.STAR_SHEARS.get(), new ShearsDispenseItemBehavior());
            DispenserBlock.registerBehavior(ModItems.DIAMOND_SHEARS.get(), new ShearsDispenseItemBehavior());

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CYAN_ROSE.getId(),ModBlocks.POTTED_CYAN_ROSE);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_ROSE.getId(),ModBlocks.POTTED_RED_ROSE);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BONE_FLOWER.getId(),ModBlocks.POTTED_BONE_FLOWER);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.EBONY_SAPLING.getId(),ModBlocks.POTTED_EBONY_SAPLING);
        });
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ABYSSON);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SALT);
            event.accept(ModItems.ROSE_QUARTZ);
            event.accept(ModItems.ROSE_GOLD_INGOT);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.HELLSTEEL_INGOT);
            event.accept(ModItems.END_DUST);
            event.accept(ModItems.STAR_SHARD);
            event.accept(ModItems.GELATIN);
            event.accept(ModItems.COPPER_NUGGET);
            event.accept(ModItems.GLASS_SHARD);
            event.accept(ModItems.BRIMSTONE);
            event.accept(ModItems.FLAME_FEATHER);
            event.accept(ModItems.WARPED_PAPER);
            event.accept(ModItems.WARPED_BOOK);
            event.accept(ModItems.COCOA_POWDER);
            event.accept(ModItems.SULFUR);
            event.accept(ModItems.MINT);
            event.accept(ModItems.SHULKER_BINDING);
            event.accept(ModItems.PHILOSOPHER_STONE);
            event.accept(ModItems.VOID_QUARTZ);
        }
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.GRIM_AXE);
            event.accept(ModItems.GRIM_PICKAXE);
            event.accept(ModItems.GRIM_SHOVEL);
            event.accept(ModItems.GRIM_HOE);

            event.accept(ModItems.ROSE_GOLD_AXE);
            event.accept(ModItems.ROSE_GOLD_HOE);
            event.accept(ModItems.ROSE_GOLD_SHOVEL);
            event.accept(ModItems.ROSE_GOLD_PICKAXE);

            event.accept(ModItems.ROSE_QUARTZ_HOE);
            event.accept(ModItems.ROSE_QUARTZ_AXE);
            event.accept(ModItems.ROSE_QUARTZ_SHOVEL);
            event.accept(ModItems.ROSE_QUARTZ_PICKAXE);

            event.accept(ModItems.STEEL_HOE);
            event.accept(ModItems.STEEL_PICKAXE);
            event.accept(ModItems.STEEL_AXE);
            event.accept(ModItems.STEEL_SHOVEL);

            event.accept(ModItems.HELLSTEEL_HOE);
            event.accept(ModItems.HELLSTEEL_PICKAXE);
            event.accept(ModItems.HELLSTEEL_SHOVEL);
            event.accept(ModItems.HELLSTEEL_AXE);

            event.accept(ModItems.GRANITE_HOE);
            event.accept(ModItems.GRANITE_PICKAXE);
            event.accept(ModItems.GRANITE_SHOVEL);
            event.accept(ModItems.GRANITE_AXE);

            event.accept(ModItems.GILDED_BLACKSTONE_AXE);
            event.accept(ModItems.GILDED_BLACKSTONE_PICKAXE);
            event.accept(ModItems.GILDED_BLACKSTONE_SHOVEL);
            event.accept(ModItems.GILDED_BLACKSTONE_HOE);

            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_PICKAXE);
            event.accept(ModItems.COPPER_SHOVEL);
            event.accept(ModItems.COPPER_HOE);

            event.accept(ModItems.STAR_HOE);
            event.accept(ModItems.STAR_PICKAXE);
            event.accept(ModItems.STAR_SHOVEL);
            event.accept(ModItems.STAR_AXE);

            event.accept(ModItems.DIAMOND_SHEARS);
            event.accept(ModItems.GOLD_SHEARS);
            event.accept(ModItems.NETHERITE_SHEARS);
            event.accept(ModItems.STAR_SHEARS);

            event.accept(ModItems.MUSIC_DISC_DOG);
            event.accept(ModItems.MUSIC_DISC_DECEMBER);
            event.accept(ModItems.MUSIC_DISC_KINGSTEAD);
        }
        if(event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.SEASONED_CHICKEN);
            event.accept(ModItems.SEASONED_COD);
            event.accept(ModItems.SEASONED_STEAK);
            event.accept(ModItems.SEASONED_RABBIT);
            event.accept(ModItems.SEASONED_PORKCHOP);
            event.accept(ModItems.SEASONED_SALMON);
            event.accept(ModItems.GHAST_BERRY);
            event.accept(ModItems.CANDY_CANE);
            event.accept(ModItems.CANDY_CORN);
            event.accept(ModItems.PEPPERMINT_BARK);
            event.accept(ModItems.BERRY_PIE);
            event.accept(ModItems.APPLE_PIE);
            event.accept(ModItems.ENDER_FRUIT);
            event.accept(ModItems.SUSHI);
            event.accept(ModItems.JERKY);
            event.accept(ModItems.CURED_FLESH);
            event.accept(ModItems.GOLDEN_POTATO);
            event.accept(ModItems.CHOCOLATE_BAR);
        }
        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.COPPER_HELMET);
            event.accept(ModItems.COPPER_CHESTPLATE);
            event.accept(ModItems.COPPER_LEGGINGS);
            event.accept(ModItems.COPPER_BOOTS);

            event.accept(ModItems.GILDED_BLACKSTONE_HELMET);
            event.accept(ModItems.GILDED_BLACKSTONE_CHESTPLATE);
            event.accept(ModItems.GILDED_BLACKSTONE_LEGGINGS);
            event.accept(ModItems.GILDED_BLACKSTONE_BOOTS);

            event.accept(ModItems.HELLSTEEL_HELMET);
            event.accept(ModItems.HELLSTEEL_CHESTPLATE);
            event.accept(ModItems.HELLSTEEL_LEGGINGS);
            event.accept(ModItems.HELLSTEEL_BOOTS);

            event.accept(ModItems.STEEL_HELMET);
            event.accept(ModItems.STEEL_CHESTPLATE);
            event.accept(ModItems.STEEL_LEGGINGS);
            event.accept(ModItems.STEEL_BOOTS);

            event.accept(ModItems.ROSE_QUARTZ_HELMET);
            event.accept(ModItems.ROSE_QUARTZ_CHESTPLATE);
            event.accept(ModItems.ROSE_QUARTZ_LEGGINGS);
            event.accept(ModItems.ROSE_QUARTZ_BOOTS);

            event.accept(ModItems.ROSE_GOLD_HELMET);
            event.accept(ModItems.ROSE_GOLD_CHESTPLATE);
            event.accept(ModItems.ROSE_GOLD_LEGGINGS);
            event.accept(ModItems.ROSE_GOLD_BOOTS);

            event.accept(ModItems.GRIM_HELMET);
            event.accept(ModItems.GRIM_CHESTPLATE);
            event.accept(ModItems.GRIM_LEGGINGS);
            event.accept(ModItems.GRIM_BOOTS);

            event.accept(ModItems.CROWN);

            event.accept(ModItems.AMETHYST_SWORD);
            event.accept(ModItems.STAR_BLADE);
            event.accept(ModItems.COPPER_SWORD);
            event.accept(ModItems.GILDED_BLACKSTONE_SWORD);
            event.accept(ModItems.GRANITE_SWORD);
            event.accept(ModItems.HELLSTEEL_SWORD);
            event.accept(ModItems.STEEL_SWORD);
            event.accept(ModItems.ROSE_QUARTZ_SWORD);
            event.accept(ModItems.ROSE_GOLD_SWORD);
            event.accept(ModItems.GRIM_SWORD);
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.POLISHED_GRANITE_BRICKS);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICK_WALL);

            event.accept(ModBlocks.POLISHED_DIORITE_BRICKS);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICK_WALL);

            event.accept(ModBlocks.POLISHED_ANDESITE_BRICKS);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);

            event.accept(ModBlocks.CALCITE_SLAB);
            event.accept(ModBlocks.CALCITE_STAIRS);
            event.accept(ModBlocks.CALCITE_WALL);

            event.accept(ModBlocks.POLISHED_CALCITE);
            event.accept(ModBlocks.POLISHED_CALCITE_SLAB);
            event.accept(ModBlocks.POLISHED_CALCITE_STAIRS);

            event.accept(ModBlocks.POLISHED_CALCITE_BRICKS);
            event.accept(ModBlocks.POLISHED_CALCITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_CALCITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_CALCITE_BRICK_WALL);

            event.accept(ModBlocks.GRIMSTONE);
            event.accept(ModBlocks.GRIMSTONE_BRICKS);
            event.accept(ModBlocks.GRIMSTONE_BRICK_SLAB);
            event.accept(ModBlocks.GRIMSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.GRIMSTONE_BRICK_WALL);

            event.accept(ModBlocks.SNOW_BRICKS);
            event.accept(ModBlocks.SNOW_BRICK_SLAB);
            event.accept(ModBlocks.SNOW_BRICK_STAIRS);
            event.accept(ModBlocks.SNOW_BRICK_WALL);

            event.accept(ModBlocks.TUFF_SLAB);
            event.accept(ModBlocks.TUFF_STAIRS);
            event.accept(ModBlocks.TUFF_WALL);

            event.accept(ModBlocks.POLISHED_TUFF);
            event.accept(ModBlocks.POLISHED_TUFF_SLAB);
            event.accept(ModBlocks.POLISHED_TUFF_STAIRS);

            event.accept(ModBlocks.POLISHED_TUFF_BRICKS);
            event.accept(ModBlocks.POLISHED_TUFF_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_TUFF_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_TUFF_BRICK_WALL);

            event.accept(ModBlocks.SMOOTH_BASALT_SLAB);
            event.accept(ModBlocks.SMOOTH_BASALT_STAIRS);
            event.accept(ModBlocks.SMOOTH_BASALT_WALL);

            event.accept(ModBlocks.BASALT_BRICKS);
            event.accept(ModBlocks.BASALT_BRICK_SLAB);
            event.accept(ModBlocks.BASALT_BRICK_STAIRS);
            event.accept(ModBlocks.BASALT_BRICK_WALL);

            event.accept(ModBlocks.CUT_BASALT);
            event.accept(ModBlocks.CUT_BASALT_SLAB);
            event.accept(ModBlocks.CUT_BASALT_STAIRS);

            event.accept(ModBlocks.SANDSTONE_BRICKS);
            event.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.SANDSTONE_BRICK_WALL);

            event.accept(ModBlocks.RED_SANDSTONE_BRICKS);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.RED_SANDSTONE_BRICK_WALL);

            event.accept(ModBlocks.DRIPSTONE_SLAB);
            event.accept(ModBlocks.DRIPSTONE_STAIRS);
            event.accept(ModBlocks.DRIPSTONE_WALL);

            event.accept(ModBlocks.POLISHED_DRIPSTONE);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_STAIRS);

            event.accept(ModBlocks.POLISHED_DRIPSTONE_BRICKS);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_BRICK_WALL);

            event.accept(ModBlocks.GLASS_SLAB);

            event.accept(ModBlocks.NETHER_BRICK_PILLAR);
            event.accept(ModBlocks.NETHER_CORE);

            event.accept(ModBlocks.STRIPPED_CHORUS_LOG);
            event.accept(ModBlocks.STRIPPED_CHORUS_WOOD);
            event.accept(ModBlocks.CHORUS_LOG);
            event.accept(ModBlocks.CHORUS_WOOD);
            event.accept(ModBlocks.CHORUS_PLANKS);
            event.accept(ModBlocks.CHORUS_STAIRS);
            event.accept(ModBlocks.CHORUS_SLAB);
            event.accept(ModBlocks.CHORUS_FENCE);
            event.accept(ModBlocks.CHORUS_FENCE_GATE);
            event.accept(ModBlocks.CHORUS_DOOR);
            event.accept(ModBlocks.CHORUS_TRAPDOOR);
            event.accept(ModBlocks.CHORUS_PRESSURE_PLATE);
            event.accept(ModBlocks.CHORUS_BUTTON);

            event.accept(ModBlocks.STRIPPED_EBONY_LOG);
            event.accept(ModBlocks.STRIPPED_EBONY_WOOD);
            event.accept(ModBlocks.EBONY_LOG);
            event.accept(ModBlocks.EBONY_WOOD);
            event.accept(ModBlocks.EBONY_PLANKS);
            event.accept(ModBlocks.EBONY_STAIRS);
            event.accept(ModBlocks.EBONY_SLAB);
            event.accept(ModBlocks.EBONY_FENCE);
            event.accept(ModBlocks.EBONY_FENCE_GATE);
            event.accept(ModBlocks.EBONY_DOOR);
            event.accept(ModBlocks.EBONY_TRAPDOOR);
            event.accept(ModBlocks.EBONY_PRESSURE_PLATE);
            event.accept(ModBlocks.EBONY_BUTTON);

            event.accept(ModBlocks.SALT_LAMP_BLOCK);

            event.accept(ModBlocks.SOUL_SANDSTONE);
            event.accept(ModBlocks.SOUL_SANDSTONE_SLAB);
            event.accept(ModBlocks.SOUL_SANDSTONE_STAIRS);
            event.accept(ModBlocks.SOUL_SANDSTONE_WALL);

            event.accept(ModBlocks.CHISELED_SOUL_SANDSTONE);

            event.accept(ModBlocks.CUT_SOUL_SANDSTONE);
            event.accept(ModBlocks.CUT_SOUL_SANDSTONE_SLAB);

            event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE);
            event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
            event.accept(ModBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);

            event.accept(ModBlocks.STONE_TILES);
            event.accept(ModBlocks.STONE_TILE_SLAB);
            event.accept(ModBlocks.STONE_TILE_STAIRS);
            event.accept(ModBlocks.STONE_TILE_WALL);

            event.accept(ModBlocks.SOUL_SANDSTONE_BRICKS);
            event.accept(ModBlocks.SOUL_SANDSTONE_BRICK_SLAB);
            event.accept(ModBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.SOUL_SANDSTONE_BRICK_WALL);

            event.accept(ModBlocks.SOUL_GLASS);
            event.accept(ModBlocks.SOUL_GLASS_PANE);

            event.accept(ModBlocks.CRACKED_SANDSTONE);
            event.accept(ModBlocks.CRACKED_RED_SANDSTONE);
            event.accept(ModBlocks.CRACKED_SOUL_SANDSTONE);

            event.accept(ModBlocks.END_SAND);
            event.accept(ModBlocks.END_GLASS);
            event.accept(ModBlocks.END_GLASS_PANE);

            event.accept(ModBlocks.PURPUR_WALL);

            event.accept(ModBlocks.VOID_QUARTZ_BLOCK);
            event.accept(ModBlocks.VOID_QUARTZ_SLAB);
            event.accept(ModBlocks.VOID_QUARTZ_STAIRS);

            event.accept(ModBlocks.SMOOTH_VOID_QUARTZ_BLOCK);
            event.accept(ModBlocks.SMOOTH_VOID_QUARTZ_SLAB);
            event.accept(ModBlocks.SMOOTH_VOID_QUARTZ_STAIRS);

            event.accept(ModBlocks.CHISELED_VOID_QUARTZ_BLOCK);
            event.accept(ModBlocks.VOID_QUARTZ_PILLAR);

            event.accept(ModBlocks.VOID_QUARTZ_BRICKS);
            event.accept(ModBlocks.VOID_QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.VOID_QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.VOID_QUARTZ_BRICK_WALL);

            event.accept(ModBlocks.QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.QUARTZ_BRICK_WALL);

            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.STEEL_BARS);
            event.accept(ModBlocks.STEEL_DOOR);
            event.accept(ModBlocks.STEEL_TRAPDOOR);

            event.accept(ModBlocks.STICK_BLOCK);
            event.accept(ModBlocks.BLAZE_BUNDLE);
            event.accept(ModBlocks.BONE_BUNDLE);
            event.accept(ModBlocks.CANDY_CANE_BLOCK);
            event.accept(ModBlocks.CANDY_CORN_BLOCK);
            event.accept(ModBlocks.BLACK_ICE);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.COMPACT_AMETHYST_BLOCK);
            event.accept(ModBlocks.HELLSTEEL_BLOCK);
            event.accept(ModBlocks.CHARCOAL_BLOCK);
            event.accept(ModBlocks.STAR_BLOCK);
            event.accept(ModBlocks.SULFUR_BLOCK);
            event.accept(ModBlocks.ROSE_GOLD_BLOCK);
            event.accept(ModBlocks.ROSE_QUARTZ_BLOCK);
            event.accept(ModBlocks.SALT_BLOCK);
            event.accept(ModBlocks.BRIMSTONE_BLOCK);
            event.accept(ModBlocks.ABYSSON_BLOCK);
        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){

            event.accept(ModBlocks.GRIMSTONE);

            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.SALT_BLOCK);
            event.accept(ModBlocks.NETHER_COAL_ORE);
            event.accept(ModBlocks.SULFUR_ORE);
            event.accept(ModBlocks.BRIMSTONE_BLOCK);
            event.accept(ModBlocks.ABYSSON_ORE);

            event.accept(ModBlocks.EBONY_SAPLING);
            event.accept(ModBlocks.EBONY_LOG);
            event.accept(ModBlocks.EBONY_LEAVES);
            event.accept(ModBlocks.EBONY_LEAF_CARPET);

            event.accept(ModBlocks.DRIED_BIRCH_LEAF_CARPET);
            event.accept(ModBlocks.DRIED_OAK_LEAF_CARPET);

            event.accept(ModBlocks.DRIED_OAK_LEAVES);
            event.accept(ModBlocks.DRIED_BIRCH_LEAVES);

            event.accept(ModBlocks.OAK_LEAF_CARPET);
            event.accept(ModBlocks.BIRCH_LEAF_CARPET);
            event.accept(ModBlocks.AZALEA_LEAF_CARPET);
            event.accept(ModBlocks.FLOWERING_AZALEA_LEAF_CARPET);
            event.accept(ModBlocks.ACACIA_LEAF_CARPET);
            event.accept(ModBlocks.SPRUCE_LEAF_CARPET);
            event.accept(ModBlocks.DARK_OAK_LEAF_CARPET);
            event.accept(ModBlocks.JUNGLE_LEAF_CARPET);
            event.accept(ModBlocks.MANGROVE_LEAF_CARPET);

            event.accept(ModBlocks.CYAN_ROSE);
            event.accept(ModBlocks.RED_ROSE);
            event.accept(ModBlocks.BONE_FLOWER);
        }
        if(event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS){
            event.accept(ModBlocks.SOUL_TNT);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
//            MenuScreens.register(ModMenuTypes.KILN_BLOCK_MENU.get(), KilnBlockScreen::new);
            BlockColors blockColors = Minecraft.getInstance().getBlockColors();
            ItemColors itemColors = Minecraft.getInstance().getItemColors();

            //Leaf Coloring
            blockColors.register((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.OAK_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> {
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.OAK_LEAF_CARPET.get());

            //Leaf Coloring
            blockColors.register((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.EBONY_LEAVES.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> {
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.EBONY_LEAVES.get());

            //Leaf Coloring
            blockColors.register((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.EBONY_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> {
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.EBONY_LEAF_CARPET.get());

            //Birch Leaf Coloring
            blockColors.register((p92631, p92632, p92633, p92634) -> {
                return FoliageColor.getBirchColor();
            }, ModBlocks.BIRCH_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> { //Change to event.register for 1.19.3
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.BIRCH_LEAF_CARPET.get());

            //Acacia Leaf Coloring
            blockColors.register((state, world, pos, tintIndex) ->
                            world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                    ModBlocks.ACACIA_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> {
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.ACACIA_LEAF_CARPET.get());

            //SPRUCE Leaf Coloring
            blockColors.register((p92631, p92632, p92633, p92634) -> {
                return FoliageColor.getEvergreenColor();
            }, ModBlocks.SPRUCE_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> { //Change to event.register for 1.19.3
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.SPRUCE_LEAF_CARPET.get());

            //DARK OAK Leaf Coloring
            blockColors.register((p92631, p92632, p92633, p92634) -> {
                return FoliageColor.getDefaultColor();
            }, ModBlocks.DARK_OAK_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> { //Change to event.register for 1.19.3
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.DARK_OAK_LEAF_CARPET.get());

            //JUNGLE Leaf Coloring
            blockColors.register((p92631, p92632, p92633, p92634) -> {
                return FoliageColor.getDefaultColor();
            }, ModBlocks.JUNGLE_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> { //Change to event.register for 1.19.3
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.JUNGLE_LEAF_CARPET.get());

            //MANGROVE Leaf Coloring
            blockColors.register((p92631, p92632, p92633, p92634) -> {
                return FoliageColor.getMangroveColor();
            }, ModBlocks.MANGROVE_LEAF_CARPET.get());
            //Grabs the color of the block and sets the item color to be the same
            itemColors.register((stack, tintIndex) -> { //Change to event.register for 1.19.3
                        BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                        return blockColors.getColor(BlockState, null, null, tintIndex); },
                    ModBlocks.MANGROVE_LEAF_CARPET.get());
         }
    }
}
