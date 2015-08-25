package com.log.mysite.web.mvc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 * @author 诸葛晓寅
 * @date Jun 4, 2009 7:59:46 PM
 * @version 1.0
 */
public class ModuleProxy {
	private ModuleDesc moduleDesc = null;
	private Object targetObj;
	private Map methodMap = null;

	public ModuleProxy(ModuleDesc moduleDesc) {
		this.moduleDesc = moduleDesc;
		methodMap = new HashMap();
	}

	public void initial() throws Exception {

		targetObj = Class.forName(moduleDesc.getClassName()).newInstance();
		if ((moduleDesc.getInitMethod() != null)
				&& (!"".equals(moduleDesc.getInitMethod()))) {
			Method initMethod = targetObj.getClass().getMethod(
					moduleDesc.getInitMethod(), new Class[] {});
			initMethod.invoke(targetObj, new Object[] {});
		}

	}

	public void destory() throws Exception {
		if (targetObj != null) {
			if ((moduleDesc.getDestoryMethod() != null)
					&& (!"".equals(moduleDesc.getDestoryMethod()))) {
				Method destoryMethod = targetObj.getClass().getMethod(
						moduleDesc.getDestoryMethod(), new Class[] {});
				destoryMethod.invoke(targetObj, new Object[] {});
			}
		}
	}

	public ModuleView execute(HttpServletRequest req, HttpServletResponse res,
			String methodName) {
		if (methodName == null || "".equals(methodName)) {
			throw new RuntimeException("Module[" + moduleDesc.getName()
					+ "]not method [" + methodName + "]");
		}
		
		Method method = (Method) methodMap.get(methodName);
		if (method == null) {
			try {
				
				method = targetObj.getClass().getMethod(
						methodName,
						new Class[] { HttpServletRequest.class,
								HttpServletResponse.class });
				
				methodMap.put(methodName, method);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Module[" + moduleDesc.getName()
						+ "]not method [" + methodName + "]");
			}
		}
		if (method == null) {
			throw new RuntimeException("Module[" + moduleDesc.getName()
					+ "] can't location \"" + methodName + "\" method");
		}
		try {
			ModuleView moduleView = (ModuleView) method.invoke(targetObj,
					new Object[] { req, res });
			return moduleView;

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"IllegalAccessException occur when call Module["
							+ moduleDesc.getName() + "]->" + methodName
							+ "() method");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"IllegalAccessException occur when call Module["
							+ moduleDesc.getName() + "]->" + methodName
							+ "() method");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"InvocationTargetException occur when call Module["
							+ moduleDesc.getName() + "]->" + methodName
							+ "() method");
		}
	
	}
}
