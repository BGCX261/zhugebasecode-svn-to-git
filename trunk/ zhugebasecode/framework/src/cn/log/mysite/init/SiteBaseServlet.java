package cn.log.mysite.init;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import cn.log.mysite.base.ConfigLoader;
import cn.log.mysite.exceptions.SiteStartupException;

public class SiteBaseServlet extends HttpServlet {

	private static final Logger logger = Logger
			.getLogger(SiteBaseServlet.class);

	protected void startApplication() {
		try {
			
		} catch (Exception e) {
			throw new SiteStartupException("Error while start site", e);
		}
	}

	public void init(ServletConfig config) throws ServletException {
		super.init();
		try {
			String appPath = config.getServletContext().getRealPath("");
			logger.info("Start SiteBaseServlet .....");
			ConfigLoader.startSystemglobals(appPath);// 系统配置
			ConfigLoader.startCacheEngine();//
			// 模块映射
		} catch (Exception e) {
			throw new SiteStartupException("Error while start site", e);
		}

	}

}
