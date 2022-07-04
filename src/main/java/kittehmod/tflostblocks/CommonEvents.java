package kittehmod.tflostblocks;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import twilightforest.item.MazebreakerPickItem;

public class CommonEvents
{
	// A workaround for making custom Mazestone blocks break faster with Mazebreaker.
	@SubscribeEvent
	public void modifyDestroySpeed(BreakSpeed event) {
		if (event.getEntityLiving() instanceof Player && event.getEntityLiving().getMainHandItem().getItem() instanceof MazebreakerPickItem && event.getState().is(TFLostBlocksTags.MAZESTONES)) {
			DiggerItem item = (DiggerItem) event.getEntityLiving().getMainHandItem().getItem();
			float spd = item.getDestroySpeed(event.getEntityLiving().getMainHandItem(), event.getState());
			event.setNewSpeed(spd * 16F);
		}
	}
}
