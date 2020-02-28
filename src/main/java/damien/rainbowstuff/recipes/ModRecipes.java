package damien.rainbowstuff.recipes;

import damien.rainbowstuff.init.ModBlocks;
import damien.rainbowstuff.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void initSmelting() {
		GameRegistry.addSmelting(ModBlocks.RAINBOW_ORE, new ItemStack(ModItems.RAINBOW_NUGGET), 15.0F);

	}

}
