package com.jake.jakemod.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class DiamondShearsItem extends ShearsItem {
    public DiamondShearsItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public float getDestroySpeed(ItemStack p_43084_, BlockState p_43085_) {
        if (!p_43085_.is(Blocks.COBWEB) && !p_43085_.is(BlockTags.LEAVES)) {
            if (p_43085_.is(BlockTags.WOOL)) {
                return 6.5F;
            } else {
                return !p_43085_.is(Blocks.VINE) && !p_43085_.is(Blocks.GLOW_LICHEN) ? super.getDestroySpeed(p_43084_, p_43085_) : 3.0F;
            }
        } else {
            return 17.5F;
        }
    }
}
