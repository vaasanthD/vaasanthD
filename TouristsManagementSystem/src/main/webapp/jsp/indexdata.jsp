<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>AddTouristDetails</title>
</head>
<body style="background-color: lightblue;">

<h1 style="color:darkblue;">AddNewTourist</h1>

	<form action="/addTourist" method="post">

		<p style="color: red;">* marked items entry is mandatory</p>

		<!-- <p style="color: purple;">
			Tourist ID : <input type="text" name="touristId" placeholder="Id"><br>
		</p> -->

		<p style="color: purple;">
			<br> *Enter Tourist Name :<input type="text" name="touristName"
				placeholder="Enter your name" required><br>
		</p>


		<p style="color: purple;">
			<br> *Enter Address: <input type="text" name="address"
				placeholder=" Enter your address" required><br>
		</p>

		<p style="color: purple;">
			<br> *Enter Tour Date : <input type="date" name="tourDate"
				placeholder="Enter Tour Date" required><br>
		</p>

		<p style="color: purple;">
			<br> *Enter Booking Amount Paid : <input type="text" name="bookingAmount"
			 placeholder="Booking Charges " required> <br>
		</p>

		<p style="color: purple;">
			<br> *Enter 1st Phone Number: <input type="text"
				name="phoneNumber1" placeholder="1st Phone Number" required><br>
		</p>


		<p style="color: purple;">
			<br> Enter 2nd Phone Number (If it present) : <input type="text"
				name="phoneNumber2" placeholder="2nd Phone Number"><br>
		</p>


		<p style="color: purple;">
			<br> *Enter 3rd Phone Number (If it present) : <input
				type="text" name="phoneNumber3" placeholder="3rd Phone Number"><br>
		</p>

		<br><input type="submit" value="Submit"><br>

	</form>



</body>

</html>
