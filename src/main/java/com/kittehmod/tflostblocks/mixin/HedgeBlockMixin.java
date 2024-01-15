package com.kittehmod.tflostblocks.mixin;

import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kittehmod.tflostblocks.items.ThorncutterAxeItem;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.block.HedgeBlock;

@Mixin(HedgeBlock.class)
public class HedgeBlockMixin extends Block
{

	public HedgeBlockMixin(Properties properties) {
		super(properties); // Not used
	}

	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;scheduleTick(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;I)V", shift = Shift.BEFORE), method = "attack(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
	private void injectAttack(BlockState state, Level world, BlockPos pos, Player player, CallbackInfo ci) {
		if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof ThorncutterAxeItem) {
			ci.cancel();
		}
	}
	
	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", shift = Shift.AFTER), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
	private void injectPlayerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity te, ItemStack stack, CallbackInfo ci) {
		if (stack.getItem() instanceof ThorncutterAxeItem) {
			ci.cancel();
		}
	}
}
