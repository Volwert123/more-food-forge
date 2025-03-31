package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;

public class MFRussianLanguageProvider extends LanguageProvider {
    public MFRussianLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "ru_ru");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.get(), "Железная морковь");
        add(MFItems.DIAMOND_CARROT.get(), "Алмазная морковь");
        add(MFItems.EMERALD_CARROT.get(), "Изумрудная морковь");
        add(MFItems.COOKED_CARROT.get(), "Жареная морковь");
        add(MFItems.CARROT_PIECES.get(), "Кусочки моркови");
        add(MFItems.CARROT_SOUP.get(), "Морковный суп");
        add(MFItems.CARROT_BREAD.get(), "Морковный хлеб");
        add(MFItems.CARROT_PIE.get(), "Морковный пирог");
        add(MFItems.CHOCOLATE_CARROT.get(), "Шоколадная морковь");

        // Apple Items
        add(MFItems.IRON_APPLE.get(), "Железное яблоко");
        add(MFItems.DIAMOND_APPLE.get(), "Алмазное яблоко");
        add(MFItems.EMERALD_APPLE.get(), "Изумрудное яблоко");
        add(MFItems.COOKED_APPLE.get(), "Жареное яблоко");
        add(MFItems.APPLE_PIECES.get(), "Кусочки яблока");
        add(MFItems.APPLE_SOUP.get(), "Яблочный суп");
        add(MFItems.APPLE_BREAD.get(), "Яблочный хлеб");
        add(MFItems.APPLE_PIE.get(), "Яблочный пирог");
        add(MFItems.CHOCOLATE_APPLE.get(), "Шоколадное яблоко");

        // Kelp Items
        add(MFItems.IRON_KELP.get(), "Железный ламинария");
        add(MFItems.GOLDEN_KELP.get(), "Золотистая ламинария");
        add(MFItems.DIAMOND_KELP.get(), "Алмазная ламинария");
        add(MFItems.EMERALD_KELP.get(), "Изумрудная ламинария");
        add(MFItems.KELP_PIECES.get(), "Кусочки ламинарии");
        add(MFItems.KELP_SOUP.get(), "Ламинарийный суп");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Сушёная шоколадная ламинария");

        // Potato Items
        add(MFItems.IRON_POTATO.get(), "Железный картофель");
        add(MFItems.GOLDEN_POTATO.get(), "Золотой картофель");
        add(MFItems.DIAMOND_POTATO.get(), "Алмазный картофель");
        add(MFItems.EMERALD_POTATO.get(), "Изумрудный картофель");
        add(MFItems.POTATO_PIECES.get(), "Кусочки картофеля");
        add(MFItems.POTATO_SOUP.get(), "Картофельный суп");
        add(MFItems.POTATO_BREAD.get(), "Картофельный хлеб");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Жареный фантом");
        add(MFItems.PHANTOM_PIECES.get(), "Кусочки фантома");
        add(MFItems.PHANTOM_SOUP.get(), "Фантомный суп");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Жареный иглобрюх");
        add(MFItems.PUFFERFISH_PIECES.get(), "Кусочки иглобрюха");
        add(MFItems.PUFFERFISH_SOUP.get(), "Иглобрюховый суп");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Тыквенный суп");
        add(MFItems.PUMPKING_BREAD.get(), "Тыквенный хлеб");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Жареный бамбук");
        add(MFItems.BAMBOO_PIECES.get(), "Кусочки бамбука");
        add(MFItems.BAMBOO_SOUP.get(), "Бамбук суп");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.get(), "Железная жареная крольчатина");
        add(MFItems.GOLDEN_COOKED_RABBIT.get(), "Золотая жареная крольчатина");
        add(MFItems.DIAMOND_COOKED_RABBIT.get(), "Алмазная жареная крольчатина");
        add(MFItems.EMERALD_COOKED_RABBIT.get(), "Изумрудная жареная крольчатина");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.get(), "Железный ломтик арбуза");
        add(MFItems.GOLDEN_MELON_SLICE.get(), "Золотой ломтик арбуза");
        add(MFItems.DIAMOND_MELON_SLICE.get(), "Алмазный ломтик арбуза");
        add(MFItems.EMERALD_MELON_SLICE.get(), "Изумрудный ломтик арбуза");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.get(), "Железная жареная курятина");
        add(MFItems.GOLDEN_COOKED_CHICKEN.get(), "Золотая жареная курятина");
        add(MFItems.DIAMOND_COOKED_CHICKEN.get(), "Алмазная жареная курятина");
        add(MFItems.EMERALD_COOKED_CHICKEN.get(), "Изумрудная жареная курятина");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.get(), "Железная жареная баранина");
        add(MFItems.GOLDEN_COOKED_MUTTON.get(), "Золотая жареная баранина");
        add(MFItems.DIAMOND_COOKED_MUTTON.get(), "Алмазная жареная баранина");
        add(MFItems.EMERALD_COOKED_MUTTON.get(), "Изумрудная жареная баранина");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.get(), "Железная жареная свинина");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.get(), "Золотая жареная свинина");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.get(), "Алмазная жареная свинина");
        add(MFItems.EMERALD_COOKED_PORKCHOP.get(), "Изумрудная жареная свинина");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.get(), "Железная жареная говядина");
        add(MFItems.GOLDEN_COOKED_BEEF.get(), "Золотая жареная говядина");
        add(MFItems.DIAMOND_COOKED_BEEF.get(), "Алмазная жареная говядина");
        add(MFItems.EMERALD_COOKED_BEEF.get(), "Изумрудная жареная говядина");

        // Rice Items
        add(MFItems.RICE.get(), "Рис");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Рисовая миска с курицей");
        add(MFItems.RICE_SALMON_BOWL.get(), "Рисовая миска с лососем");
        add(MFItems.RICE_COD_BOWL.get(), "Рисовая миска с треской");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Рисовая миска с овощами");
        add(MFItems.RICE_PUDDING.get(), "Рисовый пудинг");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Рисовый медовый пудинг");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Суши с бамбука");
        add(MFItems.SUSHI_CARROT.get(), "Суши с моркови");
        add(MFItems.SUSHI_BEETROOT.get(), "Суши с свёклы");
        add(MFItems.SUSHI_SALMON.get(), "Суши с лососем");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Варёное яйцо");
        add(MFItems.RAW_BACON.get(), "Сырой бекон");
        add(MFItems.COOKED_BACON.get(), "Жареный бекон");
        add(MFItems.COOKED_BACON_EGG.get(), "Варёное яйцо с беконом");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Шоколад");
        add(MFItems.CHOCOLATE_BAR.get(), "Шоколадная плитка");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Шоколадные сладкие ягоды");
    }
}