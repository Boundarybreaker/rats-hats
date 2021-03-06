package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;

public class AviatorHatModel extends HatModel {
	public ModelPart hat1;
	public ModelPart sideDingle;
	public ModelPart sideDingle2;
	public ModelPart goggles1;

	public AviatorHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.hat1 = new ModelPart(this, 0, 64);
		this.hat1.setPivot(0.0F, -8.0F, 0.0F);
		this.hat1.addCuboid(-4.5F, -4.0F, -4.5F, 9, 4, 9, 0.0F);
		this.setRotateAngle(hat1, 0.0F, 0F, 0.0F);
		this.sideDingle = new ModelPart(this, 0, 78);
		this.sideDingle.setPivot(4.0F, 0.0F, 0.0F);
		this.sideDingle.addCuboid(0.0F, 0.0F, -2.5F, 1, 7, 5, 0.0F);
		this.setRotateAngle(sideDingle, 0.0F, 0.0F, -0.2617993877991494F);
		this.goggles1 = new ModelPart(this, 14, 78);
		this.goggles1.setPivot(0.0F, 0.0F, 0.0F);
		this.goggles1.addCuboid(-5.0F, 0.0F, -5.0F, 10, 3, 10, 0.0F);
		this.sideDingle2 = new ModelPart(this, 0, 78);
		this.sideDingle2.mirror = true;
		this.sideDingle2.setPivot(-4.0F, 0.0F, 0.0F);
		this.sideDingle2.addCuboid(-1.0F, 0.0F, -2.5F, 1, 7, 5, 0.0F);
		this.setRotateAngle(sideDingle2, 0.0F, 0.0F, 0.27314402793711257F);
		this.head.addChild(this.hat1);
		this.hat1.addChild(this.sideDingle);
		this.hat1.addChild(this.goggles1);
		this.hat1.addChild(this.sideDingle2);
	}

	@Override
	public void setAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.goggles1.yaw = 2.0F;
		super.setAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
}
