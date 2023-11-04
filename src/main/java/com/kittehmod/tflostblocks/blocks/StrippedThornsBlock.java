package com.kittehmod.tflostblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import twilightforest.block.ThornsBlock;

public class StrippedThornsBlock extends ThornsBlock
{

	public StrippedThornsBlock(Properties properties) {
		super(properties);
	}

	// Stripped thorns don't hurt the player.
	@Override
	public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {}
	
	@Override
	public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        playerWillDestroy(level, pos, state, player);
        return level.setBlock(pos, fluid.createLegacyBlock(), level.isClientSide() ? 11 : 3);
	}
}
