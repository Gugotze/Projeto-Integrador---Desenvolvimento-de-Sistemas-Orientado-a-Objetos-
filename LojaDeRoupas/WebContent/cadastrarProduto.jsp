<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
<head>

<script lang="text/javascript">
            
$(document).ready( function () {
	$('#valorCompra').mask("#.##0.00", {reverse: true});
	$('#valorVenda').mask("#.##0.00", {reverse: true});
});
</script>

<meta charset="UTF-8">
<title>Cadastrar produto</title>
</head>
<body>
<div class="container">
<!-- 	<form action= "/LojaDeRoupas/insereProdutos" method="post">
	
		codFilial: <input type="text" name="codFilial">
		<br>
		codProduto: <input type="text" name="codProduto">
		<br>
		nome: <input type="text" name="nome">
		<br>
		tipo: <input type="text" name="tipoProduto">
		<br>
		quantidade: <input type="text" name="quantidade">
		<br>
		valorCompra: <input type="text" name="valorCompra">
		<br>
		valorVenda: <input type="text" name="valorVenda">
			<br>	<br>
		<input type="submit">
	</form> -->
	
  <form action= "/LojaDeRoupas/insereProdutos" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="nome">Nome</label>
      <input type="text" class="form-control" id="nome" name="nome" required="required" placeholder="Ex: Boné Brasil, Camiseta New Era">
    </div>
    <div class="form-group col-md-6">
      <label for="tipoProduto">Tipo</label>
      <input type="text" class="form-control" id="tipoProduto" name="tipoProduto" required="required" placeholder="Ex: Roupas, Calçados, Acessórios">
    </div>
  </div>
  <div class="form-row">
  	<div class="form-group col-md-6">
    <label for="quantidade">Quantidade</label>
    <input type="number" class="form-control" id="quantidade" name="quantidade" required="required">
    </div>
    <div class="form-group col-md-6">
    <label for="codFilial">Filial</label>
    <input type="text" class="form-control" id="codFilial" name="codFilial">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="valorCompra">Valor compra</label>
      <input type="text" class="form-control" id="valorCompra" name="valorCompra">
    </div>
    <div class="form-group col-md-6">
      <label for="valorVenda">Valor venda</label>
      <input type="text" class="form-control" id="valorVenda" name="valorVenda">
    </div>
  </div>
   <button type="submit" class="btn btn-primary">OK</button>
</form>
</div>
	
</body>
</html>