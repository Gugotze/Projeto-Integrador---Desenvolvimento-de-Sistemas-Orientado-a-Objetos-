<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
<head>
<title>Consultar Vendas</title>
<script lang="text/javascript">
            
$(document).ready( function () {
	 $('#minhaTabela tfoot th').each( function () {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="Procurar por '+title+'" />' );
	    } );
	 
	    // DataTable
	    var table = $('#minhaTabela').DataTable({
	    	
	    	"language": {
	    	    "search": "Buscar:",
	    	    "sZeroRecords": "Nenhum item encontrado",
	    	    "lengthMenu": "Mostrar _MENU_ linhas",
	    	    "info": "Mostrando página _PAGE_ de _PAGES_",
	    	  },
	    	
	        initComplete: function () {
	            
	            this.api().columns().every( function () {
	                var that = this;
	 
	                $( 'input', this.footer() ).on( 'keyup change clear', function () {
	                    if ( that.search() !== this.value ) {
	                        that
	                            .search( this.value )
	                            .draw();
	                    }
	                } );
	            } );
	        }
	    });
    
} );
        </script>
    </head>

</head>
<body>
	<center>
		<h1>Relatório de Vendas</h1>
		<button class="btn btn-primary" ><a href="RealizarVenda.jsp" style="color: white;"> Realizar Nova Venda</a></button>
		<br>
		<br>
		<br>
	</center>
	<div>
		<table id="minhaTabela" class="display">
			<thead>
			<tr>
				<th>Cod.Venda</th>
				<th>Data</th>
				<th>Cod.Cliente</th>
				<th>Cod.Produto</th>
				<th>Cod.Filial</th>
				<th>Quantidade</th>
				<th>Desconto</th>
				<th>Valor Total</th>
				<th>Editar</th>
				<th>Apagar</th>
			</tr>
			<thead>
			<tbody>
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
			
				</tr>
			
			</c:forEach>
			</tbody>
			<tfoot>
            <tr>
                <th>Cod.Venda</th>
                <th>Data</th>
                <th>Cod.Cliente</th>
                <th>Cod.Produto</th>
                <th>Cod.Filial</th>
                <th>Quantidade</th>
                <th>Desconto</th>
                <th>Valor total</th> 
                <th style="Display: none;"></th> 
                <th style="Display: none;"></th>      
            </tr>
        </tfoot>
		</table>
	</div>
</body>
</html>