package zabi.minecraft.nomoreglowingpots;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = NoMoreGlowingPots.MOD_ID)
@Mod.EventBusSubscriber
public class ModConfig {
	
	@Config.Comment("Set this to true to enable default potion glint")
	public static boolean enableGlint = false;
	
	@SubscribeEvent
	public static void saveConfig(ConfigChangedEvent evt) {
		if (evt.getModID().equals(NoMoreGlowingPots.MOD_ID)) {
			ConfigManager.sync(NoMoreGlowingPots.MOD_ID, Type.INSTANCE);
		}
	}
	
}
