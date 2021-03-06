package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class FarmerHatModel extends HatModel {
	public ModelPart famerHat;
	public ModelPart brim;

	public FarmerHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.brim = new ModelPart(this, -16, 76);
		this.brim.setPivot(0.0F, 0.0F, 0.0F);
		this.brim.addCuboid(-8.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
		this.famerHat = new ModelPart(this, 0, 64);
		this.famerHat.setPivot(0.0F, -8.0F, 0.0F);
		this.famerHat.addCuboid(-4.0F, -4.0F, -4.0F, 8, 4, 8, 0.0F);
		this.famerHat.addChild(this.brim);
		this.head.addChild(this.famerHat);
	}
}