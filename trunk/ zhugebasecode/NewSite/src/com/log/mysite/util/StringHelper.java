package com.log.mysite.util;

public class StringHelper {
	private StringHelper() {
	}

	public static String toUpperCase(String str) {
		return str == null ? null : str.toUpperCase();
	}

	public static String toLowerCase(String str) {
		return str == null ? null : str.toLowerCase();
	}
	
	
	
	public static boolean isNotEmpty(String str){
		return str != null && str.length()>0;
	}
	
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
