package cn.log.mysite.exceptions;

public class SiteException extends RuntimeException{
	
	public SiteException(){
		super();
	}
	
	public SiteException(String message){
		super(message);
	}
	
	public SiteException(Throwable t){
		super(t);
	}
	
	public SiteException(String message,Throwable t){
		super(message,t);
		this.setStackTrace(t.getStackTrace());
	}

}
