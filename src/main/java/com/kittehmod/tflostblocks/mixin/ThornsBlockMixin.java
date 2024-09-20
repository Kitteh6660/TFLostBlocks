package com.kittehmod.tflostblocks.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.blocks.TFLostBlocksProperties;
import com.kittehmod.tflostblocks.items.ThorncutterAxeItem;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FluidState;
import twilightforest.block.ThornsBlock;

@Mixin(ThornsBlock.class)
public class ThornsBlockMixin extends Block
{
	public ThornsBlockMixin(Properties properties) {
		super(properties); // Not used.
	}

	@Inject(at = @At(value = "TAIL"), method = "<init>(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)V")
	private void injectConstructor(Properties properties, CallbackInfo callback) {
		((ThornsBlock)(Object)this).registerDefaultState(((ThornsBlock)(Object)this).defaultBlockState().setValue(TFLostBlocksProperties.CAN_SPREAD, true));
	}
	
	@Inject(at = @At(value = "TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V")
	private void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(TFLostBlocksProperties.CAN_SPREAD);
	}
	
	@Inject(at = @At(value = "INVOKE", target = "doThornBurst(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", shift = Shift.BEFORE), method = "onDestroyedByPlayer(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;ZLnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
	private void injectPlayerWillDestroy(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid, CallbackInfoReturnable<Boolean> callback) {
		if (player.getItemInHand(InteractionHand.MAIN_HAND) != null && player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof ThorncutterAxeItem) {
			callback.setReturnValue(super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid));
		}
	}
	
	@Inject(at = @At(value = "HEAD"), method = "doThornBurst(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
	private void injectThornsBurst(Level level, BlockPos pos, BlockState state, CallbackInfo callback) {
		if (state.hasProperty(TFLostBlocksProperties.CAN_SPREAD) && !state.getValue(TFLostBlocksProperties.CAN_SPREAD)) {
			level.destroyBlock(pos, true);
			callback.cancel();
		}
	}
}
