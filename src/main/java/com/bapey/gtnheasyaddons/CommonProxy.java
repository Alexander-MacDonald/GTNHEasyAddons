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
        MyMod.LOG.info("I am GTNHEasyAddons at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        ItemStack[][] inputs = {
            // Default
            { new ItemStack(Blocks.gravel), new ItemStack(Blocks.dirt) },
            // Basic Stone Age
            {},
            // Steam Age
            // ULV
            // Tier 1 LV
            // Tier 2 MV
            // Tier 3 HV
            // Tier 4 MV
            // Tier 5 IV
            // Tier 6 LUV
            // Tier 7 ZPM
            // Tier 8 UV
            // Tier 9 UHV
            // Magic Novice
            // Magic Adept
            // Magic Master
            // Magic Grandmaster
            // Magic Grandmaster Unique
            // Legendary
            // Legenary Unique
            // BM Novice
            // BM Adept
            // BM Master
            // Forest Ranger Basic
            // Forest Ranger Advanced
            // Forest Ranger Expert
            // Space Invaders Moon
            // Space Invaders Mars
            // Space Invaders Asteroids
            // Bees Basic
            // Bees Advanced
            // Bees Expert
            // Fast Food
            // Slow Food
            // Haute Cuisine
            // Dessert
            // Transportation 3 Class
            // Transportation 2 Class
            // Transportation 1 Class
            // Seeds
            // Gardens
            // AE Basics
            // AE Good
            // AE Advanced
            // AE Master
            // Computer Floppies
            // Tier 1 Computers
            // Tier 2 Computers
            // Tier 3 Computers
            // Tier 3.5 Computers
            // Tier 4 Computers
            // IC2 Crops
            // Witchery Novice
            // Witchery Adept
            // Witchery Master
            // Witchery Witch
            // Witchery Deamon
            // HEE-Basic
            // HEE-Advanced

        };

        ItemStack[] bags = {
            // Default
            new ItemStack(GameRegistry.findItem("enhancedlootbags", "lootbag"), 1, 0),
            // Stone Age
            new ItemStack(GameRegistry.findItem("enhancedlootbags", "lootbag"), 1, 2)
            // Steam Age
            // ULV
            // Tier 1 LV
            // Tier 2 MV
            // Tier 3 HV
            // Tier 4 MV
            // Tier 5 IV
            // Tier 6 LUV
            // Tier 7 ZPM
            // Tier 8 UV
            // Tier 9 UHV
            // Magic Novice
            // Magic Adept
            // Magic Master
            // Magic Grandmaster
            // Magic Grandmaster Unique
            // Legendary
            // Legenary Unique
            // BM Novice
            // BM Adept
            // BM Master
            // Forest Ranger Basic
            // Forest Ranger Advanced
            // Forest Ranger Expert
            // Space Invaders Moon
            // Space Invaders Mars
            // Space Invaders Asteroids
            // Bees Basic
            // Bees Advanced
            // Bees Expert
            // Fast Food
            // Slow Food
            // Haute Cuisine
            // Dessert
            // Transportation 3 Class
            // Transportation 2 Class
            // Transportation 1 Class
            // Seeds
            // Gardens
            // AE Basics
            // AE Good
            // AE Advanced
            // AE Master
            // Computer Floppies
            // Tier 1 Computers
            // Tier 2 Computers
            // Tier 3 Computers
            // Tier 3.5 Computers
            // Tier 4 Computers
            // IC2 Crops
            // Witchery Novice
            // Witchery Adept
            // Witchery Master
            // Witchery Witch
            // Witchery Deamon
            // HEE-Basic
            // HEE-Advanced
        };
        // Default
        GameRegistry.addShapedRecipe(bags[0], "XXX", "XXX", "XXX", 'X', inputs[0]);
        // Stone Age
        GameRegistry.addShapedRecipe(bags[1], "XXX", "XXX", "XXX", 'X', inputs[1]);
        // Steam Age
        // ULV
        // Tier 1 LV
        // Tier 2 MV
        // Tier 3 HV
        // Tier 4 MV
        // Tier 5 IV
        // Tier 6 LUV
        // Tier 7 ZPM
        // Tier 8 UV
        // Tier 9 UHV
        // Magic Novice
        // Magic Adept
        // Magic Master
        // Magic Grandmaster
        // Magic Grandmaster Unique
        // Legendary
        // Legenary Unique
        // BM Novice
        // BM Adept
        // BM Master
        // Forest Ranger Basic
        // Forest Ranger Advanced
        // Forest Ranger Expert
        // Space Invaders Moon
        // Space Invaders Mars
        // Space Invaders Asteroids
        // Bees Basic
        // Bees Advanced
        // Bees Expert
        // Fast Food
        // Slow Food
        // Haute Cuisine
        // Dessert
        // Transportation 3 Class
        // Transportation 2 Class
        // Transportation 1 Class
        // Seeds
        // Gardens
        // AE Basics
        // AE Good
        // AE Advanced
        // AE Master
        // Computer Floppies
        // Tier 1 Computers
        // Tier 2 Computers
        // Tier 3 Computers
        // Tier 3.5 Computers
        // Tier 4 Computers
        // IC2 Crops
        // Witchery Novice
        // Witchery Adept
        // Witchery Master
        // Witchery Witch
        // Witchery Deamon
        // HEE-Basic
        // HEE-Advanced
        
        //TODO: Overwrite Assembler Compression Recipes in Vanillas GTNH
    }

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
