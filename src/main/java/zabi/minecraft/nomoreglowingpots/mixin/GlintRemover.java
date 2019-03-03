package zabi.minecraft.nomoreglowingpots.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;

@Mixin(PotionItem.class)
public class GlintRemover extends Item {
	
	public GlintRemover(Settings settings) {
		super(settings);
	}

	@Inject(method = "hasEnchantmentGlint", at = @At("HEAD"), require = 1)
	public void hasEnchantmentGlow(ItemStack stack, CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(super.hasEnchantmentGlint(stack));;
	}
}
