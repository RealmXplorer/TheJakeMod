package com.jake.jakemod.item;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.ModBlocks;
import com.jake.jakemod.item.custom.*;
import com.jake.jakemod.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JakeMod.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> WARPED_PAPER = ITEMS.register("warped_paper",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> VOID_QUARTZ = ITEMS.register("void_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FLAME_FEATHER = ITEMS.register("flame_feather",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PHILOSOPHER_STONE = ITEMS.register("philosopher_stone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> WARPED_BOOK = ITEMS.register("warped_book",
            () -> new BookItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRIMSTONE = ITEMS.register("brimstone",
            () -> new BrimstoneItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ABYSSON = ITEMS.register("abysson",
            () -> new AbyssonItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> HELLSTEEL_INGOT = ITEMS.register("hellsteel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STAR_SHARD = ITEMS.register("star_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GLASS_SHARD = ITEMS.register("glass_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> END_DUST = ITEMS.register("end_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHOCOLATE_BAR)));

    public static final RegistryObject<Item> CANDY_CANE= ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CANDY_CANE)));

    public static final RegistryObject<Item> CANDY_CORN= ITEMS.register("candy_corn",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CANDY_CORN)));

    public static final RegistryObject<Item> GHAST_BERRY= ITEMS.register("ghast_berry",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.GHAST_BERRY)));

    public static final RegistryObject<Item> ENDER_FRUIT= ITEMS.register("ender_fruit",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.ENDER_FRUIT)));

    public static final RegistryObject<Item> PEPPERMINT_BARK= ITEMS.register("peppermint_bark",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.PEPPERMINT_BARK)));

    public static final RegistryObject<Item> APPLE_PIE= ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.APPLE_PIE)));
    public static final RegistryObject<Item> BERRY_PIE= ITEMS.register("berry_pie",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.BERRY_PIE)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModTiers.AMETHYST, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
                    .defaultDurability(3)));

