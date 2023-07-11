package kittehmod.tflostblocks.blocks;

import kittehmod.tflostblocks.TFLostBlocksMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.block.BanisterBlock;
import twilightforest.init.TFBlocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TFLostBlocksMod.MOD_ID);
	
	public static final RegistryObject<Block> AURORA_STAIRS = BLOCKS.register("aurora_stairs", () -> new StairBlock(() -> TFBlocks.AURORA_BLOCK.get().defaultBlockState() , Properties.copy(TFBlocks.AURORA_BLOCK.get())));
	public static final RegistryObject<Block> AURORA_WALL = BLOCKS.register("aurora_wall", () -> new WallBlock(Properties.copy(TFBlocks.AURORA_BLOCK.get())));
	public static final RegistryObject<Block> AURORALIZED_GLASS_PANE = BLOCKS.register("auroralized_glass_pane", () -> new IronBarsBlock(Properties.copy(TFBlocks.AURORALIZED_GLASS.get())));

	public static final RegistryObject<Block> CASTLE_BRICK_SLAB = BLOCKS.register("castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));
	public static final RegistryObject<Block> CASTLE_BRICK_WALL = BLOCKS.register("castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));

	public static final RegistryObject<Block> BOLD_CASTLE_BRICK_SLAB = BLOCKS.register("bold_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.BOLD_CASTLE_BRICK_TILE.get())));
	public static final RegistryObject<Block> BOLD_CASTLE_BRICK_WALL = BLOCKS.register("bold_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.BOLD_CASTLE_BRICK_TILE.get())));

	public static final RegistryObject<Block> ENCASED_CASTLE_BRICK_SLAB = BLOCKS.register("encased_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.ENCASED_CASTLE_BRICK_TILE.get())));
	public static final RegistryObject<Block> ENCASED_CASTLE_BRICK_WALL = BLOCKS.register("encased_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.ENCASED_CASTLE_BRICK_TILE.get())));

	public static final RegistryObject<Block> WORN_CASTLE_BRICK_SLAB = BLOCKS.register("worn_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));
	public static final RegistryObject<Block> WORN_CASTLE_BRICK_WALL = BLOCKS.register("worn_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));

	public static final RegistryObject<Block> CRACKED_CASTLE_BRICK_SLAB = BLOCKS.register("cracked_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));
	public static final RegistryObject<Block> CRACKED_CASTLE_BRICK_WALL = BLOCKS.register("cracked_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));

	public static final RegistryObject<Block> MOSSY_CASTLE_BRICK_SLAB = BLOCKS.register("mossy_castle_brick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));
	public static final RegistryObject<Block> MOSSY_CASTLE_BRICK_WALL = BLOCKS.register("mossy_castle_brick_wall", () -> new WallBlock(Properties.copy(TFBlocks.CASTLE_BRICK.get())));

	public static final RegistryObject<Block> DEADROCK_STAIRS = BLOCKS.register("deadrock_stairs", () -> new StairBlock(() -> TFBlocks.DEADROCK.get().defaultBlockState() , Properties.copy(TFBlocks.DEADROCK.get())));
	public static final RegistryObject<Block> DEADROCK_SLAB = BLOCKS.register("deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.DEADROCK.get())));

	public static final RegistryObject<Block> CRACKED_DEADROCK_STAIRS = BLOCKS.register("cracked_deadrock_stairs", () -> new StairBlock(() -> TFBlocks.CRACKED_DEADROCK.get().defaultBlockState() , Properties.copy(TFBlocks.CRACKED_DEADROCK.get())));
	public static final RegistryObject<Block> CRACKED_DEADROCK_SLAB = BLOCKS.register("cracked_deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CRACKED_DEADROCK.get())));

	public static final RegistryObject<Block> WEATHERED_DEADROCK_STAIRS = BLOCKS.register("weathered_deadrock_stairs", () -> new StairBlock(() -> TFBlocks.WEATHERED_DEADROCK.get().defaultBlockState() , Properties.copy(TFBlocks.WEATHERED_DEADROCK.get())));
	public static final RegistryObject<Block> WEATHERED_DEADROCK_SLAB = BLOCKS.register("weathered_deadrock_slab", () -> new SlabBlock(Properties.copy(TFBlocks.WEATHERED_DEADROCK.get())));

	public static final RegistryObject<Block> NAGASTONE_SLAB_LEFT = BLOCKS.register("nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.ETCHED_NAGASTONE.get())));
	public static final RegistryObject<Block> NAGASTONE_SLAB_RIGHT = BLOCKS.register("nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.ETCHED_NAGASTONE.get())));

	public static final RegistryObject<Block> CRACKED_NAGASTONE_SLAB_LEFT = BLOCKS.register("cracked_nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.CRACKED_ETCHED_NAGASTONE.get())));
	public static final RegistryObject<Block> CRACKED_NAGASTONE_SLAB_RIGHT = BLOCKS.register("cracked_nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.CRACKED_ETCHED_NAGASTONE.get())));

	public static final RegistryObject<Block> MOSSY_NAGASTONE_SLAB_LEFT = BLOCKS.register("mossy_nagastone_slab_left", () -> new SlabBlock(Properties.copy(TFBlocks.MOSSY_ETCHED_NAGASTONE.get())));
	public static final RegistryObject<Block> MOSSY_NAGASTONE_SLAB_RIGHT = BLOCKS.register("mossy_nagastone_slab_right", () -> new SlabBlock(Properties.copy(TFBlocks.MOSSY_ETCHED_NAGASTONE.get())));

	public static final RegistryObject<Block> MAZESTONE_STAIRS = BLOCKS.register("mazestone_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.MAZESTONE.get().defaultBlockState() , Properties.copy(TFBlocks.MAZESTONE.get())));
	public static final RegistryObject<Block> MAZESTONE_SLAB = BLOCKS.register("mazestone_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.MAZESTONE.get())));
	public static final RegistryObject<Block> MAZESTONE_WALL = BLOCKS.register("mazestone_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.MAZESTONE.get())));

	public static final RegistryObject<Block> CUT_MAZESTONE_STAIRS = BLOCKS.register("cut_mazestone_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.CUT_MAZESTONE.get().defaultBlockState() , Properties.copy(TFBlocks.CUT_MAZESTONE.get())));
	public static final RegistryObject<Block> CUT_MAZESTONE_SLAB = BLOCKS.register("cut_mazestone_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.CUT_MAZESTONE.get())));
	public static final RegistryObject<Block> CUT_MAZESTONE_WALL = BLOCKS.register("cut_mazestone_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.CUT_MAZESTONE.get())));
	
	public static final RegistryObject<Block> MAZESTONE_BRICK_STAIRS = BLOCKS.register("mazestone_brick_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.MAZESTONE_BRICK.get().defaultBlockState() , Properties.copy(TFBlocks.MAZESTONE_BRICK.get())));
	public static final RegistryObject<Block> MAZESTONE_BRICK_SLAB = BLOCKS.register("mazestone_brick_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.MAZESTONE_BRICK.get())));
	public static final RegistryObject<Block> MAZESTONE_BRICK_WALL = BLOCKS.register("mazestone_brick_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.MAZESTONE_BRICK.get())));

	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_STAIRS = BLOCKS.register("mossy_mazestone_brick_stairs", () -> new MazestoneStairBlock(() -> TFBlocks.MOSSY_MAZESTONE.get().defaultBlockState() , Properties.copy(TFBlocks.MOSSY_MAZESTONE.get())));
	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_SLAB = BLOCKS.register("mossy_mazestone_brick_slab", () -> new MazestoneSlabBlock(Properties.copy(TFBlocks.MOSSY_MAZESTONE.get())));
	public static final RegistryObject<Block> MOSSY_MAZESTONE_BRICK_WALL = BLOCKS.register("mossy_mazestone_brick_wall", () -> new MazestoneWallBlock(Properties.copy(TFBlocks.MOSSY_MAZESTONE.get())));

	public static final RegistryObject<Block> TOWERWOOD_STAIRS = BLOCKS.register("towerwood_stairs", () -> new StairBlock(() -> TFBlocks.TOWERWOOD.get().defaultBlockState() , Properties.copy(TFBlocks.TOWERWOOD.get())));
	public static final RegistryObject<Block> TOWERWOOD_SLAB = BLOCKS.register("towerwood_slab", () -> new SlabBlock(Properties.copy(TFBlocks.TOWERWOOD.get())));
	public static final RegistryObject<Block> TOWERWOOD_FENCE = BLOCKS.register("towerwood_fence", () -> new FenceBlock(Properties.copy(TFBlocks.TOWERWOOD.get())));
	public static final RegistryObject<Block> TOWERWOOD_FENCE_GATE = BLOCKS.register("towerwood_fence_gate", () -> new FenceGateBlock(Properties.copy(TFBlocks.TOWERWOOD.get()), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
	public static final RegistryObject<Block> TOWERWOOD_DOOR = BLOCKS.register("towerwood_door", () -> new DoorBlock(Properties.copy(TFBlocks.TOWERWOOD.get()), ModWoodType.TOWERWOOD_SET));
	public static final RegistryObject<Block> TOWERWOOD_TRAPDOOR = BLOCKS.register("towerwood_trapdoor", () -> new TrapDoorBlock(Properties.copy(TFBlocks.TOWERWOOD.get()), ModWoodType.TOWERWOOD_SET));
	public static final RegistryObject<Block> TOWERWOOD_BUTTON = BLOCKS.register("towerwood_button", () -> new ButtonBlock(BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_SET, 30, true));
	public static final RegistryObject<Block> TOWERWOOD_PRESSURE_PLATE = BLOCKS.register("towerwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().noCollission().strength(0.5F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_SET));
	public static final RegistryObject<Block> TOWERWOOD_SIGN = BLOCKS.register("towerwood_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE));
	public static final RegistryObject<Block> TOWERWOOD_WALL_SIGN = BLOCKS.register("towerwood_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE));
	public static final RegistryObject<Block> TOWERWOOD_HANGING_SIGN = BLOCKS.register("towerwood_hanging_sign", () -> new ModCeilingHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE));
	public static final RegistryObject<Block> TOWERWOOD_WALL_HANGING_SIGN = BLOCKS.register("towerwood_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.of().noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.TOWERWOOD_WOOD_TYPE));
	public static final RegistryObject<Block> TOWERWOOD_BANISTER = BLOCKS.register("towerwood_banister", () -> new BanisterBlock(Properties.copy(TFBlocks.TOWERWOOD.get())));

	public static final RegistryObject<Block> MOSSY_TOWERWOOD_STAIRS = BLOCKS.register("mossy_towerwood_stairs", () -> new StairBlock(() -> TFBlocks.MOSSY_TOWERWOOD.get().defaultBlockState() , Properties.copy(TFBlocks.MOSSY_TOWERWOOD.get())));
	public static final RegistryObject<Block> MOSSY_TOWERWOOD_SLAB = BLOCKS.register("mossy_towerwood_slab", () -> new SlabBlock(Properties.copy(TFBlocks.MOSSY_TOWERWOOD.get())));
	
	public static final RegistryObject<Block> UNDERBRICK_STAIRS = BLOCKS.register("underbrick_stairs", () -> new StairBlock(() -> TFBlocks.UNDERBRICK.get().defaultBlockState() , Properties.copy(TFBlocks.UNDERBRICK.get())));
	public static final RegistryObject<Block> UNDERBRICK_SLAB = BLOCKS.register("underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.UNDERBRICK.get())));
	public static final RegistryObject<Block> UNDERBRICK_WALL = BLOCKS.register("underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.UNDERBRICK.get())));

	public static final RegistryObject<Block> CRACKED_UNDERBRICK_STAIRS = BLOCKS.register("cracked_underbrick_stairs", () -> new StairBlock(() -> TFBlocks.CRACKED_UNDERBRICK.get().defaultBlockState() , Properties.copy(TFBlocks.MOSSY_UNDERBRICK.get())));
	public static final RegistryObject<Block> CRACKED_UNDERBRICK_SLAB = BLOCKS.register("cracked_underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.CRACKED_UNDERBRICK.get())));
	public static final RegistryObject<Block> CRACKED_UNDERBRICK_WALL = BLOCKS.register("cracked_underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.CRACKED_UNDERBRICK.get())));

	public static final RegistryObject<Block> MOSSY_UNDERBRICK_STAIRS = BLOCKS.register("mossy_underbrick_stairs", () -> new StairBlock(() -> TFBlocks.MOSSY_UNDERBRICK.get().defaultBlockState() , Properties.copy(TFBlocks.MOSSY_UNDERBRICK.get())));
	public static final RegistryObject<Block> MOSSY_UNDERBRICK_SLAB = BLOCKS.register("mossy_underbrick_slab", () -> new SlabBlock(Properties.copy(TFBlocks.MOSSY_UNDERBRICK.get())));
	public static final RegistryObject<Block> MOSSY_UNDERBRICK_WALL = BLOCKS.register("mossy_underbrick_wall", () -> new WallBlock(Properties.copy(TFBlocks.MOSSY_UNDERBRICK.get())));

}
