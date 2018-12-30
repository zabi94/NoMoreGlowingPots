package zabi.minecraft.nomoreglowingpots;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;

public class Snippets {
	public static boolean shouldGlow(ItemStack stack) {
		if (ModConfig.enableGlint) {
			return stack.isItemEnchanted() || !PotionUtils.getEffectsFromStack(stack).isEmpty();
		}
		return stack.isItemEnchanted();
	}
}
