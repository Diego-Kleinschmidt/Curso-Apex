<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String nome = request.getParameter("nome");
	int nota01 = Integer.parseInt(request.getParameter("nota1"));
	int nota02 = Integer.parseInt(request.getParameter("nota2"));
	int nota03 = Integer.parseInt(request.getParameter("nota3"));
	
	int media = (nota01 + nota02 + nota03) / 3 ;
	
	String situacao = "";
	
	if(media >= 7){
		situacao = "Aprovado";
	}else {
		situacao = "em recuperação";
	}
	
	out.print("O aluno " + nome + " tem a media " + media + " e esta " + situacao);
	
	%>
</body>
</html>