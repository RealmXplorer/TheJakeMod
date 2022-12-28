package com.jake.jakemod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier AMETHYST = new ForgeTier(2,20,1.5f,
            10f,22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD));

    public static final ForgeTier COPPER = new ForgeTier(1,215,6f,
            1.5f,15, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier ROSE_GOLD = new ForgeTier(1,240,14f,
            1.75f,20, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()));

    public static final ForgeTier GILDED_BLACKSTONE = new ForgeTier(2, 250, 6.0F, 2.0F, 14, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.GILDED_BLACKSTONE));

    public static final ForgeTier ROSE_QUARTZ = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.ROSE_QUARTZ.get()));

    public static final ForgeTier STEEL = new ForgeTier(2,560,6.5f,
            2.5f,12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));

    public static final ForgeTier HELLSTEEL = new ForgeTier(2,560,6.5f,
            2.5f,12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.HELLSTEEL_INGOT.get()));

    public static final ForgeTier GRANITE = new ForgeTier(1, 131, 4.0F,
            1.0F, 5, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.GRANITE));

    public static final ForgeTier STAR = new ForgeTier(4, 2500, 13.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT));
}