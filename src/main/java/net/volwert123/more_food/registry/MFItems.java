package net.volwert123.more_food.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.item.*;

public class MFItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MoreFood.MOD_ID);

    // Carrot Items
    public static final RegistryObject<Item> IRON_CARROT = ITEMS.register("iron_carrot", () -> new MFIronFoodItem(registerItemProperties("iron_carrot"), registerFoodValues(3, 1.5f)));
    public static final RegistryObject<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new MFDiamondFoodItem(registerItemProperties("diamond_carrot"), registerFoodValues(3, 1.5f)));
    public static final RegistryObject<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_carrot"), registerFoodValues(3, 1.5f)));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(registerItemProperties("cooked_carrot").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> CARROT_PIECES = ITEMS.register("carrot_pieces", () -> new Item(registerItemProperties("carrot_pieces")));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new MFSoupItem(registerItemProperties("carrot_soup"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(registerItemProperties("carrot_bread").food(registerFoodValues(6, 3f))));
    public static final RegistryObject<Item> CARROT_PIE = ITEMS.register("carrot_pie", () -> new Item(registerItemProperties("carrot_pie").food(registerFoodValues(10, 5f))));
    public static final RegistryObject<Item> CHOCOLATE_CARROT = ITEMS.register("chocolate_carrot", () -> new Item(registerItemProperties("chocolate_carrot").food(registerFoodValues(6, 3f))));

    // Apple Items
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new MFIronFoodItem(registerItemProperties("iron_apple"), registerFoodValues(4, 2f)));
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new MFDiamondFoodItem(registerItemProperties("diamond_apple"), registerFoodValues(4, 2f)));
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_apple"), registerFoodValues(4, 2f)));
    public static final RegistryObject<Item> COOKED_APPLE = ITEMS.register("cooked_apple", () -> new Item(registerItemProperties("cooked_apple").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> APPLE_PIECES = ITEMS.register("apple_pieces", () -> new Item(registerItemProperties("apple_pieces")));
    public static final RegistryObject<Item> APPLE_SOUP = ITEMS.register("apple_soup", () -> new MFSoupItem(registerItemProperties("apple_soup"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> APPLE_BREAD = ITEMS.register("apple_bread", () -> new Item(registerItemProperties("apple_bread").food(registerFoodValues(6, 3f))));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(registerItemProperties("apple_pie").food(registerFoodValues(10, 5f))));
    public static final RegistryObject<Item> CHOCOLATE_APPLE = ITEMS.register("chocolate_apple", () -> new Item(registerItemProperties("chocolate_apple").food(registerFoodValues(6, 3f))));

    // Kelp Items
    public static final RegistryObject<Item> IRON_KELP = ITEMS.register("iron_kelp", () -> new MFIronFoodItem(registerItemProperties("iron_kelp"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> GOLDEN_KELP = ITEMS.register("golden_kelp", () -> new MFGoldenFoodItem(registerItemProperties("golden_kelp"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> DIAMOND_KELP = ITEMS.register("diamond_kelp", () -> new MFDiamondFoodItem(registerItemProperties("diamond_kelp"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> EMERALD_KELP = ITEMS.register("emerald_kelp", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_kelp"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> KELP_PIECES = ITEMS.register("kelp_pieces", () -> new Item(registerItemProperties("kelp_pieces")));
    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new MFSoupItem(registerItemProperties("kelp_soup"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> CHOCOLATE_DRIED_KELP = ITEMS.register("chocolate_dried_kelp", () -> new Item(registerItemProperties("chocolate_dried_kelp").food(registerFoodValues(6, 3f))));

    // Potato Items
    public static final RegistryObject<Item> IRON_POTATO = ITEMS.register("iron_potato", () -> new MFIronFoodItem(registerItemProperties("iron_potato"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", () -> new MFGoldenFoodItem(registerItemProperties("golden_potato"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato", () -> new MFDiamondFoodItem(registerItemProperties("diamond_potato"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> EMERALD_POTATO = ITEMS.register("emerald_potato", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_potato"), registerFoodValues(4, 2f)));
    public static final RegistryObject<Item> POTATO_PIECES = ITEMS.register("potato_pieces", () -> new Item(registerItemProperties("potato_pieces")));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new MFSoupItem(registerItemProperties("potato_soup"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> POTATO_BREAD = ITEMS.register("potato_bread", () -> new Item(registerItemProperties("potato_bread").food(registerFoodValues(6, 3f))));

    // Phantom Items
    public static final RegistryObject<Item> COOKED_PHANTOM = ITEMS.register("cooked_phantom", () -> new Item(registerItemProperties("cooked_phantom").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> PHANTOM_PIECES = ITEMS.register("phantom_pieces", () -> new Item(registerItemProperties("phantom_pieces")));
    public static final RegistryObject<Item> PHANTOM_SOUP = ITEMS.register("phantom_soup", () -> new MFSoupItem(registerItemProperties("phantom_soup"), registerFoodValues(6, 3f)));

    // Pufferfish Items
    public static final RegistryObject<Item> COOKED_PUFFERFISH = ITEMS.register("cooked_pufferfish", () -> new Item(registerItemProperties("cooked_pufferfish").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> PUFFERFISH_PIECES = ITEMS.register("pufferfish_pieces", () -> new Item(registerItemProperties("pufferfish_pieces")));
    public static final RegistryObject<Item> PUFFERFISH_SOUP = ITEMS.register("pufferfish_soup", () -> new MFPufferfishSoupItem(registerItemProperties("pufferfish_soup"), registerFoodValues(6, 3f)));

    // Pumpkin Items
    public static final RegistryObject<Item> PUMPKING_SOUP = ITEMS.register("pumpking_soup", () -> new MFSoupItem(registerItemProperties("pumpking_soup"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> PUMPKING_BREAD = ITEMS.register("pumpking_bread", () -> new Item(registerItemProperties("pumpking_bread").food(registerFoodValues(6, 3f))));

    // Bamboo Items
    public static final RegistryObject<Item> COOKED_BAMBOO = ITEMS.register("cooked_bamboo", () -> new Item(registerItemProperties("cooked_bamboo").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> BAMBOO_PIECES = ITEMS.register("bamboo_pieces", () -> new Item(registerItemProperties("bamboo_pieces")));
    public static final RegistryObject<Item> BAMBOO_SOUP = ITEMS.register("bamboo_soup", () -> new MFSoupItem(registerItemProperties("bamboo_soup"), registerFoodValues(6, 3f)));

    // Cooked Rabbit Items
    public static final RegistryObject<Item> IRON_COOKED_RABBIT = ITEMS.register("iron_cooked_rabbit", () -> new MFIronFoodItem(registerItemProperties("iron_cooked_rabbit"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> GOLDEN_COOKED_RABBIT = ITEMS.register("golden_cooked_rabbit", () -> new MFGoldenFoodItem(registerItemProperties("golden_cooked_rabbit"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> DIAMOND_COOKED_RABBIT = ITEMS.register("diamond_cooked_rabbit", () -> new MFDiamondFoodItem(registerItemProperties("diamond_cooked_rabbit"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> EMERALD_COOKED_RABBIT = ITEMS.register("emerald_cooked_rabbit", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_cooked_rabbit"), registerFoodValues(5, 2.5f)));

    // Melon Slice Items
    public static final RegistryObject<Item> IRON_MELON_SLICE = ITEMS.register("iron_melon_slice", () -> new MFIronFoodItem(registerItemProperties("iron_melon_slice"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> GOLDEN_MELON_SLICE = ITEMS.register("golden_melon_slice", () -> new MFGoldenFoodItem(registerItemProperties("golden_melon_slice"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> DIAMOND_MELON_SLICE = ITEMS.register("diamond_melon_slice", () -> new MFDiamondFoodItem(registerItemProperties("diamond_melon_slice"), registerFoodValues(5, 2.5f)));
    public static final RegistryObject<Item> EMERALD_MELON_SLICE = ITEMS.register("emerald_melon_slice", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_melon_slice"), registerFoodValues(5, 2.5f)));

    // Cooked Chicken Items
    public static final RegistryObject<Item> IRON_COOKED_CHICKEN = ITEMS.register("iron_cooked_chicken", () -> new MFIronFoodItem(registerItemProperties("iron_cooked_chicken"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> GOLDEN_COOKED_CHICKEN = ITEMS.register("golden_cooked_chicken", () -> new MFGoldenFoodItem(registerItemProperties("golden_cooked_chicken"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> DIAMOND_COOKED_CHICKEN = ITEMS.register("diamond_cooked_chicken", () -> new MFDiamondFoodItem(registerItemProperties("diamond_cooked_chicken"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> EMERALD_COOKED_CHICKEN = ITEMS.register("emerald_cooked_chicken", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_cooked_chicken"), registerFoodValues(6, 3f)));

    // Cooked Mutton Items
    public static final RegistryObject<Item> IRON_COOKED_MUTTON = ITEMS.register("iron_cooked_mutton", () -> new MFIronFoodItem(registerItemProperties("iron_cooked_mutton"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> GOLDEN_COOKED_MUTTON = ITEMS.register("golden_cooked_mutton", () -> new MFGoldenFoodItem(registerItemProperties("golden_cooked_mutton"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> DIAMOND_COOKED_MUTTON = ITEMS.register("diamond_cooked_mutton", () -> new MFDiamondFoodItem(registerItemProperties("diamond_cooked_mutton"), registerFoodValues(6, 3f)));
    public static final RegistryObject<Item> EMERALD_COOKED_MUTTON = ITEMS.register("emerald_cooked_mutton", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_cooked_mutton"), registerFoodValues(6, 3f)));

    // Cooked Porkchop Items
    public static final RegistryObject<Item> IRON_COOKED_PORKCHOP = ITEMS.register("iron_cooked_porkchop", () -> new MFIronFoodItem(registerItemProperties("iron_cooked_porkchop"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> GOLDEN_COOKED_PORKCHOP = ITEMS.register("golden_cooked_porkchop", () -> new MFGoldenFoodItem(registerItemProperties("golden_cooked_porkchop"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> DIAMOND_COOKED_PORKCHOP = ITEMS.register("diamond_cooked_porkchop", () -> new MFDiamondFoodItem(registerItemProperties("diamond_cooked_porkchop"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> EMERALD_COOKED_PORKCHOP = ITEMS.register("emerald_cooked_porkchop", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_cooked_porkchop"), registerFoodValues(8, 4f)));

    // Cooked Beef Items
    public static final RegistryObject<Item> IRON_COOKED_BEEF = ITEMS.register("iron_cooked_beef", () -> new MFIronFoodItem(registerItemProperties("iron_cooked_beef"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> GOLDEN_COOKED_BEEF = ITEMS.register("golden_cooked_beef", () -> new MFGoldenFoodItem(registerItemProperties("golden_cooked_beef"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> DIAMOND_COOKED_BEEF = ITEMS.register("diamond_cooked_beef", () -> new MFDiamondFoodItem(registerItemProperties("diamond_cooked_beef"), registerFoodValues(8, 4f)));
    public static final RegistryObject<Item> EMERALD_COOKED_BEEF = ITEMS.register("emerald_cooked_beef", () -> new MFEmeraldFoodItem(registerItemProperties("emerald_cooked_beef"), registerFoodValues(8, 4f)));

    // Rice Items
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new BlockItem(MFBlocks.RICE_CROP.get(), registerItemProperties("rice").useBlockDescriptionPrefix()));
    public static final RegistryObject<Item> RICE_CHICKEN_BOWL = ITEMS.register("rice_chicken_bowl", () -> new MFRiceBowlItem(registerItemProperties("rice_chicken_bowl"), registerFoodValues(10, 5f)));
    public static final RegistryObject<Item> RICE_SALMON_BOWL = ITEMS.register("rice_salmon_bowl", () -> new MFRiceBowlItem(registerItemProperties("rice_salmon_bowl"), registerFoodValues(10, 5f)));
    public static final RegistryObject<Item> RICE_COD_BOWL = ITEMS.register("rice_cod_bowl", () -> new MFRiceBowlItem(registerItemProperties("rice_cod_bowl"), registerFoodValues(10, 5f)));
    public static final RegistryObject<Item> RICE_VEGETABLE_BOWL = ITEMS.register("rice_vegetable_bowl", () -> new MFRiceBowlItem(registerItemProperties("rice_vegetable_bowl"), registerFoodValues(9, 4.5f)));
    public static final RegistryObject<Item> RICE_PUDDING = ITEMS.register("rice_pudding", () -> new MFRiceBowlItem(registerItemProperties("rice_pudding"), registerFoodValues(9, 4.5f)));
    public static final RegistryObject<Item> RICE_HONEY_PUDDING = ITEMS.register("rice_honey_pudding", () -> new MFRiceBowlItem(registerItemProperties("rice_honey_pudding"), registerFoodValues(10, 5f)));

    // Sushi Items
    public static final RegistryObject<Item> SUSHI_BAMBOO = ITEMS.register("sushi_bamboo", () -> new Item(registerItemProperties("sushi_bamboo").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> SUSHI_CARROT = ITEMS.register("sushi_carrot", () -> new Item(registerItemProperties("sushi_carrot").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> SUSHI_BEETROOT = ITEMS.register("sushi_beetroot", () -> new Item(registerItemProperties("sushi_beetroot").food(registerFoodValues(5, 2.5f))));
    public static final RegistryObject<Item> SUSHI_SALMON = ITEMS.register("sushi_salmon", () -> new Item(registerItemProperties("sushi_salmon").food(registerFoodValues(5, 2.5f))));

    // Egg & Bacon Items
    public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg", () -> new Item(registerItemProperties("cooked_egg").food(registerFoodValues(3, 1.5f))));
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(registerItemProperties("raw_bacon").food(registerFoodValues(2,1f))));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(registerItemProperties("cooked_bacon").food(registerFoodValues(5,2.5f))));
    public static final RegistryObject<Item> COOKED_BACON_EGG = ITEMS.register("cooked_bacon_egg", () -> new Item(registerItemProperties("cooked_bacon_egg").food(registerFoodValues(7, 3.5f))));

    // Chocolate Items
    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(registerItemProperties("chocolate").food(registerFoodValues(6,3f))));
    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new Item(registerItemProperties("chocolate_bar").food(registerFoodValues(8,4f))));

    // Sweet Berries Items
    public static final RegistryObject<Item> CHOCOLATE_SWEET_BERRIES = ITEMS.register("chocolate_sweet_berries", () -> new Item(registerItemProperties("chocolate_sweet_berries").food(registerFoodValues(6, 3f))));

    private static Item.Properties registerItemProperties(String id) {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, id)));
    }
    
    public static FoodProperties registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }
}