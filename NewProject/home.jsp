<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
		<%
		
		if (session.getAttribute("webwing")!= null) 
		{
	   
			response.sendRedirect("profile.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	
		%>
		
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>