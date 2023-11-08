<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nice</title>
</head>
<body>

	<form action= "laptopsInput" method="post"> 
		<input type="text" name="brandName"/>
		<input type="submit" value="Submit"/>
	</form>
	
Numele brandului este ${laptopBrand} si are ${characterCount} caractere. <br>
Numarul de caractere al brandului ${laptopBrand} este ${paritate}.
	
	

</body>
</html>