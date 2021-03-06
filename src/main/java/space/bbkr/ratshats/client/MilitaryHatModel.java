package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class MilitaryHatModel extends HatModel {

	public ModelPart hat1;
	public ModelPart hat2;
	public ModelPart hat3;
	public ModelPart hat4;
	public ModelPart gold;

	public MilitaryHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.hat4 = new ModelPart(this, 0, 87);
		this.hat4.setPivot(0.0F, 0.0F, 0.0F);
		this.hat4.addCuboid(-4.0F, -1.0F, -4.0F, 8, 1, 8, 0.0F);
		this.gold = new ModelPart(this, 0, 65);
		this.gold.setPivot(0.0F, -2.5F, 3.5F);
		this.gold.addCuboid(-1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F);
		this.hat1 = new ModelPart(this, 0, 64);
		this.hat1.setPivot(0.0F, -8.0F, 0.0F);
		this.hat1.addCuboid(-3.5F, -4.0F, -3.5F, 7, 4, 7, 0.0F);
		this.setRotateAngle(hat1, 0.0F, 3.141592653589793F, 0.0F);
		this.hat3 = new ModelPart(this, 0, 97);
		this.hat3.setPivot(0.0F, 0.0F, 3.0F);
		this.hat3.addCuboid(-2.5F, -1.0F, 1.0F, 5, 1, 2, 0.0F);
		this.hat2 = new ModelPart(this, 0, 75);
		this.hat2.setPivot(0.0F, -3.0F, 0.0F);
		this.hat2.addCuboid(-5.0F, -2.0F, -5.0F, 10, 2, 10, 0.0F);
		this.setRotateAngle(hat2, 0.2617993877991494F, 0.0F, 0.0F);
		this.hat1.addChild(this.hat4);
		this.hat1.addChild(this.gold);
		this.hat1.addChild(this.hat3);
		this.hat1.addChild(this.hat2);
		this.head.addChild(hat1);
	}
}
