package com.zombsta123.wildwestern.common.items;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        ItemInit.ITEMS.add(this);
	}

}
