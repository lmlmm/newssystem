<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.hnjd.news.dao.NewsDao" %>
<%@ page import="com.hnjd.news.dao.NewsDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hnjd.news.entity.News" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页查询新闻</title>
</head>
<body>
<table>
			<tr>
				<th><input type="submit" value="删除所选"></th>
				<th>新闻标题</th>
				<th>新闻作者</th>
				<th>创建时间</th>
				<th>修改时间</th>
				<th>操作</th>
			</tr>
			<c:forEach var="news" items=${page.newsList }>
				<tr>
					<td><input type="checkbox" name="nids" value="${news.nid}"></td>
					<td>
						<a href="${pageContext.request.contextPath}/selectNewsServlet?nid=${news.nid}">${news.ntitle}</a>
					</td>
					<td>${news.nauthor}</td>
					<td>${news.ncreateDate}</td>
					<td>${news.nmodifyDate}</td>
					<td>	
						<a href="editNews.jsp">修改</a>
						<a href="${pageContext.request.contextPath}/deleteNewsServlet?nid=${news.nid}">删除</a>
					</td>
				</tr>
			</c:forEach>
			记录总数：${page.totalSize}<br>
			每页显示记录数：${page.pageSize}<br>
			当前页数：${page.currPage}<br>
			总页数：${page.totalPage}<br>
			<c:forEach begin="1" end="${page.totalPage}" step="1" var="num">
			<a href="${pageContext.request\ContextPath}/selectNewsByPage?currPage=${num} pageSize="10">${num}</a>
				
			</c:forEach>
		</table>
</body>
</html>