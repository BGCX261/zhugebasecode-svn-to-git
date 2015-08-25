package cn.log.mysite.base;

import java.sql.Connection;

import org.apache.log4j.Logger;

/**
 * @desc 执行上下文
 * @author zhuge
 * 
 */
public class ExecutionContext {
	private static Logger logger = Logger.getLogger(ExecutionContext.class);

	private static ThreadLocal userData = new ThreadLocal();
	private Connection conn;

	// private

	public static ExecutionContext get() {
		ExecutionContext ex = (ExecutionContext) userData.get();
		if (ex == null) {
			ex = new ExecutionContext();
			userData.set(ex);
		}
		return ex;
	}

	public static void set(ExecutionContext ex) {
		userData.set(ex);
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}

	public static Connection getConnection() {
		return getConnection(true);

	}

	public static Connection getConnection(boolean validate) {
		ExecutionContext ex = (ExecutionContext) userData.get();
		Connection conn = ex.conn;
		if (validate && conn == null) {
			
		}
		return ex.conn;
	}

}
