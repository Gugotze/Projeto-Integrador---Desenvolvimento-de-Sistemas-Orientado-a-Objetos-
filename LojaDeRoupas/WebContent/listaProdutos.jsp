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


function mostrarModalExclusao(_codProduto, _nome){
    $("#nomeProduto").html(_nome);
    $("#codProduto").val(_codProduto);
    $('#modalExclusao').modal('show');
}

function excluirCliente() {
    var _codProduto = $("#codProduto").val();
    $.get( "/LojaDeRoupas/deletarProduto?id="+_codProduto, function( resposta ) {
        $('#modalExclusao').modal('hide')
        if (resposta === "true") {
            console.log("Funfou!");
        } else {
            console.log("Ops!");
        }
        window.location.reload();
    });
}

</script>

</head>
<body>
<div>
	<center>
		<h1>Produtos</h1>
		<button class="btn btn-primary" ><a href="/LojaDeRoupas/atualizaProdutos?action=create&id=0" style="color: white;"> Adicionar novo produto</a></button>
		<br/>
		<br/>
		<br/>
	</center>
	</div>
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
					<td><a href="/LojaDeRoupas/atualizaProdutos?action=update&id=${produto._codProduto}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
					<td><button type="button"  onclick="mostrarModalExclusao(${produto._codProduto}, '${produto._nome}')"><i class="fa fa-trash" aria-hidden="true"></i></button></td>
				</tr>
			</c:forEach>
			</tbody>
			
		</table>
		<div class="modal fade" id="modalExclusao" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title" id="exampleModalLabel">Confirmar Exclusão</h5>
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <div class="modal-body">
                    Confirmar exclusão do produto  <label id="nomeProduto"></label> ?
                    <input id="codProduto" hidden="true" />
                 
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                  <button type="button" class="btn btn-primary" onclick="excluirCliente()">Confirmar</button>
                </div>
              </div>
            </div>
          </div>
	</div>
</body>
</html>