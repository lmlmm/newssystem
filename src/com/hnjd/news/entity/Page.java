package com.hnjd.news.entity;

import java.util.List;

public class Page {
	//分页查询新闻
	private int currPage;//当前页数
	
	private int pageSize;//显示记录数
	
	private List<News> newsList;//新闻列表
	
	private int totalSize;//总记录数
	
	private int totalPage;//总页数

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setTotalPage() {
		if(this.totalSize % pageSize==0) {
			this.totalPage=this.totalSize/pageSize;
		}
		if(this.totalSize % pageSize>0) {
			this.totalPage=(this.totalSize/pageSize)+1;
		}
	}
	
}
