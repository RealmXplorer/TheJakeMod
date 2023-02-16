package com.jake.jakemod.block;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.custom.*;
//import com.jake.jakemod.block.custom.KilnBlockOld;
import com.jake.jakemod.block.custom.DirectionalBlock;
import com.jake.jakemod.item.custom.*;
import com.jake.jakemod.item.ModItems;
import com.jake.jakemod.item.custom.BrimstoneBlock;
import com.jake.jakemod.world.feature.tree.EbonyTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));

    //POLISHED GRANITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops().explosionResistance(4)));

    //POLISHED GRANITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));

    //POLISHED GRANITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> KILN_BLOCK = registerBlock("kiln_block",
            () -> new KilnBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion().explosionResistance(4)));

    //GRIMSTONE
    public static final RegistryObject<Block> GRIMSTONE = registerBlock("grimstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
//GRIMSTONE BRICKS
    public static final RegistryObject<Block> GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    //GRIMSTONE BRICK STAIRS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_STAIRS = registerBlock("grimstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRIMSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(3f).requiresCorrectToolForDrops().explosionResistance(4).sound(SoundType.NETHER_BRICKS)));
    //GRIMSTONE BRICK SLABS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    //GRIMSTONE BRICK WALLS
    public static final RegistryObject<Block> GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));


    //POLISHED ANDESITE BRICKS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //POLISHED ANDESITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
    //POLISHED ANDESITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //POLISHED ANDESITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    //POLISHED DIORITE BRICKS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //POLISHED DIORITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops().explosionResistance(4)));
    //POLISHED DIORITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //POLISHED DIORITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


