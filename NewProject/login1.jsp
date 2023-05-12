<%@page import="com.dao.DbDao"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	SignupModel m2 =new SignupModel();
	m2.setEmail(email);
	m2.setPassword(password);
	
	//System.out.println(m2.getName());
	

	DbDao w = new DbDao();
	SignupModel m = w.LoginCustomer(m2);

	if (m != null) 
	{
		session.setAttribute("webwing", true);
		session.setAttribute("myemail", email);
		session.setAttribute("myname", m.getName());
		
		
		response.sendRedirect("home.jsp");

	} 
	else 
	{
		
		
		//response.sendRedirect("Login.jsp");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		
	}
	%>


</body>
</html>