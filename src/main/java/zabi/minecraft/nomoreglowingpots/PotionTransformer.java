package zabi.minecraft.nomoreglowingpots;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;

import net.minecraft.launchwrapper.IClassTransformer;

public class PotionTransformer implements IClassTransformer {

	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) {
		
		if (transformedName.equals("net.minecraft.item.ItemPotion")) {
			ClassReader cr = new ClassReader(basicClass);
			ClassNode cn = new ClassNode();
			cr.accept(cn, 0);
			boolean transformed = false;
			for (Mapping map:Mapping.mappings) {
				if (transformed) break;
				Log.i("Trying to use "+map.name+" to patch class");

				String s_name_mcp = map.name_mcp;
				String s_name_srg = map.name_srg;
				String s_name_obf = map.name_obf;
				String s_desc_srg = map.desc_srg;
				String s_desc_obf = map.desc_obf;

				for (MethodNode mn : cn.methods) {
					Log.d("Method name: "+mn.name);
					Log.d("Method desc: "+mn.desc);
					if (mn.name.equals(s_name_mcp)||mn.name.equals(s_name_srg)||mn.name.equals(s_name_obf)) {
						if (mn.desc.equals(s_desc_srg)||mn.desc.equals(s_desc_obf)) {
							Log.d("Method matched!");
							InsnList il = new InsnList();
							il.add(new InsnNode(Opcodes.ICONST_0)); //Load false (Integer 0)
							il.add(new InsnNode(Opcodes.IRETURN));	//Return loaded integer 
							mn.instructions = il;
							transformed = true;
						} else {
						}
					}
				}
			}
			if (transformed) {
				Log.i("Successfully transformed potion class");
				ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
				cn.accept(cw);
				return cw.toByteArray();
			} else {
				Log.e("Potion class failed to transform, potion glint couldn't be removed - please report this error");
				return basicClass;
			}
		} else {
			return basicClass;
		}
	}

}
