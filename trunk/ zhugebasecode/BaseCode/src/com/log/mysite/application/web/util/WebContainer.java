package com.log.mysite.application.web.util;

import javax.servlet.ServletContext;

/**
 * @description
 * @author 诸葛晓寅
 * @date Jun 8, 2009 2:03:48 PM
 * @version 1.0
 */
public class WebContainer {
	private ServletContext context;

	public WebContainer(ServletContext context) {
		this.context = context;
	}
   
	public String getRealPath(){
		if(context == null){
			return "";
		}
		return this.context.getRealPath("/").replace("\\", "/");
	}
	public String getResourcePath(String path) {
		if(context == null){
			return "";
		}
		return this.context.getRealPath("/").replace("\\", "/")+"WEB-INF/"+path;
	}
}
