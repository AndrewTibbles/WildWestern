package com.zombsta123.wildwestern.core.init;

import java.util.ArrayList;
import java.util.List;

import com.zombsta123.wildwestern.common.blocks.BlockAlloySmelter;
import com.zombsta123.wildwestern.common.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 6.0f, 30.0f, 3, "pickaxe");
    
    //Ores
    public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK, 5.0f, 12.0f, 2, "pickaxe");
    public static final Block DRY_BONE_ORE = new BlockBase("dry_bone_ore", Material.ROCK, 4.0f, 10.0f, 2, "pickaxe");
    
    //Machines
    public static final Block ALLOY_SMELTER = new BlockAlloySmelter("alloy_smelter");
}
