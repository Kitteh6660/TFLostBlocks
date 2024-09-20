package com.kittehmod.tflostblocks;

import com.kittehmod.tflostblocks.blocks.ModWoodType;
import com.kittehmod.tflostblocks.registry.ModBlockEntities;
import com.kittehmod.tflostblocks.registry.ModBlocks;
import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;

@Mod(TFLostBlocksMod.MOD_ID)
public class TFLostBlocksMod
{
    public static final String MOD_ID = "tflostblocks";

    public TFLostBlocksMod(IEventBus bus, ModContainer container)
    {
    	bus.register(TFLostBlocksRegistry.class);
    	bus.register(CreativeTabHelper.class);
    	bus.addListener(this::setupCommon);
    }

    private void setupCommon(final FMLCommonSetupEvent event)
    {
    	NeoForge.EVENT_BUS.register(new CommonEvents());
        event.enqueueWork(() -> WoodType.register(ModWoodType.THORN_WOOD_TYPE));
        event.enqueueWork(() -> WoodType.register(ModWoodType.TOWERWOOD_WOOD_TYPE));
    }
}
