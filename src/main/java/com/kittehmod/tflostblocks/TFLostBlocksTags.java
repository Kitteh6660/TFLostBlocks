package com.kittehmod.tflostblocks;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class TFLostBlocksTags
{
	public static final TagKey<Block> MAZESTONE = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("twilightforest", "mazestone"));
	public static final TagKey<Block> THORN_WOOD = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("twilightforest", "thorn_wood"));
}
