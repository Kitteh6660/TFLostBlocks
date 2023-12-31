package com.kittehmod.tflostblocks.client;

import java.awt.*;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import twilightforest.block.AuroraBrickBlock;
import twilightforest.block.TFBlocks;

import com.kittehmod.tflostblocks.blockentities.ModBlockEntities;
import com.kittehmod.tflostblocks.registry.ModBlocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHandler
{
	public static void setupRenderers() {
		ClientRegistry.bindTileEntityRenderer(ModBlockEntities.LOST_TF_SIGN.get(), SignTileEntityRenderer::new);
		RenderTypeLookup.setRenderLayer(ModBlocks.AURORALIZED_GLASS_PANE.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(ModBlocks.STRIPPED_THORNS.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.THORN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.THORN_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.TOWERWOOD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(ModBlocks.TOWERWOOD_TRAPDOOR.get(), RenderType.cutout());
	}
	
	@SubscribeEvent
	public static void registerBlockColours(ColorHandlerEvent.Block event) {
		BlockColors blockColours = event.getBlockColors();
		// Tint Towerwood
		blockColours.register((state, worldIn, pos, tintIndex) -> {
		if (tintIndex > 15) return 0xFFFFFF;

		if (worldIn == null || pos == null) {
			return -1;
		} else {
			float f = AuroraBrickBlock.rippleFractialNoise(2, 32.0f, pos, 0.4f, 1.0f, 2f);
			return Color.HSBtoRGB(0.1f, 1f - f, (f + 2f) / 3f);
		}
		}, ModBlocks.TOWERWOOD_STAIRS.get(), ModBlocks.TOWERWOOD_SLAB.get(), ModBlocks.TOWERWOOD_FENCE.get(), ModBlocks.TOWERWOOD_FENCE_GATE.get(), ModBlocks.TOWERWOOD_DOOR.get(), ModBlocks.TOWERWOOD_TRAPDOOR.get(), ModBlocks.TOWERWOOD_BUTTON.get(), ModBlocks.TOWERWOOD_PRESSURE_PLATE.get(), ModBlocks.MOSSY_TOWERWOOD_STAIRS.get(), ModBlocks.MOSSY_TOWERWOOD_SLAB.get());
		// Tint Aurora Stairs & Slabs
		blockColours.register((state, worldIn, pos, tintIndex) -> {
			if (tintIndex > 15) return 0xFFFFFF;

			int normalColor = blockColours.getColor(TFBlocks.aurora_block.get().defaultBlockState(), worldIn, pos, tintIndex);

			int red = (normalColor >> 16) & 255;
			int blue = normalColor & 255;
			int green = (normalColor >> 8) & 255;

			float[] hsb = Color.RGBtoHSB(red, blue, green, null);

			return Color.HSBtoRGB(hsb[0], hsb[1] * 0.5F, Math.min(hsb[2] + 0.4F, 0.9F));
		}, ModBlocks.AURORA_STAIRS.get(), ModBlocks.AURORA_WALL.get(), ModBlocks.AURORALIZED_GLASS_PANE.get());
	}
	
	@SubscribeEvent
	public static void registerItemColours(ColorHandlerEvent.Item event) {
		ItemColors itemColours = event.getItemColors();
		BlockColors blockColours = event.getBlockColors();
		itemColours.register((stack, tintIndex) -> blockColours.getColor(((BlockItem)stack.getItem()).getBlock().defaultBlockState(), null, null, tintIndex), ModBlocks.AURORA_STAIRS.get(), ModBlocks.AURORA_WALL.get(), ModBlocks.AURORALIZED_GLASS_PANE.get());
	}
}
