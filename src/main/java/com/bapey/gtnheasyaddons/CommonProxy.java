package com.bapey.gtnheasyaddons;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());

        MyMod.LOG.info(Config.greeting);
        MyMod.LOG.info("I am MyMod at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        ItemStack[] inputs = { new ItemStack(Blocks.gravel), new ItemStack(Blocks.dirt) };

        ItemStack[] bags = { new ItemStack(GameRegistry.findItem("enhancedlootbags", "lootbag"), 1, 0),
            new ItemStack(GameRegistry.findItem("enhancedlootbags", "lootbag"), 1, 2) };

        GameRegistry.addShapedRecipe(bags[0], "XXX", "XXX", "XXX", 'X', inputs[0]);
        GameRegistry.addShapedRecipe(bags[1], "XXX", "XXX", "XXX", 'X', inputs[1]);
    }

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
