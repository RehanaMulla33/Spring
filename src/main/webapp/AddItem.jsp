<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Laptop Lists</h1>

	<form action="additem.do" method="post">
		<div>
			<label>Name </label> <select name="name" id="name ">
				<option value="select">select</option>

				<option value="Dell">Dell</option>
				<option value="Apple">--Apple--</option>
				<option value="HP">--HP--</option>
				<option value="Lenovo">--Lenovo --</option>
				<option value="ASUS">--ASUS--</option>
				<option value="Alenware">--Alenware--</option>
				<option value="A">--AI--</option>
			</select>
		</div>
		<div>
			<label>Brand</label><select name="brand" id="brand">
				<option value="select">select</option>

				<option value="Lenovo">Lenovo</option>
				<option value="Dell">Dell</option>
				<option value="asus">asus</option>
				<option value="acer">acer</option>
				<option value="a">a</option>
			</select>
		</div>
		<div>
			<label>Color</label> <select name="color" id="color">
				<option value="select">select</option>
				<option value="Black">Black</option>
				<option value="Silver">Silver</option>
				<option value="white">white</option>
				<option value="Grey">Grey</option>
				<option value="p">P</option>

			</select>
		</div>
		<div>
			<label>Price</label> <input type="text" name="price" />
		</div>
		<div>
			<label>RAM</label> <input type="text" name="ram" />
		</div>
		<div>
			<label>ROM</label> <input type="text" name="rom" />
		</div>

		<div>
			<label>HardDisk</label> <select name="hardDisk" id="hardDisk">
				<option value="select">select</option>
				<option value="1TB">1TB</option>
				<option value="500GB">500GB</option>
				<option value="160GB">160GB</option>
				<option value="120GB">120GB</option>
				<option value="250GB">250GB</option>
				<option value="300GB">300GB</option>
			</select>
		</div>
		<input type="submit" value="Submit">

	</form>
	<a href="Laptop.jsp">Laptop</a>


</body>
</html>