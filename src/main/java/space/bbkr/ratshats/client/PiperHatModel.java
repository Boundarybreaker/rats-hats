package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class PiperHatModel extends HatModel {
	public ModelPart hat;
	public ModelPart hat_feather;
	public ModelPart hatTop;

	public PiperHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.hat_feather = new ModelPart(this, 0, 72);
		this.hat_feather.setPivot(-2.5F, -5.0F, 0.0F);
		this.hat_feather.addCuboid(0.0F, -9.0F, 0.0F, 0, 9, 9, 0.0F);
		this.setRotateAngle(hat_feather, 0.0F, 0.0F, -0.3490658503988659F);
		this.hat = new ModelPart(this, 0, 64);
		this.hat.setPivot(0.0F, -6.0F, 0.0F);
		this.hat.addCuboid(-4.5F, -5.0F, -6.0F, 9, 4, 12, 0.0F);
		this.setRotateAngle(hat, 0.17453292519943295F, 0.0F, 0.0F);
		this.hatTop = new ModelPart(this, 0, 118);
		this.hatTop.setPivot(0.0F, -5.0F, 0.0F);
		this.hatTop.addCuboid(-2.5F, -2.0F, -4.0F, 5, 2, 8, 0.0F);
		this.head.addChild(this.hat);
		this.hat.addChild(this.hat_feather);
		this.hat.addChild(this.hatTop);
	}
}