//GRANITE TOOLS
    public static final RegistryObject<Item> GRANITE_SWORD = ITEMS.register("granite_sword",
            () -> new SwordItem(ModTiers.GRANITE, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GRANITE_PICKAXE = ITEMS.register("granite_pickaxe",
            () -> new PickaxeItem(ModTiers.GRANITE, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRANITE_AXE = ITEMS.register("granite_axe",
            () -> new AxeItem(ModTiers.GRANITE, 7, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRANITE_SHOVEL = ITEMS.register("granite_shovel",
            () -> new ShovelItem(ModTiers.GRANITE, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRANITE_HOE = ITEMS.register("granite_hoe",
            () -> new HoeItem(ModTiers.GRANITE, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
      //      () -> new DiamondShieldItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //GRIM TOOLS
    public static final RegistryObject<Item> GRIM_SWORD = ITEMS.register("grim_sword",
            () -> new SwordItem(ModTiers.GRIM, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GRIM_PICKAXE = ITEMS.register("grim_pickaxe",
            () -> new PickaxeItem(ModTiers.GRIM, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRIM_AXE = ITEMS.register("grim_axe",
            () -> new AxeItem(ModTiers.GRIM, 6, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRIM_SHOVEL = ITEMS.register("grim_shovel",
            () -> new ShovelItem(ModTiers.GRIM, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GRIM_HOE = ITEMS.register("grim_hoe",
            () -> new HoeItem(ModTiers.GRIM, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //GILDED BLACKSTONE TOOLS\
    public static final RegistryObject<Item> GILDED_BLACKSTONE_SWORD = ITEMS.register("gilded_blackstone_sword",
            () -> new SwordItem(ModTiers.GILDED_BLACKSTONE, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_PICKAXE = ITEMS.register("gilded_blackstone_pickaxe",
            () -> new PickaxeItem(ModTiers.GILDED_BLACKSTONE, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_AXE = ITEMS.register("gilded_blackstone_axe",
            () -> new AxeItem(ModTiers.GILDED_BLACKSTONE, 6, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_SHOVEL = ITEMS.register("gilded_blackstone_shovel",
            () -> new ShovelItem(ModTiers.GILDED_BLACKSTONE, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_HOE = ITEMS.register("gilded_blackstone_hoe",
            () -> new HoeItem(ModTiers.GILDED_BLACKSTONE, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //ROSE QUARTZ TOOLS
    public static final RegistryObject<Item> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword",
            () -> new SwordItem(ModTiers.ROSE_QUARTZ, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe",
            () -> new PickaxeItem(ModTiers.ROSE_QUARTZ, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_QUARTZ_AXE = ITEMS.register("rose_quartz_axe",
            () -> new AxeItem(ModTiers.ROSE_QUARTZ, 5, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel",
            () -> new ShovelItem(ModTiers.ROSE_QUARTZ, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe",
            () -> new HoeItem(ModTiers.ROSE_QUARTZ, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    //COPPER TOOLS
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 2, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 6, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    //ROSE GOLD TOOLS
    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModTiers.ROSE_GOLD, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ModTiers.ROSE_GOLD, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ModTiers.ROSE_GOLD, 6, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ModTiers.ROSE_GOLD, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ModTiers.ROSE_GOLD, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //STEEL TOOLS
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 5, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //HELLSTEEL TOOLS
    public static final RegistryObject<Item> HELLSTEEL_SWORD = ITEMS.register("hellsteel_sword",
            () -> new SwordItem(ModTiers.HELLSTEEL, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELLSTEEL_PICKAXE = ITEMS.register("hellsteel_pickaxe",
            () -> new PickaxeItem(ModTiers.HELLSTEEL, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELLSTEEL_AXE = ITEMS.register("hellsteel_axe",
            () -> new AxeItem(ModTiers.HELLSTEEL, 5, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELLSTEEL_SHOVEL = ITEMS.register("hellsteel_shovel",
            () -> new ShovelItem(ModTiers.HELLSTEEL, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> HELLSTEEL_HOE = ITEMS.register("hellsteel_hoe",
            () -> new HoeItem(ModTiers.HELLSTEEL, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    //COPPER ARMOR
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //GRIM ARMOR
    public static final RegistryObject<Item> GRIM_HELMET = ITEMS.register("grim_helmet",
            () -> new GrimItem(ModArmorMaterials.GRIM, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GRIM_CHESTPLATE = ITEMS.register("grim_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GRIM, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GRIM_LEGGINGS = ITEMS.register("grim_leggings",
            () -> new ArmorItem(ModArmorMaterials.GRIM, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GRIM_BOOTS = ITEMS.register("grim_boots",
            () -> new ArmorItem(ModArmorMaterials.GRIM, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    //ROSE QUARTZ ARMOR
    public static final RegistryObject<Item> ROSE_QUARTZ_HELMET = ITEMS.register("rose_quartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_QUARTZ, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_QUARTZ_CHESTPLATE = ITEMS.register("rose_quartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_QUARTZ, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_QUARTZ_LEGGINGS = ITEMS.register("rose_quartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_QUARTZ, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_QUARTZ_BOOTS = ITEMS.register("rose_quartz_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_QUARTZ, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //ROSE GOLD ARMOR
    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new RoseGoldItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new RoseGoldItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new RoseGoldItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new RoseGoldItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //STEEL ARMOR
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //HELLSTEEL ARMOR
    public static final RegistryObject<Item> HELLSTEEL_HELMET = ITEMS.register("hellsteel_helmet",
            () -> new HellsteelArmorItem(ModArmorMaterials.HELLSTEEL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELLSTEEL_CHESTPLATE = ITEMS.register("hellsteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLSTEEL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELLSTEEL_LEGGINGS = ITEMS.register("hellsteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLSTEEL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> HELLSTEEL_BOOTS = ITEMS.register("hellsteel_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLSTEEL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //GILDED BLACKSTONE ARMOR
    public static final RegistryObject<Item> GILDED_BLACKSTONE_HELMET = ITEMS.register("gilded_blackstone_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_BLACKSTONE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_CHESTPLATE = ITEMS.register("gilded_blackstone_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_BLACKSTONE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_LEGGINGS = ITEMS.register("gilded_blackstone_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_BLACKSTONE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_BOOTS = ITEMS.register("gilded_blackstone_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_BLACKSTONE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //CROWN
    public static final RegistryObject<Item> CROWN = ITEMS.register("crown",
            () -> new CrownItem(ModArmorMaterials.CROWN, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MINT_SEEDS = ITEMS.register("mint_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MINT_CROP.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GOLD_SHEARS = ITEMS.register("gold_shears",
            () -> new GoldenShearsItem(new Item.Properties().durability(120).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new DiamondShearsItem(new Item.Properties().durability(1040).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
            () -> new NetheriteShearsItem(new Item.Properties().durability(2160).tab(CreativeModeTab.TAB_TOOLS)));


    public static final RegistryObject<Item> STAR_BLADE = ITEMS.register("star_blade",
            () -> new SwordItem(ModTiers.STAR, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STAR_PICKAXE = ITEMS.register("star_pickaxe",

            () -> new PickaxeItem(ModTiers.STAR, 2, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STAR_AXE = ITEMS.register("star_axe",
            () -> new AxeItem(ModTiers.STAR, 5, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STAR_SHOVEL = ITEMS.register("star_shovel",
            () -> new ShovelItem(ModTiers.STAR, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STAR_HOE = ITEMS.register("star_hoe",
            () -> new HoeItem(ModTiers.STAR, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    public static final RegistryObject<Item> MUSIC_DISC_DOG = ITEMS.register("music_disc_dog",
            () -> new RecordItem(4, ModSounds.MUSIC_DISC_DOG, new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE).stacksTo(1),2920));

    public static final RegistryObject<Item> MUSIC_DISC_KINGSTEAD = ITEMS.register("music_disc_kingstead",
            () -> new RecordItem(4, ModSounds.MUSIC_DISC_KINGSTEAD, new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE).stacksTo(1),3820));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
