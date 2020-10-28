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
	<c:if test="${empty action}">
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
</c:if>


<c:if test="${not empty action}">
	<form action= "/LojaDeRoupas/atualizaProdutos" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="nome">Nome</label>
      <input type="text" class="form-control" id="nome" name="nome" required="required" value="${produto._nome}" placeholder="Ex: Boné Brasil, Camiseta New Era">
    </div>
    <div class="form-group col-md-6">
      <label for="tipoProduto">Tipo</label>
      <input type="text" class="form-control" id="tipoProduto" name="tipoProduto" value="${produto._tipo}" required="required" placeholder="Ex: Roupas, Calçados, Acessórios">
    </div>
  </div>
  <div class="form-row">
  	<div class="form-group col-md-6">
    <label for="quantidade">Quantidade</label>
    <input type="number" class="form-control" id="quantidade" name="quantidade" value="${produto._quantidade}" required="required">
    </div>
    <div class="form-group col-md-6">
    <label for="codFilial">Filial</label>
    <input type="text" class="form-control" id="codFilial" name="codFilial" required="required" value="${produto._filial}">
    </div>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="valorCompra">Valor compra</label>
      <input type="text" class="form-control" id="valorCompra" name="valorCompra" required="required" value="${produto._valorCompra}">
    </div>
    <div class="form-group col-md-6">
      <label for="valorVenda">Valor venda</label>
      <input type="text" class="form-control" id="valorVenda" name="valorVenda" required="required" value="${produto._valorVenda}">
    </div>
  </div>
	<input type="hidden" id="codProduto" name="codProduto" value="${produto._codProduto}">
   <button type="submit" class="btn btn-primary">OK</button>
</form>
</c:if>

</div>
	
</body>
</html>