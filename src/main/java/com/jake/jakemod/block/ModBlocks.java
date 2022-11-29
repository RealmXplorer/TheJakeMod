package com.jake.jakemod.block;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.custom.DirectionalBlock;
import com.jake.jakemod.block.custom.StickBlock;
import com.jake.jakemod.item.ModCreativeModeTab;
import com.jake.jakemod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
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
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //POLISHED GRANITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);



    //POLISHED ANDESITE BRICKS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED ANDESITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);


    //POLISHED DIORITE BRICKS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK SLABS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED DIORITE BRICK WALLS
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);



    //COMPACT AMETHYST BLOCK
    public static final RegistryObject<Block> COMPACT_AMETHYST_BLOCK = registerBlock("compact_amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)), CreativeModeTab.TAB_BUILDING_BLOCKS);


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
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //DEEPSLATE RUBY ORE
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE),
                    UniformInt.of(3,7)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //RUBY BLOCK
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);




    //TUFF STAIRS
    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(() -> Blocks.TUFF.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //TUFF SLABS
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //TUFF WALLS
    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
    .sound(SoundType.TUFF).strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);



    //POLISHED TUFF BLOCK
    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock("polished_tuff",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
//POLISHED TUFF STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //POLISHED TUFF BRICKS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = registerBlock("polished_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK STAIRS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_STAIRS = registerBlock("polished_tuff_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_TUFF.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.TUFF)
                            .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK SLABS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_SLAB = registerBlock("polished_tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.TUFF)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //POLISHED TUFF BRICK WALLS
    public static final RegistryObject<Block> POLISHED_TUFF_BRICK_WALL = registerBlock("polished_tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.TUFF)), CreativeModeTab.TAB_DECORATIONS);

    //STICK BLOCK
    public static final RegistryObject<StickBlock> STICK_BLOCK = registerBlock("stick_block",
            () -> new StickBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f)
                    .sound(SoundType.SCAFFOLDING)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //SNOW BRICKS
    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW)),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK STAIRS
    public static final RegistryObject<Block> SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SNOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .sound(SoundType.SNOW)
                            .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK SLABS
    public static final RegistryObject<Block> SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.SNOW)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //SNOW BRICK WALLS
    public static final RegistryObject<Block> SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0f).requiresCorrectToolForDrops()
                    .sound(SoundType.SNOW)), CreativeModeTab.TAB_DECORATIONS);

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

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
