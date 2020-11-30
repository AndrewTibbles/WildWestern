package com.zombsta123.wildwestern.common.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool
{
	public static final Set<Block> EFFECTIVE = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
    public ToolAxe(String name, ToolMaterial material)
    {
    	super(material, EFFECTIVE);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        ItemInit.ITEMS.add(this);
    }
    
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
    	Material material = state.getMaterial();
    	return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}
