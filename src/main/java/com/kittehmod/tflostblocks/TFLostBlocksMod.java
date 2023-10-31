package com.kittehmod.tflostblocks;

import com.kittehmod.tflostblocks.blockentities.ModBlockEntities;
import com.kittehmod.tflostblocks.blocks.ModWoodType;
import com.kittehmod.tflostblocks.client.ClientHandler;
import com.kittehmod.tflostblocks.registry.ModBlocks;
import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TFLostBlocksMod.MOD_ID)
public class TFLostBlocksMod
{
    public static final String MOD_ID = "tflostblocks";

    public TFLostBlocksMod()
    {
    	ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ModBlockEntities.BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    	
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupCommon);
    	if (FMLEnvironment.dist == Dist.CLIENT) {
    		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
    	}
    }

    private void setupCommon(final FMLCommonSetupEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new CommonEvents());
        event.enqueueWork(() -> WoodType.register(ModWoodType.THORN));
        event.enqueueWork(() -> WoodType.register(ModWoodType.TOWERWOOD));
    }
    
    private void setupClient(final FMLClientSetupEvent event)
    {
    	ClientHandler.setupRenderers();
    	event.enqueueWork(() -> { Sheets.addWoodType(ModWoodType.THORN);} );
    	event.enqueueWork(() -> { Sheets.addWoodType(ModWoodType.TOWERWOOD);} );
    	
    	MinecraftForge.EVENT_BUS.register(ClientHandler.class);
    }

}
