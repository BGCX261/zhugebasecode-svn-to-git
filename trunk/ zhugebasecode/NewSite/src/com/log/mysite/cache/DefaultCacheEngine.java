package com.log.mysite.cache;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DefaultCacheEngine implements CacheEngine {
	
	private Map cache = new HashMap();
	
	public void add(String key, Object value) {
		this.cache.put(key, value);
	}

	
	public void add(String fqn, String key, Object value) {
		Map m = (Map)this.cache.get(fqn);

	}

	
	public Object get(String fqn, String key) {
		
		return null;
	}

	
	public Object get(String fqn) {
		
		return null;
	}

	
	public Collection getValues(String fqn) {
		
		return null;
	}

	
	public void init() {
		this.cache = new HashMap();

	}

	
	public void remove(String fqn) {
		

	}

	
	public void remove(String fqn, String key) {
		

	}

	
	public void stop() {
		

	}

}
