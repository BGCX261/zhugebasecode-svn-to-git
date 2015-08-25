package cn.log.mysite.cache;

public interface CacheEngine {
	
	public void init();
	
	public void stop();
	
	
	
	public void add(String key,Object object);
	
	public void add(String fqn,String key,Object object);
	

	
	public Object get(String fqn);
	
	public Object get(String fqn,String key);
	
	public void remove(String fqn);
	
	public void remove(String fqn,String key);
}
