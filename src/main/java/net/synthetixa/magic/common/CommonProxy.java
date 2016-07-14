package net.synthetixa.magic.common;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.synthetixa.magic.common.events.EventHandler;
import net.synthetixa.magic.init.*;

/**
 * Created by ben on 7/12/16.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        Tabs.init();
        Blocks.init();
        Items.init();
        Tiles.init();
    }

    public void init(FMLInitializationEvent e) {
        Crafting.init();
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}
