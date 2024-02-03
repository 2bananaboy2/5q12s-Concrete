/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mod5q12.concrete;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mod5q12.concrete.init.Concrete5q12ModTabs;
import net.mod5q12.concrete.init.Concrete5q12ModItems;
import net.mod5q12.concrete.init.Concrete5q12ModBlocks;

import net.fabricmc.api.ModInitializer;

public class Concrete5q12Mod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "concrete_5q12";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Concrete5q12Mod");

		Concrete5q12ModTabs.load();

		Concrete5q12ModBlocks.load();
		Concrete5q12ModItems.load();

	}
}
