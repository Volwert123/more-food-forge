package net.volwert123.more_food.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MFPufferfishSoupItem extends Item {
    private final FoodProperties foodProperties;

    public MFPufferfishSoupItem(Properties properties, FoodProperties foodProperties) {
        super(properties.stacksTo(1).food(foodProperties));
        this.foodProperties = foodProperties;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
        if (player instanceof ServerPlayer) CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player,stack);
        if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600));
        if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 700));
        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(foodProperties);
            if (!player.getAbilities().instabuild) stack.shrink(1);
        }
        if (player == null || !player.getAbilities().instabuild) {
            if (stack.isEmpty()) return new ItemStack(Items.BOWL);
            if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
        }
        return stack;
    }
}