//DRIED OAK LEAVES
public static final RegistryObject<Block> DRIED_OAK_LEAVES = registerBlock("dried_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.3f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 45;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 90;
                }
            });

    //DRIED BIRCH LEAVES
    public static final RegistryObject<Block> DRIED_BIRCH_LEAVES = registerBlock("dried_birch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).strength(0.3f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 45;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 90;
                }
            });

    //OAK LEAF CARPET
    public static final RegistryObject<Block> OAK_LEAF_CARPET = registerBlock("oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0f).noCollission().sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //MANGROVE LEAF CARPET
    public static final RegistryObject<Block> MANGROVE_LEAF_CARPET = registerBlock("mangrove_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //BIRCH LEAF CARPET
    public static final RegistryObject<Block> BIRCH_LEAF_CARPET = registerBlock("birch_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //SPRUCE LEAF CARPET
    public static final RegistryObject<Block> SPRUCE_LEAF_CARPET = registerBlock("spruce_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //ACACIA LEAF CARPET
    public static final RegistryObject<Block> ACACIA_LEAF_CARPET = registerBlock("acacia_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //AZAELEA LEAF CARPET
    public static final RegistryObject<Block> AZALEA_LEAF_CARPET = registerBlock("azalea_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).noCollission().strength(0f).sound(SoundType.AZALEA_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //FLOWERING AZAELEA LEAF CARPET
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAF_CARPET = registerBlock("flowering_azalea_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).noCollission().strength(0f).sound(SoundType.AZALEA_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });

    //DARK OAK LEAF CARPET
    public static final RegistryObject<Block> DARK_OAK_LEAF_CARPET = registerBlock("dark_oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });
    //JUNGLE LEAF CARPET
    public static final RegistryObject<Block> JUNGLE_LEAF_CARPET = registerBlock("jungle_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });



    //DRIED OAK LEAF CARPET
    public static final RegistryObject<Block> DRIED_OAK_LEAF_CARPET = registerBlock("dried_oak_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(ModBlocks.DRIED_OAK_LEAVES.get()).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });


    //BIRCH LEAF CARPET
    public static final RegistryObject<Block> DRIED_BIRCH_LEAF_CARPET = registerBlock("dried_birch_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(ModBlocks.DRIED_BIRCH_LEAVES.get()).noCollission().strength(0f).sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            });


    //CRACKED SANDSTONE
    public static final RegistryObject<Block> CRACKED_SANDSTONE = registerBlock("cracked_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //CRACKED RED SANDSTONE
    public static final RegistryObject<Block> CRACKED_RED_SANDSTONE = registerBlock("cracked_red_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //CRACKED SOUL SANDSTONE
    public static final RegistryObject<Block> CRACKED_SOUL_SANDSTONE = registerBlock("cracked_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //SANDSTONE BRICKS
    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()));
    //SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()));
    //SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));
    //SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));

    //RED SANDSTONE BRICKS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()));
    //RED SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()));
    //RED SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));
    //RED SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()));


    //STONE TILES
    public static final RegistryObject<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //STONE TILE STAIRS
    public static final RegistryObject<Block> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.STONE_TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
    //STONE TILE SLABS
    public static final RegistryObject<Block> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //STONE TILE WALLS
    public static final RegistryObject<Block> STONE_TILE_WALL = registerBlock("stone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    //VOID QUARTZ BLOCK
    public static final RegistryObject<Block> VOID_QUARTZ_BLOCK = registerBlock("void_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
//VOID QUARTZ STAIRS
    public static final RegistryObject<Block> VOID_QUARTZ_STAIRS = registerBlock("void_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
    //VOID QUARTZ SLABS
    public static final RegistryObject<Block> VOID_QUARTZ_SLAB = registerBlock("void_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    //SMOOTH VOID QUARTZ BLOCK
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_BLOCK = registerBlock("smooth_void_quartz",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //SMOOTH VOID QUARTZ STAIRS
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_STAIRS = registerBlock("smooth_void_quartz_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
    //VOID QUARTZ SLABS
    public static final RegistryObject<Block> SMOOTH_VOID_QUARTZ_SLAB = registerBlock("smooth_void_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    //VOID QUARTZ BRICKS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICKS = registerBlock("void_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    //VOID QUARTZ BRICK STAIRS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_STAIRS = registerBlock("void_quartz_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_VOID_QUARTZ_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
 //VOID QUARTZ BRICK SLABS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_SLAB = registerBlock("void_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
  //VOID QUARTZ BRICK WALLS
    public static final RegistryObject<Block> VOID_QUARTZ_BRICK_WALL = registerBlock("void_quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));

    //VOID QUARTZ PILLAR
    public static final RegistryObject<Block> VOID_QUARTZ_PILLAR = registerBlock("void_quartz_pillar",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)
                    .explosionResistance(4))
    );

    //CHISELED VOID QUARTZ BLOCK
    public static final RegistryObject<Block> CHISELED_VOID_QUARTZ_BLOCK = registerBlock("chiseled_void_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));



    // QUARTZ BRICK STAIRS
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(() -> Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).explosionResistance(4).requiresCorrectToolForDrops()));
    //QUARTZ BRICK SLABS
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));
    // QUARTZ BRICK WALLS
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(4).strength(2f).requiresCorrectToolForDrops()));


    //COMPACT AMETHYST BLOCK
    public static final RegistryObject<Block> COMPACT_AMETHYST_BLOCK = registerBlock("compact_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).explosionResistance(4)));

    //STEEL BLOCK
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)));

    //HELLSTEEL BLOCK
    public static final RegistryObject<Block> HELLSTEEL_BLOCK = registerBlock("hellsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)));

    //ROSE QUARTZ BLOCK
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL).explosionResistance(4)));


    //CHISELED SOUL SANDSTONE
    public static final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = registerBlock("chiseled_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //CUT SOUL SANDSTONE
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE = registerBlock("cut_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //CUT SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_SLAB = registerBlock("cut_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()));

    //SOUL SANDSTONE
    public static final RegistryObject<Block> SOUL_SANDSTONE = registerBlock("soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //SOUL SANDSTONE STAIRS
    public static final RegistryObject<Block> SOUL_SANDSTONE_STAIRS = registerBlock("soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops()));
    //SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> SOUL_SANDSTONE_SLAB = registerBlock("soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()));
    //SOUL SANDSTONE WALLS
    public static final RegistryObject<Block> SOUL_SANDSTONE_WALL = registerBlock("soul_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops()));

    //SMOOTH SOUL SANDSTONE
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE = registerBlock("smooth_soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    //SMOOTH SOUL SANDSTONE STAIRS
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = registerBlock("smooth_soul_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops()));
    //SMOOTH SOUL SANDSTONE SLABS
    public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_SLAB = registerBlock("smooth_soul_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops()));


    //SOUL SANDSTONE BRICKS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICKS = registerBlock("soul_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)));
    //SOUL SANDSTONE BRICK STAIRS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_STAIRS = registerBlock("soul_sandstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_SANDSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.STONE)
                            .strength(1f).requiresCorrectToolForDrops().explosionResistance(4)));
    //SOUL SANDSTONE BRICK SLABS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_SLAB = registerBlock("soul_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(1f).requiresCorrectToolForDrops().explosionResistance(4)));
    //SOUL SANDSTONE BRICK WALLS
    public static final RegistryObject<Block> SOUL_SANDSTONE_BRICK_WALL = registerBlock("soul_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(1f).requiresCorrectToolForDrops().explosionResistance(4)));


    //PURPUR WALLS
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE).strength(2f).requiresCorrectToolForDrops().explosionResistance(4)));


    //BRIMSTONE BLOCK
    public static final RegistryObject<Block> BRIMSTONE_BLOCK = registerBlock("brimstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT).explosionResistance(4)));

    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)));

    public static final RegistryObject<Block> BLAZE_BUNDLE = registerBlock("blaze_bundle",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4)));

    public static final RegistryObject<Block> BONE_BUNDLE = registerBlock("bone_bundle",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f)
                    .sound(SoundType.BONE_BLOCK).explosionResistance(4)));

    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT).explosionResistance(4)));

//    public static final RegistryObject<Block> WARPED_BOOKCASE = registerBlock("blaze_bundle",
//            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(2f).requiresCorrectToolForDrops()
//                    .sound(SoundType.STONE).explosionResistance(4)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //RUBY ORE
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops().explosionResistance(4),
                    UniformInt.of(3,7))
    );
    public static final RegistryObject<Block> NETHER_COAL_ORE = registerBlock("nether_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_GOLD_ORE),
                    UniformInt.of(2,4))
    );

    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_GOLD_ORE),
                    UniformInt.of(1,3)));

    public static final RegistryObject<Block> ABYSSON_ORE = registerBlock("abysson_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4),
                    UniformInt.of(2,4)));

    public static final RegistryObject<Block> BLACK_ICE = registerBlock("black_ice",
            () -> new HalfTransparentBlock(BlockBehaviour.Properties.of(Material.ICE_SOLID).strength(2.8F).friction(1F).sound(SoundType.GLASS))
    );

    //ABYSSON BLOCK
    public static final RegistryObject<Block> ABYSSON_BLOCK = registerBlock("abysson_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().explosionResistance(4)
                    .sound(SoundType.METAL))
    );

    //SULFUR BLOCK
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().explosionResistance(4)
                    .sound(SoundType.METAL))
    );

    //DEEPSLATE RUBY ORE
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops().explosionResistance(4)
                    .sound(SoundType.DEEPSLATE),
                    UniformInt.of(3,7))
    );
    //RUBY BLOCK
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .explosionResistance(4))
    );

    //RUBY BLOCK
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .explosionResistance(4))
    );


    //TUFF STAIRS
    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(() -> Blocks.TUFF.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(1f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //TUFF SLABS
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(1f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //TUFF WALLS
    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
    .sound(SoundType.TUFF).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));

    //DRIPSTONE STAIRS
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //DRIPSTONE SLABS
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //DRIPSTONE WALLS
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));


    //POLISHED DRIPSTONE BLOCK
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4))
    );
    //POLISHED DRIPSTONE STAIRS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED DRIPSTONE SLABS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));


    //POLISHED DRIPSTONE BRICKS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICKS = registerBlock("polished_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4))
    );
    //POLISHED DRIPSTONE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_STAIRS = registerBlock("polished_dripstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DRIPSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.DRIPSTONE_BLOCK)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED DRIPSTONE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_SLAB = registerBlock("polished_dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //POLISHED DRIPSTONE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_WALL = registerBlock("polished_dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4)));


    //POLISHED TUFF BLOCK
    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4))
    );
