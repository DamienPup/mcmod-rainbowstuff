package damien.rainbowstuff.item;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.item.ItemSword;

public class RainbowSword extends ItemSword {
	
	public RainbowSword(ToolMaterial material) {
		super(material);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

}
