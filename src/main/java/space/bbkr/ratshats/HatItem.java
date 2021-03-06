package space.bbkr.ratshats;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class HatItem extends ArmorItem {
	private int modelIndex;
	private String name;

	public HatItem(String name, int modelIndex) {
		super(RatsHats.HAT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
		this.setRegistryName(RatsHats.MODID, name);
		this.modelIndex = modelIndex;
		this.name = name;
	}

	public HatItem(String name, int modelIndex, ItemGroup group) {
		super(RatsHats.HAT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(group));
		this.setRegistryName(RatsHats.MODID, name);
		this.modelIndex = modelIndex;
		this.name = name;
	}

	public HatItem(ArmorMaterial mat, String name, int modelIndex) {
		super(mat, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
		this.setRegistryName(RatsHats.MODID, name);
		this.modelIndex = modelIndex;
		this.name = name;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void appendTooltip(ItemStack stack, @Nullable World worldIn, List<Text> tooltip, TooltipContext flagIn) {
		if (stack.getItem() == RatsHats.ARCHEOLOGIST_HAT) {
			tooltip.add(new TranslatableText("item.rats-hats.archeologist_hat.desc").formatted(Formatting.GRAY));
		}
		if (stack.getItem() == RatsHats.PLAGUE_DOCTOR_MASK) {
			tooltip.add(new TranslatableText("item.rats-hats.plague_doctor_mask.desc").formatted(Formatting.GRAY));
		}
		if (stack.getItem() == RatsHats.BLACK_DEATH_MASK) {
			tooltip.add(new TranslatableText("item.rats-hats.plague_doctor_mask.desc").formatted(Formatting.GRAY));
			tooltip.add(new TranslatableText("item.rats-hats.black_death_mask.desc").formatted(Formatting.GRAY));
		}
		if (stack.getItem() == RatsHats.RAT_FEZ) {
			tooltip.add(new TranslatableText("item.rats-hats.rat_fez.desc0").formatted(Formatting.GRAY));
			tooltip.add(new TranslatableText("item.rats-hats.rat_fez.desc1").formatted(Formatting.GRAY));
		}
	}

	@OnlyIn(Dist.CLIENT)
	@Nullable
	@Override
	public <A extends BipedEntityModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default) {
		return (A) RatsHats.PROXY.getArmorModel(modelIndex);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
		return "rats-hats:textures/model/" + name + ".png";
	}
}
