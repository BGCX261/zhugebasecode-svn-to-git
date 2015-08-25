package cn.log.mysite.exceptions;

public class SiteStartupException extends SiteException{
	public SiteStartupException(String message,Throwable t){
		super(message,t);
		this.setStackTrace(t.getStackTrace());
	}
}
