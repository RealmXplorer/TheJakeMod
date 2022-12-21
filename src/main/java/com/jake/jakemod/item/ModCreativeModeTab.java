package com.jake.jakemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JAKE_TAB = new CreativeModeTab("jaketab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.RUBY.get());
        }
    };

}
