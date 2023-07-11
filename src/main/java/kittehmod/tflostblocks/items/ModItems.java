package kittehmod.tflostblocks.items;

import kittehmod.tflostblocks.TFLostBlocksMod;
import kittehmod.tflostblocks.blocks.ModBlocks;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.HangingSignItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.init.TFBlocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TFLostBlocksMod.MOD_ID);

	// Aurora Palace
	public static final RegistryObject<Item> AURORA_STAIRS = ITEMS.register("aurora_stairs", () -> new BlockItem(ModBlocks.AURORA_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> AURORA_WALL = ITEMS.register("aurora_wall", () -> new BlockItem(ModBlocks.AURORA_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> AURORALIZED_GLASS_PANE = ITEMS.register("auroralized_glass_pane", () -> new BlockItem(ModBlocks.AURORALIZED_GLASS_PANE.get(), new Item.Properties()));

	// Final Castle
	public static final RegistryObject<Item> CASTLE_BRICK_SLAB = ITEMS.register("castle_brick_slab", () -> new BlockItem(ModBlocks.CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> CASTLE_BRICK_WALL = ITEMS.register("castle_brick_wall", () -> new BlockItem(ModBlocks.CASTLE_BRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> BOLD_CASTLE_BRICK_SLAB = ITEMS.register("bold_castle_brick_slab", () -> new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOLD_CASTLE_BRICK_WALL = ITEMS.register("bold_castle_brick_wall", () -> new BlockItem(ModBlocks.BOLD_CASTLE_BRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> WORN_CASTLE_BRICK_SLAB = ITEMS.register("worn_castle_brick_slab", () -> new BlockItem(ModBlocks.WORN_CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> WORN_CASTLE_BRICK_WALL = ITEMS.register("worn_castle_brick_wall", () -> new BlockItem(ModBlocks.WORN_CASTLE_BRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> CRACKED_CASTLE_BRICK_SLAB = ITEMS.register("cracked_castle_brick_slab", () -> new BlockItem(ModBlocks.CRACKED_CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRACKED_CASTLE_BRICK_WALL = ITEMS.register("cracked_castle_brick_wall", () -> new BlockItem(ModBlocks.CRACKED_CASTLE_BRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> ENCASED_CASTLE_BRICK_SLAB = ITEMS.register("encased_castle_brick_slab", () -> new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> ENCASED_CASTLE_BRICK_WALL = ITEMS.register("encased_castle_brick_wall", () -> new BlockItem(ModBlocks.ENCASED_CASTLE_BRICK_WALL.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> MOSSY_CASTLE_BRICK_SLAB = ITEMS.register("mossy_castle_brick_slab", () -> new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_CASTLE_BRICK_WALL = ITEMS.register("mossy_castle_brick_wall", () -> new BlockItem(ModBlocks.MOSSY_CASTLE_BRICK_WALL.get(), new Item.Properties()));

	// Deadrock
	public static final RegistryObject<Item> DEADROCK_STAIRS = ITEMS.register("deadrock_stairs", () -> new BlockItem(ModBlocks.DEADROCK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEADROCK_SLAB = ITEMS.register("deadrock_slab", () -> new BlockItem(ModBlocks.DEADROCK_SLAB.get(), new Item.Properties()));

	public static final RegistryObject<Item> CRACKED_DEADROCK_STAIRS = ITEMS.register("cracked_deadrock_stairs", () -> new BlockItem(ModBlocks.CRACKED_DEADROCK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRACKED_DEADROCK_SLAB = ITEMS.register("cracked_deadrock_slab", () -> new BlockItem(ModBlocks.CRACKED_DEADROCK_SLAB.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> WEATHERED_DEADROCK_STAIRS = ITEMS.register("weathered_deadrock_stairs", () -> new BlockItem(ModBlocks.WEATHERED_DEADROCK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> WEATHERED_DEADROCK_SLAB = ITEMS.register("weathered_deadrock_slab", () -> new BlockItem(ModBlocks.WEATHERED_DEADROCK_SLAB.get(), new Item.Properties()));

	// Minotaur Labyrinth
	public static final RegistryObject<Item> MAZESTONE_STAIRS = ITEMS.register("mazestone_stairs", () -> new BlockItem(ModBlocks.MAZESTONE_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> MAZESTONE_SLAB = ITEMS.register("mazestone_slab", () -> new BlockItem(ModBlocks.MAZESTONE_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MAZESTONE_WALL = ITEMS.register("mazestone_wall", () -> new BlockItem(ModBlocks.MAZESTONE_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> CUT_MAZESTONE_STAIRS = ITEMS.register("cut_mazestone_stairs", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> CUT_MAZESTONE_SLAB = ITEMS.register("cut_mazestone_slab", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> CUT_MAZESTONE_WALL = ITEMS.register("cut_mazestone_wall", () -> new BlockItem(ModBlocks.CUT_MAZESTONE_WALL.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> MAZESTONE_BRICK_STAIRS = ITEMS.register("mazestone_brick_stairs", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> MAZESTONE_BRICK_SLAB = ITEMS.register("mazestone_brick_slab", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MAZESTONE_BRICK_WALL = ITEMS.register("mazestone_brick_wall", () -> new BlockItem(ModBlocks.MAZESTONE_BRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_STAIRS = ITEMS.register("mossy_mazestone_brick_stairs", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_SLAB = ITEMS.register("mossy_mazestone_brick_slab", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_MAZESTONE_BRICK_WALL = ITEMS.register("mossy_mazestone_brick_wall", () -> new BlockItem(ModBlocks.MOSSY_MAZESTONE_BRICK_WALL.get(), new Item.Properties()));
	
	// Naga Courtyard
	public static final RegistryObject<Item> NAGASTONE_SLAB_LEFT = ITEMS.register("nagastone_slab_left", () -> new BlockItem(ModBlocks.NAGASTONE_SLAB_LEFT.get(), new Item.Properties()));
	public static final RegistryObject<Item> NAGASTONE_SLAB_RIGHT = ITEMS.register("nagastone_slab_right", () -> new BlockItem(ModBlocks.NAGASTONE_SLAB_RIGHT.get(), new Item.Properties()));

	public static final RegistryObject<Item> CRACKED_NAGASTONE_SLAB_LEFT = ITEMS.register("cracked_nagastone_slab_left", () -> new BlockItem(ModBlocks.CRACKED_NAGASTONE_SLAB_LEFT.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRACKED_NAGASTONE_SLAB_RIGHT = ITEMS.register("cracked_nagastone_slab_right", () -> new BlockItem(ModBlocks.CRACKED_NAGASTONE_SLAB_RIGHT.get(), new Item.Properties()));

	public static final RegistryObject<Item> MOSSY_NAGASTONE_SLAB_LEFT = ITEMS.register("mossy_nagastone_slab_left", () -> new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_LEFT.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_NAGASTONE_SLAB_RIGHT = ITEMS.register("mossy_nagastone_slab_right", () -> new BlockItem(ModBlocks.MOSSY_NAGASTONE_SLAB_RIGHT.get(), new Item.Properties()));
	
	// Dark Tower
	public static final RegistryObject<Item> TOWERWOOD_STAIRS = ITEMS.register("towerwood_stairs", () -> new BlockItem(ModBlocks.TOWERWOOD_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_SLAB = ITEMS.register("towerwood_slab", () -> new BlockItem(ModBlocks.TOWERWOOD_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_FENCE = ITEMS.register("towerwood_fence", () -> new BlockItem(ModBlocks.TOWERWOOD_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_FENCE_GATE = ITEMS.register("towerwood_fence_gate", () -> new BlockItem(ModBlocks.TOWERWOOD_FENCE_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_DOOR = ITEMS.register("towerwood_door", () -> new BlockItem(ModBlocks.TOWERWOOD_DOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_TRAPDOOR = ITEMS.register("towerwood_trapdoor", () -> new BlockItem(ModBlocks.TOWERWOOD_TRAPDOOR.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_BUTTON = ITEMS.register("towerwood_button", () -> new BlockItem(ModBlocks.TOWERWOOD_BUTTON.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_PRESSURE_PLATE = ITEMS.register("towerwood_pressure_plate", () -> new BlockItem(ModBlocks.TOWERWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_SIGN = ITEMS.register("towerwood_sign", () -> new SignItem(new Item.Properties(), ModBlocks.TOWERWOOD_SIGN.get(), ModBlocks.TOWERWOOD_WALL_SIGN.get()));
	public static final RegistryObject<Item> TOWERWOOD_HANGING_SIGN = ITEMS.register("towerwood_hanging_sign", () -> new HangingSignItem(ModBlocks.TOWERWOOD_HANGING_SIGN.get(), ModBlocks.TOWERWOOD_WALL_HANGING_SIGN.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_BANISTER = ITEMS.register("towerwood_banister", () -> new BlockItem(ModBlocks.TOWERWOOD_BANISTER.get(), new Item.Properties()));

	public static final RegistryObject<Item> MOSSY_TOWERWOOD_SLAB = ITEMS.register("mossy_towerwood_slab", () -> new BlockItem(ModBlocks.MOSSY_TOWERWOOD_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_TOWERWOOD_STAIRS = ITEMS.register("mossy_towerwood_stairs", () -> new BlockItem(ModBlocks.MOSSY_TOWERWOOD_STAIRS.get(), new Item.Properties()));

	// Goblin Knight Stronghold
	public static final RegistryObject<Item> UNDERBRICK_STAIRS = ITEMS.register("underbrick_stairs", () -> new BlockItem(ModBlocks.UNDERBRICK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> UNDERBRICK_SLAB = ITEMS.register("underbrick_slab", () -> new BlockItem(ModBlocks.UNDERBRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> UNDERBRICK_WALL = ITEMS.register("underbrick_wall", () -> new BlockItem(ModBlocks.UNDERBRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> CRACKED_UNDERBRICK_STAIRS = ITEMS.register("cracked_underbrick_stairs", () -> new BlockItem(ModBlocks.CRACKED_UNDERBRICK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRACKED_UNDERBRICK_SLAB = ITEMS.register("cracked_underbrick_slab", () -> new BlockItem(ModBlocks.CRACKED_UNDERBRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRACKED_UNDERBRICK_WALL = ITEMS.register("cracked_underbrick_wall", () -> new BlockItem(ModBlocks.CRACKED_UNDERBRICK_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> MOSSY_UNDERBRICK_STAIRS = ITEMS.register("mossy_underbrick_stairs", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_STAIRS.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_UNDERBRICK_SLAB = ITEMS.register("mossy_underbrick_slab", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_SLAB.get(), new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_UNDERBRICK_WALL = ITEMS.register("mossy_underbrick_wall", () -> new BlockItem(ModBlocks.MOSSY_UNDERBRICK_WALL.get(), new Item.Properties()));

	
    private static CreativeModeTab getTabWithMatchingName(String tabName) {
    	CreativeModeTab tab = null;
    	if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) { // Check to make sure the code doesn't advance on server to prevent crashes.
    		return null;
    	}
    	for (CreativeModeTab tempTab : CreativeModeTabRegistry.getSortedCreativeModeTabs()) {
    		if (!(tempTab.getDisplayName().getContents() instanceof TranslatableContents)) {
    			continue;
    		}
    		if (((TranslatableContents)tempTab.getDisplayName().getContents()).getKey().equalsIgnoreCase("itemGroup." + tabName)) {
    			tab = tempTab;
    			break;
    		}
    	}
    	return tab;
    }
    
    @SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	MutableHashedLinkedMap<ItemStack, TabVisibility> map = event.getEntries();
    	if (event.getTab() == getTabWithMatchingName("twilightforest.blocks")) {
    		// Insert Aurora blocks.
    		map.putBefore(TFBlocks.AURORA_SLAB.get().asItem().getDefaultInstance(), AURORA_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.AURORA_SLAB.get().asItem().getDefaultInstance(), AURORA_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.AURORALIZED_GLASS.get().asItem().getDefaultInstance(), AURORALIZED_GLASS_PANE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Castle brick blocks.
    		map.putAfter(TFBlocks.BOLD_CASTLE_BRICK_STAIRS.get().asItem().getDefaultInstance(), CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), WORN_CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(WORN_CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), CRACKED_CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRACKED_CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), MOSSY_CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), ENCASED_CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(ENCASED_CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), BOLD_CASTLE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		map.putAfter(BOLD_CASTLE_BRICK_SLAB.get().asItem().getDefaultInstance(), CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CASTLE_BRICK_WALL.get().asItem().getDefaultInstance(), WORN_CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(WORN_CASTLE_BRICK_WALL.get().asItem().getDefaultInstance(), CRACKED_CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRACKED_CASTLE_BRICK_WALL.get().asItem().getDefaultInstance(), MOSSY_CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_CASTLE_BRICK_WALL.get().asItem().getDefaultInstance(), ENCASED_CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(ENCASED_CASTLE_BRICK_WALL.get().asItem().getDefaultInstance(), BOLD_CASTLE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Insert Deadrock blocks.
    		map.putAfter(TFBlocks.DEADROCK.get().asItem().getDefaultInstance(), DEADROCK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(DEADROCK_STAIRS.get().asItem().getDefaultInstance(), DEADROCK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		map.putAfter(TFBlocks.CRACKED_DEADROCK.get().asItem().getDefaultInstance(), CRACKED_DEADROCK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRACKED_DEADROCK_STAIRS.get().asItem().getDefaultInstance(), CRACKED_DEADROCK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		map.putAfter(TFBlocks.WEATHERED_DEADROCK.get().asItem().getDefaultInstance(), WEATHERED_DEADROCK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(WEATHERED_DEADROCK_STAIRS.get().asItem().getDefaultInstance(), WEATHERED_DEADROCK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Insert Mazestone blocks.
    		map.putAfter(TFBlocks.MAZESTONE.get().asItem().getDefaultInstance(), MAZESTONE_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MAZESTONE_STAIRS.get().asItem().getDefaultInstance(), MAZESTONE_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MAZESTONE_SLAB.get().asItem().getDefaultInstance(), MAZESTONE_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.CUT_MAZESTONE.get().asItem().getDefaultInstance(), CUT_MAZESTONE_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CUT_MAZESTONE_STAIRS.get().asItem().getDefaultInstance(), CUT_MAZESTONE_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CUT_MAZESTONE_SLAB.get().asItem().getDefaultInstance(), CUT_MAZESTONE_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.MAZESTONE_BRICK.get().asItem().getDefaultInstance(), MAZESTONE_BRICK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MAZESTONE_BRICK_STAIRS.get().asItem().getDefaultInstance(), MAZESTONE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MAZESTONE_BRICK_SLAB.get().asItem().getDefaultInstance(), MAZESTONE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.MOSSY_MAZESTONE.get().asItem().getDefaultInstance(), MOSSY_MAZESTONE_BRICK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_MAZESTONE_BRICK_STAIRS.get().asItem().getDefaultInstance(), MOSSY_MAZESTONE_BRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_MAZESTONE_BRICK_SLAB.get().asItem().getDefaultInstance(), MOSSY_MAZESTONE_BRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Nagastone blocks.
    		map.putAfter(TFBlocks.NAGASTONE_STAIRS_LEFT.get().asItem().getDefaultInstance(), NAGASTONE_SLAB_LEFT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.NAGASTONE_STAIRS_RIGHT.get().asItem().getDefaultInstance(), NAGASTONE_SLAB_RIGHT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		map.putAfter(TFBlocks.CRACKED_NAGASTONE_STAIRS_LEFT.get().asItem().getDefaultInstance(), CRACKED_NAGASTONE_SLAB_LEFT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.CRACKED_NAGASTONE_STAIRS_RIGHT.get().asItem().getDefaultInstance(), CRACKED_NAGASTONE_SLAB_RIGHT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.MOSSY_NAGASTONE_STAIRS_LEFT.get().asItem().getDefaultInstance(), MOSSY_NAGASTONE_SLAB_LEFT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.MOSSY_NAGASTONE_STAIRS_RIGHT.get().asItem().getDefaultInstance(), MOSSY_NAGASTONE_SLAB_RIGHT.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Underbrick blocks.
    		map.putAfter(TFBlocks.UNDERBRICK.get().asItem().getDefaultInstance(), UNDERBRICK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(UNDERBRICK_STAIRS.get().asItem().getDefaultInstance(), UNDERBRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(UNDERBRICK_SLAB.get().asItem().getDefaultInstance(), UNDERBRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.CRACKED_UNDERBRICK.get().asItem().getDefaultInstance(), CRACKED_UNDERBRICK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRACKED_UNDERBRICK_STAIRS.get().asItem().getDefaultInstance(), CRACKED_UNDERBRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRACKED_UNDERBRICK_SLAB.get().asItem().getDefaultInstance(), CRACKED_UNDERBRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		map.putAfter(TFBlocks.MOSSY_UNDERBRICK.get().asItem().getDefaultInstance(), MOSSY_UNDERBRICK_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_UNDERBRICK_STAIRS.get().asItem().getDefaultInstance(), MOSSY_UNDERBRICK_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_UNDERBRICK_SLAB.get().asItem().getDefaultInstance(), MOSSY_UNDERBRICK_WALL.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    		// Insert Towerwood blocks.
    		map.putAfter(TFBlocks.TOWERWOOD.get().asItem().getDefaultInstance(), TOWERWOOD_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_STAIRS.get().asItem().getDefaultInstance(), TOWERWOOD_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_SLAB.get().asItem().getDefaultInstance(), TOWERWOOD_FENCE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_FENCE.get().asItem().getDefaultInstance(), TOWERWOOD_FENCE_GATE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_FENCE_GATE.get().asItem().getDefaultInstance(), TOWERWOOD_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_DOOR.get().asItem().getDefaultInstance(), TOWERWOOD_TRAPDOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_TRAPDOOR.get().asItem().getDefaultInstance(), TOWERWOOD_PRESSURE_PLATE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_PRESSURE_PLATE.get().asItem().getDefaultInstance(), TOWERWOOD_BUTTON.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_BUTTON.get().asItem().getDefaultInstance(), TOWERWOOD_SIGN.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_SIGN.get().asItem().getDefaultInstance(), TOWERWOOD_HANGING_SIGN.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TOWERWOOD_HANGING_SIGN.get().asItem().getDefaultInstance(), TOWERWOOD_BANISTER.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(TFBlocks.MOSSY_TOWERWOOD.get().asItem().getDefaultInstance(), MOSSY_TOWERWOOD_STAIRS.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MOSSY_TOWERWOOD_STAIRS.get().asItem().getDefaultInstance(), MOSSY_TOWERWOOD_SLAB.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    	}
    }
}
