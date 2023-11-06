package com.kittehmod.tflostblocks.blockentities;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.registry.ModBlocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlockEntities
{
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, TFLostBlocksMod.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> LOST_TF_SIGN = BLOCK_ENTITIES.register("lost_tf_sign", () -> BlockEntityType.Builder.of(ModSignBlockEntity::new, ModBlocks.THORN_SIGN.get(), ModBlocks.THORN_WALL_SIGN.get(), ModBlocks.TOWERWOOD_SIGN.get(), ModBlocks.TOWERWOOD_WALL_SIGN.get()).build(null));
}
