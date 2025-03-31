package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;

public class MFFrenchLanguageProvider extends LanguageProvider {
    public MFFrenchLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.get(), "Carotte de fer");
        add(MFItems.DIAMOND_CARROT.get(), "Carotte de diamant");
        add(MFItems.EMERALD_CARROT.get(), "Carotte d'émeraude");
        add(MFItems.COOKED_CARROT.get(), "Carotte cuite");
        add(MFItems.CARROT_PIECES.get(), "Morceaux de carotte");
        add(MFItems.CARROT_SOUP.get(), "Soupe de carotte");
        add(MFItems.CARROT_BREAD.get(), "Pain à la carotte");
        add(MFItems.CARROT_PIE.get(), "Tarte à la carotte");
        add(MFItems.CHOCOLATE_CARROT.get(), "Carotte en chocolat");

        // Apple Items
        add(MFItems.IRON_APPLE.get(), "Pomme de fer");
        add(MFItems.DIAMOND_APPLE.get(), "Pomme de diamant");
        add(MFItems.EMERALD_APPLE.get(), "Pomme d'émeraude");
        add(MFItems.COOKED_APPLE.get(), "Pomme cuite");
        add(MFItems.APPLE_PIECES.get(), "Morceaux de pomme");
        add(MFItems.APPLE_SOUP.get(), "Soupe de pomme");
        add(MFItems.APPLE_BREAD.get(), "Pain à la pomme");
        add(MFItems.APPLE_PIE.get(), "Tarte à la pommes");
        add(MFItems.CHOCOLATE_APPLE.get(), "Pomme en chocolat");

        // Kelp Items
        add(MFItems.IRON_KELP.get(), "Algue de fer");
        add(MFItems.GOLDEN_KELP.get(), "Algue dorée");
        add(MFItems.DIAMOND_KELP.get(), "Algue de diamant");
        add(MFItems.EMERALD_KELP.get(), "Algue d'émeraude");
        add(MFItems.KELP_PIECES.get(), "Morceaux d'algue");
        add(MFItems.KELP_SOUP.get(), "Soupe d'algue");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Algue séchée au chocolat");

        // Potato Items
        add(MFItems.IRON_POTATO.get(), "Pomme de terre de fer");
        add(MFItems.GOLDEN_POTATO.get(), "Pomme de terre dorée");
        add(MFItems.DIAMOND_POTATO.get(), "Pomme de terre de diamant");
        add(MFItems.EMERALD_POTATO.get(), "Pomme de terre d'émeraude");
        add(MFItems.POTATO_PIECES.get(), "Morceaux de pomme de terre");
        add(MFItems.POTATO_SOUP.get(), "Soupe de pommes de terre");
        add(MFItems.POTATO_BREAD.get(), "Pain à la pommes de terre");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Phantom cuit");
        add(MFItems.PHANTOM_PIECES.get(), "Morceaux de phantom");
        add(MFItems.PHANTOM_SOUP.get(), "Soupe de phantom");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Poisson-globe cuit");
        add(MFItems.PUFFERFISH_PIECES.get(), "Morceaux de poisson-globe");
        add(MFItems.PUFFERFISH_SOUP.get(), "Soupe de poisson-globe");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Soupe de citrouille");
        add(MFItems.PUMPKING_BREAD.get(), "Pain à la citrouille");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Bambou cuit");
        add(MFItems.BAMBOO_PIECES.get(), "Morceaux de bambou");
        add(MFItems.BAMBOO_SOUP.get(), "Soupe de bambou");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.get(), "Lapin cuit de fer");
        add(MFItems.GOLDEN_COOKED_RABBIT.get(), "Lapin cuit doré");
        add(MFItems.DIAMOND_COOKED_RABBIT.get(), "Lapin cuit de diamant");
        add(MFItems.EMERALD_COOKED_RABBIT.get(), "Lapin cuit d'émeraude");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.get(), "Tranche de pastèque de fer");
        add(MFItems.GOLDEN_MELON_SLICE.get(), "Tranche de pastèque dorée");
        add(MFItems.DIAMOND_MELON_SLICE.get(), "Tranche de pastèque de diamant");
        add(MFItems.EMERALD_MELON_SLICE.get(), "Tranche de pastèque d'émeraude");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.get(), "Poulet rôti de fer");
        add(MFItems.GOLDEN_COOKED_CHICKEN.get(), "Poulet rôti doré");
        add(MFItems.DIAMOND_COOKED_CHICKEN.get(), "Poulet rôti de diamant");
        add(MFItems.EMERALD_COOKED_CHICKEN.get(), "Poulet rôti d'émeraude");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.get(), "Mouton cuit de fer");
        add(MFItems.GOLDEN_COOKED_MUTTON.get(), "Mouton cuit doré");
        add(MFItems.DIAMOND_COOKED_MUTTON.get(), "Mouton cuit de diamant");
        add(MFItems.EMERALD_COOKED_MUTTON.get(), "Mouton cuit d'émeraude");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.get(), "Côtelette de porc cuite de fer");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.get(), "Côtelette de porc cuite dorée");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.get(), "Côtelette de porc cuite de diamant");
        add(MFItems.EMERALD_COOKED_PORKCHOP.get(), "Côtelette de porc cuite d'émeraude");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.get(), "Steak de fer");
        add(MFItems.GOLDEN_COOKED_BEEF.get(), "Steak doré");
        add(MFItems.DIAMOND_COOKED_BEEF.get(), "Steak de diamant");
        add(MFItems.EMERALD_COOKED_BEEF.get(), "Steak d'émeraude");

        // Rice Items
        add(MFItems.RICE.get(), "Riz");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Bol de riz au poulet");
        add(MFItems.RICE_SALMON_BOWL.get(), "Bol de riz au saumon");
        add(MFItems.RICE_COD_BOWL.get(), "Bol de riz au morue");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Bol de riz aux légumes");
        add(MFItems.RICE_PUDDING.get(), "Riz au lait");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Riz au lait et au miel");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Sushi de bambou");
        add(MFItems.SUSHI_CARROT.get(), "Sushi de carotte");
        add(MFItems.SUSHI_BEETROOT.get(), "Sushi de betterave");
        add(MFItems.SUSHI_SALMON.get(), "Sushi de saumon");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Œuf cuit");
        add(MFItems.RAW_BACON.get(), "Bacon cru");
        add(MFItems.COOKED_BACON.get(), "Bacon cuit");
        add(MFItems.COOKED_BACON_EGG.get(), "Œuf au bacon cuit");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Chocolat");
        add(MFItems.CHOCOLATE_BAR.get(), "Tablette de chocolat");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Baies sucrées au chocolat");
    }
}