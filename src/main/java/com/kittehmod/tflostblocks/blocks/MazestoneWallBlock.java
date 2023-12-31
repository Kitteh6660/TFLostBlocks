package com.kittehmod.tflostblocks.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightforest.item.MazebreakerPickItem;

public class MazestoneWallBlock extends WallBlock
{
	public MazestoneWallBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void playerWillDestroy(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		super.playerWillDestroy(world, pos, state, player);
		ItemStack stack = player.getItemInHand(Hand.MAIN_HAND);

		// damage the player's pickaxe
		if (!world.isClientSide && !stack.isEmpty() && stack.getItem().canBeDepleted() && !(stack.getItem() instanceof MazebreakerPickItem)) {
			stack.hurtAndBreak(16, player, (user) -> user.broadcastBreakEvent(Hand.MAIN_HAND));
		}
	}
}
