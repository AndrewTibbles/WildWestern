package com.zombsta123.wildwestern.core.recipes;

import com.zombsta123.wildwestern.core.init.BlockInit;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes 
{
	public static void init()
	{
		//Ruby
		ItemStack ruby_block = new ItemStack(BlockInit.RUBY_BLOCK);
		ItemStack ruby = new ItemStack(ItemInit.RUBY, 9);
		GameRegistry.addShapelessRecipe(new ResourceLocation("ruby"), null, ruby, Ingredient.fromStacks(ruby_block));
	}

}
