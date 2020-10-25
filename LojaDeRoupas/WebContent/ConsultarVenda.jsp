<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Consultar Vendas</title>
</head>
<body>
	<center>
		<h1>Relatório de Vendas</h1>
		<h2>
			<a href='/new'>Alterar Venda</a> <a href='list'>Listar Vendas</a>
		</h2>
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
			<c:forEach var="Venda" items="${listaVenda}">
				<tr>
					<td><c:out value="${Venda.codvenda}" /></td>
					<td><c:out value="${Venda.data_venda}" /></td>
					<td><c:out value="${Venda.cod_cliente}" /></td>
					<td><c:out value="${Venda.cod_produto}" /></td>
					<td><c:out value="${Venda.cod_filial}" /></td>
					<td><c:out value="${Venda.quantidade}" /></td>
					<td><c:out value="${Venda.desconto}" /></td>
					<td><c:out value="${Venda.valor_Total}" /></td>
					<td><a href="/edit?id=<c:out value='${Venda.codvenda}' />">Alterar</a>
						<a href="/delete?id=<c:out value='${Venda.codvenda}' />">Deletar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>