package damien.rainbowstuff.material;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class RainbowMaterials {
	public static final ToolMaterial RAINBOW_TOOL = EnumHelper.addToolMaterial(RainbowStuff.MODID + ":" + "rainbow_tool", 3, 1000, 10.0F, 5.0F, 10);
	public static final ArmorMaterial RAINBOW_ARMOR = EnumHelper.addArmorMaterial(RainbowStuff.MODID + ":" + "rainbow_armor", RainbowStuff.MODID + ":rainbow", 20, new int[] {5, 10, 8, 6}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
}
