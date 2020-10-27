<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
<head>
<title>Produtos</title>


            
<script>   
$(document).ready( function () {

	
	var table = $('#minhaTabela').DataTable({
		 aoColumns : [
		      { "sWidth": "2%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		      { "sWidth": "5%"},
		    ],
		"language": {
    	    "search": "Buscar:",
    	    "sZeroRecords": "Nenhum item encontrado",
    	    "processing":     "Carregando...",
    	    "lengthMenu": "Mostrar _MENU_ linhas",
    	    "info": "Mostrando página _PAGE_ de _PAGES_",
    	    "paginate": {
    	        "first":      "Primeira",
    	        "last":       "Úlrima",
    	        "next":       "Próxima",
    	        "previous":   "Anterior"
    	    },
    	  }
		
	});
    	
       
    
} );
</script>

</head>
<body>
<div>
	<center>
		<h1>Produtos</h1>
		<button class="btn btn-primary" ><a href="cadastrarProduto.jsp" style="color: white;"> Adicionar novo produto</a></button>
		<br/>
		<br/>
		<br/>
	</center>
	<div class="container">
		<table id="minhaTabela">
		<thead>
			<tr>
				<th>Cod produto</th>
				<th>Nome</th>
				<th>Tipo</th>
				<th>Quantidade</th>
				<th>Valor compra</th>
				<th>Valor venda</th>
				<th>Cod filial</th>
				<th>Editar</th>
				<th>Deletar</th>
			</tr>
			<thead>
			<tbody>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td>${produto._codProduto}</td>
					<td>${produto._nome}</td>
					<td>${produto._tipo}</td>
					<td>${produto._quantidade}</td>
					<td>${produto._valorCompra}</td>
					<td>${produto._valorVenda}</td>
					<td>${produto._filial}</td>
					<td><a href="/editarProduto?id=${produto._codProduto}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
					<td><a href="/deletarProduto?id=${produto._codProduto}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
				</tr>
			</c:forEach>
			</tbody>
			
		</table>
	</div>
</body>
</html>