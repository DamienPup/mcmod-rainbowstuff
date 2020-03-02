package damien.rainbowstuff.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import damien.rainbowstuff.RainbowStuff;

public class RainbowArmor extends ItemArmor {
	public RainbowArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
		super(material, 0, equipmentSlot);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

}
