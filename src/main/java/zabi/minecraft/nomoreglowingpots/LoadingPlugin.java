package zabi.minecraft.nomoreglowingpots;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

@Name("No More Glowing Pots")
@TransformerExclusions({
		"zabi.minecraft.nomoreglowingpots"
	})
public class LoadingPlugin implements IFMLLoadingPlugin {
	
	@Override
	public String[] getASMTransformerClass() {
			return new String[] {
					"zabi.minecraft.nomoreglowingpots.PotionTransformer"
			};
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
