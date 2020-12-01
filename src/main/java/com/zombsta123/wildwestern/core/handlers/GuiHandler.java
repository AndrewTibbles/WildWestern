package com.zombsta123.wildwestern.core.handlers;

import com.zombsta123.wildwestern.common.container.ContainerAlloySmelter;
import com.zombsta123.wildwestern.common.gui.GuiAlloySmelter;
import com.zombsta123.wildwestern.common.tileentity.TileEntityAlloySmelter;
import com.zombsta123.wildwestern.core.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == Reference.GUI_ALLOY_SMELTER)
			return new ContainerAlloySmelter(player.inventory,
					(TileEntityAlloySmelter) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == Reference.GUI_ALLOY_SMELTER)
			return new GuiAlloySmelter(player.inventory,
					(TileEntityAlloySmelter) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
}
