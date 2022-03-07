<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Grocery Lists</h1>

	<form action="update.do" method="post">
		<div>
			<label>Name </label> <select name="name" id="name ">
				<option value="select">select</option>
				<option value="Pulses">Fortune oil</option>
				<option value="Green">--Garam Masala --</option>
				<option value="Black">--Black gram--</option>
				<option value="Rajma">--Rajma --</option>
				<option value="Matar">--Parle--</option>
				<option value="Horse">--Chips --</option>
				<option value="Rice">--Panner --</option>
				<option value="Bajra">--Chees--</option>
				<option value="Corn">--Corn Flour--</option>
				<option value="Purpose">--All-Purpose-flour --</option>
				<option value="Semolina">--Semolina--</option>
				<option value="Broken">--Pet Food --</option>
				<option value="Vermicelli">--Vermicelli --</option>
				<option value="Sago">--Sago--</option>
				<option value="Horlicks">--Horlicks --</option>
				<option value="Cashew">--Cashew-- --</option>
				<option value="Mango">--Mango Juice--</option>
				<option value="CocaCola">--CocaCola --</option>
				<option value="Pepsi">--Pepsi --</option>
				<option value="Aluiminium">--Aluiminium Foil --</option>
				<option value="Pepsi">--Fruits/Vegtables --</option>
			</select>
		</div>
		<div>
			<label>Name</label><input type="text" value="${grocery.name }"
				name="name" disabled="disabled" />
		</div>
		<div>
			<label>Quantity</label><input type="text" value="${grocery.quantity }"
				name="quantity" />
		</div>
		<div>
			<label>Price</label><input type="text" value="${grocery.price }"
				name="price" />
		</div>
		<div>
			<label>Type</label><input type="text" value="${grocery.type }"
				name="type" />
		</div>
		<div>
			<label>Brand</label><input type="text" value="${grocery.brand}"
				name="brand" />
		</div>
		<div>
			<label> Total</label><input type="text" name="">
		</div>
		<input type="submit" value="update">
	</form>
	<a href="Home.jsp">Home</a>
	<br>
	<br>

</body>
</html>