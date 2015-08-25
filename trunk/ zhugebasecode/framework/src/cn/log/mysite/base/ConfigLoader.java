package cn.log.mysite.base;

import org.apache.log4j.Logger;

import cn.log.mysite.cfg.SystemGlobals;

public class ConfigLoader {
	private static Logger logger = Logger.getLogger(ConfigLoader.class);
	public static boolean startDatabase(){
		return false;
	}
	public static void startSystemglobals(String appPath)throws Exception{		
		SystemGlobals.initGlobals(appPath, "/WEB-INF/config/SystemGlobals.properties");
	}
	public static void startCacheEngine(){
		
	}
	public static void startCache(){
		
	}
	
	
	
}
