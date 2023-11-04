package com.kittehmod.tflostblocks.blocks;

import com.kittehmod.tflostblocks.blockentities.ModHangingSignBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModCeilingHangingSignBlock extends CeilingHangingSignBlock
{
	public ModCeilingHangingSignBlock(Properties properties, WoodType woodtype) {
		super(properties.requiredFeatures(FeatureFlags.UPDATE_1_20), woodtype);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new ModHangingSignBlockEntity(pos, state);
	}
}
