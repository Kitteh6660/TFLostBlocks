package com.kittehmod.tflostblocks.mixin;

import java.util.Set;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import twilightforest.world.components.structures.finalcastle.FinalCastleBossGazeboComponent;

@Mixin(FinalCastleBossGazeboComponent.class)
public class FinalCastleMixin
{
	@Inject(at = @At(value = "HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
	private void injectPostProcess(WorldGenLevel world, StructureManager manager, ChunkGenerator generator, RandomSource randomIn, BoundingBox sbb, ChunkPos chunkPosIn, BlockPos blockPos, CallbackInfo callback) {
		((StructurePiece)(Object)this).placeBlock(world, Blocks.CHEST.defaultBlockState(), 10, 0, 5, sbb);
		ChestBlockEntity blockentity = (ChestBlockEntity)world.getBlockEntity(((StructurePiece)(Object)this).getWorldPos(10, 0, 5));
		if (blockentity != null) {
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
}
