package damien.rainbowstuff.init;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.entity.EntityUnicorn;
import damien.rainbowstuff.entity.render.RenderUnicorn;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities()
	{
		registerEntity("unicorn", EntityUnicorn.class, RainbowStuff.ENTITY_UNICORN_ID, 30, 16738740, 16777215);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(RainbowStuff.MODID + ":" + name), entity, name, id, RainbowStuff.instance, range, 1, true, color1, color2);
	}
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, new IRenderFactory<EntityUnicorn>()
		{
			@Override
			public Render<? super EntityUnicorn> createRenderFor(RenderManager manager) 
			{
				return new RenderUnicorn(manager);
			}
		});
	}

}
