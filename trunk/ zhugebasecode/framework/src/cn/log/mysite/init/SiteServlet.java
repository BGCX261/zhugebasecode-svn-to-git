package cn.log.mysite.init;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SiteServlet extends SiteBaseServlet {

	public void init(ServletConfig config) throws ServletException {
		super.init(config); //启动配置文件
		super.startApplication();// 启动应用程序

		//启动数据库
		
		//启动网站各种基本信息
	}

	public void service(HttpServletRequest request, HttpServletResponse res){

	}

	public void destroy() {
		try {
			super.destroy();
			System.out.println("Destorying Site .....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
