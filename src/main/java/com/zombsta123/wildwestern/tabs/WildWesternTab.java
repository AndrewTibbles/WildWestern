package com.zombsta123.wildwestern.tabs;

import com.zombsta123.wildwestern.init.ItemInit;

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
