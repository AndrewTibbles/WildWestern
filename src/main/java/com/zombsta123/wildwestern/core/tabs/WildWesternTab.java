package com.zombsta123.wildwestern.core.tabs;

import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WildWesternTab extends CreativeTabs {

	public WildWesternTab(String label) {
		super("wildwesterntab");
		this.setBackgroundImageName("wildwestern.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.RUBY);
	}

}
