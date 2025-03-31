package net.volwert123.more_food;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFCreativeTabs;
import net.volwert123.more_food.registry.MFItems;
import net.volwert123.more_food.registry.MFLootModifiers;

@Mod(MoreFood.MOD_ID)
public class MoreFood {
    public static final String MOD_ID = "more_food";

    public MoreFood(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        MFBlocks.BLOCKS.register(modEventBus);
        MFCreativeTabs.TABS.register(modEventBus);
        MFItems.ITEMS.register(modEventBus);
        MFLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == MFCreativeTabs.MORE_FOOD_MAIN.getKey()) {
            for (RegistryObject<Item> item : MFItems.ITEMS.getEntries()) {
                event.accept(item);
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class BMMClientEvents {
        @SubscribeEvent
        @SuppressWarnings("removal")
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(MFBlocks.RICE_CROP.get(), RenderType.cutout());
        }
    }
}