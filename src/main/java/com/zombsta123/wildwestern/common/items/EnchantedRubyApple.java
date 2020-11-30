package com.zombsta123.wildwestern.common.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EnchantedRubyApple extends FoodBase {

	public EnchantedRubyApple(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) 
	{
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 2000, 4, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 50, 200, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2000, 1, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2000, 4, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 2000, 1, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2000, 1, false, false));
		
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
