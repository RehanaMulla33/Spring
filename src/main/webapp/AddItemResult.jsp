<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Grocery Application</h1>

	<form action="result.do" method="post">

		<label>Name :</label>${grocery.name}<br> 
		<label>Quantity:</label>${grocery.quantity}<br> 
		<label>Price :</label>${grocery.price}<br>
		<label>Brand :</label>${grocery.brand}<br> 
		<label>Total :</label>${messageTotal}<br><br>

	</form>

	<a href="AddItem.jsp">Add another item</a>
	<br>
	<br>
	<a href="Home.jsp">Go Home</a>

</body>
</html>