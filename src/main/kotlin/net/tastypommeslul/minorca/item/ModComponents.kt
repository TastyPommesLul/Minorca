package net.tastypommeslul.minorca.item

import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.component.Consumable
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect
import net.tastypommeslul.minorca.utils.Tick

object ConsumeProps {
  val poisonFish: Consumable = Consumable.builder()
    .onConsume(ApplyStatusEffectsConsumeEffect(MobEffectInstance(MobEffects.POISON, Tick.fromSeconds(30), 0), 1.0f))
    .build()
}

object FoodProps {
  val poisonFish: FoodProperties = FoodProperties.Builder().alwaysEdible().build()
}