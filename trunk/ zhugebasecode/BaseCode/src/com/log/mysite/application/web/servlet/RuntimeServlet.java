package com.log.mysite.application.web.servlet;

import java.io.File;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.log.mysite.application.mvc.ModuleManger;
import com.log.mysite.application.mvc.ModuleView;
import com.log.mysite.application.web.util.WebContainer;

/**
 * @description
 * @author 诸葛晓寅
 * @date Jun 8, 2009 1:39:02 PM
 * @version 1.0
 */
public class RuntimeServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	private String moduleName;
	private String methodName;
	private String actionPath;
	private ModuleManger moduleManger = new ModuleManger();	
	
	private static final String MODULE = "module";
	private static final String METHOD = "method";
	private static final String ACTION_PATH = "actionPath";
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		this.doExecute(request, response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		this.doExecute(request, response);
	}
	protected void doExecute(HttpServletRequest request ,HttpServletResponse response){
		String module = request.getParameter(MODULE);
		String method = request.getParameter(METHOD);
		ModuleView moduleView = moduleManger.doExcute(request, response, module, method);
		if(moduleView !=null){
			
		}
	}

	public void init(ServletConfig conf) throws ServletException {
		super.init(conf);
		System.out.println("initRuntimeServlet");
		moduleName = conf.getInitParameter(MODULE);
		methodName = conf.getInitParameter(METHOD);
		actionPath = conf.getInitParameter(ACTION_PATH);
		
		WebContainer container = new WebContainer(conf.getServletContext());

		if (moduleName == null || "".equals(moduleName)) {
			moduleName = MODULE;
		}
		if (methodName == null || "".equals(methodName)) {
			methodName = METHOD;
		}
		if(actionPath == null || "".equals(actionPath)){
			actionPath = ACTION_PATH;			
		}
		
		try {
			File fileDir = new File(container.getResourcePath(actionPath));	
			moduleManger.initial(fileDir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("call RuntimeServlet init success");
	}
}
