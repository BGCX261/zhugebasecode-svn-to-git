package com.log.mysite.web.assistant;

import org.dom4j.Document;

public interface ExecuteResult {
	
	public void setMessage(String message);
	
	public String getMessage();
	
	public void setObject(Object object);
	
	public Object getObject();
	
	public void setState(int state);
	
	public int getState();
	
	public boolean isSuccess();
	
	public void setSuccess(boolean success);
	
	public abstract Document createXML(ObjectWrapper wrapper);
	
	
	
}
