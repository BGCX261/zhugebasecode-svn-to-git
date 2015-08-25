package cn.log.mysite.cache;

import java.util.HashMap;
import java.util.Map;

public class DefaultCacheEngine implements CacheEngine{
	
	private Map cache = new HashMap();
	
	@Override
	public void add(String key, Object object) {
		this.cache.put(key, object);		
	}

	@Override
	public void add(String fqn, String key, Object object) {
		Map map = (Map)this.cache.get(fqn);
		if(map == null){
			map = new HashMap();			
		}
		map.put(key, object);
		cache.put(fqn, map);
	}

	@Override
	public Object get(String fqn) {
		return this.cache.get(fqn);
		
	}

	@Override
	public Object get(String fqn, String key) {
		Map map = (Map)this.cache.get(fqn);
		if(map == null){
			return null;
		}
		return map.get(key);
		
	}

	@Override
	public void init() {
		this.cache = new HashMap();		
	}

	@Override
	public void remove(String fqn) {
		this.cache.remove(fqn);		
	}

	@Override
	public void remove(String fqn, String key) {
		Map map = (Map)this.cache.get(fqn);
		if(map != null){
			map.remove(key);
		}
	}

	@Override
	public void stop() {
			this.cache.clear();	
	}
	
}
