package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class RatFezModel extends HatModel {
	public ModelPart fez1;
	public ModelPart fez2;

	public RatFezModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.fez2 = new ModelPart(this, 0, 75);
		this.fez2.setPivot(2.0F, -7.0F, 1.5F);
		this.fez2.addCuboid(0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
		this.setRotateAngle(fez2, 0.0F, 0.0F, -0.27314402793711257F);
		this.fez1 = new ModelPart(this, 0, 64);
		this.fez1.setPivot(0.0F, -8.0F, 0.0F);
		this.fez1.addCuboid(0.0F, -6.0F, 0.0F, 5, 6, 5, 0.0F);
		this.setRotateAngle(fez1, -0.4459316238845512F, 0.0F, 0.3312634920285238F);
		this.fez1.addChild(this.fez2);
		this.head.addChild(this.fez1);
	}
}
