package damien.rainbowstuff.block.animation;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRainbowChest extends TileEntitySpecialRenderer<TileEntityRainbowChest>
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(RainbowStuff.MODID + ":textures/blocks/rainbow_chest.png");
	private final ModelRainbowChest MODEL = new ModelRainbowChest();
	
	@Override
	public void render(TileEntityRainbowChest te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) 
	{
		GlStateManager.enableDepth();
        GlStateManager.depthFunc(515);
        GlStateManager.depthMask(true);
    	
    	ModelRainbowChest model = MODEL;
    	
    	if (destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0F, 4.0F, 1.0F);
            GlStateManager.translate(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
        }
    	else this.bindTexture(TEXTURE);
    	
    	GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate((float)x, (float)y + 1.0F, (float)z + 1.0F);
        GlStateManager.scale(1.0F, -1.0F, -1.0F);
        GlStateManager.translate(0.5F, 0.5F, 0.5F);
        GlStateManager.translate(-0.5F, -0.5F, -0.5F);
       
        float f = te.prevLidAngle + (te.lidAngle - te.prevLidAngle) * partialTicks;
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        model.chestLid.rotateAngleX = -(f * ((float)Math.PI / 2F));
        model.renderAll();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }	
	}
}