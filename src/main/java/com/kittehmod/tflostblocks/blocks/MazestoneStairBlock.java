package com.kittehmod.tflostblocks.blocks;

import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.item.MazebreakerPickItem;

public class MazestoneStairBlock extends StairBlock
{

	public MazestoneStairBlock(Supplier<BlockState> state, Properties properties) {
		super(state, properties);
	}

	@Override
	public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
		super.playerWillDestroy(world, pos, state, player);
		ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);

		// damage the player's pickaxe
		if (!world.isClientSide && !stack.isEmpty() && stack.getItem().canBeDepleted() && !(stack.getItem() instanceof MazebreakerPickItem)) {
			stack.hurtAndBreak(16, player, (user) -> user.broadcastBreakEvent(InteractionHand.MAIN_HAND));
		}
	}
}
