<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">${titlevalue}</h1>
<hr>
<form action="processOrder">
<div align="center">

<label for="food_item">Item name :</label>
<input type="text" name="foodType" placeholder="food type??"
id="food_item"> <input type="submit" value="order now">
</div>
</form>
</body>
</html>