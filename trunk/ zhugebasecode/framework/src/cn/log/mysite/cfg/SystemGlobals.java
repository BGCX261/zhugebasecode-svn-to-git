package cn.log.mysite.cfg;


import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import cn.log.mysite.exceptions.SiteException;

public class SystemGlobals {
	private static final Logger logger = Logger.getLogger(Logger.class);

	private static SystemGlobals globals = new SystemGlobals();

	private String defaultConfig;

	private static Properties defaults = new Properties();


	
	public SystemGlobals() {
	}

	public static void initGlobals(String appPath, String configurationFile) throws Exception {
		globals = new SystemGlobals();
		globals.bulidingSystem(appPath, configurationFile);
	}

	private void bulidingSystem(String appPath, String configurationFile) throws Exception {
		if (configurationFile == null) {
			throw new InvalidParameterException(
					"configuration could not be null");// 初始化错误
		}
		this.defaultConfig = configurationFile;
		this.defaults = new Properties();
		
		
		this.defaults.put(ConfigKeys.APPLICATION_PATH, appPath);
		this.defaults.put(ConfigKeys.DEFAULT_CONFIG, configurationFile);
		SystemGlobals.loadDefault();
	}
	
	public static String getValue(String key){
		return globals.defaults.getProperty(key);
	}

	public static void loadDefault() throws Exception {
		FileInputStream file = null;
		try {
			file = new FileInputStream(globals.defaultConfig);
			globals.defaults.load(file);
		} catch (IOException e) {			
			throw new SiteException(e);
		} finally {
			if(file!=null){
				try{
					file.close();
				}catch(IOException e){}
				
			}
		}
	}
	
	
}
