package com.log.mysite.application.web.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * @description 容器
 * @author 诸葛晓寅
 * @date Jun 11, 2009 10:22:58 AM
 * @version 1.0
 */
public class ParameterContainer {
	private Map map = new HashMap();

	public void insertValue(String name, String value) {
		map.put(name, value);
	}

	public void insertValue(String name, String[] value) {
		map.put(name, value);
	}

	public String getValue(String name) {
		if (name == null || "".equals(name)) {
			return "";
		}
		return ((map.containsKey(name)) ? (String) map.get(name) : "");
	}

	public String[] getValueArray(String name) {
		if (name == null || "".equals(name)) {
			return null;
		}
		return (String[]) ((map.containsKey(name)) ? map.get(name) : "");

	}

}
