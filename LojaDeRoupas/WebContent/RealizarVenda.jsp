<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venda Cadastrar</title>
    </head>
    <body class="container">
        <h1>Venda</h1>
        <form action="VendaCadastrar" method="POST">
            <p>Data</p>
            <input name="data_venda" class="form-control" required="true"/><br/>
            <p>Cod.Cliente</p>
            <input name="cod_cliente" class="form-control" required="true"/><br/>
            <p>Cod.Produto</p>
            <input name="cod_produto" class="form-control" required="true"/><br/>
            <p>Cod.Filial</p>
            <input name="cod_filial" class="form-control" required="true"/><br/>
            <p>Quantidade</p>
            <input name="quantidade" class="form-control" required="true"/><br/>
            <p>Desconto</p>
            <input name="desconto" class="form-control" required="true"/><br/>
            <p>Total</p>
            <input name="valor_Total" class="form-control" required="true"/><br/>
           
            
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
