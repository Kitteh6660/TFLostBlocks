package com.kittehmod.tflostblocks.registry;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.items.ThorncutterAxeItem;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.CreativeModeTabRegistry;
import net.neoforged.neoforge.common.util.MutableHashedLinkedMap;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import twilightforest.TwilightForestMod;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFCreativeTabs;
import twilightforest.init.TFItems;

// @EventBusSubscriber(modid = TFLostBlocksMod.MOD_ID)
public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, TFLostBlocksMod.MOD_ID);

	public static final Item INCOMPLETE_THORNCUTTER_AXE = new AxeItem(Tiers.IRON, new Item.Properties().rarity(Rarity.RARE));
	public static final Item THORNCUTTER_AXE = new ThorncutterAxeItem(Tiers.DIAMOND, new Item.Properties().rarity(Rarity.EPIC));
	
	// Stone Tiles
	public static final Item STONE_TILES = new BlockItem(ModBlocks.STONE_TILES, new Item.Properties());
	public static final Item STONE_TILE_STAIRS = new BlockItem(ModBlocks.STONE_TILE_STAIRS, new Item.Properties());
	public static final Item STONE_TILE_SLAB = new BlockItem(ModBlocks.STONE_TILE_SLAB, new Item.Properties());
	public static final Item STONE_TILE_WALL = new BlockItem(ModBlocks.STONE_TILE_WALL, new Item.Properties());

	public static final Item MOSSY_STONE_TILES = new BlockItem(ModBlocks.MOSSY_STONE_TILES, new Item.Properties());
	public static final Item MOSSY_STONE_TILE_STAIRS = new BlockItem(ModBlocks.MOSSY_STONE_TILE_STAIRS, new Item.Properties());
	public static final Item MOSSY_STONE_TILE_SLAB = new BlockItem(ModBlocks.MOSSY_STONE_TILE_SLAB, new Item.Properties());
	public static final Item MOSSY_STONE_TILE_WALL = new BlockItem(ModBlocks.MOSSY_STONE_TILE_WALL, new Item.Properties());

	// Aurora Palace
	public static final Item AURORA_STAIRS = new BlockItem(ModBlocks.AURORA_STAIRS, new Item.Properties());
	public static final Item AURORA_WALL = new BlockItem(ModBlocks.AURORA_WALL, new Item.Properties());
	public static final Item AURORALIZED_GLASS_PANE = new BlockItem(ModBlocks.AURORALIZED_GLASS_PANE, new Item.Properties());

	// Final Castle
	public static final Item CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item CASTLE_BRICK_WALL = new BlockItem(ModBlocks.CASTLE_BRICK_WALL, new Item.Properties());

	public static final Item CASTLE_BRICK_TILES = new BlockItem(ModBlocks.CASTLE_BRICK_TILES, new Item.Properties());
	public static final Item CASTLE_BRICK_TILE_STAIRS = new BlockItem(ModBlocks.CASTLE_BRICK_TILE_STAIRS, new Item.Properties());
	public static final Item CASTLE_BRICK_TILE_SLAB = new BlockItem(ModBlocks.CASTLE_BRICK_TILE_SLAB, new Item.Properties());
	public static final Item CASTLE_BRICK_TILE_WALL = new BlockItem(ModBlocks.CASTLE_BRICK_TILE_WALL, new Item.Properties());

	public static final Item BOLD_CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item BOLD_CASTLE_BRICK_WALL = new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_WALL, new Item.Properties());

	public static final Item WORN_CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.WORN_CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item WORN_CASTLE_BRICK_WALL = new BlockItem(ModBlocks.WORN_CASTLE_BRICK_WALL, new Item.Properties());

	public static final Item CRACKED_CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.CRACKED_CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item CRACKED_CASTLE_BRICK_WALL = new BlockItem(ModBlocks.CRACKED_CASTLE_BRICK_WALL, new Item.Properties());

	public static final Item ENCASED_CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item ENCASED_CASTLE_BRICK_WALL = new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_WALL, new Item.Properties());
	
	public static final Item MOSSY_CASTLE_BRICK_SLAB = new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_SLAB, new Item.Properties());
	public static final Item MOSSY_CASTLE_BRICK_WALL = new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_WALL, new Item.Properties());

	// Deadrock
	public static final Item DEADROCK_STAIRS = new BlockItem(ModBlocks.DEADROCK_STAIRS, new Item.Properties());
	public static final Item DEADROCK_SLAB = new BlockItem(ModBlocks.DEADROCK_SLAB, new Item.Properties());

	public static final Item CRACKED_DEADROCK_STAIRS = new BlockItem(ModBlocks.CRACKED_DEADROCK_STAIRS, new Item.Properties());
	public static final Item CRACKED_DEADROCK_SLAB = new BlockItem(ModBlocks.CRACKED_DEADROCK_SLAB, new Item.Properties());
	
	public static final Item WEATHERED_DEADROCK_STAIRS = new BlockItem(ModBlocks.WEATHERED_DEADROCK_STAIRS, new Item.Properties());
	public static final Item WEATHERED_DEADROCK_SLAB = new BlockItem(ModBlocks.WEATHERED_DEADROCK_SLAB, new Item.Properties());

	public static final Item DEADROCK_BRICKS = new BlockItem(ModBlocks.DEADROCK_BRICKS, new Item.Properties());
	public static final Item DEADROCK_BRICK_STAIRS = new BlockItem(ModBlocks.DEADROCK_BRICK_STAIRS, new Item.Properties());
	public static final Item DEADROCK_BRICK_SLAB = new BlockItem(ModBlocks.DEADROCK_BRICK_SLAB, new Item.Properties());
	public static final Item DEADROCK_BRICK_WALL = new BlockItem(ModBlocks.DEADROCK_BRICK_WALL, new Item.Properties());
	
	// Minotaur Labyrinth
	public static final Item MAZESTONE_STAIRS = new BlockItem(ModBlocks.MAZESTONE_STAIRS, new Item.Properties());
	public static final Item MAZESTONE_SLAB = new BlockItem(ModBlocks.MAZESTONE_SLAB, new Item.Properties());
	public static final Item MAZESTONE_WALL = new BlockItem(ModBlocks.MAZESTONE_WALL, new Item.Properties());

	public static final Item CUT_MAZESTONE_STAIRS = new BlockItem(ModBlocks.CUT_MAZESTONE_STAIRS, new Item.Properties());
	public static final Item CUT_MAZESTONE_SLAB = new BlockItem(ModBlocks.CUT_MAZESTONE_SLAB, new Item.Properties());
	public static final Item CUT_MAZESTONE_WALL = new BlockItem(ModBlocks.CUT_MAZESTONE_WALL, new Item.Properties());
	
	public static final Item LARGE_MAZESTONE_BRICKS = new BlockItem(ModBlocks.LARGE_MAZESTONE_BRICKS, new Item.Properties());
	public static final Item LARGE_MAZESTONE_BRICK_STAIRS = new BlockItem(ModBlocks.LARGE_MAZESTONE_BRICK_STAIRS, new Item.Properties());
	public static final Item LARGE_MAZESTONE_BRICK_SLAB = new BlockItem(ModBlocks.LARGE_MAZESTONE_BRICK_SLAB, new Item.Properties());
	public static final Item LARGE_MAZESTONE_BRICK_WALL = new BlockItem(ModBlocks.LARGE_MAZESTONE_BRICK_WALL, new Item.Properties());

	public static final Item MAZESTONE_BRICK_STAIRS = new BlockItem(ModBlocks.MAZESTONE_BRICK_STAIRS, new Item.Properties());
	public static final Item MAZESTONE_BRICK_SLAB = new BlockItem(ModBlocks.MAZESTONE_BRICK_SLAB, new Item.Properties());
	public static final Item MAZESTONE_BRICK_WALL = new BlockItem(ModBlocks.MAZESTONE_BRICK_WALL, new Item.Properties());

	public static final Item MOSSY_MAZESTONE_BRICK_STAIRS = new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_STAIRS, new Item.Properties());
	public static final Item MOSSY_MAZESTONE_BRICK_SLAB = new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_SLAB, new Item.Properties());
	public static final Item MOSSY_MAZESTONE_BRICK_WALL = new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_WALL, new Item.Properties());
	
	// Naga Courtyard
	public static final Item NAGASTONE_SLAB_LEFT = new BlockItem(ModBlocks.NAGASTONE_SLAB_LEFT, new Item.Properties());
	public static final Item NAGASTONE_SLAB_RIGHT = new BlockItem(ModBlocks.NAGASTONE_SLAB_RIGHT, new Item.Properties());

	public static final Item CRACKED_NAGASTONE_SLAB_LEFT = new BlockItem(ModBlocks.CRACKED_NAGASTONE_SLAB_LEFT, new Item.Properties());
	public static final Item CRACKED_NAGASTONE_SLAB_RIGHT = new BlockItem(ModBlocks.CRACKED_NAGASTONE_SLAB_RIGHT, new Item.Properties());

	public static final Item MOSSY_NAGASTONE_SLAB_LEFT = new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_LEFT, new Item.Properties());
	public static final Item MOSSY_NAGASTONE_SLAB_RIGHT = new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_RIGHT, new Item.Properties());
	
	// Dark Tower
	public static final Item TOWERWOOD_STAIRS = new BlockItem(ModBlocks.TOWERWOOD_STAIRS, new Item.Properties());
	public static final Item TOWERWOOD_SLAB = new BlockItem(ModBlocks.TOWERWOOD_SLAB, new Item.Properties());
	public static final Item TOWERWOOD_FENCE = new BlockItem(ModBlocks.TOWERWOOD_FENCE, new Item.Properties());
	public static final Item TOWERWOOD_FENCE_GATE = new BlockItem(ModBlocks.TOWERWOOD_FENCE_GATE, new Item.Properties());
	public static final Item TOWERWOOD_DOOR = new BlockItem(ModBlocks.TOWERWOOD_DOOR, new Item.Properties());
	public static final Item TOWERWOOD_TRAPDOOR = new BlockItem(ModBlocks.TOWERWOOD_TRAPDOOR, new Item.Properties());
	public static final Item TOWERWOOD_BUTTON = new BlockItem(ModBlocks.TOWERWOOD_BUTTON, new Item.Properties());
	public static final Item TOWERWOOD_PRESSURE_PLATE = new BlockItem(ModBlocks.TOWERWOOD_PRESSURE_PLATE, new Item.Properties());
	public static final Item TOWERWOOD_SIGN = new SignItem(new Item.Properties(), ModBlocks.TOWERWOOD_SIGN, ModBlocks.TOWERWOOD_WALL_SIGN);
	public static final Item TOWERWOOD_HANGING_SIGN = new HangingSignItem(ModBlocks.TOWERWOOD_HANGING_SIGN, ModBlocks.TOWERWOOD_WALL_HANGING_SIGN, new Item.Properties());
	public static final Item TOWERWOOD_BANISTER = new BlockItem(ModBlocks.TOWERWOOD_BANISTER, new Item.Properties());

	public static final Item MOSSY_TOWERWOOD_SLAB = new BlockItem(ModBlocks.MOSSY_TOWERWOOD_SLAB, new Item.Properties());
	public static final Item MOSSY_TOWERWOOD_STAIRS = new BlockItem(ModBlocks.MOSSY_TOWERWOOD_STAIRS, new Item.Properties());

	// Thorn Wood
	public static final Item STRIPPED_THORNS = new BlockItem(ModBlocks.STRIPPED_THORNS, new Item.Properties());
	public static final Item STRIPPED_THORN_BLOCK = new BlockItem(ModBlocks.STRIPPED_THORN_BLOCK, new Item.Properties());
	
	public static final Item THORN_PLANKS = new BlockItem(ModBlocks.THORN_PLANKS, new Item.Properties());
	public static final Item THORN_STAIRS = new BlockItem(ModBlocks.THORN_STAIRS, new Item.Properties());
	public static final Item THORN_SLAB = new BlockItem(ModBlocks.THORN_SLAB, new Item.Properties());
	public static final Item THORN_FENCE = new BlockItem(ModBlocks.THORN_FENCE, new Item.Properties());
	public static final Item THORN_FENCE_GATE = new BlockItem(ModBlocks.THORN_FENCE_GATE, new Item.Properties());
	public static final Item THORN_DOOR = new BlockItem(ModBlocks.THORN_DOOR, new Item.Properties());
	public static final Item THORN_TRAPDOOR = new BlockItem(ModBlocks.THORN_TRAPDOOR, new Item.Properties());
	public static final Item THORN_BUTTON = new BlockItem(ModBlocks.THORN_BUTTON, new Item.Properties());
	public static final Item THORN_PRESSURE_PLATE = new BlockItem(ModBlocks.THORN_PRESSURE_PLATE, new Item.Properties());
	public static final Item THORN_SIGN = new SignItem(new Item.Properties(), ModBlocks.THORN_SIGN, ModBlocks.THORN_WALL_SIGN);
	public static final Item THORN_HANGING_SIGN = new HangingSignItem(ModBlocks.THORN_HANGING_SIGN, ModBlocks.THORN_WALL_HANGING_SIGN, new Item.Properties());
	public static final Item THORN_BANISTER = new BlockItem(ModBlocks.THORN_BANISTER, new Item.Properties());
	
	// Goblin Knight Stronghold
	public static final Item UNDERBRICK_STAIRS = new BlockItem(ModBlocks.UNDERBRICK_STAIRS, new Item.Properties());
	public static final Item UNDERBRICK_SLAB = new BlockItem(ModBlocks.UNDERBRICK_SLAB, new Item.Properties());
	public static final Item UNDERBRICK_WALL = new BlockItem(ModBlocks.UNDERBRICK_WALL, new Item.Properties());

	public static final Item CRACKED_UNDERBRICK_STAIRS = new BlockItem(ModBlocks.CRACKED_UNDERBRICK_STAIRS, new Item.Properties());
	public static final Item CRACKED_UNDERBRICK_SLAB = new BlockItem(ModBlocks.CRACKED_UNDERBRICK_SLAB, new Item.Properties());
	public static final Item CRACKED_UNDERBRICK_WALL = new BlockItem(ModBlocks.CRACKED_UNDERBRICK_WALL, new Item.Properties());

	public static final Item MOSSY_UNDERBRICK_STAIRS = new BlockItem(ModBlocks.MOSSY_UNDERBRICK_STAIRS, new Item.Properties());
	public static final Item MOSSY_UNDERBRICK_SLAB = new BlockItem(ModBlocks.MOSSY_UNDERBRICK_SLAB, new Item.Properties());
	public static final Item MOSSY_UNDERBRICK_WALL = new BlockItem(ModBlocks.MOSSY_UNDERBRICK_WALL, new Item.Properties());

	// Trollsteinn
	public static final Item TROLLSTEINN_STAIRS = new BlockItem(ModBlocks.TROLLSTEINN_STAIRS, new Item.Properties());
	public static final Item TROLLSTEINN_SLAB = new BlockItem(ModBlocks.TROLLSTEINN_SLAB, new Item.Properties());
	public static final Item TROLLSTEINN_WALL = new BlockItem(ModBlocks.TROLLSTEINN_WALL, new Item.Properties());

	public static final Item POLISHED_TROLLSTEINN = new BlockItem(ModBlocks.POLISHED_TROLLSTEINN, new Item.Properties());
	public static final Item POLISHED_TROLLSTEINN_STAIRS = new BlockItem(ModBlocks.POLISHED_TROLLSTEINN_STAIRS, new Item.Properties());
	public static final Item POLISHED_TROLLSTEINN_SLAB = new BlockItem(ModBlocks.POLISHED_TROLLSTEINN_SLAB, new Item.Properties());
	public static final Item POLISHED_TROLLSTEINN_WALL = new BlockItem(ModBlocks.POLISHED_TROLLSTEINN_WALL, new Item.Properties());

	public static final Item TROLLSTEINN_BRICKS = new BlockItem(ModBlocks.TROLLSTEINN_BRICKS, new Item.Properties());
	public static final Item TROLLSTEINN_BRICK_STAIRS = new BlockItem(ModBlocks.TROLLSTEINN_BRICK_STAIRS, new Item.Properties());
	public static final Item TROLLSTEINN_BRICK_SLAB = new BlockItem(ModBlocks.TROLLSTEINN_BRICK_SLAB, new Item.Properties());
	public static final Item TROLLSTEINN_BRICK_WALL = new BlockItem(ModBlocks.TROLLSTEINN_BRICK_WALL, new Item.Properties());

	public static final Item CHISELED_TROLLSTEINN = new BlockItem(ModBlocks.CHISELED_TROLLSTEINN, new Item.Properties());
    
}
