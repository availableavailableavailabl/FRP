package com.idtech.block;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
//import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockMod {

    //Basic Block
    public static final Block CASTLE_WALL = BlockUtils.createBasicBlock("castlewall", Material.STONE);
    public static final Item CASTLE_WALL_ITEM = BlockUtils.createBlockItem(CASTLE_WALL, CreativeModeTab.TAB_BREWING);
    public static final Block LI_BLOX_ORE = BlockUtils.createBasicBlock("uuubloc", Material.PISTON,0.65f);
    public static final Item LI_BLOX_ORE_ITEM = BlockUtils.createBlockItem(LI_BLOX_ORE, CreativeModeTab.TAB_MISC);
    public static final Block SANDZ = BlockUtils.createBasicBlock("treasure-sand", Material.SAND,0.65f);
    public static final Item SANDZ_ITEM = BlockUtils.createBlockItem(SANDZ, CreativeModeTab.TAB_MISC);
    public static final Block DEEPSLATE_LI_BLOX_ORE = BlockUtils.createBasicBlock("deepslateuuhore", Material.PISTON, 0.65f);
    public static final Item DEEPSLATE_LI_BLOX_ORE_ITEM = BlockUtils.createBlockItem(DEEPSLATE_LI_BLOX_ORE, CreativeModeTab.TAB_MISC);
    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(CASTLE_WALL_ITEM);
        event.getRegistry().register(LI_BLOX_ORE_ITEM);
        event.getRegistry().register(SANDZ_ITEM);
        event.getRegistry().register(DEEPSLATE_LI_BLOX_ORE_ITEM);



    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        event.getRegistry().register(CASTLE_WALL);
        event.getRegistry().register(SANDZ);
        event.getRegistry().register(LI_BLOX_ORE);
        event.getRegistry().register(DEEPSLATE_LI_BLOX_ORE);

    }
}





