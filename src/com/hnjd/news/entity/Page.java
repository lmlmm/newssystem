package com.hnjd.news.entity;

import java.util.List;

public class Page {
	//��ҳ��ѯ����
	private int currPage;//��ǰҳ��
	
	private int pageSize;//��ʾ��¼��
	
	private List<News> newsList;//�����б�
	
	private int totalSize;//�ܼ�¼��
	
	private int totalPage;//��ҳ��

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
