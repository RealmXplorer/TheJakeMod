package com.jake.jakemod.block.custom;


import net.minecraft.world.level.block.TntBlock;

public class SoulTntBlock extends TntBlock {

    public SoulTntBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.defaultBlockState().setValue(UNSTABLE, Boolean.valueOf(false)));
    }
}
