package damien.rainbowstuff.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelRaincow extends ModelBase {
    public ModelRenderer CowBody;
    public ModelRenderer RearLeftLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer RearRightLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer CowHead;
    public ModelRenderer Horn;
    public ModelRenderer CowRightEar;
    public ModelRenderer CowLeftEar;

    public ModelRaincow() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.CowHead = new ModelRenderer(this, 0, 0);
        this.CowHead.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.CowHead.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.CowBody = new ModelRenderer(this, 18, 4);
        this.CowBody.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.CowBody.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(CowBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.CowRightEar = new ModelRenderer(this, 22, 0);
        this.CowRightEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CowRightEar.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.RearRightLeg = new ModelRenderer(this, 0, 16);
        this.RearRightLeg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.RearRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 16);
        this.FrontLeftLeg.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.FrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Horn = new ModelRenderer(this, 0, 0);
        this.Horn.setRotationPoint(0.0F, -0.9F, -15.0F);
        this.Horn.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Horn, 0.5235987755982988F, 0.0F, 0.0F);
        this.CowLeftEar = new ModelRenderer(this, 22, 0);
        this.CowLeftEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CowLeftEar.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.RearLeftLeg = new ModelRenderer(this, 0, 16);
        this.RearLeftLeg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.RearLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 16);
        this.FrontRightLeg.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.FrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.CowHead.addChild(this.CowRightEar);
        this.CowHead.addChild(this.CowLeftEar);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.CowHead.render(f5);
        this.CowBody.render(f5);
        this.RearRightLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.Horn.render(f5);
        this.RearLeftLeg.render(f5);
        this.FrontRightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RearLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RearRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.CowHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.CowHead.rotateAngleX = headPitch * 0.017453292F;
    }
}
