<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

</head>
<body>
	<h1>Welcome Grocery Application</h1>
	<div>
		<a href="viewAll.do">ViewAllGroceryItems</a><br> <br>
		<c:forEach items="${ListOfGroceryItems}" var="groceryObj">
			<table style="width: 70%">
				<tr>
					<th>Grocery name</th>
					<td>${groceryObj.name}</td>

				</tr>
				<tr>
					<th>Quantity</th>
					<td>${groceryObj.quantity}</td>

				</tr>
				<tr>
					<th>price</th>

					<td>${groceryObj.price}</td>
				</tr>
				<tr>
					<th>Type</th>

					<td>${groceryObj.type}</td>
				</tr>
				<tr>
					<th>Brand</th>

					<td>${groceryObj.brand}</td>
				</tr>
			</table>
		</c:forEach>
	</div>
</body>
</html>