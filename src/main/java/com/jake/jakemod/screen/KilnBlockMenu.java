package com.jake.jakemod.screen;

import com.jake.jakemod.screen.ModMenuTypes;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipeType;

public class KilnBlockMenu extends AbstractFurnaceMenu {
    public KilnBlockMenu(int pContainerId, Inventory pPlayerInventory) {
        super(MenuType.SMOKER, RecipeType.SMOKING, RecipeBookType.SMOKER, pContainerId, pPlayerInventory);
    }

    public KilnBlockMenu(int pContainerId, Inventory pPlayerInventory, Container pSmokerContainer, ContainerData pSmokerData) {
        super(MenuType.SMOKER, RecipeType.SMOKING, RecipeBookType.SMOKER, pContainerId, pPlayerInventory, pSmokerContainer, pSmokerData);
    }
}