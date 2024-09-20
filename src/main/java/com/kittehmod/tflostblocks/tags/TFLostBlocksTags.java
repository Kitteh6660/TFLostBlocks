package com.kittehmod.tflostblocks.tags;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;

public class TFLostBlocksTags
{
	public static final TagKey<Block> THORN_WOOD = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("twilightforest", "thorn_wood"));
}
