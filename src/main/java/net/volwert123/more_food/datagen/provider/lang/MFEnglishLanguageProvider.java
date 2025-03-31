package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;

public class MFEnglishLanguageProvider extends LanguageProvider {
    public MFEnglishLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.get(), "Iron Carrot");
        add(MFItems.DIAMOND_CARROT.get(), "Diamond Carrot");
        add(MFItems.EMERALD_CARROT.get(), "Emerald Carrot");
        add(MFItems.COOKED_CARROT.get(), "Cooked Carrot");
        add(MFItems.CARROT_PIECES.get(), "Carrot Pieces");
        add(MFItems.CARROT_SOUP.get(), "Carrot Soup");
        add(MFItems.CARROT_BREAD.get(), "Carrot Bread");
        add(MFItems.CARROT_PIE.get(), "Carrot Pie");
        add(MFItems.CHOCOLATE_CARROT.get(), "Chocolate Carrot");

        // Apple Items
        add(MFItems.IRON_APPLE.get(), "Iron Apple");
        add(MFItems.DIAMOND_APPLE.get(), "Diamond Apple");
        add(MFItems.EMERALD_APPLE.get(), "Emerald Apple");
        add(MFItems.COOKED_APPLE.get(), "Cooked Apple");
        add(MFItems.APPLE_PIECES.get(), "Apple Pieces");
        add(MFItems.APPLE_SOUP.get(), "Apple Soup");
        add(MFItems.APPLE_BREAD.get(), "Apple Bread");
        add(MFItems.APPLE_PIE.get(), "Apple Pie");
        add(MFItems.CHOCOLATE_APPLE.get(), "Chocolate Apple");

        // Kelp Items
        add(MFItems.IRON_KELP.get(), "Iron Kelp");
        add(MFItems.GOLDEN_KELP.get(), "Golden Kelp");
        add(MFItems.DIAMOND_KELP.get(), "Diamond Kelp");
        add(MFItems.EMERALD_KELP.get(), "Emerald Kelp");
        add(MFItems.KELP_PIECES.get(), "Kelp Pieces");
        add(MFItems.KELP_SOUP.get(), "Kelp Soup");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Chocolate Dried Kelp");

        // Potato Items
        add(MFItems.IRON_POTATO.get(), "Iron Potato");
        add(MFItems.GOLDEN_POTATO.get(), "Golden Potato");
        add(MFItems.DIAMOND_POTATO.get(), "Diamond Potato");
        add(MFItems.EMERALD_POTATO.get(), "Emerald Potato");
        add(MFItems.POTATO_PIECES.get(), "Potato Pieces");
        add(MFItems.POTATO_SOUP.get(), "Potato Soup");
        add(MFItems.POTATO_BREAD.get(), "Potato Bread");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Cooked Phantom");
        add(MFItems.PHANTOM_PIECES.get(), "Phantom Pieces");
        add(MFItems.PHANTOM_SOUP.get(), "Phantom Soup");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Cooked Pufferfish");
        add(MFItems.PUFFERFISH_PIECES.get(), "Pufferfish Pieces");
        add(MFItems.PUFFERFISH_SOUP.get(), "Pufferfish Soup");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Pumpkin Soup");
        add(MFItems.PUMPKING_BREAD.get(), "Pumpkin Bread");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Cooked Bamboo");
        add(MFItems.BAMBOO_PIECES.get(), "Bamboo Pieces");
        add(MFItems.BAMBOO_SOUP.get(), "Bamboo Soup");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.get(), "Iron Cooked Rabbit");
        add(MFItems.GOLDEN_COOKED_RABBIT.get(), "Golden Cooked Rabbit");
        add(MFItems.DIAMOND_COOKED_RABBIT.get(), "Diamond Cooked Rabbit");
        add(MFItems.EMERALD_COOKED_RABBIT.get(), "Emerald Cooked Rabbit");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.get(), "Iron Melon Slice");
        add(MFItems.GOLDEN_MELON_SLICE.get(), "Golden Melon Slice");
        add(MFItems.DIAMOND_MELON_SLICE.get(), "Diamond Melon Slice");
        add(MFItems.EMERALD_MELON_SLICE.get(), "Emerald Melon Slice");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.get(), "Iron Cooked Chicken");
        add(MFItems.GOLDEN_COOKED_CHICKEN.get(), "Golden Cooked Chicken");
        add(MFItems.DIAMOND_COOKED_CHICKEN.get(), "Diamond Cooked Chicken");
        add(MFItems.EMERALD_COOKED_CHICKEN.get(), "Emerald Cooked Chicken");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.get(), "Iron Cooked Mutton");
        add(MFItems.GOLDEN_COOKED_MUTTON.get(), "Golden Cooked Mutton");
        add(MFItems.DIAMOND_COOKED_MUTTON.get(), "Diamond Cooked Mutton");
        add(MFItems.EMERALD_COOKED_MUTTON.get(), "Emerald Cooked Mutton");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.get(), "Iron Cooked Porkchop");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.get(), "Golden Cooked Porkchop");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.get(), "Diamond Cooked Porkchop");
        add(MFItems.EMERALD_COOKED_PORKCHOP.get(), "Emerald Cooked Porkchop");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.get(), "Iron Cooked Beef");
        add(MFItems.GOLDEN_COOKED_BEEF.get(), "Golden Cooked Beef");
        add(MFItems.DIAMOND_COOKED_BEEF.get(), "Diamond Cooked Beef");
        add(MFItems.EMERALD_COOKED_BEEF.get(), "Emerald Cooked Beef");

        // Rice Items
        add(MFItems.RICE.get(), "Rice");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Rice Chicken Bowl");
        add(MFItems.RICE_SALMON_BOWL.get(), "Rice Salmon Bowl");
        add(MFItems.RICE_COD_BOWL.get(), "Rice Cod Bowl");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Rice Vegetable Bowl");
        add(MFItems.RICE_PUDDING.get(), "Rice Pudding");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Rice Honey Pudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Sushi Bamboo");
        add(MFItems.SUSHI_CARROT.get(), "Sushi Carrot");
        add(MFItems.SUSHI_BEETROOT.get(), "Sushi Beetroot");
        add(MFItems.SUSHI_SALMON.get(), "Sushi Salmon");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Cooked Egg");
        add(MFItems.RAW_BACON.get(), "Raw Bacon");
        add(MFItems.COOKED_BACON.get(), "Cooked Bacon");
        add(MFItems.COOKED_BACON_EGG.get(), "Cooked Bacon Egg");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Chocolate");
        add(MFItems.CHOCOLATE_BAR.get(), "Chocolate Bar");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Chocolate Sweet Berries");
    }
}