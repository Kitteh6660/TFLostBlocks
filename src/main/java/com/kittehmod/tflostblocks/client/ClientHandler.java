package com.kittehmod.tflostblocks.client;

import java.awt.Color;

import com.kittehmod.tflostblocks.blocks.ModWoodType;
import com.kittehmod.tflostblocks.registry.ModBlockEntities;
import com.kittehmod.tflostblocks.registry.ModBlocks;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import twilightforest.init.TFBlocks;
import twilightforest.util.ColorUtil;
import twilightforest.util.SimplexNoiseHelper;

public class ClientHandler
{
	@SubscribeEvent
    public static void setupClient(final FMLClientSetupEvent event)
    {
    	ClientHandler.setupRenderers();
    	event.enqueueWork(() -> { Sheets.addWoodType(ModWoodType.THORN_WOOD_TYPE);} );
    	event.enqueueWork(() -> { Sheets.addWoodType(ModWoodType.TOWERWOOD_WOOD_TYPE);} );
    }
    
	public static void setupRenderers() {
		BlockEntityRenderers.register(ModBlockEntities.LOST_TF_SIGN, SignRenderer::new);
		BlockEntityRenderers.register(ModBlockEntities.LOST_TF_HANGING_SIGN, HangingSignRenderer::new);
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.AURORALIZED_GLASS_PANE, RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.THORN_DOOR, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.THORN_TRAPDOOR, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOWERWOOD_DOOR, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOWERWOOD_TRAPDOOR, RenderType.cutout());
	}
	
	@SubscribeEvent
	public static void registerBlockColours(RegisterColorHandlersEvent.Block event) {
		BlockColors blockColours = event.getBlockColors();
		// Tint Towerwood
		event.register((state, worldIn, pos, tintIndex) -> {
		if (tintIndex > 15) return 0xFFFFFF;

		if (worldIn == null || pos == null) {
			return -1;
		} else {
			float f = SimplexNoiseHelper.rippleFractalNoise(2, 32.0f, pos, 0.4f, 1.0f, 2f);
			return Color.HSBtoRGB(0.1f, 1f - f, (f + 2f) / 3f);
		}
		}, ModBlocks.TOWERWOOD_STAIRS, ModBlocks.TOWERWOOD_SLAB, ModBlocks.TOWERWOOD_FENCE, ModBlocks.TOWERWOOD_FENCE_GATE, ModBlocks.TOWERWOOD_DOOR, ModBlocks.TOWERWOOD_TRAPDOOR, ModBlocks.TOWERWOOD_BUTTON, ModBlocks.TOWERWOOD_PRESSURE_PLATE, ModBlocks.MOSSY_TOWERWOOD_STAIRS, ModBlocks.MOSSY_TOWERWOOD_SLAB);
		// Tint Aurora Stairs & Slabs
		event.register((state, worldIn, pos, tintIndex) -> {
			if (tintIndex > 15) return 0xFFFFFF;

			int normalColor = blockColours.getColor(TFBlocks.AURORA_BLOCK.get().defaultBlockState(), worldIn, pos, tintIndex);

			int red = (normalColor >> 16) & 255;
			int blue = normalColor & 255;
			int green = (normalColor >> 8) & 255;

			float[] hsb = ColorUtil.rgbToHSV(red, green, blue);

			return ColorUtil.hsvToRGB(hsb[0], hsb[1] * 0.5F, Math.min(hsb[2] + 0.4F, 0.9F));
		}, ModBlocks.AURORA_STAIRS, ModBlocks.AURORA_WALL, ModBlocks.AURORALIZED_GLASS_PANE);
	}
	
	@SubscribeEvent
	public static void registerItemColours(RegisterColorHandlersEvent.Item event) {
		BlockColors blockColours = event.getBlockColors();
		event.register((stack, tintIndex) -> blockColours.getColor(((BlockItem)stack.getItem()).getBlock().defaultBlockState(), null, null, tintIndex), ModBlocks.AURORA_STAIRS, ModBlocks.AURORA_WALL, ModBlocks.AURORALIZED_GLASS_PANE);
	}
}
