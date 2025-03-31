package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class MFRecipeProvider extends RecipeProvider {
    private final HolderGetter<Item> items;

    protected MFRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        items = registries.lookupOrThrow(Registries.ITEM);
    }

    @Override
    protected void buildRecipes() {
        // Carrot Recipes
        createIronFoodRecipe(items, MFItems.IRON_CARROT.get(), Items.CARROT).save(output, registerRecipe(MFItems.IRON_CARROT.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_CARROT.get(), Items.CARROT).save(output, registerRecipe(MFItems.DIAMOND_CARROT.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_CARROT.get(), Items.CARROT).save(output, registerRecipe(MFItems.EMERALD_CARROT.get()));
        createCookingRecipes(MFItems.COOKED_CARROT.get(), Items.CARROT, output);
        createPiecesRecipe(items, MFItems.CARROT_PIECES.get(), Items.CARROT).save(output, registerRecipe(MFItems.CARROT_PIECES.get()));
        createSoupRecipe(items, MFItems.CARROT_SOUP.get(), Items.CARROT, MFItems.CARROT_PIECES.get()).save(output, registerRecipe(MFItems.CARROT_SOUP.get()));
        createBreadRecipe(items, MFItems.CARROT_BREAD.get(), Items.CARROT, MFItems.CARROT_PIECES.get()).save(output, registerRecipe(MFItems.CARROT_BREAD.get()));
        createPieRecipe(items, MFItems.CARROT_PIE.get(), Items.CARROT).save(output, registerRecipe(MFItems.CARROT_PIE.get()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_CARROT.get(), Items.CARROT).save(output, registerRecipe(MFItems.CHOCOLATE_CARROT.get()));

        // Apple Recipes
        createIronFoodRecipe(items, MFItems.IRON_APPLE.get(), Items.APPLE).save(output, registerRecipe(MFItems.IRON_APPLE.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_APPLE.get(), Items.APPLE).save(output, registerRecipe(MFItems.DIAMOND_APPLE.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_APPLE.get(), Items.APPLE).save(output, registerRecipe(MFItems.EMERALD_APPLE.get()));
        createCookingRecipes(MFItems.COOKED_APPLE.get(), Items.APPLE, output);
        createPiecesRecipe(items, MFItems.APPLE_PIECES.get(), Items.APPLE).save(output, registerRecipe(MFItems.APPLE_PIECES.get()));
        createSoupRecipe(items, MFItems.APPLE_SOUP.get(), Items.APPLE, MFItems.APPLE_PIECES.get()).save(output, registerRecipe(MFItems.APPLE_SOUP.get()));
        createBreadRecipe(items, MFItems.APPLE_BREAD.get(), Items.APPLE, MFItems.APPLE_PIECES.get()).save(output, registerRecipe(MFItems.APPLE_BREAD.get()));
        createPieRecipe(items, MFItems.APPLE_PIE.get(), Items.APPLE).save(output, registerRecipe(MFItems.APPLE_PIE.get()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_APPLE.get(), Items.APPLE).save(output, registerRecipe(MFItems.CHOCOLATE_APPLE.get()));

        // Kelp Recipes
        createIronFoodRecipe(items, MFItems.IRON_KELP.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.IRON_KELP.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_KELP.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.GOLDEN_KELP.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_KELP.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.DIAMOND_KELP.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_KELP.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.EMERALD_KELP.get()));
        createPiecesRecipe(items, MFItems.KELP_PIECES.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.KELP_PIECES.get()));
        createSoupRecipe(items, MFItems.KELP_SOUP.get(), Items.DRIED_KELP, MFItems.KELP_PIECES.get()).save(output, registerRecipe(MFItems.KELP_SOUP.get()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_DRIED_KELP.get(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.CHOCOLATE_DRIED_KELP.get()));

        // Potato Recipes
        createIronFoodRecipe(items, MFItems.IRON_POTATO.get(), Items.POTATO).save(output, registerRecipe(MFItems.IRON_POTATO.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_POTATO.get(), Items.POTATO).save(output, registerRecipe(MFItems.GOLDEN_POTATO.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_POTATO.get(), Items.POTATO).save(output, registerRecipe(MFItems.DIAMOND_POTATO.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_POTATO.get(), Items.POTATO).save(output, registerRecipe(MFItems.EMERALD_POTATO.get()));
        createPiecesRecipe(items, MFItems.POTATO_PIECES.get(), Items.POTATO).save(output, registerRecipe(MFItems.POTATO_PIECES.get()));
        createSoupRecipe(items, MFItems.POTATO_SOUP.get(), Items.POTATO, MFItems.POTATO_PIECES.get()).save(output, registerRecipe(MFItems.POTATO_SOUP.get()));
        createBreadRecipe(items, MFItems.POTATO_BREAD.get(), Items.POTATO, MFItems.POTATO_PIECES.get()).save(output, registerRecipe(MFItems.POTATO_BREAD.get()));

        // Phantom Recipes
        createCookingRecipes(MFItems.COOKED_PHANTOM.get(), Items.PHANTOM_MEMBRANE, output);
        createPiecesRecipe(items, MFItems.PHANTOM_PIECES.get(), Items.PHANTOM_MEMBRANE).save(output, registerRecipe(MFItems.PHANTOM_PIECES.get()));
        createSoupRecipe(items, MFItems.PHANTOM_SOUP.get(), Items.PHANTOM_MEMBRANE, MFItems.PHANTOM_PIECES.get()).save(output, registerRecipe(MFItems.PHANTOM_SOUP.get()));

        // Pufferfish Recipes
        createPiecesRecipe(items, MFItems.PUFFERFISH_PIECES.get(), Items.PUFFERFISH).save(output, registerRecipe(MFItems.PUFFERFISH_PIECES.get()));
        createSoupRecipe(items, MFItems.PUFFERFISH_SOUP.get(), Items.PUFFERFISH, MFItems.PUFFERFISH_PIECES.get()).save(output, registerRecipe(MFItems.PUFFERFISH_SOUP.get()));
        createCookingRecipes(MFItems.COOKED_PUFFERFISH.get(), Items.PUFFERFISH, output);

        // Pumpkin Recipes
        createSoupRecipe(items, MFItems.PUMPKING_SOUP.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, registerRecipe(MFItems.PUMPKING_SOUP.get()));
        createBreadRecipe(items, MFItems.PUMPKING_BREAD.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, registerRecipe(MFItems.PUMPKING_BREAD.get()));

        // Bamboo Recipes
        createCookingRecipes(MFItems.COOKED_BAMBOO.get(), Items.BAMBOO, output);
        createPiecesRecipe(items, MFItems.BAMBOO_PIECES.get(), Items.BAMBOO).save(output, registerRecipe(MFItems.BAMBOO_PIECES.get()));
        createSoupRecipe(items, MFItems.BAMBOO_SOUP.get(), Items.BAMBOO, MFItems.BAMBOO_PIECES.get()).save(output, registerRecipe(MFItems.BAMBOO_SOUP.get()));

        // Rabbit Recipes
        createIronFoodRecipe(items, MFItems.IRON_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, registerRecipe(MFItems.IRON_COOKED_RABBIT.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_RABBIT.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, registerRecipe(MFItems.DIAMOND_COOKED_RABBIT.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, registerRecipe(MFItems.EMERALD_COOKED_RABBIT.get()));

        // Melon Slice Recipes
        createIronFoodRecipe(items, MFItems.IRON_MELON_SLICE.get(), Items.MELON_SLICE).save(output, registerRecipe(MFItems.IRON_MELON_SLICE.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_MELON_SLICE.get(), Items.MELON_SLICE).save(output, registerRecipe(MFItems.GOLDEN_MELON_SLICE.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_MELON_SLICE.get(), Items.MELON_SLICE).save(output, registerRecipe(MFItems.DIAMOND_MELON_SLICE.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_MELON_SLICE.get(), Items.MELON_SLICE).save(output, registerRecipe(MFItems.EMERALD_MELON_SLICE.get()));

        // Cooked Chicken Recipes
        createIronFoodRecipe(items, MFItems.IRON_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.IRON_COOKED_CHICKEN.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.GOLDEN_COOKED_CHICKEN.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.DIAMOND_COOKED_CHICKEN.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.EMERALD_COOKED_CHICKEN.get()));

        // Cooked Mutton Recipes
        createIronFoodRecipe(items, MFItems.IRON_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, registerRecipe(MFItems.IRON_COOKED_MUTTON.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, registerRecipe(MFItems.GOLDEN_COOKED_MUTTON.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, registerRecipe(MFItems.DIAMOND_COOKED_MUTTON.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, registerRecipe(MFItems.EMERALD_COOKED_MUTTON.get()));

        // Cooked Porkchop Recipes
        createIronFoodRecipe(items, MFItems.IRON_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, registerRecipe(MFItems.IRON_COOKED_PORKCHOP.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, registerRecipe(MFItems.GOLDEN_COOKED_PORKCHOP.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, registerRecipe(MFItems.DIAMOND_COOKED_PORKCHOP.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, registerRecipe(MFItems.EMERALD_COOKED_PORKCHOP.get()));

        // Cooked Beef Recipes
        createIronFoodRecipe(items, MFItems.IRON_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, registerRecipe(MFItems.IRON_COOKED_BEEF.get()));
        createGoldenFoodRecipe(items, MFItems.GOLDEN_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, registerRecipe(MFItems.GOLDEN_COOKED_BEEF.get()));
        createDiamondFoodRecipe(items, MFItems.DIAMOND_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, registerRecipe(MFItems.DIAMOND_COOKED_BEEF.get()));
        createEmeraldFoodRecipe(items, MFItems.EMERALD_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, registerRecipe(MFItems.EMERALD_COOKED_BEEF.get()));

        // Rice Bowl Recipes
        createRiceBowlRecipe(items, MFItems.RICE_CHICKEN_BOWL.get(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.RICE_CHICKEN_BOWL.get()));
        createRiceBowlRecipe(items, MFItems.RICE_SALMON_BOWL.get(), Items.COOKED_SALMON).save(output, registerRecipe(MFItems.RICE_SALMON_BOWL.get()));
        createRiceBowlRecipe(items, MFItems.RICE_COD_BOWL.get(), Items.COOKED_COD).save(output, registerRecipe(MFItems.RICE_COD_BOWL.get()));
        createRiceVegetableBowlRecipe(items).save(output, registerRecipe(MFItems.RICE_VEGETABLE_BOWL.get()));
        createRiceBowlRecipe(items, MFItems.RICE_PUDDING.get(), Items.MILK_BUCKET).save(output, registerRecipe(MFItems.RICE_PUDDING.get()));
        createRiceHoneyPuddingRecipe(items).save(output, registerRecipe(MFItems.RICE_HONEY_PUDDING.get()));

        // Sushi Recipes
        createSushiRecipe(items, MFItems.SUSHI_BAMBOO.get(), Items.BAMBOO).save(output, registerRecipe(MFItems.SUSHI_BAMBOO.get()));
        createSushiRecipe(items, MFItems.SUSHI_CARROT.get(), Items.CARROT).save(output, registerRecipe(MFItems.SUSHI_CARROT.get()));
        createSushiRecipe(items, MFItems.SUSHI_BEETROOT.get(), Items.BEETROOT).save(output, registerRecipe(MFItems.SUSHI_BEETROOT.get()));
        createSushiRecipe(items, MFItems.SUSHI_SALMON.get(), Items.SALMON).save(output, registerRecipe(MFItems.SUSHI_SALMON.get()));

        // Egg Recipes
        createCookingRecipes(MFItems.COOKED_EGG.get(), Items.EGG, output);

        // Bacon Recipes
        createRawBaconRecipe(items).save(output, registerRecipe(MFItems.RAW_BACON.get()));
        createCookingRecipes(MFItems.COOKED_BACON.get(), MFItems.RAW_BACON.get(), output);
        createCookedBaconEggRecipe(items).save(output, registerRecipe(MFItems.COOKED_BACON_EGG.get()));

        // Chocolate Recipes
        createChocolateRecipe(items).save(output, registerRecipe(MFItems.CHOCOLATE.get()));
        createChocolateBarRecipe(items).save(output, registerRecipe(MFItems.CHOCOLATE_BAR.get()));

        // Sweet Berries
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_SWEET_BERRIES.get(), Items.SWEET_BERRIES).save(output, registerRecipe(MFItems.CHOCOLATE_SWEET_BERRIES.get()));
    }

    private ShapedRecipeBuilder createIronFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('I', Items.IRON_INGOT)
                .define('#', input)
                .pattern("III")
                .pattern("I#I")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapedRecipeBuilder createGoldenFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('G', Items.GOLD_INGOT)
                .define('#', input)
                .pattern("GGG")
                .pattern("G#G")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapedRecipeBuilder createDiamondFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('D', Items.DIAMOND)
                .define('#', input)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapedRecipeBuilder createEmeraldFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('E', Items.EMERALD)
                .define('#', input)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .unlockedBy(getHasName(input), has(input));
    }

    private void createCookingRecipes(ItemLike output, ItemLike input, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_smelting")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,100, RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_smoking")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_campfire_cooking")));
    }

    private ShapelessRecipeBuilder createPiecesRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, output, 4)
                .requires(input)
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapelessRecipeBuilder createSoupRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(Items.BOWL)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private ShapelessRecipeBuilder createBreadRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(Items.WHEAT, 2)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private ShapelessRecipeBuilder createPieRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(input)
                .requires(Items.EGG)
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.EGG), has(Items.EGG))
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR));
    }

    private ShapedRecipeBuilder createRiceBowlRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.get())
                .define('#', input)
                .pattern("  #")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapedRecipeBuilder createRiceVegetableBowlRecipe(HolderGetter<Item> items) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, MFItems.RICE_VEGETABLE_BOWL.get())
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.get())
                .define('A', MFItems.COOKED_BAMBOO.get())
                .define('C', Items.CARROT)
                .pattern(" AC")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(MFItems.COOKED_BAMBOO.get()), has(MFItems.COOKED_BAMBOO.get()))
                .unlockedBy(getHasName(Items.CARROT), has(Items.CARROT));
    }

    private ShapelessRecipeBuilder createRiceHoneyPuddingRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.RICE_HONEY_PUDDING.get())
                .requires(MFItems.RICE_PUDDING.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy(getHasName(MFItems.RICE_HONEY_PUDDING.get()), has(MFItems.RICE_HONEY_PUDDING.get()))
                .unlockedBy(getHasName(Items.HONEY_BOTTLE), has(Items.HONEY_BOTTLE));
    }

    private ShapedRecipeBuilder createSushiRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('D', Items.DRIED_KELP)
                .define('R', MFItems.RICE.get())
                .define('#', input)
                .pattern("R#R")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DRIED_KELP), has(Items.DRIED_KELP))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapelessRecipeBuilder createRawBaconRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.RAW_BACON.get())
                .requires(Items.PORKCHOP)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP));
    }

    private ShapelessRecipeBuilder createCookedBaconEggRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.COOKED_BACON_EGG.get())
                .requires(MFItems.COOKED_BACON.get())
                .requires(MFItems.COOKED_EGG.get())
                .unlockedBy(getHasName(MFItems.COOKED_BACON.get()), has(MFItems.COOKED_BACON.get()))
                .unlockedBy(getHasName(MFItems.COOKED_EGG.get()), has(MFItems.COOKED_EGG.get()));
    }

    private ShapelessRecipeBuilder createChocolateRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.CHOCOLATE.get())
                .requires(Items.MILK_BUCKET)
                .requires(Items.COCOA_BEANS)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                .unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS));
    }

    private ShapelessRecipeBuilder createChocolateBarRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.CHOCOLATE_BAR.get())
                .requires(Items.PAPER)
                .requires(MFItems.CHOCOLATE.get())
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .unlockedBy(getHasName(MFItems.CHOCOLATE.get()), has(MFItems.CHOCOLATE.get()));
    }

    private ShapedRecipeBuilder createChocolateFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('C', MFItems.CHOCOLATE.get())
                .define('#', input)
                .pattern("   ")
                .pattern(" # ")
                .pattern(" C ")
                .unlockedBy(getHasName(MFItems.CHOCOLATE.get()), has(MFItems.CHOCOLATE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ResourceKey<Recipe<?>> registerRecipe(ItemLike item) {
        return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(item)));
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider registries, @NotNull RecipeOutput output) {
            return new MFRecipeProvider(registries, output);
        }

        @Override
        public @NotNull String getName() {
            return MoreFood.MOD_ID + " recipes";
        }
    }
}