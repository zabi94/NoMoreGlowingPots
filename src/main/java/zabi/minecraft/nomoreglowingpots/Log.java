package zabi.minecraft.nomoreglowingpots;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	private static final Logger l = LogManager.getLogger(NoMoreGlowingPots.MOD_ID);
	
	public static void i(Object o) {
		l.info(o);
	}
	
	public static void d(Object o) {
		l.debug(o);
	}

	public static void w(Object o) {
		l.warn(o);
	}

	public static void e(Object o) {
		l.error(o);
	}
	
	public static void f(Object o) {
		l.fatal(o);
	}
}
