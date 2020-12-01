package com.zombsta123.wildwestern.common.slots;

import com.zombsta123.wildwestern.common.tileentity.TileEntityAlloySmelter;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotAlloySmelterFuel extends Slot {
	public SlotAlloySmelterFuel(IInventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityAlloySmelter.isItemFuel(stack);
	}

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
