package zabi.minecraft.nomoreglowingpots.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;

@Mixin(PotionItem.class)
public class GlintRemover extends Item {
	
	public GlintRemover(Settings settings) {
		super(settings);
	}

	@Overwrite
	public boolean hasEnchantmentGlow(ItemStack stack) {
		return false;
	}
}
