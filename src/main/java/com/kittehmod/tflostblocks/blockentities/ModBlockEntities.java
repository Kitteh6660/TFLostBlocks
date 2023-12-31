package com.kittehmod.tflostblocks.blockentities;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.registry.ModBlocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlockEntities
{
	public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TFLostBlocksMod.MOD_ID);
	
	public static final RegistryObject<TileEntityType<ModSignBlockEntity>> LOST_TF_SIGN = BLOCK_ENTITIES.register("lost_tf_sign", () -> TileEntityType.Builder.of(ModSignBlockEntity::new, ModBlocks.THORN_SIGN.get(), ModBlocks.THORN_WALL_SIGN.get(), ModBlocks.TOWERWOOD_SIGN.get(), ModBlocks.TOWERWOOD_WALL_SIGN.get()).build(null));
}
