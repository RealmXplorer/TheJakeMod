package com.jake.jakemod;

import com.jake.jakemod.block.ModBlocks;
import com.jake.jakemod.block.entity.ModBlockEntities;
import com.jake.jakemod.item.ModItems;
import com.jake.jakemod.loot.ModLootModifiers;
import com.jake.jakemod.potion.ModPotions;
import com.jake.jakemod.recipe.ModRecipes;
import com.jake.jakemod.screen.KilnBlockScreen;
import com.jake.jakemod.screen.ModMenuTypes;
import com.jake.jakemod.sound.ModSounds;
import com.jake.jakemod.util.BetterBrewingRecipe;
import com.jake.jakemod.world.feature.ModConfiguredFeatures;
import com.jake.jakemod.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static com.jake.jakemod.sound.ModSounds.SOUND_EVENTS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JakeMod.MOD_ID)
public class JakeMod
{
    public static final String MOD_ID = "jakemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JakeMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModSounds.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModPotions.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        ItemColors itemColors = Minecraft.getInstance().getItemColors();

        //Leaf Coloring
        blockColors.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.OAK_LEAF_CARPET.get());

        //Grabs the color of the block and sets the item color to be the same
        itemColors.register((stack, tintIndex) -> {
                    BlockState BlockState = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return blockColors.getColor(BlockState, null, null, tintIndex); },
                ModBlocks.OAK_LEAF_CARPET.get());
    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.INK_SAC, ModPotions.BLINDNESS_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.GLOW_INK_SAC, ModPotions.GLOWING_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.MUNDANE,
                    Items.PHANTOM_MEMBRANE, ModPotions.LEVITATION_POTION.get()));

            ComposterBlock.COMPOSTABLES.put(ModItems.MINT.get(), 0.65f);
            ComposterBlock.COMPOSTABLES.put(ModItems.MINT_SEEDS.get(), 0.30F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CYAN_ROSE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(Items.POISONOUS_POTATO, 0.01F);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CYAN_ROSE.getId(),ModBlocks.POTTED_CYAN_ROSE);
        });
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.KILN_BLOCK_MENU.get(), KilnBlockScreen::new);
         }
    }
}
