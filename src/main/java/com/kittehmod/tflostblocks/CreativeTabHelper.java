package com.kittehmod.tflostblocks;

import com.kittehmod.tflostblocks.registry.ModItems;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFCreativeTabs;
import twilightforest.init.TFItems;

public class CreativeTabHelper 
{
    @SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	ResourceKey<CreativeModeTab> map = event.getTabKey();
    	if (event.getTabKey() == TFCreativeTabs.BLOCKS.getKey()) {
    		// Insert Stone Tile blocks.
    		event.insertAfter(TFBlocks.TWISTED_STONE_PILLAR.asItem().getDefaultInstance(), ModItems.STONE_TILES.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.STONE_TILES.asItem().getDefaultInstance(), ModItems.STONE_TILE_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.STONE_TILE_STAIRS.asItem().getDefaultInstance(), ModItems.STONE_TILE_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.STONE_TILE_SLAB.asItem().getDefaultInstance(), ModItems.STONE_TILE_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(ModItems.STONE_TILE_WALL.asItem().getDefaultInstance(), ModItems.MOSSY_STONE_TILES.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_STONE_TILES.asItem().getDefaultInstance(), ModItems.MOSSY_STONE_TILE_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_STONE_TILE_STAIRS.asItem().getDefaultInstance(), ModItems.MOSSY_STONE_TILE_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_STONE_TILE_SLAB.asItem().getDefaultInstance(), ModItems.MOSSY_STONE_TILE_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Aurora blocks.
    		event.insertBefore(TFBlocks.AURORA_SLAB.asItem().getDefaultInstance(), ModItems.AURORA_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.AURORA_SLAB.asItem().getDefaultInstance(), ModItems.AURORA_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.AURORALIZED_GLASS.asItem().getDefaultInstance(), ModItems.AURORALIZED_GLASS_PANE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Castle brick blocks.
    		event.insertAfter(TFBlocks.CASTLE_BRICK.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_TILES.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.CASTLE_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_TILE_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.BOLD_CASTLE_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_TILE_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CASTLE_BRICK_TILE_SLAB.asItem().getDefaultInstance(), ModItems.WORN_CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.WORN_CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.CRACKED_CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CRACKED_CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.MOSSY_CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.ENCASED_CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.ENCASED_CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.BOLD_CASTLE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		event.insertAfter(ModItems.BOLD_CASTLE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CASTLE_BRICK_WALL.asItem().getDefaultInstance(), ModItems.CASTLE_BRICK_TILE_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CASTLE_BRICK_TILE_WALL.asItem().getDefaultInstance(), ModItems.WORN_CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.WORN_CASTLE_BRICK_WALL.asItem().getDefaultInstance(), ModItems.CRACKED_CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CRACKED_CASTLE_BRICK_WALL.asItem().getDefaultInstance(), ModItems.MOSSY_CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_CASTLE_BRICK_WALL.asItem().getDefaultInstance(), ModItems.ENCASED_CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.ENCASED_CASTLE_BRICK_WALL.asItem().getDefaultInstance(), ModItems.BOLD_CASTLE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Insert Deadrock blocks.
    		event.insertAfter(TFBlocks.DEADROCK.asItem().getDefaultInstance(), ModItems.DEADROCK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.DEADROCK_STAIRS.asItem().getDefaultInstance(), ModItems.DEADROCK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		event.insertAfter(TFBlocks.CRACKED_DEADROCK.asItem().getDefaultInstance(), ModItems.CRACKED_DEADROCK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CRACKED_DEADROCK_STAIRS.asItem().getDefaultInstance(), ModItems.CRACKED_DEADROCK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		event.insertAfter(TFBlocks.WEATHERED_DEADROCK.asItem().getDefaultInstance(), ModItems.WEATHERED_DEADROCK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.WEATHERED_DEADROCK_STAIRS.asItem().getDefaultInstance(), ModItems.WEATHERED_DEADROCK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(ModItems.WEATHERED_DEADROCK_SLAB.asItem().getDefaultInstance(), ModItems.DEADROCK_BRICKS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.DEADROCK_BRICKS.asItem().getDefaultInstance(), ModItems.DEADROCK_BRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.DEADROCK_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.DEADROCK_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.DEADROCK_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.DEADROCK_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Insert Mazestone blocks.
    		event.insertAfter(TFBlocks.MAZESTONE.asItem().getDefaultInstance(), ModItems.MAZESTONE_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MAZESTONE_STAIRS.asItem().getDefaultInstance(), ModItems.MAZESTONE_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MAZESTONE_SLAB.asItem().getDefaultInstance(), ModItems.MAZESTONE_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.CUT_MAZESTONE.asItem().getDefaultInstance(), ModItems.CUT_MAZESTONE_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CUT_MAZESTONE_STAIRS.asItem().getDefaultInstance(), ModItems.CUT_MAZESTONE_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CUT_MAZESTONE_SLAB.asItem().getDefaultInstance(), ModItems.CUT_MAZESTONE_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertBefore(TFBlocks.MAZESTONE_BRICK.asItem().getDefaultInstance(), ModItems.LARGE_MAZESTONE_BRICKS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.LARGE_MAZESTONE_BRICKS.asItem().getDefaultInstance(), ModItems.LARGE_MAZESTONE_BRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.LARGE_MAZESTONE_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.LARGE_MAZESTONE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.LARGE_MAZESTONE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.LARGE_MAZESTONE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.MAZESTONE_BRICK.asItem().getDefaultInstance(), ModItems.MAZESTONE_BRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MAZESTONE_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.MAZESTONE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MAZESTONE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.MAZESTONE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.MOSSY_MAZESTONE.asItem().getDefaultInstance(), ModItems.MOSSY_MAZESTONE_BRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_MAZESTONE_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.MOSSY_MAZESTONE_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_MAZESTONE_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.MOSSY_MAZESTONE_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Nagastone blocks.
    		event.insertAfter(TFBlocks.NAGASTONE_STAIRS_LEFT.asItem().getDefaultInstance(), ModItems.NAGASTONE_SLAB_LEFT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.NAGASTONE_STAIRS_RIGHT.asItem().getDefaultInstance(), ModItems.NAGASTONE_SLAB_RIGHT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		event.insertAfter(TFBlocks.CRACKED_NAGASTONE_STAIRS_LEFT.asItem().getDefaultInstance(), ModItems.CRACKED_NAGASTONE_SLAB_LEFT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.CRACKED_NAGASTONE_STAIRS_RIGHT.asItem().getDefaultInstance(), ModItems.CRACKED_NAGASTONE_SLAB_RIGHT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.MOSSY_NAGASTONE_STAIRS_LEFT.asItem().getDefaultInstance(), ModItems.MOSSY_NAGASTONE_SLAB_LEFT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.MOSSY_NAGASTONE_STAIRS_RIGHT.asItem().getDefaultInstance(), ModItems.MOSSY_NAGASTONE_SLAB_RIGHT.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Underbrick blocks.
    		event.insertAfter(TFBlocks.UNDERBRICK.asItem().getDefaultInstance(), ModItems.UNDERBRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.UNDERBRICK_STAIRS.asItem().getDefaultInstance(), ModItems.UNDERBRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.UNDERBRICK_SLAB.asItem().getDefaultInstance(), ModItems.UNDERBRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.CRACKED_UNDERBRICK.asItem().getDefaultInstance(), ModItems.CRACKED_UNDERBRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CRACKED_UNDERBRICK_STAIRS.asItem().getDefaultInstance(), ModItems.CRACKED_UNDERBRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.CRACKED_UNDERBRICK_SLAB.asItem().getDefaultInstance(), ModItems.CRACKED_UNDERBRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(TFBlocks.MOSSY_UNDERBRICK.asItem().getDefaultInstance(), ModItems.MOSSY_UNDERBRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_UNDERBRICK_STAIRS.asItem().getDefaultInstance(), ModItems.MOSSY_UNDERBRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_UNDERBRICK_SLAB.asItem().getDefaultInstance(), ModItems.MOSSY_UNDERBRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Trollsteinn blocks.
    		event.insertAfter(TFBlocks.TROLLSTEINN.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TROLLSTEINN_STAIRS.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TROLLSTEINN_SLAB.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(ModItems.TROLLSTEINN_WALL.asItem().getDefaultInstance(), ModItems.POLISHED_TROLLSTEINN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.POLISHED_TROLLSTEINN.asItem().getDefaultInstance(), ModItems.POLISHED_TROLLSTEINN_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.POLISHED_TROLLSTEINN_STAIRS.asItem().getDefaultInstance(), ModItems.POLISHED_TROLLSTEINN_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.POLISHED_TROLLSTEINN_SLAB.asItem().getDefaultInstance(), ModItems.POLISHED_TROLLSTEINN_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(ModItems.POLISHED_TROLLSTEINN_WALL.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_BRICKS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TROLLSTEINN_BRICKS.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_BRICK_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TROLLSTEINN_BRICK_STAIRS.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_BRICK_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TROLLSTEINN_BRICK_SLAB.asItem().getDefaultInstance(), ModItems.TROLLSTEINN_BRICK_WALL.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		event.insertAfter(ModItems.TROLLSTEINN_BRICK_WALL.asItem().getDefaultInstance(), ModItems.CHISELED_TROLLSTEINN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Towerwood blocks.
    		event.insertAfter(TFBlocks.TOWERWOOD.asItem().getDefaultInstance(), ModItems.TOWERWOOD_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_STAIRS.asItem().getDefaultInstance(), ModItems.TOWERWOOD_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_SLAB.asItem().getDefaultInstance(), ModItems.TOWERWOOD_FENCE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_FENCE.asItem().getDefaultInstance(), ModItems.TOWERWOOD_FENCE_GATE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_FENCE_GATE.asItem().getDefaultInstance(), ModItems.TOWERWOOD_DOOR.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_DOOR.asItem().getDefaultInstance(), ModItems.TOWERWOOD_TRAPDOOR.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_TRAPDOOR.asItem().getDefaultInstance(), ModItems.TOWERWOOD_PRESSURE_PLATE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_PRESSURE_PLATE.asItem().getDefaultInstance(), ModItems.TOWERWOOD_BUTTON.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_BUTTON.asItem().getDefaultInstance(), ModItems.TOWERWOOD_SIGN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_SIGN.asItem().getDefaultInstance(), ModItems.TOWERWOOD_HANGING_SIGN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.TOWERWOOD_HANGING_SIGN.asItem().getDefaultInstance(), ModItems.TOWERWOOD_BANISTER.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(TFBlocks.MOSSY_TOWERWOOD.asItem().getDefaultInstance(), ModItems.MOSSY_TOWERWOOD_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.MOSSY_TOWERWOOD_STAIRS.asItem().getDefaultInstance(), ModItems.MOSSY_TOWERWOOD_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Insert Thorn blocks.
    		event.insertAfter(TFBlocks.BURNT_THORNS.asItem().getDefaultInstance(), ModItems.STRIPPED_THORNS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.STRIPPED_THORNS.asItem().getDefaultInstance(), ModItems.STRIPPED_THORN_BLOCK.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.STRIPPED_THORN_BLOCK.asItem().getDefaultInstance(), ModItems.THORN_PLANKS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_PLANKS.asItem().getDefaultInstance(), ModItems.THORN_STAIRS.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_STAIRS.asItem().getDefaultInstance(), ModItems.THORN_SLAB.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_SLAB.asItem().getDefaultInstance(), ModItems.THORN_FENCE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_FENCE.asItem().getDefaultInstance(), ModItems.THORN_FENCE_GATE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_FENCE_GATE.asItem().getDefaultInstance(), ModItems.THORN_DOOR.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_DOOR.asItem().getDefaultInstance(), ModItems.THORN_TRAPDOOR.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_TRAPDOOR.asItem().getDefaultInstance(), ModItems.THORN_PRESSURE_PLATE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_PRESSURE_PLATE.asItem().getDefaultInstance(), ModItems.THORN_BUTTON.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_BUTTON.asItem().getDefaultInstance(), ModItems.THORN_SIGN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_SIGN.asItem().getDefaultInstance(), ModItems.THORN_HANGING_SIGN.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.THORN_HANGING_SIGN.asItem().getDefaultInstance(), ModItems.THORN_BANISTER.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    	}
    	if (event.getTabKey() == TFCreativeTabs.ITEMS.getKey()) {
    		event.insertBefore(TFItems.GOLDEN_MINOTAUR_AXE.get().getDefaultInstance(), ModItems.INCOMPLETE_THORNCUTTER_AXE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		event.insertAfter(ModItems.INCOMPLETE_THORNCUTTER_AXE.getDefaultInstance(), ModItems.THORNCUTTER_AXE.getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    	}
    }
}
