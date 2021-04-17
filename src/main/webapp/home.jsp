<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Homee</title>
</head>
<body>

	<form action="/addAlien">
		<input type="text" name="aid"><br> 
		<input type="text" name="aname"><br>
		<input type="text" name="aloc"><br>
		<input type="submit"><br>
	</form>
	
	
	<form action="/getAlien">
		<input type="text" name="aid"><br> 

		<input type="submit"><br>
	</form>
	
	
	<form action="/delAlien">
		<input type="text" name="aid"><br> 

		<input type="submit"><br>
	</form>
	

</body>
</html>