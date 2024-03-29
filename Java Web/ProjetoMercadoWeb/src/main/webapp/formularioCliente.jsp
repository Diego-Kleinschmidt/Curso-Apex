<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.BancoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>
<body>
	<%
	BancoDAO db = new BancoDAO();
	int id = Integer.parseInt(request.getParameter("id_cliente"));
	String idade = "";
	String situacao = "";
	String nomeCliente = "";
	String titulo = "Cadastrando um novo cliente ";
	boolean ativo = true;
	if (id > 0) {
		ResultSet retorno = db.retornaDados("select * from clientes where id_cliente = " + id);
		if (retorno.next()) {
			titulo = "Alterando cliente " + id;
			nomeCliente = retorno.getString("nome_cliente");
			idade = retorno.getString("idade");
			situacao = retorno.getString("situacao");
			if (situacao.equals("A")){
				ativo = true;
			}else {
				ativo = false;
			}
		}
	}
	%>
<body class="bg-dark text-light">
<div class="container">
	<div class="jumbotron bg-warning">
		<h1 style="color:black;">CADASTRO DE CLIENTES</h1>
	</div>
<main>
	<section>
		<a href="cadastroCliente.jsp"><button class="btn btn-success">Voltar</button></a>
	</section>
	<h2 class="mt-3"><% out.write(titulo); %></h2>
	<form method="get" action="SalvaCliente.jsp">
		<input type="hidden" name="id_cliente" value="<% out.write(String.valueOf(id));%>">
		<div class="form-group">
			<label>Nome cliente</label>
			<input type="text" class="form-control" name="nome_cliente" value="<% out.write(nomeCliente); %>">
		</div>
		<div class="form-group">
			<label>Idade</label>
			<input type="number" class="form-control" name="idade" value="<% out.write(idade); %>">
		</div>
		<div class="form-group">
			<label>Situação</label>
			<div>
				<div class="form-check form-check-inline">
					<label class="form-control">
						<input type="radio" name="situacao" value="A" <% if (ativo) { out.write("checked=''"); } %>> Ativo
					</label>
				</div>
				<div class="form-check form-check-inline">
					<label class="form-control">
						<input type="radio" name="situacao" value="I" <% if (!ativo) { out.write("checked=''"); } %>> Inativo
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-success" >Cadastrar</button>
		</div>
	</form>
</main>
    <!-- .container -->
</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  
</body>
</body>
</html>