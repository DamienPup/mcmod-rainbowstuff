package damien.rainbowstuff.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.init.*;

public class RainbowTab extends CreativeTabs {
	public RainbowTab() {
        super(RainbowStuff.MODID);
    }
 
    @SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
    	 return new ItemStack(Item.getItemFromBlock(ModBlocks.RAINBOW_BLOCK));
	}

}
