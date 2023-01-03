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


public class LeafCarpetBlock extends CarpetBlock implements net.minecraftforge.common.IPlantable{
    public LeafCarpetBlock(Properties properties) {
        super(properties);
    }

    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.DIRT);
    }


    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos)
    {
        BlockPos blockpos = pos.below();

        if(level.getBlockState(pos).getBlock().equals(BlockTags.DIRT)){
            return true;
        }
	    else {
            return false;
        }
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return IPlantable.super.getPlantType(level, pos);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return null;
    }
}
