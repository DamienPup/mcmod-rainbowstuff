package damien.rainbowstuff.init;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.BlockRainbowBlock;
import damien.rainbowstuff.block.BlockRainbowChest;
import damien.rainbowstuff.block.BlockRainbowOre;
import damien.rainbowstuff.block.animation.RenderRainbowChest;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(RainbowStuff.MODID)
public class ModBlocks {
	public static final BlockRainbowOre RAINBOW_ORE = new BlockRainbowOre();
	public static final BlockRainbowBlock RAINBOW_BLOCK = new BlockRainbowBlock();
	public static final BlockRainbowChest RAINBOW_CHEST = new BlockRainbowChest();
	//public static final BlockRainbowTeleporter RAINBOW_TELEPORTER = null;
	
	@EventBusSubscriber(modid = RainbowStuff.MODID)
	public static class RegistrationHandler{
		@SubscribeEvent
		public static void registerBlocks(Register<Block> event) {
			final Block[] blocks = {
					RAINBOW_ORE.setRegistryName(RainbowStuff.MODID, "rainbow_ore").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_ore"),
					RAINBOW_BLOCK.setRegistryName(RainbowStuff.MODID, "rainbow_block").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_block"),
					RAINBOW_CHEST.setRegistryName(RainbowStuff.MODID, "rainbow_chest").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_chest"),
					//new BlockRainbowTeleporter().setRegistryName(RainbowStuff.MODID, "rainbow_teleporter").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_teleporter")
			};
			
			event.getRegistry().registerAll(blocks);
			ModTileEntities.registerTileEntities();
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRainbowChest.class, new RenderRainbowChest());
			//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRainbowTeleporter.class, new RenderRainbowTeleporter());
		}
		@SubscribeEvent
		public static void registerItemBlocks(Register<Item> event) {
			final Item[] itemBlocks = {
					new ItemBlock(RAINBOW_ORE).setRegistryName(RAINBOW_ORE.getRegistryName()),
					new ItemBlock(RAINBOW_BLOCK).setRegistryName(RAINBOW_BLOCK.getRegistryName()),
					new ItemBlock(RAINBOW_CHEST).setRegistryName(RAINBOW_CHEST.getRegistryName()),
					//new ItemBlock(RAINBOW_TELEPORTER).setRegistryName(RAINBOW_TELEPORTER.getRegistryName())
			};
			
			event.getRegistry().registerAll(itemBlocks);
		}
	}
}
