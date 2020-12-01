package com.zombsta123.wildwestern.core.handlers;

import com.zombsta123.wildwestern.common.tileentity.TileEntityAlloySmelter;
import com.zombsta123.wildwestern.core.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntitys() {
		GameRegistry.registerTileEntity(TileEntityAlloySmelter.class,
				new ResourceLocation(Reference.MOD_ID + "alloy_smelter"));
	}
}
