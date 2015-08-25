package com.log.mysite.web.parser;

import javax.servlet.http.HttpServletRequest;

/**
 * @description  
 * @author  诸葛晓寅
 * @date Jun 11, 2009 10:15:12 AM
 * @version  1.0
 */
public abstract class AbstractCommonParser {
	private static final String type = "GET";
	public Object parser(HttpServletRequest request){
		ParameterContainer container = new ParameterContainer();
		return null;
	}
}
