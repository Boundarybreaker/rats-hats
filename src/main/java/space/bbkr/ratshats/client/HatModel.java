package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;

public abstract class HatModel extends BipedEntityModel<LivingEntity> {
	protected HatModel(float f, float g, int i, int j) {
		super(f, g, i, j);
	}

	@Override
	public void setAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if (entityIn instanceof ArmorStandEntity) {
			ArmorStandEntity entityarmorstand = (ArmorStandEntity) entityIn;
			this.head.pitch = 0.017453292F * entityarmorstand.getHeadRotation().getPitch();
			this.head.yaw = 0.017453292F * entityarmorstand.getHeadRotation().getYaw();
			this.head.roll = 0.017453292F * entityarmorstand.getHeadRotation().getRoll();
			this.head.setPivot(0.0F, 1.0F, 0.0F);
			this.torso.pitch = 0.017453292F * entityarmorstand.getBodyRotation().getPitch();
			this.torso.yaw = 0.017453292F * entityarmorstand.getBodyRotation().getYaw();
			this.torso.roll = 0.017453292F * entityarmorstand.getBodyRotation().getRoll();
			this.leftArm.pitch = 0.017453292F * entityarmorstand.getLeftArmRotation().getPitch();
			this.leftArm.yaw = 0.017453292F * entityarmorstand.getLeftArmRotation().getYaw();
			this.leftArm.roll = 0.017453292F * entityarmorstand.getLeftArmRotation().getRoll();
			this.rightArm.pitch = 0.017453292F * entityarmorstand.getRightArmRotation().getPitch();
			this.rightArm.yaw = 0.017453292F * entityarmorstand.getRightArmRotation().getYaw();
			this.rightArm.roll = 0.017453292F * entityarmorstand.getRightArmRotation().getRoll();
			this.leftLeg.pitch = 0.017453292F * entityarmorstand.getLeftLegRotation().getPitch();
			this.leftLeg.yaw = 0.017453292F * entityarmorstand.getLeftLegRotation().getYaw();
			this.leftLeg.roll = 0.017453292F * entityarmorstand.getLeftLegRotation().getRoll();
			this.leftLeg.setPivot(1.9F, 11.0F, 0.0F);
			this.rightLeg.pitch = 0.017453292F * entityarmorstand.getRightLegRotation().getPitch();
			this.rightLeg.yaw = 0.017453292F * entityarmorstand.getRightLegRotation().getYaw();
			this.rightLeg.roll = 0.017453292F * entityarmorstand.getRightLegRotation().getRoll();
			this.rightLeg.setPivot(-1.9F, 11.0F, 0.0F);
			this.helmet.copyPositionAndRotation(this.head);
		} else {
			super.setAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}

	public void setRotateAngle(ModelPart part, float x, float y, float z) {
		part.pitch = x;
		part.yaw = y;
		part.roll = z;
	}
}
