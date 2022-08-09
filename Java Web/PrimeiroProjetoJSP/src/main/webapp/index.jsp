<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="receber.jsp">
		<label>Nome:</label>
		<input name = "nome" type = "text">
		<label>Idade:</label>
		<input name = "idade" type = "number">
		<br>
		<br>
		<input type = "submit">
	</form>
</body>
</html>
