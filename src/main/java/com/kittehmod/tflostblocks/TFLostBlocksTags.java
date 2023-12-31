package com.kittehmod.tflostblocks;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;

public class TFLostBlocksTags
{
	public static final ITag.INamedTag<Block> MAZESTONE = BlockTags.createOptional(new ResourceLocation("twilightforest", "mazestone"));
	public static final ITag.INamedTag<Block> THORN_WOOD = BlockTags.createOptional(new ResourceLocation("twilightforest", "thorn_wood"));
}
