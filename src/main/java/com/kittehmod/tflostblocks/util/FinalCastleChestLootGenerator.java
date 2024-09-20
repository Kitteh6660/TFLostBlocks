package com.kittehmod.tflostblocks.util;

import java.util.Set;

import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.ChestBlockEntity;

public class FinalCastleChestLootGenerator 
{
	public static void fillChestWithAxe(ChestBlockEntity blockentity, RandomSource randomIn) {
		if (!blockentity.hasAnyOf(Set.of(ModItems.INCOMPLETE_THORNCUTTER_AXE))) {
			blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE, 1));
			if (randomIn.nextFloat() < 0.6F) {
				blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE, 1));
			}
			if (randomIn.nextFloat() < 0.3F) {
				blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE, 1));
			}
		}
	}
}
