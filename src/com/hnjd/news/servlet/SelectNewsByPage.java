package com.hnjd.news.servlet;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnjd.news.dao.NewsDao;
import com.hnjd.news.dao.NewsDaoImpl;
import com.hnjd.news.entity.News;
import com.hnjd.news.entity.Page;

/**
 * Servlet implementation class SelectNewsByPage
 */
@WebServlet("/SelectNewsByPage")
public class SelectNewsByPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectNewsByPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��ҳ��ѯ����
		String currPage=request.getParameter("currPage");
		String pageSize=request.getParameter("pageSize");
		Integer m=Integer.valueOf(currPage);
		Integer n=Integer.valueOf(pageSize);
		List<News> newsByPage=new ArrayList<News>();
		Page page=new Page();
		NewsDao newsDao=new NewsDaoImpl();
		try {
			newsByPage=newsDao.getNewsByPage(m,n);
			page.setNewsList(newsByPage);
			page.setCurrPage(m);
			page.setPageSize(n);
			page.setTotalSize(NewsDao.getAllNews(Size()));
		}catch(Exception e) {
			// TODO �Զ����ɵ� catch ��
			request.setAttribute("newsByPage",newsByPage);
			request.getRequestDispatcher("/selectNewsByPage").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
