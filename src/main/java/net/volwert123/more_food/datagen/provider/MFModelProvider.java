package net.volwert123.more_food.datagen.provider;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.more_food.block.MFRiceCropBlock;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Stream;

public class MFModelProvider extends ModelProvider {
    public MFModelProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected @NotNull BlockModelGenerators getBlockModelGenerators(@NotNull BlockStateGeneratorCollector blocks, @NotNull ItemInfoCollector items, @NotNull SimpleModelCollector models) {
        return new BlockModelGenerators(blocks, items, models) {
            @Override
            public void run() {
                this.createCropBlock(MFBlocks.RICE_CROP.get(), MFRiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
            }
        };
    }

    @Override
    protected @NotNull ItemModelGenerators getItemModelGenerators(@NotNull ItemInfoCollector items, @NotNull SimpleModelCollector models) {
        return new ItemModelGenerators(items, models) {
            @Override
            public void run() {
                for (RegistryObject<Item> item : MFItems.ITEMS.getEntries()) {
                    Set<Item> excludedItems = Set.of(MFItems.RICE.get());
                    if (!excludedItems.contains(item.get())) {
                        this.generateFlatItem(item.get(), ModelTemplates.FLAT_ITEM);
                    }
                }
            }
        };
    }

    @Override
    protected @NotNull Stream<Block> getKnownBlocks() {
        return MFBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get);
    }

    @Override
    protected @NotNull Stream<Item> getKnownItems() {
        return MFItems.ITEMS.getEntries().stream().map(RegistryObject::get);
    }
}