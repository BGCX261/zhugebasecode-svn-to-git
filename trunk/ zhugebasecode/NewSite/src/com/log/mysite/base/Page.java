package com.log.mysite.base;
import java.util.List;

import com.log.mysite.exceptions.SiteException;
/**
 *@ author 诸葛晓寅  Apr 27, 2008 9:58:27 PM
 *@ Description:
 *@ version 1.0
 *@ 著作权所有，侵权必究
 */
public class Page {
	
	private int curPage ;//当前页
	private int pageSize; //每页记录数(行数)
	private long totalRecord ;//总的记录数;
	private int totalPage;//总页数;
	
	private List list;
	
	
	
	Page(){		
	}
	public Page(int curPage,int pageSize,long totalRecord){
		this.curPage = curPage;		
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		if(pageSize<=0||totalRecord<0){
			throw new SiteException("每页记录数或总的记录数设置错误");
		}
		calc();
	}
	public void calc(){	
		if(totalRecord % pageSize == 0){
			totalPage = (int) (totalRecord /pageSize);
		}else{
			totalPage = (int)(totalRecord / pageSize)+1;
		}
		if(totalPage == 0){
			totalPage  = 1;
		}
		if(curPage<=0){
			curPage = 1;
		}else if(curPage>totalPage){
			curPage = totalPage;
		}		
	}
	public int getPrevPage(){
	
		return (curPage-1)==0?1:curPage-1;
	}
	public int getNextPage(){
	
		return ((curPage+1)>totalPage)?totalPage:curPage+1;
	}
	public int getFirstResult(){
		return (curPage-1)*pageSize;
	}
	
	public int getCurPage() {
		return curPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	
	
}
