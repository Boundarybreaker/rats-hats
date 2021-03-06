package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class SantaHatModel extends HatModel{
	public ModelPart santaHat;
	public ModelPart red1;
	public ModelPart red2;
	public ModelPart red3;
	public ModelPart red4;
	public ModelPart ball;

	public SantaHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.red1 = new ModelPart(this, 0, 76);
		this.red1.setPivot(-4.0F, 0.0F, -3.5F);
		this.red1.addCuboid(0.0F, -5.0F, 0.0F, 8, 5, 7, 0.0F);
		this.setRotateAngle(red1, -0.2617993877991494F, 0.0F, 0.091106186954104F);
		this.santaHat = new ModelPart(this, 0, 64);
		this.santaHat.setPivot(0.0F, -8.5F, 0.0F);
		this.santaHat.addCuboid(-5.0F, -0.01F, -5.0F, 10, 2, 10, 0.0F);
		this.red3 = new ModelPart(this, 0, 100);
		this.red3.setPivot(1.0F, -6.0F, 0.5F);
		this.red3.addCuboid(0.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(red3, -0.20943951023931953F, 0.0F, 0.27314402793711257F);
		this.red4 = new ModelPart(this, 16, 100);
		this.red4.setPivot(1.0F, -4.0F, 1.0F);
		this.red4.addCuboid(0.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(red4, -0.20943951023931953F, 0.0F, 0.27314402793711257F);
		this.red2 = new ModelPart(this, 0, 88);
		this.red2.setPivot(1.0F, -5.0F, 0.5F);
		this.red2.addCuboid(0.0F, -6.0F, 0.0F, 6, 6, 6, 0.0F);
		this.setRotateAngle(red2, -0.20943951023931953F, 0.0F, 0.27314402793711257F);
		this.ball = new ModelPart(this, 30, 64);
		this.ball.setPivot(1.0F, -1.6F, 1.0F);
		this.ball.addCuboid(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(ball, 0.0F, -0.7853981633974483F, 0.17453292519943295F);
		this.head.addChild(this.santaHat);
		this.santaHat.addChild(this.red1);
		this.red2.addChild(this.red3);
		this.red3.addChild(this.red4);
		this.red1.addChild(this.red2);
		this.red4.addChild(this.ball);
	}
}
