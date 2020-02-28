package damien.rainbowstuff.item;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.item.ItemAxe;

public class RainbowAxe extends ItemAxe {
	
	public RainbowAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

	public RainbowAxe(ToolMaterial material, String unlocalizedName, String registryName) {
		this(material, 8.0F, -3.1F);
	}


}
