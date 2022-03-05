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

	<form action="additem.do" method="post">
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
			<label>Quantity</label><select name="quantity" id="quantity">
				<option value="select">select</option>

				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
			</select>
		</div>
		<div>
			<label>Price</label> <input type="text" name="price" />
		</div>
		<div>
			<label>Type</label> <select name="type" id="type">
				<option value="select">select</option>

				<option value="vegtables">vegtables</option>
				<option value="Bread">--Bread/Bakery --</option>
				<option value="Breakfast">--Breakfast--</option>
				<option value="Drinks">--Drinks --</option>
				<option value="Frozen">--Frozen--</option>
				<option value="Dairy">--Dairy/Fridge--</option>
				<option value="Dal">--Dal-</option>
				<option value="Oils">--Oils--</option>
				<option value="Personal">--Personal--</option>
				<option value="Paper">--Paper/Plastic --</option>
				<option value="HouseHld">--HouseHld--</option>
				<option value="BabyFood">--BabyFood--</option>
				<option value="Snacks">--Snacks --</option>
			</select>
		</div>
		<div>
			<label>Brand</label> <select name="brand" id="brand">
				<option value="select">select</option>

				<option value="Kissan">Kissan</option>
				<option value="Amul">--Amul --</option>
				<option value="Haldiram's">--Haldiram's--</option>
				<option value="Britannia">--Britannia --</option>
				<option value="Kissan">--Kissan--</option>
				<option value="MTR">--MTR--</option>
				<option value="Balaji">--Balaji --</option>
				<option value="MDH">--MDH--</option>
				<option value="Rooh">--Rooh Afza--</option>
				<option value="Vadilal">--Vadilal --</option>
				<option value="White">--White Owl--</option>
				<option value="Mother">--Mother dairy--</option>
				<option value="DiSano">--DiSano --</option>
				<option value="DiSano">--Pet --</option>

			</select>
		</div>
		<input type="submit" value="AddItem">

	</form>
	<a href="Search.jsp">search</a>

</body>
</html>