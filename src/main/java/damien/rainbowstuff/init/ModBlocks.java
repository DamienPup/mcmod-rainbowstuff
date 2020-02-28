package damien.rainbowstuff.init;

import damien.rainbowstuff.block.*;
import damien.rainbowstuff.RainbowStuff;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(RainbowStuff.MODID)
public class ModBlocks {
	public static final BlockRainbowOre RAINBOW_ORE = null;
	public static final BlockRainbowBlock RAINBOW_BLOCK = null;
	
	@EventBusSubscriber(modid = RainbowStuff.MODID)
	public static class RegistrationHandler{
		@SubscribeEvent
		public static void registerBlocks(Register<Block> event) {
			final Block[] blocks = {
					new BlockRainbowOre().setRegistryName(RainbowStuff.MODID, "rainbow_ore").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_ore"),
					new BlockRainbowBlock().setRegistryName(RainbowStuff.MODID, "rainbow_block").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_block")
			};
			
			event.getRegistry().registerAll(blocks);
		}
		@SubscribeEvent
		public static void registerItemBlocks(Register<Item> event) {
			final Item[] itemBlocks = {
					new ItemBlock(RAINBOW_ORE).setRegistryName(RAINBOW_ORE.getRegistryName()),
					new ItemBlock(RAINBOW_BLOCK).setRegistryName(RAINBOW_BLOCK.getRegistryName())
			};
			
			event.getRegistry().registerAll(itemBlocks);
		}
	}
}
