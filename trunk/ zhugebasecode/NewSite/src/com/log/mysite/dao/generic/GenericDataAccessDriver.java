package com.log.mysite.dao.generic;

import com.log.mysite.dao.AttachmentDAO;
import com.log.mysite.dao.CommentDAO;
import com.log.mysite.dao.DataAccessDriver;
import com.log.mysite.dao.FriendsLinksDAO;
import com.log.mysite.dao.NewsCategoryDAO;
import com.log.mysite.dao.NewsDAO;
import com.log.mysite.dao.PhotoDAO;
import com.log.mysite.dao.PhotoboxDAO;
import com.log.mysite.dao.PrivilegeDAO;
import com.log.mysite.dao.RevertDAO;
import com.log.mysite.dao.StatDAO;
import com.log.mysite.dao.UserDAO;
import com.log.mysite.dao.UserPrivilegeDAO;

public class GenericDataAccessDriver extends DataAccessDriver {

	
	
	public AttachmentDAO newAttachmentDAO() {
		
		return null;
	}

	
	public CommentDAO newCommentDAO() {
		
		return null;
	}

	
	public FriendsLinksDAO newFriendsLinksDAO() {
		
		return null;
	}

	
	public NewsCategoryDAO newNewsCategory() {
		
		return null;
	}

	@Override
	public NewsDAO newNewsDAO() {
		
		return null;
	}

	@Override
	public PhotoDAO newPhotoDAO() {
		
		return null;
	}

	@Override
	public PhotoboxDAO newPhotoboxDAO() {
		
		return null;
	}

	@Override
	public PrivilegeDAO newPrivliegeDAO() {
		
		return null;
	}

	@Override
	public RevertDAO newRevertDAO() {
		
		return null;
	}

	@Override
	public StatDAO newStatDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDAO newUserDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPrivilegeDAO newUserPrivilegeDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
