package com.log.mysite.web.mvc;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 * @author 诸葛晓寅
 * @date Jun 4, 2009 6:15:39 PM
 * @version 1.0
 */
public class ModuleManger {
	private Map moduleCache = new HashMap();
	private Map proxyCache = new HashMap();

	public void initial(File fileDir) {
		try {
			File[] fileArray = fileDir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return (name.endsWith(".xml"));
				}
			});
			
			for (int i = 0; i < fileArray.length; i++) {
				List list = ModuleHelper.parse(fileArray[i]);
				for (Iterator it = list.iterator(); it.hasNext();) {
					ModuleDesc moduleDesc = (ModuleDesc) it.next();
					ModuleProxy moduleProxy = new ModuleProxy(moduleDesc);
					moduleProxy.initial();
					moduleCache.put(moduleDesc.getName(), moduleDesc);
					proxyCache.put(moduleDesc, moduleProxy);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ModuleView doExcute(HttpServletRequest request,
			HttpServletResponse response, String module, String method) {
		  if(module == null || "".equals(module)){
			  throw new RuntimeException("can't location target module");
		  }
		  if(!moduleCache.containsKey(module)){
			  throw new RuntimeException("can't location target module");			 
		  }
		  ModuleProxy moduleProxy = (ModuleProxy)proxyCache.get(moduleCache.get(module));
		  return moduleProxy.execute(request, response, method);
	}
}
