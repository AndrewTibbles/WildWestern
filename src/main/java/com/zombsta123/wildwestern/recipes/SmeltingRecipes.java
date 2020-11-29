package com.zombsta123.wildwestern.recipes;

import com.zombsta123.wildwestern.init.BlockInit;
import com.zombsta123.wildwestern.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(BlockInit.RUBY_ORE), new ItemStack(ItemInit.RUBY), 10.0f);
	}
}