package com.log.mysite.application.mvc;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * @description
 * @author 诸葛晓寅
 * @date Jun 4, 2009 8:37:47 AM
 * @version 1.0
 */
public class ModuleHelper {
	public static List parse(File file) throws Exception {
		try {
			ArrayList moduleDescList = new ArrayList();
			SAXReader reader = new SAXReader();
			Document document = reader.read(file);
			List list = document.selectNodes("//dispath/module");
			for (Iterator it = list.iterator(); it.hasNext();) {
				ModuleDesc moduleDesc = new ModuleDesc();
				Node moduleNode = (Node) it.next();
				String name = moduleNode.valueOf("@name");
				moduleDesc.setName(name);
				String className = moduleNode.valueOf("@class");
				moduleDesc.setClassName(className);
				String initmethod = moduleNode.valueOf("@initmethod");
				moduleDesc.setInitMethod(initmethod);
				String destorymethod = moduleNode.valueOf("@destorymethod");
				moduleDesc.setDestoryMethod(destorymethod);
				moduleDescList.add(moduleDesc);

			}
			return moduleDescList;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
