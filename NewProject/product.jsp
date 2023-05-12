<%@page import="com.model.ProductModel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.DbDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
		<%
				List<ProductModel>list = DbDao.productviewdata();
				request.setAttribute("mydata",list);
		%>
		
		<c:forEach items="${mydata}" var="m">
		
		
			<center>
			
				<br>
				<br>
				
				<p>
						<img width="500px" height="200px" src="${m.getProduct_image()}">
				</p>
				
				<p>
						<h2>${m.getProduct_name()}</h2>
				</p>
				
				<p>
						<h3>${m.getProduct_price()}</h3>
				</p>
				
				<p>
					<a class="swd-button"  href="addtocart.jsp?id=${m.getId()}">Add To Cart</a>
					<a class="swd-button"  href="wishlist.jsp?id=${m.getId()}">Add To WishList</a>
				</p>
				
				
			
			</center>
		
			
		
		</c:forEach>
			
		
	
	
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>