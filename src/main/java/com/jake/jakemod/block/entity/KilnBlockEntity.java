package com.jake.jakemod.block.entity;

//import com.jake.jakemod.recipe.KilnBlockRecipe;
import com.jake.jakemod.recipe.ModRecipes;
//import com.jake.jakemod.screen.KilnBlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import com.jake.jakemod.screen.KilnBlockMenu;
import net.minecraft.world.inventory.SmokerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.index;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {

    public KilnBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityType.SMOKER, pPos, pBlockState, RecipeType.SMOKING);
    }

    protected Component getDefaultName() {
        return Component.literal("Kiln");
    }

    protected int getBurnDuration(ItemStack pFuel) {
        return super.getBurnDuration(pFuel) / 2;
    }

    protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
        return new KilnBlockMenu(pId, pPlayer, this, this.dataAccess);
    }
}
