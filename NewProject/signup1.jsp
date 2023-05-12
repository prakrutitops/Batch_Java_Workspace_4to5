<%@page import="com.dao.DbDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%
		String pass = request.getParameter("password");
		String repass = request.getParameter("repassword");
		
		if(pass.equals(repass))
		{
			int status = DbDao.savedata(m);	
			
			if(status>0)
			{
				response.sendRedirect("Login.jsp");
			}
			else
			{
				response.sendRedirect("Error.jsp");
			}
		}
		else
		{
			out.print("Password and repassword are not same");
			//response.sendRedirect("Error.jsp");
		}
		
		
		
	
	%>



</body>
</html>