//POLISHED TUFF STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED TUFF SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));


    //POLISHED TUFF BRICKS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = registerBlock("polished_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4))
    );
    //POLISHED TUFF BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_STAIRS = registerBlock("polished_tuff_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED TUFF BRICK SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_SLAB = registerBlock("polished_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //POLISHED TUFF BRICK WALLS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_WALL = registerBlock("polished_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)
                    .explosionResistance(4)));

    //STICK BLOCK
    public static final RegistryObject<StickBlock> STICK_BLOCK = registerBlock("stick_block",
            () -> new StickBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1f)
                    .sound(SoundType.SCAFFOLDING)));


    //CALCITE STAIRS
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(() -> Blocks.CALCITE.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(1f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //CALCITE SLABS
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //CALCITE WALLS
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));


    //POLISHED CALCITE BLOCK
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4))
    );
    //POLISHED CALCITE STAIRS
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED CALCITE SLABS
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));

    //POLISHED CALCITE BRICKS BLOCK
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4))
    );
    //POLISHED CALCITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_STAIRS = registerBlock("polished_calcite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_CALCITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.CALCITE)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //POLISHED CALCITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_SLAB = registerBlock("polished_calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.CALCITE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //POLISHED CALCITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_CALCITE_BRICK_WALL = registerBlock("polished_calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.CALCITE)
                    .explosionResistance(4)));


    //NETHER BRICK PILLAR
    public static final RegistryObject<Block> NETHER_BRICK_PILLAR = registerBlock("nether_brick_pillar",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)
                    .sound(SoundType.NETHER_BRICKS)
                    .explosionResistance(4))
    );

    //CHORUS LOG
    public static final RegistryObject<Block> CHORUS_LOG = registerBlock("chorus_log",
            () -> new DirectionalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD)));
