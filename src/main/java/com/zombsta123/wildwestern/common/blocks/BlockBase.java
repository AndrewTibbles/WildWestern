package com.zombsta123.wildwestern.common.blocks;

import com.zombsta123.wildwestern.WildWestern;
import com.zombsta123.wildwestern.core.init.BlockInit;
import com.zombsta123.wildwestern.core.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
    public BlockBase(String name, Material material, float hardness, float resistance, int mininglevel, String tool)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, mininglevel);
        setCreativeTab(WildWestern.WILDWESTERNTAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
