<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Docentes</title>
</head>
<body>

<h3>Formulário de Cadastro de Docentes</h3>

<form:form method="post" action="adicionar.html" commandName="docente">
	<table>
	<tr>
		<td>Nome:</td>
		<td><form:input path="nome"></form:input></td>
	</tr>
	<tr>
		<td>Matrícula:</td>
		<td><form:input path="matricula"></form:input></td>
	</tr>
	<tr>
		<td>Titulação:</td>
		<td><form:input path="titulacao"></form:input></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Salvar"/>
		</td>		
	</tr>
	</table>
</form:form>
</body>
</html>