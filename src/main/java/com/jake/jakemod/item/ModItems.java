package com.jake.jakemod.item;

import com.jake.jakemod.JakeMod;
import com.jake.jakemod.block.ModBlocks;
import com.jake.jakemod.item.custom.BrimstoneItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JakeMod.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BRIMSTONE = ITEMS.register("brimstone",
            () -> new BrimstoneItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STAR_SHARD = ITEMS.register("star_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GLASS_SHARD = ITEMS.register("glass_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHOCOLATE_BAR)));

    public static final RegistryObject<Item> CANDY_CANE= ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CANDY_CANE)));

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


//COPPER TOOLS
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 2, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 5, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

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
            () -> new AxeItem(ModTiers.ROSE_GOLD, 7, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
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
            () -> new AxeItem(ModTiers.ROSE_GOLD, 7, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.ROSE_GOLD, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.ROSE_GOLD, -1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //COPPER ARMOR
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //ROSE GOLD ARMOR
    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //STEEL ARMOR
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //CROWN
    public static final RegistryObject<Item> CROWN = ITEMS.register("crown",
            () -> new ArmorItem(ModArmorMaterials.CROWN, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MINT_SEEDS = ITEMS.register("mint_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MINT_CROP.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
