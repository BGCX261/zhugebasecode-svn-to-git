package com.log.mysite.dao;

import com.log.mysite.pojo.Attachment;

/** 
 * @author zhuge
 * @date Jul 31, 2009
 */
public interface AttachmentDAO {
	
	/**
	 * Adds a new Attachment
	 * @param a The attachment to add
	 */
	public void addAttachment(Attachment a);
	
	/**
	 * Updates an Attachment 
	 * @param a The attachment to update
	 */
	public void updateAttachment(Attachment a);
	
	/**
	 * Removos an Attachment
	 * @param id The attachment's id to remove
	 */
	public void removeAttachement(Long id);
	
	/**
	 * Gets an attachment by its id
	 * @param id
	 * @return
	 */
	public Attachment selectAttachmentById(Long id);
	
}
