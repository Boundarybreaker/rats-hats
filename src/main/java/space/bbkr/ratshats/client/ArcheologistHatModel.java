package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class ArcheologistHatModel extends HatModel {
	public ModelPart brim;
	public ModelPart top;
	public ModelPart dimple;

	public ArcheologistHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.brim = new ModelPart(this, 0, 64);
		this.brim.setPivot(0.0F, -9.0F, 0.0F);
		this.brim.addCuboid(-7.0F, 0.0F, -5.0F, 14, 1, 10, 0.0F);
		this.setRotateAngle(brim, 0.0F, 1.5707963267948966F, 0.0F);
		this.dimple = new ModelPart(this, 0, 71);
		this.dimple.setPivot(0.0F, -4.5F, 0.0F);
		this.dimple.addCuboid(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
		this.top = new ModelPart(this, 0, 75);
		this.top.setPivot(0.0F, 0.0F, 0.0F);
		this.top.addCuboid(-3.5F, -4.0F, -3.5F, 7, 4, 7, 0.0F);
		this.head.addChild(this.brim);
		this.top.addChild(this.dimple);
		this.brim.addChild(this.top);
	}

}
