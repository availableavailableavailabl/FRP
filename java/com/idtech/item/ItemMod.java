package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.idtech.sound.Modsoundsss;

@Mod.EventBusSubscriber
public class ItemMod {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaseMod.MODID);
    public static final RegistryObject<Item> lightning = ITEMS.register("lightning",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC);
    public static final Item Lithium = ItemUtils.buildBasicItem("uuuuuuhore", CreativeModeTab.TAB_MISC);
    public static final Item aligator_teef = ItemUtils.buildBasicItem("tooths", CreativeModeTab.TAB_BREWING);
    public static final Item batery = ItemUtils.buildBasicItem("enegry", CreativeModeTab.TAB_TOOLS);

    //FOODS
    public static FoodProperties yummyFood = (new FoodProperties.Builder().nutrition(6).saturationMod(3f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 0), 0.8f).alwaysEat().build());
    public static Item suspicious_pie = ItemUtils.buildFoodItem("yumfood", yummyFood);
    public static FoodProperties wildFood = (new FoodProperties.Builder().nutrition(5).saturationMod(1.4f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 500, 1), 1.0f).alwaysEat().build());
    public static Item wildberries = ItemUtils.buildFoodItem("berrys", yummyFood);
    //ARMOR
    public static final RegistryObject<Item> LIGHTNING_HELMET = ITEMS.register("lightning_helmet",
            () -> new ArmorItem(ArmorMaterialsMOd.LIGHTNING, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_chestplate",
            () -> new ArmorItem(ArmorMaterialsMOd.LIGHTNING, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHTNING_LEGGINGS = ITEMS.register("lightning_leggings",
            () -> new ArmorItem(ArmorMaterialsMOd.LIGHTNING, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> LIGHTNING_BOOTS = ITEMS.register("lightning_boots",
            () -> new ArmorItem(ArmorMaterialsMOd.LIGHTNING, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> RUSH_E_MUSIC_DISC = ITEMS.register("rush_e_disc",
            () -> new RecordItem(4, Modsoundsss.RUSH_E,
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE).stacksTo(3)));
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coalcoke",
            ()-> new CoalCokeItem (new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    @SubscribeEvent


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }}



