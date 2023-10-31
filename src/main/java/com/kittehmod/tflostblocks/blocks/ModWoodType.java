package com.kittehmod.tflostblocks.blocks;

import com.kittehmod.tflostblocks.TFLostBlocksMod;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodType
{
	
	public static final BlockSetType THORN_SET = new BlockSetType(TFLostBlocksMod.MOD_ID + ":thorn");
	public static final BlockSetType TOWERWOOD_SET = new BlockSetType(TFLostBlocksMod.MOD_ID + ":towerwood");
	
	public static final WoodType THORN_WOOD_TYPE = WoodType.register(new WoodType(TFLostBlocksMod.MOD_ID + ":thorn", THORN_SET));
	public static final WoodType TOWERWOOD_WOOD_TYPE = WoodType.register(new WoodType(TFLostBlocksMod.MOD_ID + ":towerwood", TOWERWOOD_SET));
}
