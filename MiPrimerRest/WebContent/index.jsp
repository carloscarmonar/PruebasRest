<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Form to create a new resource</title>
</head>
<body>
	<form action="../MiPrimerRest/rest/todos" method="POST">
		<label for="id">ID</label> <input name="id" /> <br /> <label
			for="summary">Summary</label> <input name="summary" /> <br />
		Description:
		<TEXTAREA NAME="description" COLS=40 ROWS=6></TEXTAREA>
		<br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>
</html>