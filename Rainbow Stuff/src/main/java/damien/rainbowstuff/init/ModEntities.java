package damien.rainbowstuff.init;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.entity.EntityRaincow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities{
	public static void registerEntities() {
		registerEntity("raincow", EntityRaincow.class, RainbowStuff.ENTITY_IDS.RAINCOW.ordinal(), 20, 16777215, 15204568);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(RainbowStuff.MODID + ":" + name), entity, name, id, RainbowStuff.instance, range, 1, true, color1, color2);
	}
}
