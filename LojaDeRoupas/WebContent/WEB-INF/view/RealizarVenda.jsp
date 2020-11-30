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
        <form action="/LojaDeRoupas/entrada?acao=VendaCadastrar" method="POST">
            <p>Data</p>
            <input  type= "date" name="data_venda" class="form-control" required="true" placeholder="Ex.: dd/mm/aaaa" data-mask="00/00/0000" maxlength="10" autocomplete="off"/><br/>
            <p>Cod.Cliente</p>
            <input name="cod_cliente" class="form-control" placeholder="Ex.: 1"  required="true"/><br/>
            <p>Cod.Produto</p>
            <input name="cod_produto" class="form-control" placeholder="Ex.: 1" required="true"/><br/>
            <p>Cod.Filial</p>
            <input name="cod_filial" class="form-control" placeholder="Ex.: 1" required="true"/><br/>
            <p>Quantidade</p>
            <input name="quantidade" class="form-control" placeholder="Ex.: 1" required="true"/><br/>
            <p>Desconto</p>
            <input name="desconto" class="form-control" data-type="currency"  placeholder="Ex.: 20.00" onkeypress="$(this).mask('R$ 999.990,00')" required="true"/><br/>
            <p>Total</p>
            <input type = "text"  name="valor_Total" class="form-control" data-type="currency"  placeholder="Ex.: 55.90" onkeypress="$(this).mask('R$ 999.990,00')" required="true"/><br/>
           
            
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
