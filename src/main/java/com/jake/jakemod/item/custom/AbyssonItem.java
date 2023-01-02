package com.jake.jakemod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class AbyssonItem extends Item {
    public AbyssonItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 2000;
    }
}
