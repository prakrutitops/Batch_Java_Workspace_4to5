<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Solution:
	<%
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if(pass.equals("1234"))
		{
			out.print("Login Successful");
		}
		else
		{
			out.print("Login Fail");
		}
	 %>
	 
	<br>
	<br>
	
	 <%= Calendar.getInstance().getTime() %>
	 
	 <%!
	 	int cube(int n)
	 	{
		 
		 	return n*n*n;
	 	}
	 
	 %>
	 
	 <%=cube(3) %>

</body>
</html>