<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
<head>
<title>Consultar Vendas</title>
</head>
<body>
	<center>
		<h1>Relatório de Vendas</h1>
		<button class="btn btn-primary" ><a href="RealizarVenda.jsp" style="color: white;"> Realizar Nova Venda</a></button>
		<br>
		<br>
		<br>
	</center>
	<div align="center">
		<table border="1" cellpadding="8">
			<caption>
				<h2>Relatório de Vendas</h2>
			</caption>
			<tr>
				<th>Cod.Venda</th>
				<th>Data</th>
				<th>Cod.Cliente</th>
				<th>Cod.Produto</th>
				<th>Cod.Filial</th>
				<th>Quantidade</th>
				<th>Desconto</th>
				<th>Valor Total</th>
			</tr>
			<c:forEach var="venda" items="${listaVendas}">
				<tr>
					<td>${venda.codvenda}</td>
					<td>${venda.data_venda}</td>
					<td>${venda.cod_cliente}</td>
					<td>${venda.cod_produto}</td>
					<td>${venda.cod_filial}</td>
					<td>${venda.quantidade}</td>
					<td>${venda.desconto}</td>
					<td>${venda.valor_Total}</td>
					<td><a href="/VendaAlterar?id=${Venda.codvenda}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
					<td><a href="/VendaDeletar?id=${venda.codvenda}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>