package com.kittehmod.tflostblocks.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kittehmod.tflostblocks.blocks.TFLostBlocksProperties;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import twilightforest.block.ThornsBlock;

@Mixin(value = ThornsBlock.class, remap = true)
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
	
	@Inject(at = @At(value = "HEAD"), method = "doThornBurst(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true, remap = false)
	private void injectThornsBurst(Level level, BlockPos pos, BlockState state, CallbackInfo callback) {
		if (state.hasProperty(TFLostBlocksProperties.CAN_SPREAD) && !state.getValue(TFLostBlocksProperties.CAN_SPREAD)) {
			level.destroyBlock(pos, true);
			callback.cancel();
		}
	}
}
