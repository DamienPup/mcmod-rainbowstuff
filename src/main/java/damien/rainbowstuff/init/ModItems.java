package damien.rainbowstuff.init;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.item.*;
import damien.rainbowstuff.material.RainbowMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.inventory.EntityEquipmentSlot;

@ObjectHolder(RainbowStuff.MODID)
public class ModItems {
	public static final Item RAINBOW_INGOT = null;
	public static final Item RAINBOW_NUGGET = null;
	public static final Item RAINBOW_STICK = null;
	
	public static final Item RAINBOW_SWORD = null;
	public static final Item RAINBOW_SHOVEL = null;
	public static final Item RAINBOW_HOE = null;
	public static final Item RAINBOW_PICKAXE = null;
	public static final Item RAINBOW_AXE = null;
	
	public static final Item RAINBOW_HELMET = null;
	public static final Item RAINBOW_CHESTPLATE = null;
	public static final Item RAINBOW_LEGGINGS = null;
	public static final Item RAINBOW_BOOTS = null;
	
	@EventBusSubscriber(modid = RainbowStuff.MODID)
	public static class RegistrationHandler{
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(RainbowStuff.MODID, "rainbow_ingot").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_ingot").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new Item().setRegistryName(RainbowStuff.MODID, "rainbow_nugget").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_nugget").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new Item().setRegistryName(RainbowStuff.MODID, "rainbow_stick").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_stick").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowSword(RainbowMaterials.RAINBOW_TOOL).setRegistryName(RainbowStuff.MODID, "rainbow_sword").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_sword").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowShovel(RainbowMaterials.RAINBOW_TOOL).setRegistryName(RainbowStuff.MODID, "rainbow_shovel").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_shovel").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowHoe(RainbowMaterials.RAINBOW_TOOL).setRegistryName(RainbowStuff.MODID, "rainbow_hoe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_hoe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowPickaxe(RainbowMaterials.RAINBOW_TOOL).setRegistryName(RainbowStuff.MODID, "rainbow_pickaxe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_pickaxe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowAxe(RainbowMaterials.RAINBOW_TOOL, 5.0F, 1.0F).setRegistryName(RainbowStuff.MODID, "rainbow_axe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_axe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.HEAD).setRegistryName(RainbowStuff.MODID, "rainbow_helmet").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_helmet").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.CHEST).setRegistryName(RainbowStuff.MODID, "rainbow_chestplate").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_chestplate").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.LEGS).setRegistryName(RainbowStuff.MODID, "rainbow_leggings").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_leggings").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.FEET).setRegistryName(RainbowStuff.MODID, "rainbow_boots").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_boots").setCreativeTab(RainbowStuff.RAINBOW_TAB)
			};
			
			event.getRegistry().registerAll(items);
		}
	}

}
