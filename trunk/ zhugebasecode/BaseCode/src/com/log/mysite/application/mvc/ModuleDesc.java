package com.log.mysite.application.mvc;
/**
 * @description  
 * @author  诸葛晓寅
 * @date Jun 1, 2009 3:16:01 PM
 * @version  1.0
 */
public class ModuleDesc {
	private String name; 
	private String className;
	private String initMethod;
	private String destoryMethod;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getInitMethod() {
		return initMethod;
	}
	public void setInitMethod(String initMethod) {
		this.initMethod = initMethod;
	}
	public String getDestoryMethod() {
		return destoryMethod;
	}
	public void setDestoryMethod(String destoryMethod) {
		this.destoryMethod = destoryMethod;
	}
	
	

}
