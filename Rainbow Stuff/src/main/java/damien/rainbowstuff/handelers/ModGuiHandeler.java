package damien.rainbowstuff.handelers;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.container.ContainerRainbowChest;
import damien.rainbowstuff.block.gui.GuiRainbowChest;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandeler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == RainbowStuff.GUI_IDS.RAINBOW_CHEST.ordinal()) return new ContainerRainbowChest(player.inventory, (TileEntityRainbowChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		//if(ID == RainbowStuff.GUI_IDS.RAINBOW_TELEPORTER.ordinal()) return new TeleporterRainbow(player.inventory, (TileEntityRainbowTeleporter)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == RainbowStuff.GUI_IDS.RAINBOW_CHEST.ordinal()) return new GuiRainbowChest(player.inventory, (TileEntityRainbowChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		//if(ID == RainbowStuff.GUI_IDS.RAINBOW_TELEPORTER.ordinal()) return new GuiRainbowTeleporter(player.inventory, (TileEntityRainbowTeleporter)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	public static void registerGUIs() {
		
	}
}
