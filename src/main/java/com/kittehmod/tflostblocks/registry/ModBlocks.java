package com.kittehmod.tflostblocks.registry;

import com.kittehmod.tflostblocks.TFLostBlocksMod;
import com.kittehmod.tflostblocks.blocks.MazestoneSlabBlock;
import com.kittehmod.tflostblocks.blocks.MazestoneStairBlock;
import com.kittehmod.tflostblocks.blocks.MazestoneWallBlock;
import com.kittehmod.tflostblocks.blocks.ModStandingSignBlock;
import com.kittehmod.tflostblocks.blocks.ModWallSignBlock;
import com.kittehmod.tflostblocks.blocks.ModWoodType;
import com.kittehmod.tflostblocks.blocks.StrippedThornsBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnSlabBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnStairBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnWallBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import twilightforest.block.MazestoneBlock;
import twilightforest.block.TFBlocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TFLostBlocksMod.MOD_ID);
	
	public static final RegistryObject<Block> STONE_TILES = BLOCKS.register("stone_tiles", () -> new Block(Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> STONE_TILE_STAIRS = BLOCKS.register("stone_tile_stairs", () -> new StairsBlock(() -> Blocks.STONE_BRICKS.defaultBlockState(), Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> STONE_TILE_SLAB = BLOCKS.register("stone_tile_slab", () -> new SlabBlock(Properties.copy(Blocks.STONE_BRICKS)));
	public static final RegistryObject<Block> STONE_TILE_WALL = BLOCKS.register("stone_tile_wall", () -> new WallBlock(Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> MOSSY_STONE_TILES = BLOCKS.register("mossy_stone_tiles", () -> new Block(Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> MOSSY_STONE_TILE_STAIRS = BLOCKS.register("mossy_stone_tile_stairs", () -> new StairsBlock(() -> Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> MOSSY_STONE_TILE_SLAB = BLOCKS.register("mossy_stone_tile_slab", () -> new SlabBlock(Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
	public static final RegistryObject<Block> MOSSY_STONE_TILE_WALL = BLOCKS.register("mossy_stone_tile_wall", () -> new WallBlock(Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

	public static final RegistryObject<Block> AURORA_STAIRS = BLOCKS.register("aurora_stairs", () -> new StairsBlock(() -> TFBlocks.aurora_block.get().defaultBlockState(), Properties.copy(TFBlocks.aurora_block.get())));
	public static final RegistryObject<Block> AURORA_WALL = BLOCKS.register("aurora_wall", () -> new WallBlock(Properties.copy(TFBlocks.aurora_block.get())));
	public static final RegistryObject<Block> AURORALIZED_GLASS_PANE = BLOCKS.register("auroralized_glass_pane", () -> new PaneBlock(Properties.copy(TFBlocks.auroralized_glass.get())));

	public static final RegistryObject<Block> CASTLE_BRICK_SLAB = BLOCKS.register("castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_brick.get())));
	public static final RegistryObject<Block> CASTLE_BRICK_WALL = BLOCKS.register("castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_brick.get())));

	public static final RegistryObject<Block> CASTLE_BRICK_TILES = BLOCKS.register("castle_brick_tiles", () -> new Block(Properties.copy(TFBlocks.castle_brick.get())));
	public static final RegistryObject<Block> CASTLE_BRICK_TILE_STAIRS = BLOCKS.register("castle_brick_tile_stairs", () -> new StairsBlock(() -> TFBlocks.castle_brick.get().defaultBlockState(), Properties.copy(TFBlocks.castle_brick.get())));
	public static final RegistryObject<Block> CASTLE_BRICK_TILE_SLAB = BLOCKS.register("castle_brick_tile_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_brick.get())));
	public static final RegistryObject<Block> CASTLE_BRICK_TILE_WALL = BLOCKS.register("castle_brick_tile_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_brick.get())));

	public static final RegistryObject<Block> BOLD_CASTLE_BRICK_SLAB = BLOCKS.register("bold_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_pillar_bold_tile.get())));
	public static final RegistryObject<Block> BOLD_CASTLE_BRICK_WALL = BLOCKS.register("bold_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_pillar_bold_tile.get())));

	public static final RegistryObject<Block> ENCASED_CASTLE_BRICK_SLAB = BLOCKS.register("encased_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_pillar_encased_tile.get())));
	public static final RegistryObject<Block> ENCASED_CASTLE_BRICK_WALL = BLOCKS.register("encased_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_pillar_encased_tile.get())));

	public static final RegistryObject<Block> WORN_CASTLE_BRICK_SLAB = BLOCKS.register("worn_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_brick_worn.get())));
	public static final RegistryObject<Block> WORN_CASTLE_BRICK_WALL = BLOCKS.register("worn_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_brick_worn.get())));

	public static final RegistryObject<Block> CRACKED_CASTLE_BRICK_SLAB = BLOCKS.register("cracked_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_brick_cracked.get())));
	public static final RegistryObject<Block> CRACKED_CASTLE_BRICK_WALL = BLOCKS.register("cracked_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_brick_cracked.get())));
	
	public static final RegistryObject<Block> MOSSY_CASTLE_BRICK_SLAB = BLOCKS.register("mossy_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.castle_brick_mossy.get())));
	public static final RegistryObject<Block> MOSSY_CASTLE_BRICK_WALL = BLOCKS.register("mossy_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.castle_brick_mossy.get())));

	public static final RegistryObject<Block> DEADROCK_STAIRS = BLOCKS.register("deadrock_stairs", () -> new StairsBlock(() -> TFBlocks.deadrock.get().defaultBlockState(), Properties.copy(TFBlocks.deadrock.get())));
	public static final RegistryObject<Block> DEADROCK_SLAB = BLOCKS.register("deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.deadrock.get())));

	public static final RegistryObject<Block> CRACKED_DEADROCK_STAIRS = BLOCKS.register("cracked_deadrock_stairs", () -> new StairsBlock(() -> TFBlocks.deadrock_cracked.get().defaultBlockState(), Properties.copy(TFBlocks.deadrock_cracked.get())));
	public static final RegistryObject<Block> CRACKED_DEADROCK_SLAB = BLOCKS.register("cracked_deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.deadrock_cracked.get())));

	public static final RegistryObject<Block> WEATHERED_DEADROCK_STAIRS = BLOCKS.register("weathered_deadrock_stairs", () -> new StairsBlock(() -> TFBlocks.deadrock_weathered.get().defaultBlockState(), Properties.copy(TFBlocks.deadrock_weathered.get())));
	public static final RegistryObject<Block> WEATHERED_DEADROCK_SLAB = BLOCKS.register("weathered_deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.deadrock_weathered.get())));

	public static final RegistryObject<Block> NAGASTONE_SLAB_LEFT = BLOCKS.register("nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone.get())));
	public static final RegistryObject<Block> NAGASTONE_SLAB_RIGHT = BLOCKS.register("nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone.get())));

	public static final RegistryObject<Block> CRACKED_NAGASTONE_SLAB_LEFT = BLOCKS.register("cracked_nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone_weathered.get())));
	public static final RegistryObject<Block> CRACKED_NAGASTONE_SLAB_RIGHT = BLOCKS.register("cracked_nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone_weathered.get())));
	
	public static final RegistryObject<Block> MOSSY_NAGASTONE_SLAB_LEFT = BLOCKS.register("mossy_nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone_weathered.get())));
	public static final RegistryObject<Block> MOSSY_NAGASTONE_SLAB_RIGHT = BLOCKS.register("mossy_nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.etched_nagastone_weathered.get())));

	public static final RegistryObject<Block> MAZESTONE_STAIRS = BLOCKS.register("mazestone_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.maze_stone.get().defaultBlockState(), Properties.copy(TFBlocks.maze_stone.get())));
	public static final RegistryObject<Block> MAZESTONE_SLAB = BLOCKS.register("mazestone_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.maze_stone.get())));
	public static final RegistryObject<Block> MAZESTONE_WALL = BLOCKS.register("mazestone_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.maze_stone.get())));

	public static final RegistryObject<Block> CUT_MAZESTONE_STAIRS = BLOCKS.register("cut_mazestone_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.maze_stone_chiseled.get().defaultBlockState(), Properties.copy(TFBlocks.maze_stone_chiseled.get())));
	public static final RegistryObject<Block> CUT_MAZESTONE_SLAB = BLOCKS.register("cut_mazestone_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.maze_stone_chiseled.get())));
	public static final RegistryObject<Block> CUT_MAZESTONE_WALL = BLOCKS.register("cut_mazestone_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.maze_stone_chiseled.get())));

	public static final RegistryObject<Block> LARGE_MAZESTONE_BRICKS = BLOCKS.register("large_mazestone_bricks", () -> new MazestoneBlock(Properties.copy(TFBlocks.maze_stone.get())));
	public static final RegistryObject<Block> LARGE_MAZESTONE_BRICK_STAIRS = BLOCKS.register("large_mazestone_brick_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.maze_stone.get().defaultBlockState(), Properties.copy(TFBlocks.maze_stone.get())));
	public static final RegistryObject<Block> LARGE_MAZESTONE_BRICK_SLAB = BLOCKS.register("large_mazestone_brick_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.maze_stone.get())));
	public static final RegistryObject<Block> LARGE_MAZESTONE_BRICK_WALL = BLOCKS.register("large_mazestone_brick_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.maze_stone.get())));

	public static final RegistryObject<Block> MAZESTONE_BRICK_STAIRS = BLOCKS.register("mazestone_brick_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.maze_stone_brick.get().defaultBlockState(), Properties.copy(TFBlocks.maze_stone_brick.get())));
	public static final RegistryObject<Block> MAZESTONE_BRICK_SLAB = BLOCKS.register("mazestone_brick_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.maze_stone_brick.get())));
	public static final RegistryObject<Block> MAZESTONE_BRICK_WALL = BLOCKS.register("mazestone_brick_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.maze_stone_brick.get())));

	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_STAIRS = BLOCKS.register("mossy_mazestone_brick_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.maze_stone_mossy.get().defaultBlockState(), Properties.copy(TFBlocks.maze_stone_mossy.get())));
	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_SLAB = BLOCKS.register("mossy_mazestone_brick_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.maze_stone_mossy.get())));
	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_WALL = BLOCKS.register("mossy_mazestone_brick_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.maze_stone_mossy.get())));

	public static final RegistryObject<Block> TOWERWOOD_STAIRS = BLOCKS.register("towerwood_stairs", () -> new StairsBlock(() -> TFBlocks.tower_wood.get().defaultBlockState(), Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_SLAB = BLOCKS.register("towerwood_slab", () -> new SlabBlock(Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_FENCE = BLOCKS.register("towerwood_fence", () -> new FenceBlock(Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_FENCE_GATE = BLOCKS.register("towerwood_fence_gate", () -> new FenceGateBlock(Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_DOOR = BLOCKS.register("towerwood_door", () -> new DoorBlock(Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_TRAPDOOR = BLOCKS.register("towerwood_trapdoor", () -> new TrapDoorBlock(Properties.copy(TFBlocks.tower_wood.get())));
	public static final RegistryObject<Block> TOWERWOOD_BUTTON = BLOCKS.register("towerwood_button", () -> new WoodButtonBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TOWERWOOD_PRESSURE_PLATE = BLOCKS.register("towerwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TOWERWOOD_SIGN = BLOCKS.register("towerwood_sign", () -> new ModStandingSignBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD));
	public static final RegistryObject<Block> TOWERWOOD_WALL_SIGN = BLOCKS.register("towerwood_wall_sign", () -> new ModWallSignBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD));
	//public static final RegistryObject<Block> TOWERWOOD_BANISTER = BLOCKS.register("towerwood_banister", () -> new BanisterBlock(Properties.copy(TFBlocks.tower_wood.get()))); // Disabled as banisters are not in 1.16.5.

	public static final RegistryObject<Block> MOSSY_TOWERWOOD_STAIRS = BLOCKS.register("mossy_towerwood_stairs", () -> new StairsBlock(() -> TFBlocks.tower_wood_mossy.get().defaultBlockState(), Properties.copy(TFBlocks.tower_wood_mossy.get())));
	public static final RegistryObject<Block> MOSSY_TOWERWOOD_SLAB = BLOCKS.register("mossy_towerwood_slab", () -> new SlabBlock(Properties.copy(TFBlocks.tower_wood_mossy.get())));
	
	public static final RegistryObject<Block> STRIPPED_THORNS = BLOCKS.register("stripped_thorns", () -> new StrippedThornsBlock(Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).sound(SoundType.WOOD).strength(50.0F, 2000.0F)));
	public static final RegistryObject<Block> STRIPPED_THORN_BLOCK = BLOCKS.register("stripped_thorn_block", () -> new RotatedPillarBlock(Properties.copy(STRIPPED_THORNS.get())));
	public static final RegistryObject<Block> THORN_PLANKS = BLOCKS.register("thorn_planks", () -> new Block(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_STAIRS = BLOCKS.register("thorn_stairs", () -> new StairsBlock(() -> STRIPPED_THORN_BLOCK.get().defaultBlockState(), Properties.copy(STRIPPED_THORNS.get())));
	public static final RegistryObject<Block> THORN_SLAB = BLOCKS.register("thorn_slab", () -> new SlabBlock(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_FENCE = BLOCKS.register("thorn_fence", () -> new FenceBlock(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_FENCE_GATE = BLOCKS.register("thorn_fence_gate", () -> new FenceGateBlock(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_DOOR = BLOCKS.register("thorn_door", () -> new DoorBlock(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_TRAPDOOR = BLOCKS.register("thorn_trapdoor", () -> new TrapDoorBlock(Properties.copy(STRIPPED_THORN_BLOCK.get())));
	public static final RegistryObject<Block> THORN_BUTTON = BLOCKS.register("thorn_button", () -> new WoodButtonBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> THORN_PRESSURE_PLATE = BLOCKS.register("thorn_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> THORN_SIGN = BLOCKS.register("thorn_sign", () -> new ModStandingSignBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN));
	public static final RegistryObject<Block> THORN_WALL_SIGN = BLOCKS.register("thorn_wall_sign", () -> new ModWallSignBlock(AbstractBlock.Properties.of(Material.WOOD).noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN));
	//public static final RegistryObject<Block> THORN_BANISTER = BLOCKS.register("thorn_banister", () -> new BanisterBlock(Properties.copy(STRIPPED_THORN_BLOCK.get()))); // Disabled as banisters are not in 1.16.5.
	
	public static final RegistryObject<Block> UNDERBRICK_STAIRS = BLOCKS.register("underbrick_stairs", () -> new StairsBlock(() -> TFBlocks.underbrick.get().defaultBlockState(), Properties.copy(TFBlocks.underbrick.get())));
	public static final RegistryObject<Block> UNDERBRICK_SLAB = BLOCKS.register("underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.underbrick.get())));
	public static final RegistryObject<Block> UNDERBRICK_WALL = BLOCKS.register("underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.underbrick.get())));

	public static final RegistryObject<Block> CRACKED_UNDERBRICK_STAIRS = BLOCKS.register("cracked_underbrick_stairs", () -> new StairsBlock(() -> TFBlocks.underbrick_cracked.get().defaultBlockState(), Properties.copy(TFBlocks.underbrick_cracked.get())));
	public static final RegistryObject<Block> CRACKED_UNDERBRICK_SLAB = BLOCKS.register("cracked_underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.underbrick_cracked.get())));
	public static final RegistryObject<Block> CRACKED_UNDERBRICK_WALL = BLOCKS.register("cracked_underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.underbrick_cracked.get())));
	
	public static final RegistryObject<Block> MOSSY_UNDERBRICK_STAIRS = BLOCKS.register("mossy_underbrick_stairs", () -> new StairsBlock(() -> TFBlocks.underbrick_mossy.get().defaultBlockState(), Properties.copy(TFBlocks.underbrick_mossy.get())));
	public static final RegistryObject<Block> MOSSY_UNDERBRICK_SLAB = BLOCKS.register("mossy_underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.underbrick_mossy.get())));
	public static final RegistryObject<Block> MOSSY_UNDERBRICK_WALL = BLOCKS.register("mossy_underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.underbrick_mossy.get())));
	
	public static final RegistryObject<Block> TROLLSTEINN_STAIRS = BLOCKS.register("trollsteinn_stairs", () -> new TrollsteinnStairBlock(() -> TFBlocks.trollsteinn.get().defaultBlockState(), Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_SLAB = BLOCKS.register("trollsteinn_slab", () -> new TrollsteinnSlabBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_WALL = BLOCKS.register("trollsteinn_wall", () -> new TrollsteinnWallBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	/*public static final RegistryObject<Block> POLISHED_TROLLSTEINN = BLOCKS.register("polished_trollsteinn", () -> new Block(Properties.copy(TFBlocks.trollsteinn.get()))); // Disabled as the constructor isn't public.
	public static final RegistryObject<Block> POLISHED_TROLLSTEINN_STAIRS = BLOCKS.register("polished_trollsteinn_stairs", () -> new TrollsteinnStairBlock(() -> POLISHED_TROLLSTEINN.get().defaultBlockState(), Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> POLISHED_TROLLSTEINN_SLAB = BLOCKS.register("polished_trollsteinn_slab", () -> new TrollsteinnSlabBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> POLISHED_TROLLSTEINN_WALL = BLOCKS.register("polished_trollsteinn_wall", () -> new TrollsteinnWallBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_BRICKS = BLOCKS.register("trollsteinn_bricks", () -> new Block(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_BRICK_STAIRS = BLOCKS.register("trollsteinn_brick_stairs", () -> new TrollsteinnStairBlock(() -> TROLLSTEINN_BRICKS.get().defaultBlockState(), Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_BRICK_SLAB = BLOCKS.register("trollsteinn_brick_slab", () -> new TrollsteinnSlabBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> TROLLSTEINN_BRICK_WALL = BLOCKS.register("trollsteinn_brick_wall", () -> new TrollsteinnWallBlock(Properties.copy(TFBlocks.trollsteinn.get())));
	public static final RegistryObject<Block> CHISELED_TROLLSTEINN = BLOCKS.register("chiseled_trollsteinn", () -> new Block(Properties.copy(TFBlocks.trollsteinn.get())));*/
}
