package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class EmeralddBlade extends SwordItem {
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static final Tier customtier = new ForgeTier(4, 2000000, 8.0F, 10.0F, 5, null, () -> {
        return Ingredient.of(ItemMod.STRUCTURE_GEL);
    });

    public static Item INSTANCE = new EmeralddBlade(customtier, 100, 100,
            properties).setRegistryName(BaseMod.MODID,"emeralddblade");
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // parameters of PotionEffect are: id,  duration in ticks (20 = 1 second), and amplifier
        stack.hurtAndBreak(1, attacker, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5026, 1));
        attacker.addEffect(new MobEffectInstance(MobEffects.LUCK,5000, 1));
        return true;
    }


    public EmeralddBlade(Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);
    }


}
