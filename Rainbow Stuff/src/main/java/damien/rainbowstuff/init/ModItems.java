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
	public static final Item RAINBOW_INGOT = new Item();
	public static final Item RAINBOW_NUGGET = new Item();
	public static final Item RAINBOW_STICK = new RainbowStick();
	
	public static final Item RAINBOW_SWORD = new RainbowSword(RainbowMaterials.RAINBOW_TOOL);
	public static final Item RAINBOW_SHOVEL = new RainbowShovel(RainbowMaterials.RAINBOW_TOOL);
	public static final Item RAINBOW_HOE = new RainbowHoe(RainbowMaterials.RAINBOW_TOOL);
	public static final Item RAINBOW_PICKAXE = new RainbowPickaxe(RainbowMaterials.RAINBOW_TOOL);
	public static final Item RAINBOW_AXE = new RainbowAxe(RainbowMaterials.RAINBOW_TOOL, 5.0F, 1.0F);
	
	public static final Item RAINBOW_HELMET = new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.HEAD);
	public static final Item RAINBOW_CHESTPLATE = new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.CHEST);
	public static final Item RAINBOW_LEGGINGS = new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.LEGS);
	public static final Item RAINBOW_BOOTS = new RainbowArmor(RainbowMaterials.RAINBOW_ARMOR, EntityEquipmentSlot.FEET);
	
	@EventBusSubscriber(modid = RainbowStuff.MODID)
	public static class RegistrationHandler{
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					RAINBOW_INGOT.setRegistryName(RainbowStuff.MODID, "rainbow_ingot").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_ingot").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_NUGGET.setRegistryName(RainbowStuff.MODID, "rainbow_nugget").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_nugget").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_STICK.setRegistryName(RainbowStuff.MODID, "rainbow_stick").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_stick").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_SWORD.setRegistryName(RainbowStuff.MODID, "rainbow_sword").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_sword").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_SHOVEL.setRegistryName(RainbowStuff.MODID, "rainbow_shovel").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_shovel").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_HOE.setRegistryName(RainbowStuff.MODID, "rainbow_hoe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_hoe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_PICKAXE.setRegistryName(RainbowStuff.MODID, "rainbow_pickaxe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_pickaxe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_AXE.setRegistryName(RainbowStuff.MODID, "rainbow_axe").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_axe").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_HELMET.setRegistryName(RainbowStuff.MODID, "rainbow_helmet").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_helmet").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_CHESTPLATE.setRegistryName(RainbowStuff.MODID, "rainbow_chestplate").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_chestplate").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_LEGGINGS.setRegistryName(RainbowStuff.MODID, "rainbow_leggings").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_leggings").setCreativeTab(RainbowStuff.RAINBOW_TAB),
					RAINBOW_BOOTS.setRegistryName(RainbowStuff.MODID, "rainbow_boots").setTranslationKey(RainbowStuff.MODID + "." + "rainbow_boots").setCreativeTab(RainbowStuff.RAINBOW_TAB)
			};
			
			event.getRegistry().registerAll(items);
		}
	}

}
