<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clientes</title>
</head>
<body>
	<center>
		<h1>Clientes</h1>
		<button><a href="cadastrarProduto.jsp" > Adicionar novo cliente</a></button>
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
					<td><a href="/editarProduto?id=${produto._codProduto}">Alterar</a></td>
					<td><a href="/deletarProduto?id=${produto._codProduto}">Deletar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>