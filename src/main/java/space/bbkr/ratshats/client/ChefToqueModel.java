package space.bbkr.ratshats.client;

import net.minecraft.client.model.ModelPart;

public class ChefToqueModel extends HatModel{
	public ModelPart toupe;

	public ChefToqueModel(float scale) {
		super(scale, 0, 64, 128);
		this.toupe = new ModelPart(this, 0, 64);
		this.toupe.setPivot(0.0F, -7.0F, 0.0F);
		this.toupe.addCuboid(-4.5F, -15.0F, -4.5F, 9, 16, 9, 0.0F);
		this.setRotateAngle(toupe, -0.27314402793711257F, 0.0F, 0.0F);
		this.head.addChild(toupe);
	}
}
