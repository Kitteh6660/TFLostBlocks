package com.kittehmod.tflostblocks.blocks;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TrollsteinnStairBlock extends StairsBlock
{
	private static final BooleanProperty LIT = TFLostBlocksProperties.LIT;

	private static final int LIGHT_THRESHOLD = 7;
	
	public TrollsteinnStairBlock(Supplier<BlockState> state, Properties properties) {
		super(state, properties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(LIT, false));
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(LIT);
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
		BlockState newState = state;
		newState = newState.setValue(LIT, level.getMaxLocalRawBrightness(pos) > LIGHT_THRESHOLD);
		if (!newState.equals(state)) level.setBlockAndUpdate(pos, newState);
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState state, World level, BlockPos pos) {
		int peak = 0;
		for (Direction direction : Direction.values())
			peak = Math.max(level.getMaxLocalRawBrightness(pos.relative(direction)), peak);
		return peak;
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx) {
		BlockState ret = super.getStateForPlacement(ctx);
		int light = ctx.getLevel().getMaxLocalRawBrightness(ctx.getClickedPos());
		ret = ret.setValue(LIT, light > LIGHT_THRESHOLD);
		return ret;
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState state, World level, BlockPos pos, Random rand) {
		if (rand.nextInt(2) == 0) this.sparkle(level, pos);
	}
	
	private void sparkle(World level, BlockPos pos) {
		Random random = level.getRandom();
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
				level.addParticle(new RedstoneParticleData(0.0F, random.nextFloat(), 1.0F, 1.0F), rx, ry, rz, 0.25D, -1.0D, 0.5D);
			}
		}
	}
}
