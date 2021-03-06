package space.bbkr.ratshats;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class CustomArmorMaterial implements ArmorMaterial {
	private String name;
	private int durability;
	private int[] damageReduction;
	private int encantability;
	private SoundEvent sound;
	private float toughness;
	private float knockbackResistance;
	private Ingredient ingredient = null;

	public CustomArmorMaterial(String name, int durability, int[] damageReduction, int encantability, SoundEvent sound, float toughness, float knockbackResistance) {
		this.name = name;
		this.durability = durability;
		this.damageReduction = damageReduction;
		this.encantability = encantability;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDurability(EquipmentSlot slotIn) {
		return durability;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slotIn) {
		return damageReduction[slotIn.getEntitySlotId()];
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@Override
	public int getEnchantability() {
		return encantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return ingredient == null ? Ingredient.EMPTY : ingredient;
	}

	public void setRepairMaterial(Ingredient ingredient){
		this.ingredient = ingredient;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}
