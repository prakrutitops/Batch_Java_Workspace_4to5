<%@page import="com.dao.DbDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="product12" class="com.model.WishListModel"></jsp:useBean>
 <jsp:setProperty property="*" name="product12"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		int status123 = DbDao.WishAdd(product12);
		
		//System.out.println(status123);
		
		if (status123 > 0) 
		{
			response.sendRedirect("");
		}
		else 
		{
			out.print("Product can't be added in wishlist");
		}
		%>

	

</body>
</html>