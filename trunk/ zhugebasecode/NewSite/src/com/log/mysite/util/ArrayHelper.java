package com.log.mysite.util;

public class ArrayHelper {
	
	public static String[] toStringArray(Object[] objects){
		int len = objects.length;
		String[] result = new String[len];//new String(len);
		
		for(int i = 0 ;i<len;i++){
			result[i] = objects[i].toString();
		}
		return result;
	}
	
	public static int indexof(Object[] array, Object object) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].equals(object)){
				return i;
			}
		}
		return -1;
	}
}
