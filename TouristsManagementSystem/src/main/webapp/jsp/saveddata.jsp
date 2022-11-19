<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.entity.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>saved tourist data</title>
</head>
<body style="background-color: lightcyan;">

<h1 style="color:darkblue;">Tourist Details</h1>

<%
	TouristMaster tourist = (TouristMaster)request.getAttribute("tourist");
	TouristContact touristContact = (TouristContact)request.getAttribute("touristContact");
	TouristContact touristContact2 = (TouristContact)request.getAttribute("touristContact2");
	TouristContact touristContact3 = (TouristContact)request.getAttribute("touristContact3");
%>
 
 
<p style="color:indigo;">Tourist ID : ${tourist.id}</p>
<p style="color:indigo;">Tourist Name :${tourist.name}</p>
<p style="color:indigo;">Address : ${tourist.address}</p>
<p style="color:indigo;">Tour Date :${tourist.date}</p>
<p style="color:indigo;">Booking Amount :${tourist.bookingAmount}</p>
<p style="color:indigo;">Phone Number1 : ${touristContact.phoneNumber}</p>
<p style="color:indigo;">Phone Number2 : ${touristContact2.phoneNumber}</p>
<p style="color:indigo;">Phone Number3 : ${touristContact3.phoneNumber}</p>


<a href="/index">Return</a>




</body>
</html>