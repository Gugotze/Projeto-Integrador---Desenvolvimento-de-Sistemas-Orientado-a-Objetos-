<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alteração de Venda</title>
    </head>
    <body class="container">
        <h1>Alterar Venda</h1>
      	<form action="/LojaDeRoupas/VendaAlterar" method="POST">
            <p>Data</p>
            <input  type= "date" name="data_venda" class="form-control" value="${venda.data_venda}"  required="true"  data-mask="00/00/0000" maxlength="10" autocomplete="off"/><br/>
            <p>Cod.Cliente</p>
            <input name="cod_cliente" class="form-control"  value="${venda.cod_cliente}" required="true"/><br/>
            <p>Cod.Produto</p>
            <input name="cod_produto" class="form-control" value="${venda.cod_produto}"  required="true"/><br/>
            <p>Cod.Filial</p>
            <input name="cod_filial" class="form-control" value="${venda.cod_filial}"   required="true"/><br/>
            <p>Quantidade</p>
            <input name="quantidade" class="form-control" value="${venda.quantidade}"   required="true"/><br/>
            <p>Desconto</p>
            <input name="desconto" class="form-control" data-type="currency" value="${venda.desconto}"  onkeypress="$(this).mask('R$ 999.990,00')" required="true"/><br/>
            <p>Total</p>
            <input type = "text"  name="valor_Total" class="form-control" data-type="currency" value="${venda.valor_Total}"    onkeypress="$(this).mask('R$ 999.990,00')" required="true"/><br/>
           	<input type="hidden" name="id_venda" value="${venda.id_venda}">
            
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
