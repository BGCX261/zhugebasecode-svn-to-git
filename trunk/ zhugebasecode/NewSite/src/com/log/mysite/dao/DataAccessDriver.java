package com.log.mysite.dao;

public abstract class DataAccessDriver {
	
	private static DataAccessDriver driver;
	
	protected DataAccessDriver(){};
	
	public static void init(DataAccessDriver implementation){
		driver = implementation;
	}
	
	public static DataAccessDriver getInstatnce(){
		return driver;
	}
	
	public abstract AttachmentDAO newAttachmentDAO();
	
	public abstract CommentDAO newCommentDAO();
	
	public abstract FriendsLinksDAO newFriendsLinksDAO();
	
	public abstract NewsDAO newNewsDAO();
	
	public abstract NewsCategoryDAO newNewsCategory();
	
	public abstract PhotoDAO newPhotoDAO();
	
	public abstract PhotoboxDAO newPhotoboxDAO();
	
	public abstract PrivilegeDAO newPrivliegeDAO();
	
	public  abstract RevertDAO newRevertDAO();
	
	public abstract StatDAO newStatDAO();
	
	public abstract UserDAO newUserDAO();
	
	public abstract UserPrivilegeDAO newUserPrivilegeDAO();
	
}
