package net.volwert123.more_food.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.datagen.provider.*;
import net.volwert123.more_food.datagen.provider.lang.MFEnglishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFFrenchLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFGermanLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFRussianLanguageProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MFDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new MFEnglishLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFFrenchLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFGermanLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFRussianLanguageProvider(packOutput));

        generator.addProvider(event.includeServer(), new MFGlobalLootModifierProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), MFLootTableProvider.create(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new MFModelProvider(packOutput));
        generator.addProvider(event.includeServer(), new MFRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new MFTagsProvider.Items(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new MFTagsProvider.Blocks(packOutput, lookupProvider, existingFileHelper));
    }
}