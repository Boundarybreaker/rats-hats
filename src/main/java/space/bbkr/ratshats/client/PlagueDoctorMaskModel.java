package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class PlagueDoctorMaskModel extends HatModel{
	public ModelPart hat;
	public ModelPart plagueMaskNose;
	public ModelPart brim;
	public ModelPart plagueMaskNose_1;

	public PlagueDoctorMaskModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.plagueMaskNose_1 = new ModelPart(this, 16, 87);
		this.plagueMaskNose_1.setPivot(0.0F, 0.0F, -3.5F);
		this.plagueMaskNose_1.addCuboid(-1.0F, -1.0F, -3.0F, 2, 2, 4, 0.1F);
		this.setRotateAngle(plagueMaskNose_1, 0.17453292519943295F, 0.0F, 0.0F);
		this.hat = new ModelPart(this, 0, 68);
		this.hat.setPivot(0.0F, 0.0F, 0.0F);
		this.hat.addCuboid(-4.0F, -11.0F, -4.0F, 8, 11, 8, 0.1F);
		this.plagueMaskNose = new ModelPart(this, 0, 87);
		this.plagueMaskNose.setPivot(0.0F, -2.0F, -5.0F);
		this.plagueMaskNose.addCuboid(-1.5F, -1.5F, -3.0F, 3, 3, 5, 0.1F);
		this.setRotateAngle(plagueMaskNose, 0.17453292519943295F, 0.0F, 0.0F);
		this.brim = new ModelPart(this, -14, 95);
		this.brim.setPivot(0.0F, -8.0F, 0.0F);
		this.brim.addCuboid(-7.0F, 0.0F, -7.0F, 14, 0, 14, 0.1F);
		this.plagueMaskNose.addChild(this.plagueMaskNose_1);
		this.hat.addChild(this.plagueMaskNose);
		this.hat.addChild(this.brim);
		this.head.addChild(this.hat);
	}
}
