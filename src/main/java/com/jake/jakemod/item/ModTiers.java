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

    public static final ForgeTier GRANITE = new ForgeTier(1, 131, 4.0F,
            1.0F, 5, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.GRANITE));
}