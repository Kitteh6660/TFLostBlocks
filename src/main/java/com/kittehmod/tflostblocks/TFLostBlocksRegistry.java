package com.kittehmod.tflostblocks;

import com.kittehmod.tflostblocks.registry.ModBlockEntities;
import com.kittehmod.tflostblocks.registry.ModBlocks;
import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

public class TFLostBlocksRegistry 
{
	// If it works, it works :)
	@SubscribeEvent
	public static void registerContent(RegisterEvent event) {  	
		event.register(Registries.BLOCK, registry -> {
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tiles"), ModBlocks.STONE_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_stairs"), ModBlocks.STONE_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_slab"), ModBlocks.STONE_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_wall"), ModBlocks.STONE_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tiles"), ModBlocks.MOSSY_STONE_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_stairs"), ModBlocks.MOSSY_STONE_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_slab"), ModBlocks.MOSSY_STONE_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_wall"), ModBlocks.MOSSY_STONE_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "aurora_stairs"), ModBlocks.AURORA_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "aurora_wall"), ModBlocks.AURORA_WALL);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "auroralized_glass_pane"), ModBlocks.AURORALIZED_GLASS_PANE);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_slab"), ModBlocks.CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_wall"), ModBlocks.CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tiles"), ModBlocks.CASTLE_BRICK_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_stairs"), ModBlocks.CASTLE_BRICK_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_slab"), ModBlocks.CASTLE_BRICK_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_wall"), ModBlocks.CASTLE_BRICK_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "bold_castle_brick_slab"), ModBlocks.BOLD_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "bold_castle_brick_wall"), ModBlocks.BOLD_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "encased_castle_brick_slab"), ModBlocks.ENCASED_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "encased_castle_brick_wall"), ModBlocks.ENCASED_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "worn_castle_brick_slab"), ModBlocks.WORN_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "worn_castle_brick_wall"), ModBlocks.WORN_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_castle_brick_slab"), ModBlocks.CRACKED_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_castle_brick_wall"), ModBlocks.CRACKED_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_castle_brick_slab"), ModBlocks.MOSSY_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_castle_brick_wall"), ModBlocks.MOSSY_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_stairs"), ModBlocks.DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_slab"), ModBlocks.DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_deadrock_stairs"), ModBlocks.CRACKED_DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_deadrock_slab"), ModBlocks.CRACKED_DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "weathered_deadrock_stairs"), ModBlocks.WEATHERED_DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "weathered_deadrock_slab"), ModBlocks.WEATHERED_DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_bricks"), ModBlocks.DEADROCK_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_stairs"), ModBlocks.DEADROCK_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_slab"), ModBlocks.DEADROCK_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_wall"), ModBlocks.DEADROCK_BRICK_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "nagastone_slab_left"), ModBlocks.NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "nagastone_slab_right"), ModBlocks.NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_nagastone_slab_left"), ModBlocks.CRACKED_NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_nagastone_slab_right"), ModBlocks.CRACKED_NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_nagastone_slab_left"), ModBlocks.MOSSY_NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_nagastone_slab_right"), ModBlocks.MOSSY_NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_stairs"), ModBlocks.MAZESTONE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_slab"), ModBlocks.MAZESTONE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_wall"), ModBlocks.MAZESTONE_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_stairs"), ModBlocks.CUT_MAZESTONE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_slab"), ModBlocks.CUT_MAZESTONE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_wall"), ModBlocks.CUT_MAZESTONE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_bricks"), ModBlocks.LARGE_MAZESTONE_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_stairs"), ModBlocks.LARGE_MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_slab"), ModBlocks.LARGE_MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_wall"), ModBlocks.LARGE_MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_stairs"), ModBlocks.MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_slab"), ModBlocks.MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_wall"), ModBlocks.MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_stairs"), ModBlocks.MOSSY_MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_slab"), ModBlocks.MOSSY_MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_wall"), ModBlocks.MOSSY_MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_stairs"), ModBlocks.UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_slab"), ModBlocks.UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_wall"), ModBlocks.UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_stairs"), ModBlocks.CRACKED_UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_slab"), ModBlocks.CRACKED_UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_wall"), ModBlocks.CRACKED_UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_stairs"), ModBlocks.MOSSY_UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_slab"), ModBlocks.MOSSY_UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_wall"), ModBlocks.MOSSY_UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_stairs"), ModBlocks.TROLLSTEINN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_slab"), ModBlocks.TROLLSTEINN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_wall"), ModBlocks.TROLLSTEINN_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "chiseled_trollsteinn"), ModBlocks.CHISELED_TROLLSTEINN);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn"), ModBlocks.POLISHED_TROLLSTEINN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_stairs"), ModBlocks.POLISHED_TROLLSTEINN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_slab"), ModBlocks.POLISHED_TROLLSTEINN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_wall"), ModBlocks.POLISHED_TROLLSTEINN_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_bricks"), ModBlocks.TROLLSTEINN_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_stairs"), ModBlocks.TROLLSTEINN_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_slab"), ModBlocks.TROLLSTEINN_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_wall"), ModBlocks.TROLLSTEINN_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_stairs"), ModBlocks.TOWERWOOD_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_slab"), ModBlocks.TOWERWOOD_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_fence"), ModBlocks.TOWERWOOD_FENCE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_fence_gate"), ModBlocks.TOWERWOOD_FENCE_GATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_door"), ModBlocks.TOWERWOOD_DOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_trapdoor"), ModBlocks.TOWERWOOD_TRAPDOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_button"), ModBlocks.TOWERWOOD_BUTTON);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_pressure_plate"), ModBlocks.TOWERWOOD_PRESSURE_PLATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_sign"), ModBlocks.TOWERWOOD_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_wall_sign"), ModBlocks.TOWERWOOD_WALL_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_hanging_sign"), ModBlocks.TOWERWOOD_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_wall_hanging_sign"), ModBlocks.TOWERWOOD_WALL_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_banister"), ModBlocks.TOWERWOOD_BANISTER);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_towerwood_stairs"), ModBlocks.MOSSY_TOWERWOOD_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_towerwood_slab"), ModBlocks.MOSSY_TOWERWOOD_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stripped_thorns"), ModBlocks.STRIPPED_THORNS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stripped_thorn_block"), ModBlocks.STRIPPED_THORN_BLOCK);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_planks"), ModBlocks.THORN_PLANKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_stairs"), ModBlocks.THORN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_slab"), ModBlocks.THORN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_fence"), ModBlocks.THORN_FENCE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_fence_gate"), ModBlocks.THORN_FENCE_GATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_door"), ModBlocks.THORN_DOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_trapdoor"), ModBlocks.THORN_TRAPDOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_button"), ModBlocks.THORN_BUTTON);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_pressure_plate"), ModBlocks.THORN_PRESSURE_PLATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_sign"), ModBlocks.THORN_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_wall_sign"), ModBlocks.THORN_WALL_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_hanging_sign"), ModBlocks.THORN_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_wall_hanging_sign"), ModBlocks.THORN_WALL_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_banister"), ModBlocks.THORN_BANISTER);
		});
		event.register(Registries.ITEM, registry -> {
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "incomplete_thorncutter_axe"), ModItems.INCOMPLETE_THORNCUTTER_AXE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorncutter_axe"), ModItems.THORNCUTTER_AXE);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tiles"), ModItems.STONE_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_stairs"), ModItems.STONE_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_slab"), ModItems.STONE_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stone_tile_wall"), ModItems.STONE_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tiles"), ModItems.MOSSY_STONE_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_stairs"), ModItems.MOSSY_STONE_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_slab"), ModItems.MOSSY_STONE_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_stone_tile_wall"), ModItems.MOSSY_STONE_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "aurora_stairs"), ModItems.AURORA_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "aurora_wall"), ModItems.AURORA_WALL);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "auroralized_glass_pane"), ModItems.AURORALIZED_GLASS_PANE);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_slab"), ModItems.CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_wall"), ModItems.CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tiles"), ModItems.CASTLE_BRICK_TILES);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_stairs"), ModItems.CASTLE_BRICK_TILE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_slab"), ModItems.CASTLE_BRICK_TILE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "castle_brick_tile_wall"), ModItems.CASTLE_BRICK_TILE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "bold_castle_brick_slab"), ModItems.BOLD_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "bold_castle_brick_wall"), ModItems.BOLD_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "encased_castle_brick_slab"), ModItems.ENCASED_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "encased_castle_brick_wall"), ModItems.ENCASED_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "worn_castle_brick_slab"), ModItems.WORN_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "worn_castle_brick_wall"), ModItems.WORN_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_castle_brick_slab"), ModItems.CRACKED_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_castle_brick_wall"), ModItems.CRACKED_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_castle_brick_slab"), ModItems.MOSSY_CASTLE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_castle_brick_wall"), ModItems.MOSSY_CASTLE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_stairs"), ModItems.DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_slab"), ModItems.DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_deadrock_stairs"), ModItems.CRACKED_DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_deadrock_slab"), ModItems.CRACKED_DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "weathered_deadrock_stairs"), ModItems.WEATHERED_DEADROCK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "weathered_deadrock_slab"), ModItems.WEATHERED_DEADROCK_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_bricks"), ModItems.DEADROCK_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_stairs"), ModItems.DEADROCK_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_slab"), ModItems.DEADROCK_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "deadrock_brick_wall"), ModItems.DEADROCK_BRICK_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "nagastone_slab_left"), ModItems.NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "nagastone_slab_right"), ModItems.NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_nagastone_slab_left"), ModItems.CRACKED_NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_nagastone_slab_right"), ModItems.CRACKED_NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_nagastone_slab_left"), ModItems.MOSSY_NAGASTONE_SLAB_LEFT);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_nagastone_slab_right"), ModItems.MOSSY_NAGASTONE_SLAB_RIGHT);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_stairs"), ModItems.MAZESTONE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_slab"), ModItems.MAZESTONE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_wall"), ModItems.MAZESTONE_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_stairs"), ModItems.CUT_MAZESTONE_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_slab"), ModItems.CUT_MAZESTONE_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cut_mazestone_wall"), ModItems.CUT_MAZESTONE_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_bricks"), ModItems.LARGE_MAZESTONE_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_stairs"), ModItems.LARGE_MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_slab"), ModItems.LARGE_MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "large_mazestone_brick_wall"), ModItems.LARGE_MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_stairs"), ModItems.MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_slab"), ModItems.MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mazestone_brick_wall"), ModItems.MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_stairs"), ModItems.MOSSY_MAZESTONE_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_slab"), ModItems.MOSSY_MAZESTONE_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_mazestone_brick_wall"), ModItems.MOSSY_MAZESTONE_BRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_stairs"), ModItems.UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_slab"), ModItems.UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "underbrick_wall"), ModItems.UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_stairs"), ModItems.CRACKED_UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_slab"), ModItems.CRACKED_UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "cracked_underbrick_wall"), ModItems.CRACKED_UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_stairs"), ModItems.MOSSY_UNDERBRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_slab"), ModItems.MOSSY_UNDERBRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_underbrick_wall"), ModItems.MOSSY_UNDERBRICK_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_stairs"), ModItems.TROLLSTEINN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_slab"), ModItems.TROLLSTEINN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_wall"), ModItems.TROLLSTEINN_WALL);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "chiseled_trollsteinn"), ModItems.CHISELED_TROLLSTEINN);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn"), ModItems.POLISHED_TROLLSTEINN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_stairs"), ModItems.POLISHED_TROLLSTEINN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_slab"), ModItems.POLISHED_TROLLSTEINN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "polished_trollsteinn_wall"), ModItems.POLISHED_TROLLSTEINN_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_bricks"), ModItems.TROLLSTEINN_BRICKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_stairs"), ModItems.TROLLSTEINN_BRICK_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_slab"), ModItems.TROLLSTEINN_BRICK_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "trollsteinn_brick_wall"), ModItems.TROLLSTEINN_BRICK_WALL);
			
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_stairs"), ModItems.TOWERWOOD_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_slab"), ModItems.TOWERWOOD_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_fence"), ModItems.TOWERWOOD_FENCE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_fence_gate"), ModItems.TOWERWOOD_FENCE_GATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_door"), ModItems.TOWERWOOD_DOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_trapdoor"), ModItems.TOWERWOOD_TRAPDOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_button"), ModItems.TOWERWOOD_BUTTON);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_pressure_plate"), ModItems.TOWERWOOD_PRESSURE_PLATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_sign"), ModItems.TOWERWOOD_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_hanging_sign"), ModItems.TOWERWOOD_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "towerwood_banister"), ModItems.TOWERWOOD_BANISTER);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_towerwood_stairs"), ModItems.MOSSY_TOWERWOOD_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "mossy_towerwood_slab"), ModItems.MOSSY_TOWERWOOD_SLAB);

			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stripped_thorns"), ModItems.STRIPPED_THORNS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "stripped_thorn_block"), ModItems.STRIPPED_THORN_BLOCK);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_planks"), ModItems.THORN_PLANKS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_stairs"), ModItems.THORN_STAIRS);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_slab"), ModItems.THORN_SLAB);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_fence"), ModItems.THORN_FENCE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_fence_gate"), ModItems.THORN_FENCE_GATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_door"), ModItems.THORN_DOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_trapdoor"), ModItems.THORN_TRAPDOOR);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_button"), ModItems.THORN_BUTTON);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_pressure_plate"), ModItems.THORN_PRESSURE_PLATE);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_sign"), ModItems.THORN_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_hanging_sign"), ModItems.THORN_HANGING_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "thorn_banister"), ModItems.THORN_BANISTER);
		});
		event.register(Registries.BLOCK_ENTITY_TYPE, registry -> {
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "lost_tf_sign"), ModBlockEntities.LOST_TF_SIGN);
			registry.register(ResourceLocation.fromNamespaceAndPath(TFLostBlocksMod.MOD_ID, "lost_tf_hanging_sign"), ModBlockEntities.LOST_TF_HANGING_SIGN);
		});
	}
	
	/*static {
		// Register blocks
		BLOCKS.register("stone_tiles", () -> ModBlocks.STONE_TILES);
		BLOCKS.register("stone_tile_stairs", () -> ModBlocks.STONE_TILE_STAIRS);
		BLOCKS.register("stone_tile_slab", () -> ModBlocks.STONE_TILE_SLAB);
		BLOCKS.register("stone_tile_wall", () -> ModBlocks.STONE_TILE_WALL);

		BLOCKS.register("mossy_stone_tiles", () -> ModBlocks.MOSSY_STONE_TILES);
		BLOCKS.register("mossy_stone_tile_stairs", () -> ModBlocks.MOSSY_STONE_TILE_STAIRS);
		BLOCKS.register("mossy_stone_tile_slab", () -> ModBlocks.MOSSY_STONE_TILE_SLAB);
		BLOCKS.register("mossy_stone_tile_wall", () -> ModBlocks.MOSSY_STONE_TILE_WALL);

		BLOCKS.register("aurora_stairs", () -> ModBlocks.AURORA_STAIRS);
		BLOCKS.register("aurora_wall", () -> ModBlocks.AURORA_WALL);
		BLOCKS.register("auroralized_glass_pane", () -> ModBlocks.AURORALIZED_GLASS_PANE);
		
		BLOCKS.register("castle_brick_slab", () -> ModBlocks.CASTLE_BRICK_SLAB);
		BLOCKS.register("castle_brick_wall", () -> ModBlocks.CASTLE_BRICK_WALL);

		BLOCKS.register("castle_brick_tiles", () -> ModBlocks.CASTLE_BRICK_TILES);
		BLOCKS.register("castle_brick_tile_stairs", () -> ModBlocks.CASTLE_BRICK_TILE_STAIRS);
		BLOCKS.register("castle_brick_tile_slab", () -> ModBlocks.CASTLE_BRICK_TILE_SLAB);
		BLOCKS.register("castle_brick_tile_wall", () -> ModBlocks.CASTLE_BRICK_TILE_WALL);

		BLOCKS.register("bold_castle_brick_slab", () -> ModBlocks.BOLD_CASTLE_BRICK_SLAB);
		BLOCKS.register("bold_castle_brick_wall", () -> ModBlocks.BOLD_CASTLE_BRICK_WALL);

		BLOCKS.register("encased_castle_brick_slab", () -> ModBlocks.ENCASED_CASTLE_BRICK_SLAB);
		BLOCKS.register("encased_castle_brick_wall", () -> ModBlocks.ENCASED_CASTLE_BRICK_WALL);

		BLOCKS.register("worn_castle_brick_slab", () -> ModBlocks.WORN_CASTLE_BRICK_SLAB);
		BLOCKS.register("worn_castle_brick_wall", () -> ModBlocks.WORN_CASTLE_BRICK_WALL);

		BLOCKS.register("cracked_castle_brick_slab", () -> ModBlocks.CRACKED_CASTLE_BRICK_SLAB);
		BLOCKS.register("cracked_castle_brick_wall", () -> ModBlocks.CRACKED_CASTLE_BRICK_WALL);

		BLOCKS.register("mossy_castle_brick_slab", () -> ModBlocks.MOSSY_CASTLE_BRICK_SLAB);
		BLOCKS.register("mossy_castle_brick_wall", () -> ModBlocks.MOSSY_CASTLE_BRICK_WALL);

		BLOCKS.register("deadrock_stairs", () -> ModBlocks.DEADROCK_STAIRS);
		BLOCKS.register("deadrock_slab", () -> ModBlocks.DEADROCK_SLAB);

		BLOCKS.register("cracked_deadrock_stairs", () -> ModBlocks.CRACKED_DEADROCK_STAIRS);
		BLOCKS.register("cracked_deadrock_slab", () -> ModBlocks.CRACKED_DEADROCK_SLAB);

		BLOCKS.register("weathered_deadrock_stairs", () -> ModBlocks.WEATHERED_DEADROCK_STAIRS);
		BLOCKS.register("weathered_deadrock_slab", () -> ModBlocks.WEATHERED_DEADROCK_SLAB);

		BLOCKS.register("deadrock_bricks", () -> ModBlocks.DEADROCK_BRICKS);
		BLOCKS.register("deadrock_brick_stairs", () -> ModBlocks.DEADROCK_BRICK_STAIRS);
		BLOCKS.register("deadrock_brick_slab", () -> ModBlocks.DEADROCK_BRICK_SLAB);
		BLOCKS.register("deadrock_brick_wall", () -> ModBlocks.DEADROCK_BRICK_WALL);
		
		BLOCKS.register("nagastone_slab_left", () -> ModBlocks.NAGASTONE_SLAB_LEFT);
		BLOCKS.register("nagastone_slab_right", () -> ModBlocks.NAGASTONE_SLAB_RIGHT);

		BLOCKS.register("cracked_nagastone_slab_left", () -> ModBlocks.CRACKED_NAGASTONE_SLAB_LEFT);
		BLOCKS.register("cracked_nagastone_slab_right", () -> ModBlocks.CRACKED_NAGASTONE_SLAB_RIGHT);

		BLOCKS.register("mossy_nagastone_slab_left", () -> ModBlocks.MOSSY_NAGASTONE_SLAB_LEFT);
		BLOCKS.register("mossy_nagastone_slab_right", () -> ModBlocks.MOSSY_NAGASTONE_SLAB_RIGHT);

		BLOCKS.register("mazestone_stairs", () -> ModBlocks.MAZESTONE_STAIRS);
		BLOCKS.register("mazestone_slab", () -> ModBlocks.MAZESTONE_SLAB);
		BLOCKS.register("mazestone_wall", () -> ModBlocks.MAZESTONE_WALL);
		
		BLOCKS.register("cut_mazestone_stairs", () -> ModBlocks.CUT_MAZESTONE_STAIRS);
		BLOCKS.register("cut_mazestone_slab", () -> ModBlocks.CUT_MAZESTONE_SLAB);
		BLOCKS.register("cut_mazestone_wall", () -> ModBlocks.CUT_MAZESTONE_WALL);

		BLOCKS.register("large_mazestone_bricks", () -> ModBlocks.LARGE_MAZESTONE_BRICKS);
		BLOCKS.register("large_mazestone_brick_stairs", () -> ModBlocks.LARGE_MAZESTONE_BRICK_STAIRS);
		BLOCKS.register("large_mazestone_brick_slab", () -> ModBlocks.LARGE_MAZESTONE_BRICK_SLAB);
		BLOCKS.register("large_mazestone_brick_wall", () -> ModBlocks.LARGE_MAZESTONE_BRICK_WALL);

		BLOCKS.register("mazestone_brick_stairs", () -> ModBlocks.MAZESTONE_BRICK_STAIRS);
		BLOCKS.register("mazestone_brick_slab", () -> ModBlocks.MAZESTONE_BRICK_SLAB);
		BLOCKS.register("mazestone_brick_wall", () -> ModBlocks.MAZESTONE_BRICK_WALL);

		BLOCKS.register("mossy_mazestone_brick_stairs", () -> ModBlocks.MOSSY_MAZESTONE_BRICK_STAIRS);
		BLOCKS.register("mossy_mazestone_brick_slab", () -> ModBlocks.MOSSY_MAZESTONE_BRICK_SLAB);
		BLOCKS.register("mossy_mazestone_brick_wall", () -> ModBlocks.MOSSY_MAZESTONE_BRICK_WALL);

		BLOCKS.register("underbrick_stairs", () -> ModBlocks.UNDERBRICK_STAIRS);
		BLOCKS.register("underbrick_slab", () -> ModBlocks.UNDERBRICK_SLAB);
		BLOCKS.register("underbrick_wall", () -> ModBlocks.UNDERBRICK_WALL);

		BLOCKS.register("cracked_underbrick_stairs", () -> ModBlocks.CRACKED_UNDERBRICK_STAIRS);
		BLOCKS.register("cracked_underbrick_slab", () -> ModBlocks.CRACKED_UNDERBRICK_SLAB);
		BLOCKS.register("cracked_underbrick_wall", () -> ModBlocks.CRACKED_UNDERBRICK_WALL);

		BLOCKS.register("mossy_underbrick_stairs", () -> ModBlocks.MOSSY_UNDERBRICK_STAIRS);
		BLOCKS.register("mossy_underbrick_slab", () -> ModBlocks.MOSSY_UNDERBRICK_SLAB);
		BLOCKS.register("mossy_underbrick_wall", () -> ModBlocks.MOSSY_UNDERBRICK_WALL);

		BLOCKS.register("trollsteinn_stairs", () -> ModBlocks.TROLLSTEINN_STAIRS);
		BLOCKS.register("trollsteinn_slab", () -> ModBlocks.TROLLSTEINN_SLAB);
		BLOCKS.register("trollsteinn_wall", () -> ModBlocks.TROLLSTEINN_WALL);

		BLOCKS.register("chiseled_trollsteinn", () -> ModBlocks.CHISELED_TROLLSTEINN);

		BLOCKS.register("polished_trollsteinn", () -> ModBlocks.POLISHED_TROLLSTEINN);
		BLOCKS.register("polished_trollsteinn_stairs", () -> ModBlocks.POLISHED_TROLLSTEINN_STAIRS);
		BLOCKS.register("polished_trollsteinn_slab", () -> ModBlocks.POLISHED_TROLLSTEINN_SLAB);
		BLOCKS.register("polished_trollsteinn_wall", () -> ModBlocks.POLISHED_TROLLSTEINN_WALL);
		
		BLOCKS.register("trollsteinn_bricks", () -> ModBlocks.TROLLSTEINN_BRICKS);
		BLOCKS.register("trollsteinn_brick_stairs", () -> ModBlocks.TROLLSTEINN_BRICK_STAIRS);
		BLOCKS.register("trollsteinn_brick_slab", () -> ModBlocks.TROLLSTEINN_BRICK_SLAB);
		BLOCKS.register("trollsteinn_brick_wall", () -> ModBlocks.TROLLSTEINN_BRICK_WALL);

		BLOCKS.register("towerwood_stairs", () -> ModBlocks.TOWERWOOD_STAIRS);
		BLOCKS.register("towerwood_slab", () -> ModBlocks.TOWERWOOD_SLAB);
		BLOCKS.register("towerwood_fence", () -> ModBlocks.TOWERWOOD_FENCE);
		BLOCKS.register("towerwood_fence_gate", () -> ModBlocks.TOWERWOOD_FENCE_GATE);
		BLOCKS.register("towerwood_door", () -> ModBlocks.TOWERWOOD_DOOR);
		BLOCKS.register("towerwood_trapdoor", () -> ModBlocks.TOWERWOOD_TRAPDOOR);
		BLOCKS.register("towerwood_button", () -> ModBlocks.TOWERWOOD_BUTTON);
		BLOCKS.register("towerwood_pressure_plate", () -> ModBlocks.TOWERWOOD_PRESSURE_PLATE);
		BLOCKS.register("towerwood_sign", () -> ModBlocks.TOWERWOOD_SIGN);
		BLOCKS.register("towerwood_wall_sign", () -> ModBlocks.TOWERWOOD_WALL_SIGN);
		BLOCKS.register("towerwood_hanging_sign", () -> ModBlocks.TOWERWOOD_HANGING_SIGN);
		BLOCKS.register("towerwood_wall_hanging_sign", () -> ModBlocks.TOWERWOOD_WALL_HANGING_SIGN);
		BLOCKS.register("towerwood_banister", () -> ModBlocks.TOWERWOOD_BANISTER);

		BLOCKS.register("mossy_towerwood_stairs", () -> ModBlocks.MOSSY_TOWERWOOD_STAIRS);
		BLOCKS.register("mossy_towerwood_slab", () -> ModBlocks.MOSSY_TOWERWOOD_SLAB);

		BLOCKS.register("stripped_thorns", () -> ModBlocks.STRIPPED_THORNS);
		BLOCKS.register("stripped_thorn_block", () -> ModBlocks.STRIPPED_THORN_BLOCK);
		BLOCKS.register("thorn_planks", () -> ModBlocks.THORN_PLANKS);
		BLOCKS.register("thorn_stairs", () -> ModBlocks.THORN_STAIRS);
		BLOCKS.register("thorn_slab", () -> ModBlocks.THORN_SLAB);
		BLOCKS.register("thorn_fence", () -> ModBlocks.THORN_FENCE);
		BLOCKS.register("thorn_fence_gate", () -> ModBlocks.THORN_FENCE_GATE);
		BLOCKS.register("thorn_door", () -> ModBlocks.THORN_DOOR);
		BLOCKS.register("thorn_trapdoor", () -> ModBlocks.THORN_TRAPDOOR);
		BLOCKS.register("thorn_button", () -> ModBlocks.THORN_BUTTON);
		BLOCKS.register("thorn_pressure_plate", () -> ModBlocks.THORN_PRESSURE_PLATE);
		BLOCKS.register("thorn_sign", () -> ModBlocks.THORN_SIGN);
		BLOCKS.register("thorn_wall_sign", () -> ModBlocks.THORN_WALL_SIGN);
		BLOCKS.register("thorn_hanging_sign", () -> ModBlocks.THORN_HANGING_SIGN);
		BLOCKS.register("thorn_wall_hanging_sign", () -> ModBlocks.THORN_WALL_HANGING_SIGN);
		BLOCKS.register("thorn_banister", () -> ModBlocks.THORN_BANISTER);
		
		// Register items.
		ITEMS.register("incomplete_thorncutter_axe", () -> ModItems.INCOMPLETE_THORNCUTTER_AXE);
		ITEMS.register("thorncutter_axe", () -> ModItems.THORNCUTTER_AXE);

		ITEMS.register("stone_tiles", () -> ModItems.STONE_TILES);
		ITEMS.register("stone_tile_stairs", () -> ModItems.STONE_TILE_STAIRS);
		ITEMS.register("stone_tile_slab", () -> ModItems.STONE_TILE_SLAB);
		ITEMS.register("stone_tile_wall", () -> ModItems.STONE_TILE_WALL);

		ITEMS.register("mossy_stone_tiles", () -> ModItems.MOSSY_STONE_TILES);
		ITEMS.register("mossy_stone_tile_stairs", () -> ModItems.MOSSY_STONE_TILE_STAIRS);
		ITEMS.register("mossy_stone_tile_slab", () -> ModItems.MOSSY_STONE_TILE_SLAB);
		ITEMS.register("mossy_stone_tile_wall", () -> ModItems.MOSSY_STONE_TILE_WALL);

		ITEMS.register("aurora_stairs", () -> ModItems.AURORA_STAIRS);
		ITEMS.register("aurora_wall", () -> ModItems.AURORA_WALL);
		ITEMS.register("auroralized_glass_pane", () -> ModItems.AURORALIZED_GLASS_PANE);
		
		ITEMS.register("castle_brick_slab", () -> ModItems.CASTLE_BRICK_SLAB);
		ITEMS.register("castle_brick_wall", () -> ModItems.CASTLE_BRICK_WALL);

		ITEMS.register("castle_brick_tiles", () -> ModItems.CASTLE_BRICK_TILES);
		ITEMS.register("castle_brick_tile_stairs", () -> ModItems.CASTLE_BRICK_TILE_STAIRS);
		ITEMS.register("castle_brick_tile_slab", () -> ModItems.CASTLE_BRICK_TILE_SLAB);
		ITEMS.register("castle_brick_tile_wall", () -> ModItems.CASTLE_BRICK_TILE_WALL);

		ITEMS.register("bold_castle_brick_slab", () -> ModItems.BOLD_CASTLE_BRICK_SLAB);
		ITEMS.register("bold_castle_brick_wall", () -> ModItems.BOLD_CASTLE_BRICK_WALL);

		ITEMS.register("encased_castle_brick_slab", () -> ModItems.ENCASED_CASTLE_BRICK_SLAB);
		ITEMS.register("encased_castle_brick_wall", () -> ModItems.ENCASED_CASTLE_BRICK_WALL);

		ITEMS.register("worn_castle_brick_slab", () -> ModItems.WORN_CASTLE_BRICK_SLAB);
		ITEMS.register("worn_castle_brick_wall", () -> ModItems.WORN_CASTLE_BRICK_WALL);

		ITEMS.register("cracked_castle_brick_slab", () -> ModItems.CRACKED_CASTLE_BRICK_SLAB);
		ITEMS.register("cracked_castle_brick_wall", () -> ModItems.CRACKED_CASTLE_BRICK_WALL);

		ITEMS.register("mossy_castle_brick_slab", () -> ModItems.MOSSY_CASTLE_BRICK_SLAB);
		ITEMS.register("mossy_castle_brick_wall", () -> ModItems.MOSSY_CASTLE_BRICK_WALL);

		ITEMS.register("deadrock_stairs", () -> ModItems.DEADROCK_STAIRS);
		ITEMS.register("deadrock_slab", () -> ModItems.DEADROCK_SLAB);

		ITEMS.register("cracked_deadrock_stairs", () -> ModItems.CRACKED_DEADROCK_STAIRS);
		ITEMS.register("cracked_deadrock_slab", () -> ModItems.CRACKED_DEADROCK_SLAB);

		ITEMS.register("weathered_deadrock_stairs", () -> ModItems.WEATHERED_DEADROCK_STAIRS);
		ITEMS.register("weathered_deadrock_slab", () -> ModItems.WEATHERED_DEADROCK_SLAB);

		ITEMS.register("deadrock_bricks", () -> ModItems.DEADROCK_BRICKS);
		ITEMS.register("deadrock_brick_stairs", () -> ModItems.DEADROCK_BRICK_STAIRS);
		ITEMS.register("deadrock_brick_slab", () -> ModItems.DEADROCK_BRICK_SLAB);
		ITEMS.register("deadrock_brick_wall", () -> ModItems.DEADROCK_BRICK_WALL);
		
		ITEMS.register("nagastone_slab_left", () -> ModItems.NAGASTONE_SLAB_LEFT);
		ITEMS.register("nagastone_slab_right", () -> ModItems.NAGASTONE_SLAB_RIGHT);

		ITEMS.register("cracked_nagastone_slab_left", () -> ModItems.CRACKED_NAGASTONE_SLAB_LEFT);
		ITEMS.register("cracked_nagastone_slab_right", () -> ModItems.CRACKED_NAGASTONE_SLAB_RIGHT);

		ITEMS.register("mossy_nagastone_slab_left", () -> ModItems.MOSSY_NAGASTONE_SLAB_LEFT);
		ITEMS.register("mossy_nagastone_slab_right", () -> ModItems.MOSSY_NAGASTONE_SLAB_RIGHT);

		ITEMS.register("mazestone_stairs", () -> ModItems.MAZESTONE_STAIRS);
		ITEMS.register("mazestone_slab", () -> ModItems.MAZESTONE_SLAB);
		ITEMS.register("mazestone_wall", () -> ModItems.MAZESTONE_WALL);
		
		ITEMS.register("cut_mazestone_stairs", () -> ModItems.CUT_MAZESTONE_STAIRS);
		ITEMS.register("cut_mazestone_slab", () -> ModItems.CUT_MAZESTONE_SLAB);
		ITEMS.register("cut_mazestone_wall", () -> ModItems.CUT_MAZESTONE_WALL);

		ITEMS.register("large_mazestone_bricks", () -> ModItems.LARGE_MAZESTONE_BRICKS);
		ITEMS.register("large_mazestone_brick_stairs", () -> ModItems.LARGE_MAZESTONE_BRICK_STAIRS);
		ITEMS.register("large_mazestone_brick_slab", () -> ModItems.LARGE_MAZESTONE_BRICK_SLAB);
		ITEMS.register("large_mazestone_brick_wall", () -> ModItems.LARGE_MAZESTONE_BRICK_WALL);

		ITEMS.register("mazestone_brick_stairs", () -> ModItems.MAZESTONE_BRICK_STAIRS);
		ITEMS.register("mazestone_brick_slab", () -> ModItems.MAZESTONE_BRICK_SLAB);
		ITEMS.register("mazestone_brick_wall", () -> ModItems.MAZESTONE_BRICK_WALL);

		ITEMS.register("mossy_mazestone_brick_stairs", () -> ModItems.MOSSY_MAZESTONE_BRICK_STAIRS);
		ITEMS.register("mossy_mazestone_brick_slab", () -> ModItems.MOSSY_MAZESTONE_BRICK_SLAB);
		ITEMS.register("mossy_mazestone_brick_wall", () -> ModItems.MOSSY_MAZESTONE_BRICK_WALL);

		ITEMS.register("underbrick_stairs", () -> ModItems.UNDERBRICK_STAIRS);
		ITEMS.register("underbrick_slab", () -> ModItems.UNDERBRICK_SLAB);
		ITEMS.register("underbrick_wall", () -> ModItems.UNDERBRICK_WALL);

		ITEMS.register("cracked_underbrick_stairs", () -> ModItems.CRACKED_UNDERBRICK_STAIRS);
		ITEMS.register("cracked_underbrick_slab", () -> ModItems.CRACKED_UNDERBRICK_SLAB);
		ITEMS.register("cracked_underbrick_wall", () -> ModItems.CRACKED_UNDERBRICK_WALL);

		ITEMS.register("mossy_underbrick_stairs", () -> ModItems.MOSSY_UNDERBRICK_STAIRS);
		ITEMS.register("mossy_underbrick_slab", () -> ModItems.MOSSY_UNDERBRICK_SLAB);
		ITEMS.register("mossy_underbrick_wall", () -> ModItems.MOSSY_UNDERBRICK_WALL);

		ITEMS.register("trollsteinn_stairs", () -> ModItems.TROLLSTEINN_STAIRS);
		ITEMS.register("trollsteinn_slab", () -> ModItems.TROLLSTEINN_SLAB);
		ITEMS.register("trollsteinn_wall", () -> ModItems.TROLLSTEINN_WALL);

		ITEMS.register("chiseled_trollsteinn", () -> ModItems.CHISELED_TROLLSTEINN);

		ITEMS.register("polished_trollsteinn", () -> ModItems.POLISHED_TROLLSTEINN);
		ITEMS.register("polished_trollsteinn_stairs", () -> ModItems.POLISHED_TROLLSTEINN_STAIRS);
		ITEMS.register("polished_trollsteinn_slab", () -> ModItems.POLISHED_TROLLSTEINN_SLAB);
		ITEMS.register("polished_trollsteinn_wall", () -> ModItems.POLISHED_TROLLSTEINN_WALL);
		
		ITEMS.register("trollsteinn_bricks", () -> ModItems.TROLLSTEINN_BRICKS);
		ITEMS.register("trollsteinn_brick_stairs", () -> ModItems.TROLLSTEINN_BRICK_STAIRS);
		ITEMS.register("trollsteinn_brick_slab", () -> ModItems.TROLLSTEINN_BRICK_SLAB);
		ITEMS.register("trollsteinn_brick_wall", () -> ModItems.TROLLSTEINN_BRICK_WALL);
		
		ITEMS.register("towerwood_stairs", () -> ModItems.TOWERWOOD_STAIRS);
		ITEMS.register("towerwood_slab", () -> ModItems.TOWERWOOD_SLAB);
		ITEMS.register("towerwood_fence", () -> ModItems.TOWERWOOD_FENCE);
		ITEMS.register("towerwood_fence_gate", () -> ModItems.TOWERWOOD_FENCE_GATE);
		ITEMS.register("towerwood_door", () -> ModItems.TOWERWOOD_DOOR);
		ITEMS.register("towerwood_trapdoor", () -> ModItems.TOWERWOOD_TRAPDOOR);
		ITEMS.register("towerwood_button", () -> ModItems.TOWERWOOD_BUTTON);
		ITEMS.register("towerwood_pressure_plate", () -> ModItems.TOWERWOOD_PRESSURE_PLATE);
		ITEMS.register("towerwood_sign", () -> ModItems.TOWERWOOD_SIGN);
		ITEMS.register("towerwood_hanging_sign", () -> ModItems.TOWERWOOD_HANGING_SIGN);
		ITEMS.register("towerwood_banister", () -> ModItems.TOWERWOOD_BANISTER);

		ITEMS.register("mossy_towerwood_stairs", () -> ModItems.MOSSY_TOWERWOOD_STAIRS);
		ITEMS.register("mossy_towerwood_slab", () -> ModItems.MOSSY_TOWERWOOD_SLAB);

		ITEMS.register("stripped_thorns", () -> ModItems.STRIPPED_THORNS);
		ITEMS.register("stripped_thorn_block", () -> ModItems.STRIPPED_THORN_BLOCK);
		ITEMS.register("thorn_planks", () -> ModItems.THORN_PLANKS);
		ITEMS.register("thorn_stairs", () -> ModItems.THORN_STAIRS);
		ITEMS.register("thorn_slab", () -> ModItems.THORN_SLAB);
		ITEMS.register("thorn_fence", () -> ModItems.THORN_FENCE);
		ITEMS.register("thorn_fence_gate", () -> ModItems.THORN_FENCE_GATE);
		ITEMS.register("thorn_door", () -> ModItems.THORN_DOOR);
		ITEMS.register("thorn_trapdoor", () -> ModItems.THORN_TRAPDOOR);
		ITEMS.register("thorn_button", () -> ModItems.THORN_BUTTON);
		ITEMS.register("thorn_pressure_plate", () -> ModItems.THORN_PRESSURE_PLATE);
		ITEMS.register("thorn_sign", () -> ModItems.THORN_SIGN);
		ITEMS.register("thorn_hanging_sign", () -> ModItems.THORN_HANGING_SIGN);
		ITEMS.register("thorn_banister", () -> ModItems.THORN_BANISTER);
		
		// Register block entities.
		BLOCK_ENTITIES.register("lost_tf_sign", () -> ModBlockEntities.LOST_TF_SIGN);
		BLOCK_ENTITIES.register("lost_tf_hanging_sign", () -> ModBlockEntities.LOST_TF_HANGING_SIGN);
	}*/
}
