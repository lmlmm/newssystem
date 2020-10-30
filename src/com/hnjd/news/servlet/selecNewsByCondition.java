package com.hnjd.news.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnjd.news.entity.News;

/**
 * Servlet implementation class selecNewsByCondition
 */
@WebServlet("/selecNewsByCondition")
public class selecNewsByCondition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selecNewsByCondition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ntitle=request.getParameter("ntitle");
		String ncreateDate=request.getParameter("ncreateDate");
		String ntid=request.getParameter("ntid");
		String nauthor=request.getParameter("nauthor");
		//构造一个查询条件
		try {
			News news=new News();
			news.setNtitle(ntitle);
			news.setNauthor(nauthor);
			news.setNtid(Integer.valueOf(ntid));
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
					news.setNcreateDate(sdf.parse(cnreateDate));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
