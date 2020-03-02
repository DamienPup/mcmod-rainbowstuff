package damien.rainbowstuff.handelers;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.init.ModItems;
import damien.rainbowstuff.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = RainbowStuff.MODID)
public class ModelRegistrationHandler {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.RAINBOW_INGOT, 0);
		registerModel(ModItems.RAINBOW_NUGGET, 0);
		registerModel(ModItems.RAINBOW_STICK, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.RAINBOW_ORE), 0);
		registerModel(Item.getItemFromBlock(ModBlocks.RAINBOW_BLOCK), 0);
		registerModel(ModItems.RAINBOW_SWORD, 0);
		registerModel(ModItems.RAINBOW_SHOVEL, 0);
		registerModel(ModItems.RAINBOW_HOE, 0);
		registerModel(ModItems.RAINBOW_PICKAXE, 0);
		registerModel(ModItems.RAINBOW_AXE, 0);
		registerModel(ModItems.RAINBOW_HELMET, 0);
		registerModel(ModItems.RAINBOW_CHESTPLATE, 0);
		registerModel(ModItems.RAINBOW_LEGGINGS, 0);
		registerModel(ModItems.RAINBOW_BOOTS, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.RAINBOW_CHEST), 0);
		//registerModel(Item.getItemFromBlock(ModBlocks.RAINBOW_TELEPORTER), 0);
	}
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
