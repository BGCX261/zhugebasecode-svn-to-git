package com.log.mysite.dao;

import java.util.List;

import com.log.mysite.pojo.FriendsLinks;

public interface FriendsLinksDAO {
	
	public void addFriendsLinks(FriendsLinks f);
	
	public void updateFriendsLinks();
	
	public void removeFriendsLinks();
	
	public List selectFriendsLinkss();
	
	
	
	
}
