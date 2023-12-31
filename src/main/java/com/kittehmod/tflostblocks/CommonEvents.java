package com.kittehmod.tflostblocks;

import com.kittehmod.tflostblocks.blocks.StrippedThornsBlock;
import com.kittehmod.tflostblocks.blocks.TFLostBlocksProperties;
import com.kittehmod.tflostblocks.items.ThorncutterAxeItem;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Hand;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event.Result;
import twilightforest.block.BurntThornsBlock;
import twilightforest.block.ThornsBlock;
import twilightforest.item.MazebreakerPickItem;

public class CommonEvents
{
	// Apply bonuses for breaking Thorns blocks faster with the Thorncutter and do workaround for Mazebreaker mining custom Mazestone blocks.
	@SubscribeEvent
	public void modifyDestroySpeed(BreakSpeed event) {
		if (event.getEntity() instanceof PlayerEntity && ((LivingEntity)event.getEntity()).getMainHandItem().getItem() instanceof MazebreakerPickItem && (event.getState().is(TFLostBlocksTags.MAZESTONE))) {
			PlayerEntity player = (PlayerEntity)event.getEntity();
			ToolItem item = (ToolItem) player.getMainHandItem().getItem();
			float spd = item.getDestroySpeed(player.getMainHandItem(), event.getState());
			event.setNewSpeed(spd * 16F);
		}
		if (event.getEntity() instanceof PlayerEntity && ((LivingEntity)event.getEntity()).getMainHandItem().getItem() instanceof ThorncutterAxeItem && (event.getState().getBlock() instanceof ThornsBlock || event.getState().is(TFLostBlocksTags.THORN_WOOD))) {
			PlayerEntity player = (PlayerEntity)event.getEntity();
			ToolItem item = (ToolItem) player.getMainHandItem().getItem();
			float spd = item.getDestroySpeed(player.getMainHandItem(), event.getState()) * (1 + (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, player.getItemInHand(Hand.MAIN_HAND)) * 0.5F));
			event.setNewSpeed(spd * 4F);
		}
	}
	
	@SubscribeEvent
	public void modifyDestroyBlocks(BreakEvent event) {
		PlayerEntity player = event.getPlayer();
		if (player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof AxeItem && (event.getState().getBlock() instanceof ThornsBlock || event.getState().is(TFLostBlocksTags.THORN_WOOD)) && !event.getPlayer().isCreative() && !event.getWorld().isClientSide()) {
			BlockState state = event.getState();
			// Handle breaking thorns.
			if (player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof ThorncutterAxeItem && state.getBlock() instanceof ThornsBlock && !(state.getBlock() instanceof StrippedThornsBlock)) {
				event.getWorld().destroyBlock(event.getPos(), true);
				if ((state.getBlock() instanceof BurntThornsBlock && !(state.getBlock() instanceof StrippedThornsBlock) && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, player.getItemInHand(Hand.MAIN_HAND)) > 0) || !(state.getBlock() instanceof BurntThornsBlock)) {
					if (player.getServer().getGameRules().getRule(GameRules.RULE_DOBLOCKDROPS).get()) {
						Block.popResource((World)event.getWorld(), event.getPos(), new ItemStack(state.getBlock().asItem()));
					}
				}
				event.setResult(Result.ALLOW);
			}
			else if (!(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof ThorncutterAxeItem) && event.getState().is(TFLostBlocksTags.THORN_WOOD)) {
				player.getItemInHand(Hand.MAIN_HAND).hurtAndBreak(16, player, (livingentity) -> { livingentity.broadcastBreakEvent(Hand.MAIN_HAND); });
			}
		}
	}
	
	@SubscribeEvent
	public void modifyPlacement(BlockEvent.EntityPlaceEvent event) {
		if (event.getEntity() instanceof PlayerEntity && event.getPlacedBlock().getBlock() instanceof ThornsBlock && !event.getWorld().isClientSide()) {
			PlayerEntity player = (PlayerEntity)event.getEntity();
			BlockState state = event.getPlacedBlock();
			if (state.hasProperty(TFLostBlocksProperties.CAN_SPREAD)) {
				state = state.setValue(TFLostBlocksProperties.CAN_SPREAD, player.isCreative());
				event.getWorld().setBlock(event.getPos(), state, 11);
			}
			event.setResult(Result.DEFAULT);
		}
	}
}
