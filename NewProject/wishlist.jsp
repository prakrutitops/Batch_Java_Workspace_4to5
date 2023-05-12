<%@page import="com.model.ProductModel"%>
<%@page import="com.dao.DbDao"%>
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
		String id=request.getParameter("id");
		int id2=Integer.parseInt(id);
		ProductModel m2=DbDao.getproductdetail(id2);
	%>
	
	<center>
	
		<br>
		<br>
		
		<form action="mywishlist.jsp">
		
		<p>
			<input type="hidden" name="id" value="<%=m2.getId() %>">
		</p>
		
		<p>
			<h2 style="align-content: center;"><input type="text" name="product_name" value="<%=m2.getProduct_name() %>"></h2>
		</p>
		
		<p>
			<h3 style="align-content: center;"><input type="text" name="product_price" value="<%=m2.getProduct_price() %>"></h3>
		</p>
		
		<p>
				
			 <input type="text" name="product_image" value="<%=m2.getProduct_image() %>"> 
		</p>
		
		<p>
			
			<input class="swd-button" type="submit" value="submit">
			
		 </p>
		</form>
	
	</center>


</body>
</html>