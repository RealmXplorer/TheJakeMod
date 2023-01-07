package com.jake.jakemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

import java.util.Properties;


public class LeafCarpetBlock extends CarpetBlock
{
    public LeafCarpetBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos)
    {
        return level.getBlockState(pos.below()).is(BlockTags.LOGS) ||
                level.getBlockState(pos.below()).is(BlockTags.PLANKS)||
                level.getBlockState(pos.below()).is(BlockTags.MINEABLE_WITH_PICKAXE) ||
                level.getBlockState(pos.below()).is(BlockTags.MINEABLE_WITH_HOE) ||
                level.getBlockState(pos.below()).is(BlockTags.MINEABLE_WITH_SHOVEL);
    }
}