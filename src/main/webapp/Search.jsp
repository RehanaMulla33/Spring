<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Search Grocery item</h1>
<form action="search.do">
<input type="text" name="groceryName"/>
<input type="submit" name="search"/>
</form>
<div>
<h2>${message}</h2>

<label>grocery Name</label>:${grocery.name }<br>

<label>grocery Quantity</label>:${grocery.quantity }<br>

<label>grocery Type</label>:${grocery.type }<br>

<label>grocery Brand</label>:${grocery.brand }<br>

<label>grocery Price</label>: <input type="text" value="${grocery.price}" name="price"/><br>
</div>
		<a href="Home.jsp">Clicke here to add Item</a><br>

</body>
</html>