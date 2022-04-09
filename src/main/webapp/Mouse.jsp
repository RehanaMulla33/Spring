<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Mouse Details</h1>
	<form action="mouseData.do" method="post">
		<label>Mouse Name</label><input type="text" name="mouseName" /><br> 
		<label>Brand</label><input type="text"name="mouseBrand" /><br>
		 <input type="submit" value="send" />

	</form>

</body>
</html>