package com.jake.jakemod.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class DiamondShieldItem extends ShieldItem {
    public DiamondShieldItem(Properties pProperties){
        super(pProperties);
    }

@Override
    public int getUseDuration(ItemStack itemStack) {
        return 96000;
    }

   // @Override
    //public boolean isValidRepairItem(ItemStack itemStack, ItemStack stackItem) {
    //    return stackItem.is(ItemTags.PLANKS) || super.isValidRepairItem(itemStack, stackItem);
    //}
    }

