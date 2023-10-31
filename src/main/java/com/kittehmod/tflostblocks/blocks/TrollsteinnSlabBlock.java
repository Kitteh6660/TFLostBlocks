package com.kittehmod.tflostblocks.blocks;

import com.mojang.math.Vector3f;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TrollsteinnSlabBlock extends SlabBlock
{
	private static final BooleanProperty LIT = TFLostBlocksProperties.LIT;
	
	private static final int LIGHT_THRESHOLD = 7;
	
	public TrollsteinnSlabBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(LIT, false));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(LIT);
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource rand) {
		if (rand.nextInt(2) == 0) this.sparkle(level, pos);
	}
	
	@Override
	public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		BlockState newState = state;
		
		if (newState.getValue(TYPE) == SlabType.DOUBLE) {
			newState = newState.setValue(LIT, getBrightestSurroundingLightLevel(level, pos) > LIGHT_THRESHOLD);
		}
		else {
			newState = newState.setValue(LIT, level.getMaxLocalRawBrightness(pos) > LIGHT_THRESHOLD);
		}
		if (!newState.equals(state)) level.setBlockAndUpdate(pos, newState);
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
		int peak = 0;
		for (Direction direction : Direction.values())
			peak = Math.max(level.getMaxLocalRawBrightness(pos.relative(direction)), peak);
		return peak;
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		BlockState ret = super.getStateForPlacement(ctx);
		int light = ctx.getLevel().getMaxLocalRawBrightness(ctx.getClickedPos());
		ret = ret.setValue(LIT, light > LIGHT_THRESHOLD);
		return ret;
	}
	
	private int getBrightestSurroundingLightLevel(Level level, BlockPos pos) {
		int brightest = 0;
		for (Direction direction : Direction.values()) {
			if (level.getMaxLocalRawBrightness(pos.relative(direction)) > brightest) {
				brightest = level.getMaxLocalRawBrightness(pos.relative(direction));
			}
		}
		return brightest;
	}
	
	private void sparkle(Level level, BlockPos pos) {
		RandomSource random = level.getRandom();
		int threshold = LIGHT_THRESHOLD;

		for (Direction side : Direction.values()) {
			double rx = pos.getX() + random.nextFloat();
			double ry = pos.getY() + random.nextFloat();
			double rz = pos.getZ() + random.nextFloat();

			if (side == Direction.DOWN && !level.getBlockState(pos.below()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.below()) <= threshold) {
				ry = pos.getY() - 0.0625D;
			}

			if (side == Direction.UP && !level.getBlockState(pos.above()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.above()) <= threshold) {
				ry = pos.getY() + 0.0625D + 1.0D;
			}

			if (side == Direction.NORTH && !level.getBlockState(pos.north()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.north()) <= threshold) {
				rz = pos.getZ() - 0.0625D;
			}

			if (side == Direction.SOUTH && !level.getBlockState(pos.south()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.south()) <= threshold) {
				rz = pos.getZ() + 0.0625D + 1.0D;
			}

			if (side == Direction.WEST && !level.getBlockState(pos.west()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.west()) <= threshold) {
				rx = pos.getX() - 0.0625D;
			}

			if (side == Direction.EAST && !level.getBlockState(pos.east()).isSolidRender(level, pos) && level.getMaxLocalRawBrightness(pos.east()) <= threshold) {
				rx = pos.getX() + 0.0625D + 1.0D;
			}

			if (rx < pos.getX() || rx > pos.getX() + 1 || ry < 0.0D || ry > pos.getY() + 1 || rz < pos.getZ() || rz > pos.getZ() + 1) {
				level.addParticle(new DustParticleOptions(new Vector3f(0.5F, 0.0F, 0.5F), 1.0F), rx, ry, rz, 0.25D, -1.0D, 0.5D);
			}
		}
	}
}
