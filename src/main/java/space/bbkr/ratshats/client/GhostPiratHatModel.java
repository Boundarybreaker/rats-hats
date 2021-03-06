package space.bbkr.ratshats.client;

public class GhostPiratHatModel extends HatModel {
	public GlowyModelPart piratHat1;
	public GlowyModelPart brim1;
	public GlowyModelPart brim2;
	public GlowyModelPart brim3;
	public GlowyModelPart brim4;
	public GlowyModelPart middle;
	public GlowyModelPart brim6;
	public GlowyModelPart brim5;
	public GlowyModelPart brim6_1;

	public GhostPiratHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.middle = new GlowyModelPart(this, 0, 86);
		this.middle.setPivot(0.0F, 0.0F, 0.0F);
		this.middle.addCuboid(-4.0F, -5.0F, -3.0F, 8, 5, 6, 0.0F);
		this.brim3 = new GlowyModelPart(this, 23, 78);
		this.brim3.setPivot(6.0F, 0.0F, 0.0F);
		this.brim3.addCuboid(0.01F, -3.0F, -4.0F, 1, 3, 8, 0.0F);
		this.brim2 = new GlowyModelPart(this, 0, 80);
		this.brim2.setPivot(0.0F, 0.0F, 4.0F);
		this.brim2.addCuboid(-7.0F, -4.0F, 0.0F, 14, 4, 1, 0.0F);
		this.setRotateAngle(brim2, 0.17453292519943295F, 0.0F, 0.0F);
		this.brim6_1 = new GlowyModelPart(this, 1, 101);
		this.brim6_1.setPivot(0.0F, -3.0F, 0.0F);
		this.brim6_1.addCuboid(-3.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F);
		this.piratHat1 = new GlowyModelPart(this, -10, 64);
		this.piratHat1.setPivot(0.0F, -6.0F, 0.0F);
		this.piratHat1.addCuboid(-7.0F, -0.01F, -5.0F, 14, 0, 9, 0.0F);
		this.setRotateAngle(piratHat1, 0.0F, 3.141592653589793F, 0.0F);
		this.brim1 = new GlowyModelPart(this, 0, 75);
		this.brim1.setPivot(0.0F, 0.0F, -5.0F);
		this.brim1.addCuboid(-7.0F, -4.0F, 0.0F, 14, 4, 1, 0.0F);
		this.setRotateAngle(brim1, -0.17453292519943295F, 0.0F, 0.0F);
		this.brim6 = new GlowyModelPart(this, 30, 90);
		this.brim6.setPivot(0.0F, -4.0F, 0.0F);
		this.brim6.addCuboid(-5.0F, -2.0F, 0.0F, 10, 2, 1, 0.0F);
		this.brim5 = new GlowyModelPart(this, 0, 97);
		this.brim5.setPivot(0.0F, -4.0F, 0.0F);
		this.brim5.addCuboid(-5.0F, -3.0F, 0.0F, 10, 3, 1, 0.0F);
		this.brim4 = new GlowyModelPart(this, 23, 78);
		this.brim4.setPivot(-6.0F, 0.0F, 0.0F);
		this.brim4.addCuboid(-1.01F, -3.0F, -4.0F, 1, 3, 8, 0.0F);
		this.piratHat1.addChild(this.middle);
		this.piratHat1.addChild(this.brim3);
		this.piratHat1.addChild(this.brim2);
		this.brim5.addChild(this.brim6_1);
		this.piratHat1.addChild(this.brim1);
		this.brim1.addChild(this.brim6);
		this.brim2.addChild(this.brim5);
		this.piratHat1.addChild(this.brim4);
		this.head.addChild(this.piratHat1);
	}
}