package space.bbkr.ratshats.client;

import net.minecraft.client.model.Model;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;

public class GlowyModelPart extends ModelPart {

	public GlowyModelPart(Model model) {
		super(model);
	}

	public GlowyModelPart(Model model, int texOffX, int texOffY) {
		super(model, texOffX, texOffY);
	}

	public GlowyModelPart(int textureWidthIn, int textureHeightIn, int textureOffsetXIn, int textureOffsetYIn) {
		super(textureWidthIn, textureHeightIn, textureOffsetXIn, textureOffsetYIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn) {
		super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);

	}
}
