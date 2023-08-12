package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.block.ModBlocks;
import net.fabricmc.example.item.ModItems;
import net.fabricmc.example.painting.ModPaintings;
import net.fabricmc.example.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "test";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModPaintings.registerPaintings();

		ModRegistries.registerModStuffs();
	}
}
