<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Phone-Directory</title>
</head>
<body>
	<h1>Welcome to Phone_Directory</h1>
	<span style="color: red;"> ${message} </span>
	<form action="phone.do" method="post">
		<div>
			<label>Name</label> <input type="text" name="name" />
		</div>
		<div>
			<label>Mobile-No</label> <input type="text" name="mobile_no" />
		</div>
		<div>
			<label for="Address">Address</label> 
			<textarea id="address" name="address" rows="6" cols="15"></textarea>
		</div>
		<div>
			<label>Landmark</label> <input type="text" name="landmark" />
		</div>
		<div>
			<label>Landline-No</label> <input type="text" name="landline_no" />
		</div>
		<div>
			<label for="City Type">City Type</label> <select name="city"
				id="city">
				<option value="Hubli">Hubli</option>
				<option value="Mysore">--Mysore --</option>
				<option value="Bangalore">--Bangalore--</option>
				<option value="Gulbarga">--Gulbarga --</option>
				<option value="Davangere">--Davangere--</option>
				<option value="Haveri">--Haveri--</option>
				<option value="Rane Bennure">--Rane Bennure--</option>
				<option value="Dharwad">--Dharwad--</option>
				<option value="Belgaum">--Belgaum--</option>
				<option value="Haveri">--Haveri --</option>
				<option value="Mandya">--Mandya--</option>
				<option value="Raichur">--Raichur--</option>
				<option value="Gadag">--Gadag --</option>
			</select>
		</div>
		<div>
			<label for="pincode">Pincode</label><select name="pincode"
				id="pincode">
				<option value="0836">0836</option>
				<option value="570001">570001</option>
				<option value="560001">560001</option>
				<option value="585101">585101</option>
				<option value="577001">577001</option>
				<option value="581110">581110</option>
				<option value="58115">58115</option>
				<option value="580001">580001</option>
				<option value="585101">585101</option>
				<option value="577001">577001</option>
				<option value="590001">590001</option>
				<option value="584101">584101</option>
				<option value="585101">585101</option>
			</select>
		</div>
		<div>
			<input type="submit" name="Add Contact">
		</div>
	</form>
</body>
</html>