
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod5q12.concrete.init;

import net.mod5q12.concrete.Concrete5q12Mod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class Concrete5q12ModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CONCRETE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(Concrete5q12Mod.MODID, "concrete"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CONCRETE,
				FabricItemGroup.builder().title(Component.translatable("item_group." + Concrete5q12Mod.MODID + ".concrete")).icon(() -> new ItemStack(Concrete5q12ModBlocks.CONCRETE_RAINBOW)).build());
	}
}
