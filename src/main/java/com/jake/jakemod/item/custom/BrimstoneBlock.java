package com.jake.jakemod.item.custom;

import com.jake.jakemod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;

public class BrimstoneBlock extends BlockItem {
    public BrimstoneBlock(Block block, Properties pProperties){
        super(block,pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 21600;
    }
}
