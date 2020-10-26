<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar produto</title>
</head>
<body>
	<form action= "/LojaDeRoupas/insereProdutos" method="post">
	
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
	</form>
</body>
</html>