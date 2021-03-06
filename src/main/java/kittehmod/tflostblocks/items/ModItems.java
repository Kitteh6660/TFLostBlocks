package kittehmod.tflostblocks.items;

import kittehmod.tflostblocks.TFLostBlocksMod;
import kittehmod.tflostblocks.blocks.ModBlocks;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TFLostBlocksMod.MOD_ID);

	// Aurora Palace
	public static final RegistryObject<Item> AURORA_STAIRS = ITEMS.register("aurora_stairs", () -> new BlockItem(ModBlocks.AURORA_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> AURORA_WALL = ITEMS.register("aurora_wall", () -> new BlockItem(ModBlocks.AURORA_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> AURORALIZED_GLASS_PANE = ITEMS.register("auroralized_glass_pane", () -> new BlockItem(ModBlocks.AURORALIZED_GLASS_PANE.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	// Final Castle
	public static final RegistryObject<Item> CASTLE_BRICK_SLAB = ITEMS.register("castle_brick_slab", () -> new BlockItem(ModBlocks.CASTLE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> CASTLE_BRICK_WALL = ITEMS.register("castle_brick_wall", () -> new BlockItem(ModBlocks.CASTLE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> BOLD_CASTLE_BRICK_SLAB = ITEMS.register("bold_castle_brick_slab", () -> new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> BOLD_CASTLE_BRICK_WALL = ITEMS.register("bold_castle_brick_wall", () -> new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> ENCASED_CASTLE_BRICK_SLAB = ITEMS.register("encased_castle_brick_slab", () -> new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> ENCASED_CASTLE_BRICK_WALL = ITEMS.register("encased_castle_brick_wall", () -> new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	public static final RegistryObject<Item> MOSSY_CASTLE_BRICK_SLAB = ITEMS.register("mossy_castle_brick_slab", () -> new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_CASTLE_BRICK_WALL = ITEMS.register("mossy_castle_brick_wall", () -> new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	// Deadrock
	public static final RegistryObject<Item> DEADROCK_STAIRS = ITEMS.register("deadrock_stairs", () -> new BlockItem(ModBlocks.DEADROCK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> DEADROCK_SLAB = ITEMS.register("deadrock_slab", () -> new BlockItem(ModBlocks.DEADROCK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> CRACKED_DEADROCK_STAIRS = ITEMS.register("cracked_deadrock_stairs", () -> new BlockItem(ModBlocks.CRACKED_DEADROCK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> CRACKED_DEADROCK_SLAB = ITEMS.register("cracked_deadrock_slab", () -> new BlockItem(ModBlocks.CRACKED_DEADROCK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	public static final RegistryObject<Item> WEATHERED_DEADROCK_STAIRS = ITEMS.register("weathered_deadrock_stairs", () -> new BlockItem(ModBlocks.WEATHERED_DEADROCK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> WEATHERED_DEADROCK_SLAB = ITEMS.register("weathered_deadrock_slab", () -> new BlockItem(ModBlocks.WEATHERED_DEADROCK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	// Minotaur Labyrinth
	public static final RegistryObject<Item> MAZESTONE_STAIRS = ITEMS.register("mazestone_stairs", () -> new BlockItem(ModBlocks.MAZESTONE_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MAZESTONE_SLAB = ITEMS.register("mazestone_slab", () -> new BlockItem(ModBlocks.MAZESTONE_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MAZESTONE_WALL = ITEMS.register("mazestone_wall", () -> new BlockItem(ModBlocks.MAZESTONE_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> CUT_MAZESTONE_STAIRS = ITEMS.register("cut_mazestone_stairs", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> CUT_MAZESTONE_SLAB = ITEMS.register("cut_mazestone_slab", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> CUT_MAZESTONE_WALL = ITEMS.register("cut_mazestone_wall", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	public static final RegistryObject<Item> MAZESTONE_BRICK_STAIRS = ITEMS.register("mazestone_brick_stairs", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MAZESTONE_BRICK_SLAB = ITEMS.register("mazestone_brick_slab", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MAZESTONE_BRICK_WALL = ITEMS.register("mazestone_brick_wall", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_STAIRS = ITEMS.register("mossy_mazestone_brick_stairs", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_SLAB = ITEMS.register("mossy_mazestone_brick_slab", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_WALL = ITEMS.register("mossy_mazestone_brick_wall", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	// Naga Courtyard
	public static final RegistryObject<Item> NAGASTONE_SLAB_LEFT = ITEMS.register("nagastone_slab_left", () -> new BlockItem(ModBlocks.NAGASTONE_SLAB_LEFT.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> NAGASTONE_SLAB_RIGHT = ITEMS.register("nagastone_slab_right", () -> new BlockItem(ModBlocks.NAGASTONE_SLAB_RIGHT.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	public static final RegistryObject<Item> MOSSY_NAGASTONE_SLAB_LEFT = ITEMS.register("mossy_nagastone_slab_left", () -> new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_LEFT.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_NAGASTONE_SLAB_RIGHT = ITEMS.register("mossy_nagastone_slab_right", () -> new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_RIGHT.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	
	// Dark Tower
	public static final RegistryObject<Item> TOWERWOOD_STAIRS = ITEMS.register("towerwood_stairs", () -> new BlockItem(ModBlocks.TOWERWOOD_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_SLAB = ITEMS.register("towerwood_slab", () -> new BlockItem(ModBlocks.TOWERWOOD_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_FENCE = ITEMS.register("towerwood_fence", () -> new BlockItem(ModBlocks.TOWERWOOD_FENCE.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_FENCE_GATE = ITEMS.register("towerwood_fence_gate", () -> new BlockItem(ModBlocks.TOWERWOOD_FENCE_GATE.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_DOOR = ITEMS.register("towerwood_door", () -> new BlockItem(ModBlocks.TOWERWOOD_DOOR.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_TRAPDOOR = ITEMS.register("towerwood_trapdoor", () -> new BlockItem(ModBlocks.TOWERWOOD_TRAPDOOR.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_BUTTON = ITEMS.register("towerwood_button", () -> new BlockItem(ModBlocks.TOWERWOOD_BUTTON.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_PRESSURE_PLATE = ITEMS.register("towerwood_pressure_plate", () -> new BlockItem(ModBlocks.TOWERWOOD_PRESSURE_PLATE.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> TOWERWOOD_SIGN = ITEMS.register("towerwood_sign", () -> new SignItem(new Item.Properties().tab(getTabWithMatchingName("twilightforest")), ModBlocks.TOWERWOOD_SIGN.get(), ModBlocks.TOWERWOOD_WALL_SIGN.get()));
	public static final RegistryObject<Item> TOWERWOOD_BANISTER = ITEMS.register("towerwood_banister", () -> new BlockItem(ModBlocks.TOWERWOOD_BANISTER.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> MOSSY_TOWERWOOD_SLAB = ITEMS.register("mossy_towerwood_slab", () -> new BlockItem(ModBlocks.MOSSY_TOWERWOOD_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_TOWERWOOD_STAIRS = ITEMS.register("mossy_towerwood_stairs", () -> new BlockItem(ModBlocks.MOSSY_TOWERWOOD_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	// Goblin Knight Stronghold
	public static final RegistryObject<Item> UNDERBRICK_STAIRS = ITEMS.register("underbrick_stairs", () -> new BlockItem(ModBlocks.UNDERBRICK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> UNDERBRICK_SLAB = ITEMS.register("underbrick_slab", () -> new BlockItem(ModBlocks.UNDERBRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> UNDERBRICK_WALL = ITEMS.register("underbrick_wall", () -> new BlockItem(ModBlocks.UNDERBRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	public static final RegistryObject<Item> MOSSY_UNDERBRICK_STAIRS = ITEMS.register("mossy_underbrick_stairs", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_STAIRS.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_UNDERBRICK_SLAB = ITEMS.register("mossy_underbrick_slab", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_SLAB.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));
	public static final RegistryObject<Item> MOSSY_UNDERBRICK_WALL = ITEMS.register("mossy_underbrick_wall", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_WALL.get(), new Item.Properties().tab(getTabWithMatchingName("twilightforest"))));

	
	private static CreativeModeTab getTabWithMatchingName(String tabName) {
    	CreativeModeTab tab = null;
    	if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) { // Check to make sure the code doesn't advance on server to prevent crashes.
    		return null;
    	}
    	for (CreativeModeTab tempTab : CreativeModeTab.TABS) {
    		if (tempTab.getDisplayName() instanceof TranslatableComponent) { // Check if it's the correct class to avoid crashes.
	    		TranslatableComponent tabComp = (TranslatableComponent) tempTab.getDisplayName();
	    		if (tabComp.getKey().equalsIgnoreCase("itemGroup." + tabName)) {
	    			tab = tempTab;
	    			break;
	    		}
    		}
    	}
    	return tab;
    }
}
