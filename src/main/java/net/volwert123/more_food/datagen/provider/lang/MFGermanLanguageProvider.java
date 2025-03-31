package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;

public class MFGermanLanguageProvider extends LanguageProvider {
    public MFGermanLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "de_de");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.get(), "Eisenkarotte");
        add(MFItems.DIAMOND_CARROT.get(), "Diamantkarotte");
        add(MFItems.EMERALD_CARROT.get(), "Smaragdkarotte");
        add(MFItems.COOKED_CARROT.get(), "Gebratene Karotte");
        add(MFItems.CARROT_PIECES.get(), "Karottenstücke");
        add(MFItems.CARROT_SOUP.get(), "Karottensuppe");
        add(MFItems.CARROT_BREAD.get(), "Karottenbrot");
        add(MFItems.CARROT_PIE.get(), "Karottenkuchen");
        add(MFItems.CHOCOLATE_CARROT.get(), "Schokoladenkarotte");

        // Apple Items
        add(MFItems.IRON_APPLE.get(), "Eisenapfel");
        add(MFItems.DIAMOND_APPLE.get(), "Diamantapfel");
        add(MFItems.EMERALD_APPLE.get(), "Smaragdapfel");
        add(MFItems.COOKED_APPLE.get(), "Gebratener Apfel");
        add(MFItems.APPLE_PIECES.get(), "Apfelstücke");
        add(MFItems.APPLE_SOUP.get(), "Apfelsuppe");
        add(MFItems.APPLE_BREAD.get(), "Apfelbrot");
        add(MFItems.APPLE_PIE.get(), "Apfelkuchen");
        add(MFItems.CHOCOLATE_APPLE.get(), "Schokoladenapfel");

        // Kelp Items
        add(MFItems.IRON_KELP.get(), "Eisenseetang");
        add(MFItems.GOLDEN_KELP.get(), "Goldener Seetang");
        add(MFItems.DIAMOND_KELP.get(), "Diamantseetang");
        add(MFItems.EMERALD_KELP.get(), "Smaragdseetang");
        add(MFItems.KELP_PIECES.get(), "Seetangstücke");
        add(MFItems.KELP_SOUP.get(), "Seetangsuppe");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Getrockneter Schokoladenseetang");

        // Potato Items
        add(MFItems.IRON_POTATO.get(), "Eisenkartoffel");
        add(MFItems.GOLDEN_POTATO.get(), "Goldene Kartoffel");
        add(MFItems.DIAMOND_POTATO.get(), "Diamantkartoffel");
        add(MFItems.EMERALD_POTATO.get(), "Smaragdkartoffel");
        add(MFItems.POTATO_PIECES.get(), "Kartoffelstücke");
        add(MFItems.POTATO_SOUP.get(), "Kartoffelsuppe");
        add(MFItems.POTATO_BREAD.get(), "Kartoffelbrot");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Gebratenes Phantom");
        add(MFItems.PHANTOM_PIECES.get(), "Phantomstücke");
        add(MFItems.PHANTOM_SOUP.get(), "Phantomsuppe");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Gebratener Kugelfisch");
        add(MFItems.PUFFERFISH_PIECES.get(), "Kugelfischstücke");
        add(MFItems.PUFFERFISH_SOUP.get(), "Kugelfischsuppe");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Kürbissuppe");
        add(MFItems.PUMPKING_BREAD.get(), "Kürbisbrot");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Gebratener Bambus");
        add(MFItems.BAMBOO_PIECES.get(), "Bambusstücke");
        add(MFItems.BAMBOO_SOUP.get(), "Bambussuppe");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.get(), "Gebratenes Eisenkaninchen");
        add(MFItems.GOLDEN_COOKED_RABBIT.get(), "Goldenes Gebratenes Kaninchen");
        add(MFItems.DIAMOND_COOKED_RABBIT.get(), "Gebratenes Diamantkaninchen");
        add(MFItems.EMERALD_COOKED_RABBIT.get(), "Gebratenes Smaragdkaninchen");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.get(), "Eisenmelonenscheibe");
        add(MFItems.GOLDEN_MELON_SLICE.get(), "Goldene Melonenscheibe");
        add(MFItems.DIAMOND_MELON_SLICE.get(), "Diamantmelonenscheibe");
        add(MFItems.EMERALD_MELON_SLICE.get(), "Smaragdmelonenscheibe");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.get(), "Gebratenes Eisenhühnchen");
        add(MFItems.GOLDEN_COOKED_CHICKEN.get(), "Goldenes Gebratenes Hühnchen");
        add(MFItems.DIAMOND_COOKED_CHICKEN.get(), "Gebratenes Diamanthühnchen");
        add(MFItems.EMERALD_COOKED_CHICKEN.get(), "Gebratenes Smaragdhühnchen");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.get(), "Gebratenes Eisenhammelfleisch");
        add(MFItems.GOLDEN_COOKED_MUTTON.get(), "Goldenes Gebratenes Hammelfleisch");
        add(MFItems.DIAMOND_COOKED_MUTTON.get(), "Gebratenes Diamanthammelfleisch");
        add(MFItems.EMERALD_COOKED_MUTTON.get(), "Gebratenes Smaragdhammelfleisch");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.get(), "Gebratenes Eisenschweinefleisch");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.get(), "Goldenes Gebratenes Schweinefleisch");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.get(), "Gebratenes Diamantschweinefleisch");
        add(MFItems.EMERALD_COOKED_PORKCHOP.get(), "Gebratenes Smaragdschweinefleisch");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.get(), "Eisensteak");
        add(MFItems.GOLDEN_COOKED_BEEF.get(), "Goldenes Steak");
        add(MFItems.DIAMOND_COOKED_BEEF.get(), "Diamantsteak");
        add(MFItems.EMERALD_COOKED_BEEF.get(), "Smaragdsteak");

        // Rice Items
        add(MFItems.RICE.get(), "Reis");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Reis-Hühnchenschüssel");
        add(MFItems.RICE_SALMON_BOWL.get(), "Reis-Lachsschüssel");
        add(MFItems.RICE_COD_BOWL.get(), "Reis-Kabeljauschüssel");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Reis-Gemüseschüssel");
        add(MFItems.RICE_PUDDING.get(), "Reispudding");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Reis-Honigpudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Bambus Sushi");
        add(MFItems.SUSHI_CARROT.get(), "Karotten Sushi");
        add(MFItems.SUSHI_BEETROOT.get(), "Rote Bete Sushi");
        add(MFItems.SUSHI_SALMON.get(), "Lachs Sushi");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Gekochtes Ei");
        add(MFItems.RAW_BACON.get(), "Roher Speck");
        add(MFItems.COOKED_BACON.get(), "Gebratener Speck");
        add(MFItems.COOKED_BACON_EGG.get(), "Gebratenes Speckei");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Schokolade");
        add(MFItems.CHOCOLATE_BAR.get(), "Schokoladentafel");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Schokoladensüßbeeren");
    }
}