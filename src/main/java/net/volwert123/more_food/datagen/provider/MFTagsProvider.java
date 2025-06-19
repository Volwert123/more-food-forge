package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFItems;
import net.volwert123.more_food.registry.MFTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public class MFTagsProvider {
    public static class Items extends TagsProvider<Item> {
        public Items(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.ITEM, registries, MoreFood.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            addCarrotTags();
            addAppleTags();
            addKelpTags();
            addPotatoTags();
            addPhantomTags();
            addPufferfishTags();
            addPumpkinTags();
            addBambooTags();
            addCookedRabbitTags();
            addMelonSliceTags();
            addCookedChickenTags();
            addCookedMuttonTags();
            addCookedPorkchopTags();
            addCookedBeefTags();
            addRiceTags();
            addSushiTags();
            addEggAndBaconTags();
            addChocolateTags();
            addSweetBerriesTags();
            addSereneSeasonCropTags();
        }

        private TagAppender<ResourceKey<Item>, Item> tag(TagKey<Item> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private void addCarrotTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_CARROT);
            tag(MFTags.Items.FOODS_VEGETABLES_CARROT).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("carrot")),
                    MFItems.IRON_CARROT.getKey(),
                    MFItems.DIAMOND_CARROT.getKey(),
                    MFItems.EMERALD_CARROT.getKey(),
                    MFItems.COOKED_CARROT.getKey()));
            tag(Tags.Items.FOODS_SOUP).add(MFItems.CARROT_SOUP.getKey());
            tag(Tags.Items.FOODS_BREAD).add(MFItems.CARROT_BREAD.getKey());
            tag(Tags.Items.FOODS_PIE).add(MFItems.CARROT_PIE.getKey());
            tag(Tags.Items.FOODS).add(MFItems.CHOCOLATE_CARROT.getKey());
        }

        private void addAppleTags() {
            tag(Tags.Items.FOODS_FRUIT).addTags(MFTags.Items.FOODS_FRUITS_APPLE);
            tag(MFTags.Items.FOODS_FRUITS_APPLE).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("apple")),
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("golden_apple")),
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("enchanted_golden_apple")),
                    MFItems.IRON_APPLE.getKey(),
                    MFItems.DIAMOND_APPLE.getKey(),
                    MFItems.EMERALD_APPLE.getKey(),
                    MFItems.COOKED_APPLE.getKey()));
            tag(Tags.Items.FOODS_SOUP).add(MFItems.APPLE_SOUP.getKey());
            tag(Tags.Items.FOODS_BREAD).add(MFItems.APPLE_BREAD.getKey());
            tag(Tags.Items.FOODS_PIE).add(MFItems.APPLE_PIE.getKey());
            tag(Tags.Items.FOODS).add(MFItems.CHOCOLATE_APPLE.getKey());
        }

        private void addKelpTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(MFTags.Items.FOODS_VEGETABLES_KELP).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("dried_kelp")),
                    MFItems.IRON_KELP.getKey(),
                    MFItems.GOLDEN_KELP.getKey(),
                    MFItems.DIAMOND_KELP.getKey(),
                    MFItems.EMERALD_KELP.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_KELP.getKey());
            tag(Tags.Items.FOODS_SOUP).add(MFItems.KELP_SOUP.getKey());
            tag(Tags.Items.FOODS).add(MFItems.CHOCOLATE_DRIED_KELP.getKey());
        }

        private void addPotatoTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(MFTags.Items.FOODS_VEGETABLES_POTATO).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("potato")),
                    MFItems.IRON_POTATO.getKey(),
                    MFItems.GOLDEN_POTATO.getKey(),
                    MFItems.DIAMOND_POTATO.getKey(),
                    MFItems.EMERALD_POTATO.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_POTATO.getKey());
            tag(Tags.Items.FOODS_SOUP).add(MFItems.POTATO_SOUP.getKey());
            tag(Tags.Items.FOODS_BREAD).add(MFItems.POTATO_BREAD.getKey());
        }

        private void addPhantomTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).add(MFItems.COOKED_PHANTOM.getKey());
            tag(Tags.Items.FOODS_SOUP).add(MFItems.PHANTOM_SOUP.getKey());
        }

        private void addPufferfishTags() {
            tag(Tags.Items.FOODS_COOKED_FISH).add(MFItems.COOKED_PUFFERFISH.getKey());
            tag(Tags.Items.FOODS_SOUP).add(MFItems.PUFFERFISH_SOUP.getKey());
            tag(Tags.Items.FOODS_FOOD_POISONING).add(MFItems.PUFFERFISH_SOUP.getKey());
        }

        private void addPumpkinTags() {
            tag(Tags.Items.FOODS_SOUP).add(MFItems.PUMPKING_SOUP.getKey());
            tag(Tags.Items.FOODS_BREAD).add(MFItems.PUMPKING_BREAD.getKey());
        }

        private void addBambooTags() {
            tag(Tags.Items.FOODS).add(MFItems.COOKED_BAMBOO.getKey());
            tag(Tags.Items.FOODS_SOUP).add(MFItems.BAMBOO_SOUP.getKey());
        }

        private void addCookedRabbitTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_RABBIT);
            tag(MFTags.Items.FOODS_COOKED_RABBIT).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_rabbit")),
                    MFItems.IRON_COOKED_RABBIT.getKey(),
                    MFItems.GOLDEN_COOKED_RABBIT.getKey(),
                    MFItems.DIAMOND_COOKED_RABBIT.getKey(),
                    MFItems.EMERALD_COOKED_RABBIT.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_COOKED_RABBIT.getKey());
        }

        private void addMelonSliceTags() {
            tag(Tags.Items.FOODS_FRUIT).addTags(MFTags.Items.FOODS_FRUITS_MELON_SLICE);
            tag(MFTags.Items.FOODS_FRUITS_MELON_SLICE).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("melon_slice")),
                    MFItems.IRON_MELON_SLICE.getKey(),
                    MFItems.GOLDEN_MELON_SLICE.getKey(),
                    MFItems.DIAMOND_MELON_SLICE.getKey(),
                    MFItems.EMERALD_MELON_SLICE.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_MELON_SLICE.getKey());
        }

        private void addCookedChickenTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_CHICKEN);
            tag(MFTags.Items.FOODS_COOKED_CHICKEN).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_chicken")),
                    MFItems.IRON_COOKED_CHICKEN.getKey(),
                    MFItems.GOLDEN_COOKED_CHICKEN.getKey(),
                    MFItems.DIAMOND_COOKED_CHICKEN.getKey(),
                    MFItems.EMERALD_COOKED_CHICKEN.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_COOKED_CHICKEN.getKey());
        }

        private void addCookedMuttonTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_MUTTON);
            tag(MFTags.Items.FOODS_COOKED_MUTTON).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_mutton")),
                    MFItems.IRON_COOKED_MUTTON.getKey(),
                    MFItems.GOLDEN_COOKED_MUTTON.getKey(),
                    MFItems.DIAMOND_COOKED_MUTTON.getKey(),
                    MFItems.EMERALD_COOKED_MUTTON.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_COOKED_MUTTON.getKey());
        }

        private void addCookedPorkchopTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_PORKCHOP);
            tag(MFTags.Items.FOODS_COOKED_PORKCHOP).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_porkchop")),
                    MFItems.IRON_COOKED_PORKCHOP.getKey(),
                    MFItems.GOLDEN_COOKED_PORKCHOP.getKey(),
                    MFItems.DIAMOND_COOKED_PORKCHOP.getKey(),
                    MFItems.EMERALD_COOKED_PORKCHOP.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_COOKED_PORKCHOP.getKey());
        }

        private void addCookedBeefTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_BEEF);
            tag(MFTags.Items.FOODS_COOKED_BEEF).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_beef")),
                    MFItems.IRON_COOKED_BEEF.getKey(),
                    MFItems.GOLDEN_COOKED_BEEF.getKey(),
                    MFItems.DIAMOND_COOKED_BEEF.getKey(),
                    MFItems.EMERALD_COOKED_BEEF.getKey()));
            tag(Tags.Items.FOODS_GOLDEN).add(MFItems.GOLDEN_COOKED_BEEF.getKey());
        }

        private void addRiceTags() {
            tag(Tags.Items.CROPS).addTags(MFTags.Items.CROPS_RICE);
            tag(MFTags.Items.CROPS_RICE).add(MFItems.RICE.getKey());
            tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTags(MFTags.Items.SEEDS_RICE);
            tag(Tags.Items.SEEDS).addTags(MFTags.Items.SEEDS_RICE);
            tag(MFTags.Items.SEEDS_RICE).add(MFItems.RICE.getKey());
            tag(Tags.Items.FOODS).addAll(List.of(
                    MFItems.RICE_CHICKEN_BOWL.getKey(),
                    MFItems.RICE_SALMON_BOWL.getKey(),
                    MFItems.RICE_COD_BOWL.getKey(),
                    MFItems.RICE_VEGETABLE_BOWL.getKey(),
                    MFItems.RICE_PUDDING.getKey(),
                    MFItems.RICE_HONEY_PUDDING.getKey()));
        }

        private void addSushiTags() {
            tag(Tags.Items.FOODS).addTags(MFTags.Items.FOODS_SUSHI);
            tag(MFTags.Items.FOODS_SUSHI).addAll(List.of(
                    MFItems.SUSHI_BAMBOO.getKey(),
                    MFItems.SUSHI_CARROT.getKey(),
                    MFItems.SUSHI_BEETROOT.getKey(),
                    MFItems.SUSHI_SALMON.getKey()));
        }

        private void addEggAndBaconTags() {
            tag(Tags.Items.FOODS).addTags(MFTags.Items.FOODS_COOKED_EGG);
            tag(MFTags.Items.FOODS_COOKED_EGG).add(MFItems.COOKED_EGG.getKey());
            tag(Tags.Items.FOODS_RAW_MEAT).addTags(MFTags.Items.FOODS_RAW_BACON);
            tag(MFTags.Items.FOODS_RAW_BACON).add(MFItems.RAW_BACON.getKey());
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_BACON);
            tag(MFTags.Items.FOODS_COOKED_BACON).add(MFItems.COOKED_BACON.getKey());
            tag(Tags.Items.FOODS).add(MFItems.COOKED_BACON_EGG.getKey());
        }

        private void addChocolateTags() {
            tag(Tags.Items.FOODS_CANDY).addAll(List.of(
                    MFItems.CHOCOLATE.getKey(),
                    MFItems.CHOCOLATE_BAR.getKey()));
        }

        private void addSweetBerriesTags() {
            tag(Tags.Items.FOODS).add(MFItems.CHOCOLATE_SWEET_BERRIES.getKey());
        }

        private void addSereneSeasonCropTags() {
            tag(MFTags.Items.SERENE_SEASON_SUMMER_CROPS).add(MFItems.RICE.getKey());
        }
    }

    public static class Blocks extends TagsProvider<Block> {
        public Blocks(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.BLOCK, completableFuture, MoreFood.MOD_ID, existingFileHelper);
        }

        private TagAppender<ResourceKey<Block>, Block> tag(TagKey<Block> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(BlockTags.CROPS).add(MFBlocks.RICE_CROP.getKey());
            tag(BlockTags.MAINTAINS_FARMLAND).add(MFBlocks.RICE_CROP.getKey());
            tag(MFTags.Blocks.SERENE_SEASON_SUMMER_CROPS).add(MFBlocks.RICE_CROP.getKey());
        }
    }
}