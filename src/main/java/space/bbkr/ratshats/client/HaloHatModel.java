package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class HaloHatModel extends HatModel{
	public ModelPart famerHat;

	public HaloHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.famerHat = new ModelPart(this, 0, 64);
		this.famerHat.setPivot(0.0F, -9.0F, 0.0F);
		this.famerHat.addCuboid(-4.0F, -4.0F, -4.0F, 8, 4, 8, scale);
		this.head.addChild(this.famerHat);
	}

	@Override
	public void setAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.famerHat.yaw = -9.0F + MathHelper.sin(ageInTicks * 0.05F);
		super.setAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
}
