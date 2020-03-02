package damien.rainbowstuff.entity.render;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.entity.EntityRaincow;
import damien.rainbowstuff.entity.model.ModelRaincow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRaincow extends RenderLiving<EntityRaincow>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(RainbowStuff.MODID + ":textures/entity/raincow.png");
	
	public RenderRaincow(RenderManager manager) 
	{
		super(manager, new ModelRaincow(), 0.25F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityRaincow entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityRaincow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}