//STRIPPED CHORUS LOG
    public static final RegistryObject<Block> STRIPPED_CHORUS_LOG = registerBlock("stripped_chorus_log",
            () -> new DirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD))
);

    //STRIPPED CHORUS WOOD
    public static final RegistryObject<Block> STRIPPED_CHORUS_WOOD = registerBlock("stripped_chorus_wood",
            () -> new DirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //CHORUS WOOD
    public static final RegistryObject<Block> CHORUS_WOOD = registerBlock("chorus_wood",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //CHORUS PLANKS
    public static final RegistryObject<Block> CHORUS_PLANKS = registerBlock("chorus_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );
    //CHORUS PLANKS
    public static final RegistryObject<Block> CHORUS_PRESSURE_PLATE = registerBlock("chorus_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f)
                    .sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON)
    );

    //CHORUS STAIRS
    public static final RegistryObject<Block> CHORUS_STAIRS = registerBlock("chorus_stairs",
            () -> new StairBlock(() -> ModBlocks.CHORUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .sound(SoundType.WOOD)
                            .strength(2f)));
    //CHORUS SLABS
    public static final RegistryObject<Block> CHORUS_SLAB = registerBlock("chorus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)));

    //CHORUS FENCE POST
    public static final RegistryObject<Block> CHORUS_FENCE = registerBlock("chorus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)));
    //CHORUS FENCE GATE
    public static final RegistryObject<Block> CHORUS_FENCE_GATE = registerBlock("chorus_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

    //CHORUS DOOR
    public static final RegistryObject<Block> CHORUS_DOOR = registerBlock("chorus_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    //CHORUS TRAPDOOR
    public static final RegistryObject<Block> CHORUS_TRAPDOOR = registerBlock("chorus_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));
    //CHORUS BUTTON
    public static final RegistryObject<Block> CHORUS_BUTTON = registerBlock("chorus_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()
                    .noCollission(), 20, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

    //EBONY LEAVES
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES)
                    .strength(0.3f)
                    .sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            }
    );
    //EBONY LEAVES
    public static final RegistryObject<Block> EBONY_LEAF_CARPET = registerBlock("ebony_leaf_carpet",
            () -> new LeafCarpetBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES)
                    .strength(2f)
                    .noCollission()
                    .sound(SoundType.GRASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 30;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 68;
                }
            }
    );
    //EBONY LOG
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new FlammableDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //STRIPPED EBONY LOG
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new FlammableDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //STRIPPED EBONY WOOD
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new FlammableDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //EBONY WOOD
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new FlammableDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD))
    );

    //EBONY PLANKS
    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .sound(SoundType.WOOD)){
        @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
            return true;
        }
        @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
            return 5;
        }
        @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
            return 20;
        }
            }
    );
    //EBONY PLANKS
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1f)
                    .sound(SoundType.WOOD), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            }
    );

    //EBONY STAIRS
    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new StairBlock(() -> ModBlocks.EBONY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .sound(SoundType.WOOD)
                            .strength(2f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });
    //EBONY SLABS
    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });

    //EBONY FENCE POST
    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });
    //EBONY FENCE GATE
    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2f), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });

    //EBONY DOOR
    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });
    //EBONY TRAPDOOR
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)
                    .noOcclusion().sound(SoundType.WOOD), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });
    //EBONY BUTTON
    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).requiresCorrectToolForDrops()
                    .noCollission(), 20, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 5;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return 20;
                }
            });

    //EBONY SAPLING
    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            ()-> new SaplingBlock(new EbonyTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                    .strength(0f)
                    .sound(SoundType.GRASS))
    );

    //POTTED CYAN ROSE
    public static final RegistryObject<Block> POTTED_EBONY_SAPLING = registerBlockWithoutBlockItem("potted_ebony_sapling",
            () -> new FlowerPotBlock(()->((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.EBONY_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    //END SAND
    public static final RegistryObject<Block> END_SAND = registerBlock("end_sand",
            () -> new SandBlock(3, BlockBehaviour.Properties.of(Material.SAND)
                    .strength(1f)
                    .sound(SoundType.SAND))
    );
    //public static final RegistryObject<Block> void_lantern = registerBlock("void_lantern",
      //      () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL)
        //            .strength(2f)
          //          .noOcclusion().sound(SoundType.LANTERN)), CreativeModeTab.TAB_DECORATIONS);
    //SNOW BRICKS
    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW))
    );
    //SNOW BRICK STAIRS
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SNOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.SNOW)
                            .strength(.5f).requiresCorrectToolForDrops()));
    //SNOW BRICK SLABS
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.SNOW)
                    .strength(.5f).requiresCorrectToolForDrops()));
    //SNOW BRICK WALLS
    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(.5f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW)));


    //SMOOTH BASALT STAIRS
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //SMOOTH BASALT SLABS
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //SMOOTH BASALT WALLS
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT).strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));



    //CUT BASALT BLOCK
    public static final RegistryObject<Block> CUT_BASALT = registerBlock("cut_basalt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4))
    );
    //CUT BASALT STAIRS
    public static final RegistryObject<Block> CUT_BASALT_STAIRS = registerBlock("cut_basalt_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_BASALT.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //CUT BASALT SLABS
    public static final RegistryObject<Block> CUT_BASALT_SLAB = registerBlock("cut_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));





    //BASALT BRICKS
    public static final RegistryObject<Block> BASALT_BRICKS = registerBlock("basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4))
    );
    //BASALT BRICK STAIRS
    public static final RegistryObject<Block> BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BASALT_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.BASALT)
                            .strength(2f).requiresCorrectToolForDrops()
                            .explosionResistance(4)));
    //BASALT BRICK SLABS
    public static final RegistryObject<Block> BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.BASALT)
                    .strength(2f).requiresCorrectToolForDrops()
                    .explosionResistance(4)));
    //BASALT BRICK WALLS
    public static final RegistryObject<Block> BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.BASALT)
                    .explosionResistance(4)));

    //MINT CROP
    public static final RegistryObject<Block> MINT_CROP = BLOCKS.register("mint_crop",
            () -> new MintCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

//CANDY CANE BLOCK
    public static final RegistryObject<Block> CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4))
);

    //VOID QUARTZ PILLAR
    public static final RegistryObject<Block> CANDY_CORN_BLOCK = registerBlock("candy_corn_block",
            () -> new DirectionalBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .explosionResistance(4))
    );

    //SOUL GLASS
    public static final RegistryObject<Block> SOUL_GLASS = registerBlock("soul_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
                    )
    );

    public static final RegistryObject<Block> SOUL_GLASS_PANE = registerBlock("soul_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.5f)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            )
    );

    //END GLASS
    public static final RegistryObject<Block> END_GLASS = registerBlock("end_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            )
    );

    public static final RegistryObject<Block> END_GLASS_PANE = registerBlock("end_glass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.5f)
                    .noOcclusion()
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            )
    );

    //GLASS SLAB
    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new GlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .noOcclusion()
                    .strength(.5f)
                    .sound(SoundType.GLASS)
                    .explosionResistance(4)
            )
    );
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
                   .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    //STEEL TRAPDOOR
    public static final RegistryObject<Block> STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()
                    .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4), SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN));
    //STEEL BARS
    public static final RegistryObject<Block> STEEL_BARS = registerBlock("steel_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()
                    .noOcclusion().sound(SoundType.NETHERITE_BLOCK).explosionResistance(4)));

    public static final RegistryObject<Block> SOUL_TNT = registerBlock("soul_tnt",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> NETHER_CORE = registerBlock("nether_core",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL).explosionResistance(4)));

    public static final RegistryObject<Block> STAR_BLOCK = registerBlock("star_block",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL).explosionResistance(4).lightLevel((p_50872_) -> {
                        return 20;
})));

    public static final RegistryObject<Block> SALT_LAMP_BLOCK = registerBlock("salt_lamp_block",
            () -> new SoulTntBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE).explosionResistance(4).lightLevel((p_50872_) -> {
                        return 9;
                    })));

    //public static final RegistryObject<Block> BLACKSTONE_CUTTER = registerBlock("blackstone_cutter",
      //      () -> new StonecutterBlock(BlockBehaviour.Properties.of(Material.STONE)
        //            .strength(1f)
          //          .noOcclusion().sound(SoundType.STONE)), CreativeModeTab.TAB_DECORATIONS);


    //CYAN ROSE
    public static final RegistryObject<Block> CYAN_ROSE = registerBlock("cyan_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.GRASS)));
    //POTTED CYAN ROSE
    public static final RegistryObject<Block> POTTED_CYAN_ROSE = registerBlockWithoutBlockItem("potted_cyan_rose",
            () -> new FlowerPotBlock(()->((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.CYAN_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    //RED ROSE
    public static final RegistryObject<Block> RED_ROSE = registerBlock("red_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.GRASS)));
    //POTTED RED ROSE
    public static final RegistryObject<Block> POTTED_RED_ROSE = registerBlockWithoutBlockItem("potted_red_rose",
            () -> new FlowerPotBlock(()->((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.RED_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    //BONE FLOWER
    public static final RegistryObject<Block> BONE_FLOWER = registerBlock("bone_flower",
            () -> new BoneFlowerBlock(MobEffects.LEVITATION, 8, BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.ROOTS)));
    //POTTED BONE FLOWER
    public static final RegistryObject<Block> POTTED_BONE_FLOWER = registerBlockWithoutBlockItem("potted_bone_flower",
            () -> new FlowerPotBlock(()->((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.RED_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_CRIMSON_ROOTS)
                    .strength(0f)
                    .noOcclusion().sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        switch(name){
            case "brimstone_block":
                return ModItems.ITEMS.register(name,() -> new BrimstoneBlock(block.get(), new Item.Properties().fireResistant()));

            case "charcoal_block":
                return ModItems.ITEMS.register(name,() -> new CharcoalBlock(block.get(), new Item.Properties()));

            case "abyssson_block":
                return ModItems.ITEMS.register(name,() -> new AbyssonBlock(block.get(), new Item.Properties()));

            case "stick_block":
                return ModItems.ITEMS.register(name,() -> new StickBundleBlock(block.get(), new Item.Properties()));

            case "blaze_bundle":
                return ModItems.ITEMS.register(name,() -> new BlazeBundleBlock(block.get(), new Item.Properties()));

            case "hellsteel_block":
            case "star_block":
                return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().fireResistant()));

            default:
                return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
