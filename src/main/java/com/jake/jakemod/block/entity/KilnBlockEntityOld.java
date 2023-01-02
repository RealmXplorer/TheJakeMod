package com.jake.jakemod.block.entity;

import com.jake.jakemod.recipe.KilnBlockRecipe;
import com.jake.jakemod.screen.KilnBlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.index;

public class KilnBlockEntityOld extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(3){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;
    int litTime = 0;
//    int litDuration = 78;
//    int cookingProgress = 0;
//    int cookingTotalTime = 78;

    public KilnBlockEntityOld(BlockPos blockPos, BlockState state) {
        super(ModBlockEntities.KILN_BLOCK.get(), blockPos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index){
                return switch (index) {
                    case 0 -> KilnBlockEntityOld.this.progress;
                    case 1 -> KilnBlockEntityOld.this.maxProgress;
//                    case 0 -> KilnBlockEntity.this.litTime;
//                    case 1 -> KilnBlockEntity.this.litDuration;
//                    case 2-> KilnBlockEntity.this.cookingProgress;
//                    case 3-> KilnBlockEntity.this.cookingTotalTime;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value){
                switch (index) {
                    case 0 -> KilnBlockEntityOld.this.progress = value;
                    case 1 -> KilnBlockEntityOld.this.maxProgress = value;

//                    case 0:
//                        KilnBlockEntity.this.litTime = value;
//                        break;
//                    case 1:
//                        KilnBlockEntity.this.litDuration = value;
//                       break;
//                    case 2:
//                        KilnBlockEntity.this.cookingProgress = value;
//                        break;
//                    case 3:
//                        KilnBlockEntity.this.cookingTotalTime = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
                //return 4;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Kiln");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new KilnBlockMenu(id, inv, this, this.data);
    }

    private boolean isLit() {
        return this.litTime > 0;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
        return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad(){
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps(){
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory",itemHandler.serializeNBT());
        nbt.putInt("kiln_block.progress", this.progress);
//        nbt.putInt("BurnTime", this.litTime);
//        nbt.putInt("CookTime", this.cookingProgress);
//        nbt.putInt("CookTimeTotal", this.cookingTotalTime);
//        ContainerHelper.saveAllItems(nbt, this.items);
//        CompoundTag compoundtag = new CompoundTag();
//        this.recipesUsed.forEach((p_187449_, p_187450_) -> {
//          compoundtag.putInt(p_187449_.toString(), p_187450_);
//        });
//        p_187452_.put("RecipesUsed", compoundtag);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("kiln_block.progress");


    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, KilnBlockEntityOld pEntity) {
        if(level.isClientSide()) {
            return;
        }

        if(hasRecipe(pEntity)) {
            pEntity.progress++;
            setChanged(level, pos, state);

            if(pEntity.progress >= pEntity.maxProgress) {
                craftItem(pEntity);
            }
        } else {
            pEntity.resetProgress();
            setChanged(level, pos, state);
        }
    }


    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(KilnBlockEntityOld pEntity) {
        Level level = pEntity.level;
        SimpleContainer inventory = new SimpleContainer(pEntity.itemHandler.getSlots());
        for (int i = 0; i < pEntity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, pEntity.itemHandler.getStackInSlot(i));
        }

        Optional<KilnBlockRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(KilnBlockRecipe.Type.INSTANCE, inventory, level);

        if(hasRecipe(pEntity)) {
            pEntity.itemHandler.extractItem(1,1,false);
            pEntity.itemHandler.setStackInSlot(2, new ItemStack(recipe.get().getResultItem().getItem(),
                    pEntity.itemHandler.getStackInSlot(2).getCount() + 1));

            pEntity.resetProgress();
        }
    }

    private static boolean hasRecipe(KilnBlockEntityOld entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<KilnBlockRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(KilnBlockRecipe.Type.INSTANCE, inventory, level);

        return recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory) &&
                canInsertItemIntoOutputSlot(inventory, recipe.get().getResultItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack stack) {
return inventory.getItem(2).getItem() == stack.getItem() || inventory.getItem(2).isEmpty();
    }
//    public static void serverTick(Level p_155014_, BlockPos p_155015_, BlockState p_155016_, AbstractFurnaceBlockEntity p_155017_) {
//        boolean flag = p_155017_.isLit();
//        boolean flag1 = false;
//        if (p_155017_.isLit()) {
//            --p_155017_.litTime;
//        }
//
//        ItemStack itemstack = p_155017_.items.get(1);
//        boolean flag2 = !p_155017_.items.get(0).isEmpty();
//        boolean flag3 = !itemstack.isEmpty();
//        if (p_155017_.isLit() || flag3 && flag2) {
//            Recipe<?> recipe;
//            if (flag2) {
//                recipe = p_155017_.quickCheck.getRecipeFor(p_155017_, p_155014_).orElse(null);
//            } else {
//                recipe = null;
//            }
//
//            int i = p_155017_.getMaxStackSize();
//            if (!p_155017_.isLit() && p_155017_.canBurn(recipe, p_155017_.items, i)) {
//                p_155017_.litTime = p_155017_.getBurnDuration(itemstack);
//                p_155017_.litDuration = p_155017_.litTime;
//                if (p_155017_.isLit()) {
//                    flag1 = true;
//                    if (itemstack.hasCraftingRemainingItem())
//                        p_155017_.items.set(1, itemstack.getCraftingRemainingItem());
//                    else
//                    if (flag3) {
//                        Item item = itemstack.getItem();
//                        itemstack.shrink(1);
//                        if (itemstack.isEmpty()) {
//                            p_155017_.items.set(1, itemstack.getCraftingRemainingItem());
//                        }
//                    }
//                }
//            }
//
//            if (p_155017_.isLit() && p_155017_.canBurn(recipe, p_155017_.items, i)) {
//                ++p_155017_.cookingProgress;
//                if (p_155017_.cookingProgress == p_155017_.cookingTotalTime) {
//                    p_155017_.cookingProgress = 0;
//                    p_155017_.cookingTotalTime = getTotalCookTime(p_155014_, p_155017_);
//                    if (p_155017_.burn(recipe, p_155017_.items, i)) {
//                        p_155017_.setRecipeUsed(recipe);
//                    }
//
//                    flag1 = true;
//                }
//            } else {
//                p_155017_.cookingProgress = 0;
//            }
//        } else if (!p_155017_.isLit() && p_155017_.cookingProgress > 0) {
//            p_155017_.cookingProgress = Mth.clamp(p_155017_.cookingProgress - 2, 0, p_155017_.cookingTotalTime);
//        }
//
//        if (flag != p_155017_.isLit()) {
//            flag1 = true;
//            p_155016_ = p_155016_.setValue(AbstractFurnaceBlock.LIT, Boolean.valueOf(p_155017_.isLit()));
//            p_155014_.setBlock(p_155015_, p_155016_, 3);
//        }
//
//        if (flag1) {
//            setChanged(p_155014_, p_155015_, p_155016_);
//        }
//
//    }
//
//    private boolean canBurn(@javax.annotation.Nullable Recipe<?> p_155006_, NonNullList<ItemStack> p_155007_, int p_155008_) {
//        if (!p_155007_.get(0).isEmpty() && p_155006_ != null) {
//            ItemStack itemstack = ((Recipe<WorldlyContainer>) p_155006_).assemble(this);
//            if (itemstack.isEmpty()) {
//                return false;
//            } else {
//                ItemStack itemstack1 = p_155007_.get(2);
//                if (itemstack1.isEmpty()) {
//                    return true;
//                } else if (!itemstack1.sameItem(itemstack)) {
//                    return false;
//                } else if (itemstack1.getCount() + itemstack.getCount() <= p_155008_ && itemstack1.getCount() + itemstack.getCount() <= itemstack1.getMaxStackSize()) { // Forge fix: make furnace respect stack sizes in furnace recipes
//                    return true;
//                } else {
//                    return itemstack1.getCount() + itemstack.getCount() <= itemstack.getMaxStackSize(); // Forge fix: make furnace respect stack sizes in furnace recipes
//                }
//            }
//        } else {
//            return false;
//        }
//    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
    return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }
}
