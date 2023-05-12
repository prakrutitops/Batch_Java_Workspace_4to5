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
	response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	response.setHeader("pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	%>
	
	<%
		if(session.getAttribute("webwing")!=null)
		{
			session.removeAttribute("webwing");
			session.invalidate();
			response.sendRedirect("mylogin.jsp");
		}
	
	%>

</body>
</html>