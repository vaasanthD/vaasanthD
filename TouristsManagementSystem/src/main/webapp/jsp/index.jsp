<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddNewTourist</title>
</head>
<body>


	<h1>Adding New Tourists Details</h1>
	

	<form action="/saveTourist" method="post" modelAttribute="Tourist">
		Tourist ID: <input type="text" name="touristId"
			placeholder="touristId" value="${Tourist.touristId}"><br>
		<br> *Enter Tourist Name: <input type="text" name="touristName"
			placeholder="touristName" value="${Tourist.touristName}" required><br>
		<br> *Enter Address: <input type="text" name="address"
			placeholder="address" value="${Tourist.address}" required><br>
		<br> *Enter Tour Date: <input type="text" name="tourDate"
			placeholder="date of tour" value="${Tourist.tourDate}" required><br>
		<br> *Enter Booking Amount Paid: <input type="text"
			name="bookingAmount" placeholder="Booking Amount Charges"
			value="${Tourist.bookingAmount}" required><br> <br>
		*Enter 1st Phone Number: <input type="text" name="phoneNumber1"
			placeholder="1st Phone Number" value="${Tourist.phoneNumber1}"
			required><br> <br> Enter 2nd Phone Number: <input
			type="text" name="phoneNumber2" placeholder="2nd Phone Number"
			value="${Tourist.phoneNumber2}"><br> <br> Enter 3rd
		Phone Number: <input type="text" name="phoneNumber3"
			placeholder="3rd Phone Number" value="${Tourist.phoneNumber3}"><br>
		<br> <input type="submit" value="Submit">
</body>
</html>