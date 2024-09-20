package com.kittehmod.tflostblocks.registry;

import com.kittehmod.tflostblocks.blocks.MazestoneSlabBlock;
import com.kittehmod.tflostblocks.blocks.MazestoneStairBlock;
import com.kittehmod.tflostblocks.blocks.MazestoneWallBlock;
import com.kittehmod.tflostblocks.blocks.ModCeilingHangingSignBlock;
import com.kittehmod.tflostblocks.blocks.ModStandingSignBlock;
import com.kittehmod.tflostblocks.blocks.ModWallHangingSignBlock;
import com.kittehmod.tflostblocks.blocks.ModWallSignBlock;
import com.kittehmod.tflostblocks.blocks.ModWoodType;
import com.kittehmod.tflostblocks.blocks.StrippedThornsBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnSlabBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnStairBlock;
import com.kittehmod.tflostblocks.blocks.TrollsteinnWallBlock;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import twilightforest.block.BanisterBlock;
import twilightforest.block.TrollsteinnBlock;
import twilightforest.init.TFBlocks;

// @EventBusSubscriber(modid = TFLostBlocksMod.MOD_ID)
public class ModBlocks
{
	public static final Block STONE_TILES = new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS));
	public static final Block STONE_TILE_STAIRS = new StairBlock(Blocks.STONE_BRICKS.defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICKS));
	public static final Block STONE_TILE_SLAB = new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICKS));
	public static final Block STONE_TILE_WALL = new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICKS));

	public static final Block MOSSY_STONE_TILES = new Block(Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS));
	public static final Block MOSSY_STONE_TILE_STAIRS = new StairBlock(Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS));
	public static final Block MOSSY_STONE_TILE_SLAB = new SlabBlock(Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS));
	public static final Block MOSSY_STONE_TILE_WALL = new WallBlock(Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS));

	public static final Block AURORA_STAIRS = new StairBlock(TFBlocks.AURORA_BLOCK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.AURORA_BLOCK.get()));
	public static final Block AURORA_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.AURORA_BLOCK.get()));
	public static final Block AURORALIZED_GLASS_PANE = new IronBarsBlock(Properties.ofFullCopy(TFBlocks.AURORALIZED_GLASS.get()));

	public static final Block CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));

	public static final Block CASTLE_BRICK_TILES = new Block(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block CASTLE_BRICK_TILE_STAIRS = new StairBlock(TFBlocks.CASTLE_BRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block CASTLE_BRICK_TILE_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block CASTLE_BRICK_TILE_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));

	public static final Block BOLD_CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.BOLD_CASTLE_BRICK_TILE.get()));
	public static final Block BOLD_CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.BOLD_CASTLE_BRICK_TILE.get()));

	public static final Block ENCASED_CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.ENCASED_CASTLE_BRICK_TILE.get()));
	public static final Block ENCASED_CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.ENCASED_CASTLE_BRICK_TILE.get()));

	public static final Block WORN_CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block WORN_CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));

	public static final Block CRACKED_CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block CRACKED_CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));

	public static final Block MOSSY_CASTLE_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));
	public static final Block MOSSY_CASTLE_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CASTLE_BRICK.get()));

	public static final Block DEADROCK_STAIRS = new StairBlock(TFBlocks.DEADROCK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.DEADROCK.get()));
	public static final Block DEADROCK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.DEADROCK.get()));

	public static final Block CRACKED_DEADROCK_STAIRS = new StairBlock(TFBlocks.CRACKED_DEADROCK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.CRACKED_DEADROCK.get()));
	public static final Block CRACKED_DEADROCK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CRACKED_DEADROCK.get()));

	public static final Block WEATHERED_DEADROCK_STAIRS = new StairBlock(TFBlocks.WEATHERED_DEADROCK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.WEATHERED_DEADROCK.get()));
	public static final Block WEATHERED_DEADROCK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.WEATHERED_DEADROCK.get()));

	public static final Block DEADROCK_BRICKS = new Block(Properties.ofFullCopy(TFBlocks.DEADROCK.get()));
	public static final Block DEADROCK_BRICK_STAIRS = new StairBlock(TFBlocks.DEADROCK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.DEADROCK.get()));
	public static final Block DEADROCK_BRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.DEADROCK.get()));
	public static final Block DEADROCK_BRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.DEADROCK.get()));
	
	public static final Block NAGASTONE_SLAB_LEFT = new SlabBlock(Properties.ofFullCopy(TFBlocks.ETCHED_NAGASTONE.get()));
	public static final Block NAGASTONE_SLAB_RIGHT = new SlabBlock(Properties.ofFullCopy(TFBlocks.ETCHED_NAGASTONE.get()));

	public static final Block CRACKED_NAGASTONE_SLAB_LEFT = new SlabBlock(Properties.ofFullCopy(TFBlocks.CRACKED_ETCHED_NAGASTONE.get()));
	public static final Block CRACKED_NAGASTONE_SLAB_RIGHT = new SlabBlock(Properties.ofFullCopy(TFBlocks.CRACKED_ETCHED_NAGASTONE.get()));

	public static final Block MOSSY_NAGASTONE_SLAB_LEFT = new SlabBlock(Properties.ofFullCopy(TFBlocks.MOSSY_ETCHED_NAGASTONE.get()));
	public static final Block MOSSY_NAGASTONE_SLAB_RIGHT = new SlabBlock(Properties.ofFullCopy(TFBlocks.MOSSY_ETCHED_NAGASTONE.get()));

	public static final Block MAZESTONE_STAIRS = new MazestoneStairBlock(TFBlocks.MAZESTONE.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MAZESTONE.get()));
	public static final Block MAZESTONE_SLAB = new MazestoneSlabBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE.get()));
	public static final Block MAZESTONE_WALL = new MazestoneWallBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE.get()));

	public static final Block CUT_MAZESTONE_STAIRS = new MazestoneStairBlock(TFBlocks.CUT_MAZESTONE.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.CUT_MAZESTONE.get()));
	public static final Block CUT_MAZESTONE_SLAB = new MazestoneSlabBlock(Properties.ofFullCopy(TFBlocks.CUT_MAZESTONE.get()));
	public static final Block CUT_MAZESTONE_WALL = new MazestoneWallBlock(Properties.ofFullCopy(TFBlocks.CUT_MAZESTONE.get()));
	
	public static final Block LARGE_MAZESTONE_BRICKS = new Block(Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));
	public static final Block LARGE_MAZESTONE_BRICK_STAIRS = new MazestoneStairBlock(TFBlocks.MAZESTONE_BRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));
	public static final Block LARGE_MAZESTONE_BRICK_SLAB = new MazestoneSlabBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));
	public static final Block LARGE_MAZESTONE_BRICK_WALL = new MazestoneWallBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));

	public static final Block MAZESTONE_BRICK_STAIRS = new MazestoneStairBlock(TFBlocks.MAZESTONE_BRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));
	public static final Block MAZESTONE_BRICK_SLAB = new MazestoneSlabBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));
	public static final Block MAZESTONE_BRICK_WALL = new MazestoneWallBlock(Properties.ofFullCopy(TFBlocks.MAZESTONE_BRICK.get()));

	public static final Block MOSSY_MAZESTONE_BRICK_STAIRS = new MazestoneStairBlock(TFBlocks.MOSSY_MAZESTONE.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MOSSY_MAZESTONE.get()));
	public static final Block MOSSY_MAZESTONE_BRICK_SLAB = new MazestoneSlabBlock(Properties.ofFullCopy(TFBlocks.MOSSY_MAZESTONE.get()));
	public static final Block MOSSY_MAZESTONE_BRICK_WALL = new MazestoneWallBlock(Properties.ofFullCopy(TFBlocks.MOSSY_MAZESTONE.get()));

	public static final Block TOWERWOOD_STAIRS = new StairBlock(TFBlocks.TOWERWOOD.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));
	public static final Block TOWERWOOD_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));
	public static final Block TOWERWOOD_FENCE = new FenceBlock(Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));
	public static final Block TOWERWOOD_FENCE_GATE = new FenceGateBlock(Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
	public static final Block TOWERWOOD_DOOR = new DoorBlock(ModWoodType.TOWERWOOD_SET, Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));
	public static final Block TOWERWOOD_TRAPDOOR = new TrapDoorBlock(ModWoodType.TOWERWOOD_SET, Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));
	public static final Block TOWERWOOD_BUTTON = new ButtonBlock(ModWoodType.TOWERWOOD_SET, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD));
	public static final Block TOWERWOOD_PRESSURE_PLATE = new PressurePlateBlock(ModWoodType.TOWERWOOD_SET, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD));
	public static final Block TOWERWOOD_SIGN = new ModStandingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE);
	public static final Block TOWERWOOD_WALL_SIGN = new ModWallSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE);
	public static final Block TOWERWOOD_HANGING_SIGN = new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE);
	public static final Block TOWERWOOD_WALL_HANGING_SIGN = new ModWallHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE);
	public static final Block TOWERWOOD_BANISTER = new BanisterBlock(Properties.ofFullCopy(TFBlocks.TOWERWOOD.get()));

	public static final Block MOSSY_TOWERWOOD_STAIRS = new StairBlock(TFBlocks.MOSSY_TOWERWOOD.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MOSSY_TOWERWOOD.get()));
	public static final Block MOSSY_TOWERWOOD_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.MOSSY_TOWERWOOD.get()));
	
	public static final Block STRIPPED_THORNS = new StrippedThornsBlock(Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).pushReaction(PushReaction.BLOCK).sound(SoundType.WOOD).strength(50.0F, 2000.0F));
	public static final Block STRIPPED_THORN_BLOCK = new RotatedPillarBlock(Properties.ofFullCopy(STRIPPED_THORNS).pushReaction(PushReaction.NORMAL));
	public static final Block THORN_PLANKS = new Block(Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	public static final Block THORN_STAIRS = new StairBlock(STRIPPED_THORN_BLOCK.defaultBlockState(), Properties.ofFullCopy(TFBlocks.BROWN_THORNS.get()));
	public static final Block THORN_SLAB = new SlabBlock(Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	public static final Block THORN_FENCE = new FenceBlock(Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	public static final Block THORN_FENCE_GATE = new FenceGateBlock(Properties.ofFullCopy(STRIPPED_THORN_BLOCK), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
	public static final Block THORN_DOOR = new DoorBlock(ModWoodType.THORN_SET, Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	public static final Block THORN_TRAPDOOR = new TrapDoorBlock(ModWoodType.THORN_SET, Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	public static final Block THORN_BUTTON = new ButtonBlock(ModWoodType.THORN_SET, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD));
	public static final Block THORN_PRESSURE_PLATE = new PressurePlateBlock(ModWoodType.THORN_SET, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD));
	public static final Block THORN_SIGN = new ModStandingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN_WOOD_TYPE);
	public static final Block THORN_WALL_SIGN = new ModWallSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN_WOOD_TYPE);
	public static final Block THORN_HANGING_SIGN = new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN_WOOD_TYPE);
	public static final Block THORN_WALL_HANGING_SIGN = new ModWallHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F, 2000.0F).sound(SoundType.WOOD), ModWoodType.THORN_WOOD_TYPE);
	public static final Block THORN_BANISTER = new BanisterBlock(Properties.ofFullCopy(STRIPPED_THORN_BLOCK));
	
	public static final Block UNDERBRICK_STAIRS = new StairBlock(TFBlocks.UNDERBRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.UNDERBRICK.get()));
	public static final Block UNDERBRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.UNDERBRICK.get()));
	public static final Block UNDERBRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.UNDERBRICK.get()));

	public static final Block CRACKED_UNDERBRICK_STAIRS = new StairBlock(TFBlocks.CRACKED_UNDERBRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MOSSY_UNDERBRICK.get()));
	public static final Block CRACKED_UNDERBRICK_SLAB = new SlabBlock(Properties.ofFullCopy(TFBlocks.CRACKED_UNDERBRICK.get()));
	public static final Block CRACKED_UNDERBRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.CRACKED_UNDERBRICK.get()));

	public static final Block MOSSY_UNDERBRICK_STAIRS = new StairBlock(TFBlocks.MOSSY_UNDERBRICK.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.MOSSY_UNDERBRICK.get()));
	public static final Block MOSSY_UNDERBRICK_SLAB =  new SlabBlock(Properties.ofFullCopy(TFBlocks.MOSSY_UNDERBRICK.get()));
	public static final Block MOSSY_UNDERBRICK_WALL = new WallBlock(Properties.ofFullCopy(TFBlocks.MOSSY_UNDERBRICK.get()));

	public static final Block TROLLSTEINN_STAIRS = new TrollsteinnStairBlock(TFBlocks.TROLLSTEINN.get().defaultBlockState(), Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_SLAB = new TrollsteinnSlabBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_WALL = new TrollsteinnWallBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block POLISHED_TROLLSTEINN = new TrollsteinnBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block POLISHED_TROLLSTEINN_STAIRS = new TrollsteinnStairBlock(POLISHED_TROLLSTEINN.defaultBlockState(), Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block POLISHED_TROLLSTEINN_SLAB = new TrollsteinnSlabBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block POLISHED_TROLLSTEINN_WALL = new TrollsteinnWallBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_BRICKS = new TrollsteinnBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_BRICK_STAIRS = new TrollsteinnStairBlock(TROLLSTEINN_BRICKS.defaultBlockState(), Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_BRICK_SLAB = new TrollsteinnSlabBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block TROLLSTEINN_BRICK_WALL = new TrollsteinnWallBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
	public static final Block CHISELED_TROLLSTEINN = new TrollsteinnBlock(Properties.ofFullCopy(TFBlocks.TROLLSTEINN.get()));
}
