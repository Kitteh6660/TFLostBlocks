package com.kittehmod.tflostblocks.items;

import com.kittehmod.tflostblocks.blocks.StrippedThornsBlock;
import com.kittehmod.tflostblocks.registry.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.block.BurntThornsBlock;
import twilightforest.block.ThornsBlock;

public class ThorncutterAxeItem extends AxeItem
{
	public ThorncutterAxeItem(Tier p_40521_, float dmgMod, float speedMod, Properties properties) {
		super(Tiers.DIAMOND, dmgMod, speedMod, properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Player player = context.getPlayer();
		ItemStack itemstack = context.getItemInHand();
		Level level = context.getLevel();
		BlockPos pos = context.getClickedPos();
		InteractionResult result = super.useOn(context);
		if (level.getBlockState(pos).getBlock() instanceof ThornsBlock && !(level.getBlockState(pos).getBlock() instanceof StrippedThornsBlock) && !(level.getBlockState(pos).getBlock() instanceof BurntThornsBlock)) {
			BlockState oldState = level.getBlockState(pos);
			BlockState state = ModBlocks.STRIPPED_THORNS.get().defaultBlockState();
			for (Direction direction : Direction.values()) {
				state = state.setValue(ThornsBlock.AXIS, oldState.getValue(ThornsBlock.AXIS));
				state = state.setValue(PipeBlock.PROPERTY_BY_DIRECTION.get(direction), oldState.getValue(PipeBlock.PROPERTY_BY_DIRECTION.get(direction)));
			}
			level.setBlock(pos, state, 11);
			level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
			if (player != null) {
				itemstack.hurtAndBreak(1, player, (livingentity) -> { livingentity.broadcastBreakEvent(context.getHand()); });
			}
			result = InteractionResult.sidedSuccess(level.isClientSide());
		}
		return result;
	}
}
