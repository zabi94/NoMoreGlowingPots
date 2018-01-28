package zabi.minecraft.nomoreglowingpots;

import java.util.ArrayList;

public class Mapping {
	
	public static final ArrayList<Mapping> mappings = new ArrayList<Mapping>(10);
	
	public Mapping(String mappingName, String method_name, String method_name_srg, String method_name_obf, String method_description_srg, String method_description_obf) {
		this.name = mappingName;
		this.name_mcp = method_name;
		this.name_srg = method_name_srg;
		this.name_obf = method_name_obf;
		this.desc_obf = method_description_obf;
		this.desc_srg = method_description_srg;
		mappings.add(this);
	}

	public String name_mcp;//mcp name of hasEffect
	public String name_srg;//srg name of hasEffect
	public String name_obf;//obf name of hasEffect
	public String desc_srg;//ASM method signature src
	public String desc_obf;//ASM method signature obf (parameter is obf name of ItemStack.class)
	public String name;//Name of the mapping



	static {
		new Mapping("1.12 v2", 			"hasEffect", "func_77962_s", "f_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Laip;)Z");
		new Mapping("1.12 v1", 			"hasEffect", "func_77636_d", "f_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Lain;)Z");
		new Mapping("1.11 v2", 			"hasEffect", "func_77636_d", "f_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Lafj;)Z");
		new Mapping("1.11 v1 (alt)", 	"hasEffect", "func_77636_d", "f_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Lafi;)Z");
		new Mapping("1.10 v1", 			"hasEffect", "func_77636_d", "i_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Ladz;)Z");
		new Mapping("1.9.4 v1", 		"hasEffect", "func_77636_d", "i_",	"(Lnet/minecraft/item/ItemStack;)Z", "(Ladq;)Z");
		new Mapping("1.8 v2", 			"hasEffect", "func_77636_d", "f",	"(Lnet/minecraft/item/ItemStack;)Z", "(Lzx;)Z");
		new Mapping("1.8 v1", 			"hasEffect", "func_77636_d", "f",	"(Lnet/minecraft/item/ItemStack;)Z", "(Lamj;)Z");
	}

}
