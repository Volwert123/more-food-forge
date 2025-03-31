package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.loot.MFAddItemModifier;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class MFGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public MFGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, MoreFood.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.@NotNull Provider provider) {
        addBlockLoot("rice_grass", MFItems.RICE.get(), Blocks.SHORT_GRASS);
        addBlockLoot("rice_fern", MFItems.RICE.get(), Blocks.FERN);
    }

    private void addBlockLoot(String id, Item item, Block block) {
        add(id, new MFAddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, item));
    }
}