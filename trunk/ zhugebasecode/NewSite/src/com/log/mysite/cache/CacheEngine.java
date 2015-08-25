package com.log.mysite.cache;

import java.util.Collection;

public interface CacheEngine {
	
	public void init();
	
	public void stop();
	
	public void add(String key,Object value);
	
	public void add(String fqn,String key,Object value);
	
	public Object get(String fqn,String key);
	
	public Object get(String fqn);
	
	public void remove(String fqn);
	
	public void remove(String fqn,String key);
	
	public Collection getValues(String fqn);
}
