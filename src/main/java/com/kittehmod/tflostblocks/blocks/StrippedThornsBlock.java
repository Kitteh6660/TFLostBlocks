package com.kittehmod.tflostblocks.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightforest.block.BurntThornsBlock;

// A workaround for Thorns block constructor being not public.
public class StrippedThornsBlock extends BurntThornsBlock
{
	public StrippedThornsBlock(Properties properties) {
		super(properties);
	}

	// Stripped thorns don't hurt the player.
	@Override
	public void entityInside(BlockState state, World level, BlockPos pos, Entity entity) {}
	
	@Override
	public boolean removedByPlayer(BlockState state, World level, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid) {
        playerWillDestroy(level, pos, state, player);
        return level.setBlock(pos, fluid.createLegacyBlock(), level.isClientSide() ? 11 : 3);
	}
}
