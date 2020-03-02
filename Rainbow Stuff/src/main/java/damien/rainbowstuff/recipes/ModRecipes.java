package damien.rainbowstuff.recipes;

import damien.rainbowstuff.init.ModBlocks;
import damien.rainbowstuff.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	private static final int NuggetsFromStick = 3;
	
	public static void initSmelting() {
		GameRegistry.addSmelting(ModBlocks.RAINBOW_ORE, new ItemStack(ModItems.RAINBOW_NUGGET), 15.0F);
		
		GameRegistry.addSmelting(ModItems.RAINBOW_HELMET, new ItemStack(ModItems.RAINBOW_NUGGET, 5), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_CHESTPLATE, new ItemStack(ModItems.RAINBOW_NUGGET, 8), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_LEGGINGS, new ItemStack(ModItems.RAINBOW_NUGGET, 7), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_BOOTS, new ItemStack(ModItems.RAINBOW_NUGGET, 4), 10.0F);
		
		GameRegistry.addSmelting(ModItems.RAINBOW_AXE, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick+3), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_PICKAXE, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick+3), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_SWORD, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick+2), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_SHOVEL, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick+2), 10.0F);
		GameRegistry.addSmelting(ModItems.RAINBOW_HOE, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick+1), 10.0F);
		
		GameRegistry.addSmelting(ModItems.RAINBOW_STICK, new ItemStack(ModItems.RAINBOW_NUGGET, NuggetsFromStick), 5.0F);
	}

}
