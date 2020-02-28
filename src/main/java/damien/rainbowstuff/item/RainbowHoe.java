package damien.rainbowstuff.item;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.item.ItemHoe;

public class RainbowHoe extends ItemHoe {
	
	public RainbowHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

}
