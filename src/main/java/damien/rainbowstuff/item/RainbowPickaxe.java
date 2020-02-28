package damien.rainbowstuff.item;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.item.ItemPickaxe;

public class RainbowPickaxe extends ItemPickaxe {
	
	public RainbowPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}


}
