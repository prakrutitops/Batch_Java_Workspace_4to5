<%@page import="com.dao.DbDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.ContactModel"/>
<jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
				int status = DbDao.contactinsert(m);	
					
				if(status>0)
				{
					response.sendRedirect("index.jsp");
				}
				else
				{
					response.sendRedirect("Error.jsp");
				}
		 %>
</body>
</html>