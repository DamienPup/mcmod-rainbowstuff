package damien.rainbowstuff.init;

import damien.rainbowstuff.entity.EntityRaincow;
import damien.rainbowstuff.entity.render.RenderRaincow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ModRenders {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityRaincow.class, new IRenderFactory<EntityRaincow>()
		{
			@Override
			public Render<? super EntityRaincow> createRenderFor(RenderManager manager) 
			{
				return new RenderRaincow(manager);
			}
		});
	}
}
