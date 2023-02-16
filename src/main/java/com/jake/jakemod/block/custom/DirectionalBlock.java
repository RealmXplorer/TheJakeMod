package com.jake.jakemod.block.custom;

import com.jake.jakemod.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;


public class DirectionalBlock extends RotatedPillarBlock {
    public DirectionalBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.CHORUS_LOG.get()))
                return ModBlocks.STRIPPED_CHORUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));

            if (state.is(ModBlocks.CHORUS_WOOD.get()))
                return ModBlocks.STRIPPED_CHORUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }

        return super.getToolModifiedState(state, context, toolAction,simulate);
    }
}
