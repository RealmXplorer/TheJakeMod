package com.jake.jakemod.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.MultifaceSpreader;

import java.util.Properties;

public class FaceBlock extends MultifaceBlock {
    public FaceBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public MultifaceSpreader getSpreader() {
        return null;
    }
}
