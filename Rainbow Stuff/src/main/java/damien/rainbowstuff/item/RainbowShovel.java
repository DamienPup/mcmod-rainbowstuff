package damien.rainbowstuff.item;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.item.ItemSpade;

public class RainbowShovel extends ItemSpade {
	
	public RainbowShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

}
