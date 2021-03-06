package space.bbkr.ratshats;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import space.bbkr.ratshats.client.ClientProxy;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.HuskEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("rats-hats")
public class RatsHats {
	// Directly reference a log4j logger.
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "rats-hats";

	public static CustomArmorMaterial PIPER_HAT_ARMOR_MATERIAL = new CustomArmorMaterial("PiperHat", 600, new int[]{2, 1, 1, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0);
	public static CustomArmorMaterial CHEF_TOQUE_ARMOR_MATERIAL = new CustomArmorMaterial("ChefToque", 200, new int[]{1, 1, 1, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0);
	public static CustomArmorMaterial HAT_ARMOR_MATERIAL = new CustomArmorMaterial("Hat", 200, new int[]{1, 1, 1, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0);
	public static CustomArmorMaterial PLAGUE_MASK_MATERIAL = new CustomArmorMaterial("PlagueMask", 100, new int[]{3, 1, 1, 1}, 100, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1, 0);

	public static final Item CHEF_TOQUE = new ChefToqueItem();
	public static final Item PIPER_HAT = new PiperHatItem();
	public static final Item ARCHEOLOGIST_HAT = new HatItem("archeologist_hat", 3);
	public static final Item FARMER_HAT = new HatItem("farmer_hat", 4);
	public static final Item FISHERMAN_HAT = new HatItem("fisherman_hat", 4);
	public static final Item RAT_FEZ = new HatItem("rat_fez", 6);
	public static final Item TOP_HAT = new HatItem("top_hat", 7);
	public static final Item SANTA_HAT = new HatItem("santa_hat", 8);
	public static final Item HALO_HAT = new HatItem("halo_hat", 10);
	public static final Item PARTY_HAT_1 = new HatItem("party_hat_1", 11);
	public static final Item PARTY_HAT_2 = new HatItem("party_hat_2", 11);
	public static final Item PARTY_HAT_3 = new HatItem("party_hat_3", 11);
	public static final Item PARTY_HAT_4 = new HatItem("party_hat_4", 11);
	public static final Item PIRAT_HAT = new HatItem("pirat_hat", 2);
	public static final Item RAT_KING_CROWN = new HatItem("rat_king_crown", 4);
	public static final Item PLAGUE_DOCTOR_MASK = new HatItem(PLAGUE_MASK_MATERIAL, "plague_doctor_mask", 5);
	public static final Item BLACK_DEATH_MASK = new HatItem(PLAGUE_MASK_MATERIAL, "black_death_mask", 5);
	public static final Item AVIATOR_HAT = new HatItem("aviator_hat", 13);
	public static final Item GHOST_PIRAT_HAT = new HatItem("ghost_pirat_hat", 9);
	public static final Item MILITARY_HAT = new HatItem("military_hat", 12);

	public static CommonProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);

	public RatsHats() {
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventBusSubscriber(modid = MODID)
	public static class GeneralEvents {
		public static final float ARCHEOLOGIST_HAT_SPAWN_RATE = 0.12F; //TODO: config?
		@SubscribeEvent
		public static void onEntityJoinWorld(LivingSpawnEvent.SpecialSpawn event) {
			if (event.getEntity() != null && event.getEntity() instanceof HuskEntity) {
				if (((HuskEntity) event.getEntity()).getRandom().nextFloat() < ARCHEOLOGIST_HAT_SPAWN_RATE) {
					event.getEntity().equipStack(EquipmentSlot.HEAD, new ItemStack(ARCHEOLOGIST_HAT));
				}
			}
			if (event.getEntity() != null && event.getEntity() instanceof SkeletonEntity) {
				if (((SkeletonEntity) event.getEntity()).getRandom().nextFloat() < ARCHEOLOGIST_HAT_SPAWN_RATE * 0.05F) {
					event.getEntity().equipStack(EquipmentSlot.HEAD, new ItemStack(ARCHEOLOGIST_HAT));
				}
			}
		}
	}

	// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					CHEF_TOQUE,
					PIPER_HAT,
					ARCHEOLOGIST_HAT,
					FARMER_HAT,
					FISHERMAN_HAT,
					RAT_FEZ,
					TOP_HAT,
					SANTA_HAT,
					HALO_HAT,
					PARTY_HAT_1,
					PARTY_HAT_2,
					PARTY_HAT_3,
					PARTY_HAT_4,
					PIRAT_HAT,
					RAT_KING_CROWN,
					PLAGUE_DOCTOR_MASK,
					BLACK_DEATH_MASK,
					AVIATOR_HAT,
					GHOST_PIRAT_HAT,
					MILITARY_HAT
			);
		}
	}
}