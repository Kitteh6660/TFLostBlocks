package com.kittehmod.tflostblocks.blocks;

import com.kittehmod.tflostblocks.blockentities.ModSignBlockEntity;

import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class ModStandingSignBlock extends StandingSignBlock
{

	public ModStandingSignBlock(Properties properties, WoodType woodtype) {
		super(properties, woodtype);
	}

	@Override
	public TileEntity newBlockEntity(IBlockReader reader) {
		return new ModSignBlockEntity();
	}
}
