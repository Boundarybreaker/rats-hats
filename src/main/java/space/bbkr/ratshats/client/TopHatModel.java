package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class TopHatModel extends HatModel {
	public ModelPart head;
	public ModelPart top;
	public ModelPart brimMiddle;

	public TopHatModel(float scale) {
		super(scale, 0, 64, 128);
		this.textureWidth = 64;
		this.textureHeight = 128;
		this.brimMiddle = new ModelPart(this, 0, 101);
		this.brimMiddle.setPivot(0.0F, -0.1F, 0.0F);
		this.brimMiddle.addCuboid(-5.0F, -0.01F, -5.0F, 10, 1, 10, 0.0F);
		this.top = new ModelPart(this, 0, 86);
		this.top.setPivot(0.0F, -8.0F, 0.0F);
		this.top.addCuboid(-3.5F, -8.0F, -3.5F, 7, 8, 7, 0.0F);
		this.head = new ModelPart(this, 0, 0);
		this.head.setPivot(0.0F, 0.0F, 0.0F);
		this.head.addCuboid(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.top.addChild(this.brimMiddle);
		this.head.addChild(this.top);
	}
}
