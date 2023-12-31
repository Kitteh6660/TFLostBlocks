package com.kittehmod.tflostblocks.mixin;

import java.util.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.google.common.collect.ImmutableSet;
import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import twilightforest.structures.finalcastle.FinalCastleBossGazeboComponent;

@Mixin(FinalCastleBossGazeboComponent.class)
public class FinalCastleMixin
{
	@Inject(at = @At(value = "HEAD"), method = "postProcess(Lnet/minecraft/world/ISeedReader;Lnet/minecraft/world/gen/feature/structure/StructureManager;Lnet/minecraft/world/gen/ChunkGenerator;Ljava/util/Random;Lnet/minecraft/util/math/MutableBoundingBox;Lnet/minecraft/util/math/ChunkPos;Lnet/minecraft/util/math/BlockPos;)Z", cancellable = true)
	private void injectPostProcess(ISeedReader world, StructureManager manager, ChunkGenerator generator, Random randomIn, MutableBoundingBox sbb, ChunkPos chunkPosIn, BlockPos blockPos, CallbackInfoReturnable<Boolean> callback) {
		StructurePiece piece = ((StructurePiece)(Object)this);
		piece.placeBlock(world, Blocks.CHEST.defaultBlockState(), 10, 0, 5, sbb);
		ChestTileEntity blockentity = (ChestTileEntity)world.getBlockEntity(new BlockPos(piece.getWorldX(10, 5), piece.getWorldY(0), piece.getWorldZ(10, 5)));
		if (blockentity != null) {
			if (!blockentity.hasAnyOf(ImmutableSet.of(ModItems.INCOMPLETE_THORNCUTTER_AXE.get()))) {
				blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE.get(), 1));
				if (randomIn.nextFloat() < 0.6F) {
					blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE.get(), 1));
				}
				if (randomIn.nextFloat() < 0.3F) {
					blockentity.setItem(randomIn.nextInt(blockentity.getContainerSize()), new ItemStack(ModItems.INCOMPLETE_THORNCUTTER_AXE.get(), 1));
				}
			}
		}
	}
}
