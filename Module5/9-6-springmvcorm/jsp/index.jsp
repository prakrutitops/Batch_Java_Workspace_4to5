<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form name="insert" method="post" action="insert">
	<table>
		<tr>
			<td>Person Name</td>
			<td><input type="text" name="pname"></td>
		</tr>
		<tr>
			<td>Person Address</td>
			<td><input type="text" name="paddress"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Insert">
			</td>
		</tr>
	</table>
	</form>
	<a href="show">Show All Person</a>

</body>
</html>