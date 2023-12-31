package com.kittehmod.tflostblocks.blockentities;

import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class ModSignBlockEntity extends SignTileEntity
{
	public ModSignBlockEntity() {
		super();
	}
	
	@Override
	public TileEntityType<?> getType() {
		return ModBlockEntities.LOST_TF_SIGN.get();
	}

}
