package com.kittehmod.tflostblocks.items;

import com.kittehmod.tflostblocks.blocks.StrippedThornsBlock;
import com.kittehmod.tflostblocks.registry.ModBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SixWayBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightforest.block.BurntThornsBlock;
import twilightforest.block.ThornsBlock;

public class ThorncutterAxeItem extends AxeItem
{
	public ThorncutterAxeItem(ItemTier p_40521_, float dmgMod, float speedMod, Properties properties) {
		super(ItemTier.DIAMOND, dmgMod, speedMod, properties);
	}

	@Override
	public ActionResultType useOn(ItemUseContext context) {
		PlayerEntity player = context.getPlayer();
		ItemStack itemstack = context.getItemInHand();
		World level = context.getLevel();
		BlockPos pos = context.getClickedPos();
		ActionResultType result = super.useOn(context);
		if (level.getBlockState(pos).getBlock() instanceof ThornsBlock && !(level.getBlockState(pos).getBlock() instanceof StrippedThornsBlock) && !(level.getBlockState(pos).getBlock() instanceof BurntThornsBlock)) {
			BlockState oldState = level.getBlockState(pos);
			BlockState state = ModBlocks.STRIPPED_THORNS.get().defaultBlockState();
			state = state.setValue(ThornsBlock.AXIS, oldState.getValue(ThornsBlock.AXIS));
			for (Direction direction : Direction.values()) {
				state = state.setValue(SixWayBlock.PROPERTY_BY_DIRECTION.get(direction), oldState.getValue(SixWayBlock.PROPERTY_BY_DIRECTION.get(direction)));
			}
			level.setBlock(pos, state, 11);
			level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
			if (player != null) {
				itemstack.hurtAndBreak(1, player, (livingentity) -> { livingentity.broadcastBreakEvent(context.getHand()); });
			}
			result = ActionResultType.sidedSuccess(level.isClientSide());
		}
		return result;
	}
}
