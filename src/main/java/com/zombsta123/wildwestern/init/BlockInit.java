package com.zombsta123.wildwestern.init;

import com.zombsta123.wildwestern.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 6.0f, 30.0f, 3, "pickaxe");
    public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK, 5.0f, 12.0f, 3, "pickaxe");
}
