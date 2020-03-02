package damien.rainbowstuff.init;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityRainbowChest.class, new ResourceLocation(RainbowStuff.MODID + ":rainbow_chest"));
		///GameRegistry.registerTileEntity(TileEntityRainbowTeleporter.class, new ResourceLocation(RainbowStuff.MODID + ":rainbow_teleporter"));
	}

}
