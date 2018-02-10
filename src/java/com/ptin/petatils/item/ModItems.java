package com.ptin.petatils.item;

import com.ptin.petatils.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {
	public static Item tutorialItem;

    public static final void init() {
        tutorialItem = new Item().setUnlocalizedName("TutarialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":tutorialItem");
        GameRegistry.registerItem(tutorialItem, "tutorialItem");
        
    }
}
