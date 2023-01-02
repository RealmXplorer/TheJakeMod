package com.jake.jakemod.item.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class AbyssonBlock extends BlockItem {
    public AbyssonBlock(Block block, Properties pProperties){
        super(block,pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 2000;
    }
}
