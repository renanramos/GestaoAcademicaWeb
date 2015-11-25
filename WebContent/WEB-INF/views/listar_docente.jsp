<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de Docentes</title>
</head>
<body>

<h3>Docentes Cadastrados</h3>

<h3><a href="form">+ Novo Docente</a></h3>

<c:if test="${!empty docenteList}">
<table border="1">
<tr>
	<th>Nome</th>
	<th>Matrícula</th>
	<th>Titulação</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${docenteList}" var="docente">
<tr>
	<td>${docente.nome}</td>
	<td>${docente.matricula}</td>
	<td>${docente.titulacao}</td>
	<td><a href="remover/${docente.id}">Excluir</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>