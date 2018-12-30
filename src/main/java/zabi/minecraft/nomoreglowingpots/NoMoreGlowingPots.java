package zabi.minecraft.nomoreglowingpots;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;

@Mod(clientSideOnly=true, modid=NoMoreGlowingPots.MOD_ID, name=NoMoreGlowingPots.NAME, version=NoMoreGlowingPots.VERSION, certificateFingerprint = NoMoreGlowingPots.FINGERPRINT)
public class NoMoreGlowingPots {
	
	public static final String MOD_ID = "nomoreglowingpots";
	public static final String NAME = "NoMoreGlowingPots";
	public static final String VERSION = "@VERSION@";
	public static final String MC_VERSION = "[1.8,1.12.2]";
	public static final String FINGERPRINT = "@FINGERPRINT@";
	
	@EventHandler
	public void fingerprintViolation(FMLFingerprintViolationEvent evt) {
		Log.e("Fingerprint doesn't match! The mod may have been modified, be careful!\n\nYou should only download mods from authoritative sources, like https://minecraft.curseforge.com\n\n");
	}
	
}
