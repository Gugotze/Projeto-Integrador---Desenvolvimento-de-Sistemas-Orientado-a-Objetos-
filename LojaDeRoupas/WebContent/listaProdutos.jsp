<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
<head>

<title>Produtos</title>
</head>
<body>
	<center>
		<h1>Produtos</h1>
		<button class="btn btn-primary" ><a href="cadastrarProduto.jsp" style="color: white;"> Adicionar novo produto</a></button>
		<br>
		<br>
		<br>
		
	</center>
	<div align="center">
		<table border="1" cellpadding="8">
			<tr>
				<th>Cod filial</th>
				<th>Cod produto</th>
				<th>Nome</th>
				<th>Tipo</th>
				<th>Quantidade</th>
				<th>Valor compra</th>
				<th>Valor venda</th>
				<th>Editar</th>
				<th>Deletar</th>
			</tr>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td>${produto._codFilial}</td>
					<td>${produto._codProduto}</td>
					<td>${produto._nome}</td>
					<td>${produto._tipo}</td>
					<td>${produto._quantidade}</td>
					<td>${produto._valorCompra}</td>
					<td>${produto._valorVenda}</td>
					<td><a href="/editarProduto?id=${produto._codProduto}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
					<td><a href="/deletarProduto?id=${produto._codProduto}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>