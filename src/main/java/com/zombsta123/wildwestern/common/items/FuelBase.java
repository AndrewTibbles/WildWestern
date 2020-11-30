package com.zombsta123.wildwestern.common.items;

import net.minecraft.item.ItemStack;

public class FuelBase extends ItemBase {
	int burnTime;

	public FuelBase(String name, int burnTime) {
		super(name);
		this.burnTime = burnTime;
	}

	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return this.burnTime;
	}
}
