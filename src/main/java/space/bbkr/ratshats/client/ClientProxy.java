package space.bbkr.ratshats.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import space.bbkr.ratshats.CommonProxy;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy {
	@OnlyIn(Dist.CLIENT)
	public Object getArmorModel(int index) {
		if (index == 0) {
			return new ChefToqueModel(1.0F);
		} else if (index == 1) {
			return new PiperHatModel(1.0F);
		} else if (index == 2) {
			return new PiratHatModel(1.0F);
		} else if (index == 3) {
			return new ArcheologistHatModel(1.0F);
		} else if (index == 4) {
			return new FarmerHatModel(1.0F);
		} else if (index == 5) {
			return new PlagueDoctorMaskModel(1.0F);
		} else if (index == 6) {
			return new RatFezModel(1.0F);
		} else if (index == 7) {
			return new TopHatModel(1.0F);
		} else if (index == 8) {
			return new SantaHatModel(1.0F);
		} else if (index == 9) {
			return new GhostPiratHatModel(1.0F);
		} else if (index == 10) {
			return new HaloHatModel(0.5F);
		} else if (index == 11) {
			return new PartyHatModel(0.5F);
		} else if (index == 12) {
			return new MilitaryHatModel(1.2F);
		} else if (index == 13) {
			return new AviatorHatModel(1.0F);
		} else {
			return null;
		}
	}
}
