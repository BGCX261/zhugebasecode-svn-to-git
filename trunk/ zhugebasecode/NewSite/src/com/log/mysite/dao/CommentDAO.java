package com.log.mysite.dao;

import java.util.List;

import com.log.mysite.pojo.Comment;

public interface CommentDAO {
	
	/**
	 * Adds a new Comment 
	 * @param a The comment to add
	 */
	public void addComment(Comment comment);
	
	/**
	 * Updates an Comment
	 * @param comment The comment to update
	 */
	public void updateComment(Comment comment);
	
	/**
	 * Rovemos an comment.
	 * @param id The comment's id to remove
	 */
	public void removeComment(Long id);
	
	/**
	 * Gets an comment by its id
	 * @param newId The news id
	 * @return A list where each entry is a com.log.mysite.pojo.News 
	 */
	public List selectComments(Long newId);
	
	/**
	 * Gets an comment by its id
	 * @param commentId The comment id
	 * @return The comment, or <code>null</code> if no record was found
	 */
	public Comment selectCommentById(Long commentId);
	
	
	
}
