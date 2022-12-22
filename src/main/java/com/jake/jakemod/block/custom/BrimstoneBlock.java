package com.jake.jakemod.block.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;

public class BrimstoneBlock extends Block {
    public BrimstoneBlock(Properties pProperties){
        super(pProperties);
    }

    //@Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 28800;
    }
}
