<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Controle?cmd=logar">
		<h2>Logar</h2>
		<p/>
		Numero<br/>
		<input type="text" name="numero" value="" size="15"/>
		<p/>
		email<br/>
		<input type="text" name="email" value="" size="35"/>
		<p/>
		Numero<br/>
		<input type="submit" value="Logar"/>
		${msg }
	</form>

</body>
</html>