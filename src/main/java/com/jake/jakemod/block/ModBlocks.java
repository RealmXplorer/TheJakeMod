package com.jake.jakemod.block;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.custom.*;
//import com.jake.jakemod.block.custom.KilnBlockOld;
import com.jake.jakemod.block.custom.DirectionalBlock;
import com.jake.jakemod.item.custom.*;
import com.jake.jakemod.item.ModItems;
import com.jake.jakemod.item.custom.BrimstoneBlock;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JakeMod.MOD_ID);

    //POLISHED GRANITE BRICKS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    public static final RegistryObject<Block> KILN_BLOCK = registerBlock("kiln_block",
            () -> new KilnBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion().explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    //GRIMSTONE
    public static final RegistryObject<Block> GRIMSTONE = registerBlock("grimstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
//GRIMSTONE BRICKS
    public static final RegistryObject<Block> GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //GRIMSTONE BRICK STAIRS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_STAIRS = registerBlock("grimstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRIMSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(3f).requiresCorrectToolForDrops().explosionResistance(4).sound(SoundType.NETHER_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //GRIMSTONE BRICK SLABS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //GRIMSTONE BRICK WALLS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED ANDESITE BRICKS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED DIORITE BRICKS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


//DRIED OAK LEAVES
public static final RegistryObject<Block> DRIED_OAK_LEAVES = registerBlock("dried_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);

    //DRIED BIRCH LEAVES
    public static final RegistryObject<Block> DRIED_BIRCH_LEAVES = registerBlock("dried_birch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);

    //OAK LEAF CARPET
    public static final RegistryObject<Block> OAK_LEAF_CARPET = registerBlock("oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //MANGROVE LEAF CARPET
    public static final RegistryObject<Block> MANGROVE_LEAF_CARPET = registerBlock("mangrove_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //BIRCH LEAF CARPET
    public static final RegistryObject<Block> BIRCH_LEAF_CARPET = registerBlock("birch_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //SPRUCE LEAF CARPET
    public static final RegistryObject<Block> SPRUCE_LEAF_CARPET = registerBlock("spruce_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //ACACIA LEAF CARPET
    public static final RegistryObject<Block> ACACIA_LEAF_CARPET = registerBlock("acacia_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //AZAELEA LEAF CARPET
    public static final RegistryObject<Block> AZALEA_LEAF_CARPET = registerBlock("azalea_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).strength(0f).sound(SoundType.AZALEA_LEAVES)), CreativeModeTab.TAB_DECORATIONS);
    //FLOWERING AZAELEA LEAF CARPET
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAF_CARPET = registerBlock("flowering_azalea_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).strength(0f).sound(SoundType.AZALEA_LEAVES)), CreativeModeTab.TAB_DECORATIONS);

    //DARK OAK LEAF CARPET
    public static final RegistryObject<Block> DARK_OAK_LEAF_CARPET = registerBlock("dark_oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //JUNGLE LEAF CARPET
    public static final RegistryObject<Block> JUNGLE_LEAF_CARPET = registerBlock("jungle_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);



    //DRIED OAK LEAF CARPET
    public static final RegistryObject<Block> DRIED_OAK_LEAF_CARPET = registerBlock("dried_oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(ModBlocks.DRIED_OAK_LEAVES.get()).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);


    //BIRCH LEAF CARPET
    public static final RegistryObject<Block> DRIED_BIRCH_LEAF_CARPET = registerBlock("dried_birch_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(ModBlocks.DRIED_BIRCH_LEAVES.get()).strength(0f).sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);


    //CRACKED SANDSTONE
    public static final RegistryObject<Block> CRACKED_SANDSTONE = registerBlock("cracked_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CRACKED RED SANDSTONE
    public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = registerBlock("cracked_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CRACKED SOUL SANDSTONE
    public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = registerBlock("cracked_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SANDSTONE BRICKS
    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    //RED SANDSTONE BRICKS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //RED SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //RED SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //RED SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    //STONE TILES
    public static final RegistryObject<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //STONE TILE STAIRS
    public static final RegistryObject<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.STONE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //STONE TILE SLABS
    public static final RegistryObject<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //STONE TILE WALLS
    public static final RegistryObject<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    //VOID QUARTZ BLOCK
    public static final RegistryObject<Block> VOID_QUARTZ_BLOCK = registerBlock("void_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//VOID QUARTZ STAIRS
    public static final RegistryObject<Block> VOID_QUARTZ_STAIRS = registerBlock("void_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //VOID QUARTZ SLABS
    public static final RegistryObject<Block> VOID_QUARTZ_SLAB = registerBlock("void_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //SMOOTH VOID QUARTZ BLOCK
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_BLOCK = registerBlock("smooth_void_quartz",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SMOOTH VOID QUARTZ STAIRS
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_STAIRS = registerBlock("smooth_void_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //VOID QUARTZ SLABS
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_SLAB = registerBlock("smooth_void_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //VOID QUARTZ BRICKS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICKS = registerBlock("void_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //VOID QUARTZ BRICK STAIRS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_STAIRS = registerBlock("void_quartz_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
 //VOID QUARTZ BRICK SLABS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_SLAB = registerBlock("void_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
  //VOID QUARTZ BRICK WALLS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_WALL = registerBlock("void_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    //VOID QUARTZ PILLAR
    public static final RegistryObject<Block> VOID_QUARTZ_PILLAR = registerBlock("void_quartz_pillar",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //CHISELED VOID QUARTZ BLOCK
    public static final RegistryObject<Block> CHISELED_VOID_QUARTZ_BLOCK = registerBlock("chiseled_void_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);



    // QUARTZ BRICK STAIRS
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(() -> Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //QUARTZ BRICK SLABS
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    // QUARTZ BRICK WALLS
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    //COMPACT AMETHYST BLOCK
    public static final RegistryObject<Block> COMPACT_AMETHYST_BLOCK = registerBlock("compact_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //STEEL BLOCK
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //HELLSTEEL BLOCK
    public static final RegistryObject<Block> HELLSTEEL_BLOCK = registerBlock("hellsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //ROSE QUARTZ BLOCK
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //CHISELED SOUL SANDSTONE
    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = registerBlock("chiseled_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CUT SOUL SANDSTONE
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = registerBlock("cut_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CUT SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = registerBlock("cut_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //SOUL SANDSTONE
    public static final RegistryObject<Block> SOUL_SANDSTONE = registerBlock("soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE STAIRS
    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = registerBlock("soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = registerBlock("soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE WALLS
    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = registerBlock("soul_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    //SMOOTH SOUL SANDSTONE
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = registerBlock("smooth_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SMOOTH SOUL SANDSTONE STAIRS
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock("smooth_soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SMOOTH SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock("smooth_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //SOUL SANDSTONE BRICKS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICKS = registerBlock("soul_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_STAIRS = registerBlock("soul_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_SLAB = registerBlock("soul_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SOUL SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_WALL = registerBlock("soul_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //PURPUR WALLS
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(2f).requiresCorrectToolForDrops().explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //BRIMSTONE BLOCK
    public static final RegistryObject<Block> BRIMSTONE_BLOCK = registerBlock("brimstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLAZE_BUNDLE = registerBlock("blaze_bundle",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //ZIRCON BLOCK
    //public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
        //    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
      //              .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.JAKE_TAB);

    //ZIRCON ORE
    //public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
          //  () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
        //            .strength(6f).requiresCorrectToolForDrops(),
      //              UniformInt.of(3,7)),
    //                ModCreativeModeTab.JAKE_TAB);

    //DEEPSLATE ZIRCON ORE
   // public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
     //       () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
       //             .strength(6f).requiresCorrectToolForDrops(),
         //           UniformInt.of(3,7)),
           //         ModCreativeModeTab.JAKE_TAB);


    //RUBY ORE
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops().explosionResistance(4),
                    UniformInt.of(3,7)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> NETHER_COAL_ORE = registerBlock("nether_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_GOLD_ORE),
                    UniformInt.of(2,4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ABYSSON_ORE = registerBlock("abysson_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4),
                    UniformInt.of(2,4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //RUBY BLOCK
    public static final RegistryObject<Block> ABYSSON_BLOCK = registerBlock("abysson_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().explosionResistance(4)
                    .sound(SoundType.METAL)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //DEEPSLATE RUBY ORE
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops().explosionResistance(4)
                    .sound(SoundType.DEEPSLATE),
                    UniformInt.of(3,7)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //RUBY BLOCK
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //RUBY BLOCK
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);


    //TUFF STAIRS
    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(() -> Blocks.TUFF.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(1f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //TUFF SLABS
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(1f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //TUFF WALLS
    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
    .sound(SoundType.TUFF).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    //DRIPSTONE STAIRS
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //DRIPSTONE SLABS
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //DRIPSTONE WALLS
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED DRIPSTONE BLOCK
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DRIPSTONE STAIRS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DRIPSTONE SLABS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //POLISHED DRIPSTONE BRICKS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICKS = registerBlock("polished_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DRIPSTONE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_STAIRS = registerBlock("polished_dripstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DRIPSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DRIPSTONE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_SLAB = registerBlock("polished_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DRIPSTONE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_WALL = registerBlock("polished_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED TUFF BLOCK
    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
//POLISHED TUFF STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //POLISHED TUFF BRICKS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = registerBlock("polished_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_STAIRS = registerBlock("polished_tuff_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_SLAB = registerBlock("polished_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK WALLS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_WALL = registerBlock("polished_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    //STICK BLOCK
    public static final RegistryObject<StickBlock> STICK_BLOCK = registerBlock("stick_block",
            () -> new StickBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1f)
                    .sound(SoundType.SCAFFOLDING)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //CALCITE STAIRS
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(() -> Blocks.CALCITE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(1f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CALCITE SLABS
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CALCITE WALLS
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED CALCITE BLOCK
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED CALCITE STAIRS
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED CALCITE SLABS
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED CALCITE BRICKS BLOCK
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED CALCITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_STAIRS = registerBlock("polished_calcite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED CALCITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_SLAB = registerBlock("polished_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED CALCITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_WALL = registerBlock("polished_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);


    //NETHER BRICK PILLAR
    public static final RegistryObject<Block> NETHER_BRICK_PILLAR = registerBlock("nether_brick_pillar",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)
                    .sound(SoundType.NETHER_BRICKS)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //CHORUS LOG
    public static final RegistryObject<Block> CHORUS_LOG = registerBlock("chorus_log",
            () -> new ChorusLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
//STRIPPED CHORUS LOG
    public static final RegistryObject<Block> STRIPPED_CHORUS_LOG = registerBlock("stripped_chorus_log",
            () -> new DirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //STRIPPED CHORUS WOOD
    public static final RegistryObject<Block> STRIPPED_CHORUS_WOOD = registerBlock("stripped_chorus_wood",
            () -> new DirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //END SAND
    public static final RegistryObject<Block> END_SAND = registerBlock("end_sand",
            () -> new SandBlock(3, BlockBehaviour.Properties.of(Material.SAND)
                    .strength(1f)
                    .sound(SoundType.SAND)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //CHORUS WOOD
    public static final RegistryObject<Block> CHORUS_WOOD = registerBlock("chorus_wood",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //CHORUS PLANKS
    public static final RegistryObject<Block> CHORUS_PLANKS = registerBlock("chorus_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CHORUS PLANKS
    public static final RegistryObject<Block> CHORUS_PRESSURE_PLATE = registerBlock("chorus_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f)
                    .sound(SoundType.WOOD)),
            CreativeModeTab.TAB_REDSTONE);

    //CHORUS STAIRS
    public static final RegistryObject<Block> CHORUS_STAIRS = registerBlock("chorus_stairs",
            () -> new StairBlock(() -> ModBlocks.CHORUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .sound(SoundType.WOOD)
                            .strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CHORUS SLABS
    public static final RegistryObject<Block> CHORUS_SLAB = registerBlock("chorus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //CHORUS FENCE POST
    public static final RegistryObject<Block> CHORUS_FENCE = registerBlock("chorus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)), CreativeModeTab.TAB_DECORATIONS);
    //CHORUS FENCE GATE
    public static final RegistryObject<Block> CHORUS_FENCE_GATE = registerBlock("chorus_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)), CreativeModeTab.TAB_DECORATIONS);

    //CHORUS DOOR
    public static final RegistryObject<Block> CHORUS_DOOR = registerBlock("chorus_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_REDSTONE);
    //CHORUS TRAPDOOR
    public static final RegistryObject<Block> CHORUS_TRAPDOOR = registerBlock("chorus_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_REDSTONE);
    //CHORUS BUTTON
    public static final RegistryObject<Block> CHORUS_BUTTON = registerBlock("chorus_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()
                    .noCollission()), CreativeModeTab.TAB_REDSTONE);

    //public static final RegistryObject<Block> void_lantern = registerBlock("void_lantern",
      //      () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL)
        //            .strength(2f)
          //          .noOcclusion().sound(SoundType.LANTERN)), CreativeModeTab.TAB_DECORATIONS);
    //SNOW BRICKS
    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK STAIRS
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SNOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.SNOW)
                            .strength(.5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK SLABS
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.SNOW)
                    .strength(.5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK WALLS
    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW)), CreativeModeTab.TAB_DECORATIONS);


    //SMOOTH BASALT STAIRS
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SMOOTH BASALT SLABS
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SMOOTH BASALT WALLS
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);



    //CUT BASALT BLOCK
    public static final RegistryObject<Block> CUT_BASALT = registerBlock("cut_basalt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CUT BASALT STAIRS
    public static final RegistryObject<Block> CUT_BASALT_STAIRS = registerBlock("cut_basalt_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_BASALT.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //CUT BASALT SLABS
    public static final RegistryObject<Block> CUT_BASALT_SLAB = registerBlock("cut_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);





    //BASALT BRICKS
    public static final RegistryObject<Block> BASALT_BRICKS = registerBlock("basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //BASALT BRICK STAIRS
    public static final RegistryObject<Block> BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BASALT_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //BASALT BRICK SLABS
    public static final RegistryObject<Block> BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //BASALT BRICK WALLS
    public static final RegistryObject<Block> BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    //MINT CROP
    public static final RegistryObject<Block> MINT_CROP = BLOCKS.register("mint_crop",
            () -> new MintCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

//CANDY CANE BLOCK
    public static final RegistryObject<Block> CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //VOID QUARTZ PILLAR
    public static final RegistryObject<Block> CANDY_CORN_BLOCK = registerBlock("candy_corn_block",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    //SOUL GLASS
    public static final RegistryObject<Block> SOUL_GLASS = registerBlock("soul_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
                    ),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> SOUL_GLASS_PANE = registerBlock("soul_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.5f)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            ),
            CreativeModeTab.TAB_DECORATIONS);

    //END GLASS
    public static final RegistryObject<Block> END_GLASS = registerBlock("end_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            ),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> END_GLASS_PANE = registerBlock("end_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.5f)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            ),
            CreativeModeTab.TAB_DECORATIONS);

    //GLASS SLAB
    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new GlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            ),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //GLASS STAIRS
//    public static final RegistryObject<Block> GLASS_STAIRS = registerBlock("glass_stairs",
//            () -> new GlassStairBlock(() -> Blocks.GLASS.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.GLASS)
//                    .noOcclusion()
//                    .strength(.5f)
//                    .sound(SoundType.GLASS)
//                    .explosionResistance(4)
//            ),
//            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //COPPER BUTTON
    //public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
    //        () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
    //                .strength(2f).requiresCorrectToolForDrops()
    //                .noCollission()), CreativeModeTab.TAB_REDSTONE);
    //COPPER PRESSURE PLATE
    //public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
    //        () -> new PressurePlateBlock(PressurePlateBlock
    //                .Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.STONE)
    //                .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_REDSTONE);
    //COPPER DOOR
    //public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door",
    //        () -> new DoorBlock(BlockBehaviour.Properties.of(Material.STONE)
    //                .strength(2f).requiresCorrectToolForDrops()
    //               .noOcclusion()), CreativeModeTab.TAB_REDSTONE);
    //COPPER TRAPDOOR
    //public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
    //        () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.STONE)
    //                .strength(2f).requiresCorrectToolForDrops()
    //                .noOcclusion()), CreativeModeTab.TAB_REDSTONE);

    //STEEL DOOR
    public static final RegistryObject<Block> STEEL_DOOR = registerBlock("steel_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()
                   .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)), CreativeModeTab.TAB_REDSTONE);
    //STEEL TRAPDOOR
    public static final RegistryObject<Block> STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()
                    .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)), CreativeModeTab.TAB_REDSTONE);
    //STEEL BARS
    public static final RegistryObject<Block> STEEL_BARS = registerBlock("steel_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()
                    .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SOUL_TNT = registerBlock("soul_tnt",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.SOUL_SAND)), CreativeModeTab.TAB_REDSTONE);

    public static final RegistryObject<Block> NETHER_CORE = registerBlock("nether_core",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .noOcclusion().sound(SoundType.METAL).explosionResistance(4)), CreativeModeTab.TAB_DECORATIONS);

    //public static final RegistryObject<Block> BLACKSTONE_CUTTER = registerBlock("blackstone_cutter",
      //      () -> new StonecutterBlock(BlockBehaviour.Properties.of(Material.STONE)
        //            .strength(1f)
          //          .noOcclusion().sound(SoundType.STONE)), CreativeModeTab.TAB_DECORATIONS);


    //CYAN ROSE
    public static final RegistryObject<Block> CYAN_ROSE = registerBlock("cyan_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //POTTED CYAN ROSE
    public static final RegistryObject<Block> POTTED_CYAN_ROSE = registerBlockWithoutBlockItem("potted_cyan_rose",
            () -> new FlowerPotBlock(null,ModBlocks.CYAN_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    //RED ROSE
    public static final RegistryObject<Block> RED_ROSE = registerBlock("red_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.GRASS)), CreativeModeTab.TAB_DECORATIONS);
    //POTTED RED ROSE
    public static final RegistryObject<Block> POTTED_RED_ROSE = registerBlockWithoutBlockItem("potted_red_rose",
            () -> new FlowerPotBlock(null,ModBlocks.RED_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    //RED ROSE
    public static final RegistryObject<Block> BONE_FLOWER = registerBlock("bone_flower",
            () -> new BoneFlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.ROOTS)), CreativeModeTab.TAB_DECORATIONS);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        if (name.equals("brimstone_block"))
            return ModItems.ITEMS.register(name,() -> new BrimstoneBlock(block.get(), new Item.Properties().tab(tab)));
        else if(name.equals("charcoal_block"))
            return ModItems.ITEMS.register(name,() -> new CharcoalBlock(block.get(), new Item.Properties().tab(tab)));
        else if(name.equals("abysson_block"))
            return ModItems.ITEMS.register(name,() -> new AbyssonBlock(block.get(), new Item.Properties().tab(tab)));
        else if(name.equals("blaze_bundle"))
            return ModItems.ITEMS.register(name,() -> new BlazeBundleBlock(block.get(), new Item.Properties().tab(tab)));
        else if(name.equals("stick_block"))
            return ModItems.ITEMS.register(name,() -> new StickBundleBlock(block.get(), new Item.Properties().tab(tab)));
        else
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
