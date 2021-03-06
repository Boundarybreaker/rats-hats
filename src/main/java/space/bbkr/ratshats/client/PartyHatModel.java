package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class PartyHatModel extends HatModel {
	public ModelPart hat1;
	public ModelPart hat2;
	public ModelPart hat3;
	public ModelPart hat4;
	public ModelPart hat5;
	public ModelPart puff1;
	public ModelPart puff2;

	public PartyHatModel(float scale) {
		super(scale, 0, 64, 64);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.hat3 = new ModelPart(this, 0, 55);
		this.hat3.setPivot(0.0F, -2.0F, 0.0F);
		this.hat3.addCuboid(-2.0F, -4.0F, -2.0F, 4, 2, 4, 0.0F);
		this.hat4 = new ModelPart(this, 18, 40);
		this.hat4.setPivot(0.0F, -2.0F, 0.0F);
		this.hat4.addCuboid(-1.5F, -4.0F, -1.5F, 3, 2, 3, 0.0F);
		this.hat5 = new ModelPart(this, 18, 48);
		this.hat5.setPivot(0.0F, -1.0F, 0.0F);
		this.hat5.addCuboid(-1.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F);
		this.hat2 = new ModelPart(this, 0, 48);
		this.hat2.setPivot(0.0F, -2.0F, 0.0F);
		this.hat2.addCuboid(-2.5F, -4.0F, -2.5F, 5, 2, 5, 0.0F);
		this.puff2 = new ModelPart(this, 40, 40);
		this.puff2.setPivot(0.0F, -4.0F, 0.0F);
		this.puff2.addCuboid(-2.5F, -5.0F, 0.0F, 5, 5, 0, 0.0F);
		this.setRotateAngle(puff2, 0.0F, -0.7853981633974483F, 0.0F);
		this.hat1 = new ModelPart(this, 0, 40);
		this.hat1.setPivot(0.0F, -6.0F, 0.0F);
		this.hat1.addCuboid(-3.0F, -4.0F, -3.0F, 6, 2, 6, 0.0F);
		this.puff1 = new ModelPart(this, 40, 40);
		this.puff1.setPivot(0.0F, -4.0F, 0.0F);
		this.puff1.addCuboid(-2.5F, -5.0F, 0.0F, 5, 5, 0, 0.0F);
		this.setRotateAngle(puff1, 0.0F, 0.7853981633974483F, 0.0F);
		this.hat2.addChild(this.hat3);
		this.hat3.addChild(this.hat4);
		this.hat4.addChild(this.hat5);
		this.hat1.addChild(this.hat2);
		this.hat5.addChild(this.puff2);
		this.hat5.addChild(this.puff1);
		this.head.addChild(this.hat1);
	}
}
