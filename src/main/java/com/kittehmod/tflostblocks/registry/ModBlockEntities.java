package com.kittehmod.tflostblocks.registry;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.blockentities.ModHangingSignBlockEntity;
import com.kittehmod.tflostblocks.blockentities.ModSignBlockEntity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredRegister;

// @EventBusSubscriber(modid = TFLostBlocksMod.MOD_ID)
public class ModBlockEntities
{
	public static final BlockEntityType<ModSignBlockEntity> LOST_TF_SIGN = BlockEntityType.Builder.of(ModSignBlockEntity::new, ModBlocks.TOWERWOOD_SIGN, ModBlocks.TOWERWOOD_WALL_SIGN, ModBlocks.THORN_SIGN, ModBlocks.THORN_WALL_SIGN).build(null);
	public static final BlockEntityType<ModHangingSignBlockEntity> LOST_TF_HANGING_SIGN = BlockEntityType.Builder.of(ModHangingSignBlockEntity::new, ModBlocks.TOWERWOOD_HANGING_SIGN, ModBlocks.TOWERWOOD_WALL_HANGING_SIGN, ModBlocks.THORN_HANGING_SIGN, ModBlocks.THORN_WALL_HANGING_SIGN).build(null);
}
