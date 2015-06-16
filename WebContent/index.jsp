<!DOCTYPE html>
<html>
<head>
</head>

<body>
	<form method="post" action="Controle?cmd=gravar">
		<h2>Correntista</h2>
		Numero<br/>
		<input type="text" name="numero" value="" size="15" required="required"/>
		<p/>nome<br/>
		<input type="text" name="nome" value="" size="35" required="required"/>
		<p/>Email<br/>
		<input type="text" name="email" value="" size="35" required="required"/>
		<p/>saldo<br/>
		<input type="text" name="saldo" value="" size="10"
		required="required"
		placeholder="entre com saldo"
		pattern="[0-9\\.]{4,10}" title="Entre Com padrão Saldo"/>
		
		<br/>
		<input type="submit" name="Enviar"/>
		
		
	</form>
	
	${msg}<br/>
	${correntista}<br/>
	<a href="logar.jsp">Entrar no sistema</a>
</body>
</html>