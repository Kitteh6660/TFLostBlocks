package kittehmod.tflostblocks.blocks;

import kittehmod.tflostblocks.TFLostBlocksMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodType
{
	
	public static final BlockSetType TOWERWOOD_SET = new BlockSetType(TFLostBlocksMod.MOD_ID + ":towerwood");
	
	public static final WoodType TOWERWOOD_WOOD_TYPE = WoodType.register(new WoodType(TFLostBlocksMod.MOD_ID + ":towerwood", TOWERWOOD_SET));
}
