package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

import static com.idtech.item.EmeralddBlade.customtier;

public class waterpic extends PickaxeItem {
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_TOOLS);
    public static Item INSTANCE = new waterpic(Tiers.IRON, 8, 100, properties).setRegistryName(BaseMod.MODID,"waterpic");

    public static Item IINSTANCE = new EmeralddBlade(customtier, 100, 100,
            properties).setRegistryName(BaseMod.MODID,"waterpic");
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // parameters of PotionEffect are: id,  duration in ticks (20 = 1 second), and amplifier
        stack.hurtAndBreak(1, attacker, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        target.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 5026, 1));
        attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,5000, 0));
        return true;
    }
    public waterpic(Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);
    }


}


