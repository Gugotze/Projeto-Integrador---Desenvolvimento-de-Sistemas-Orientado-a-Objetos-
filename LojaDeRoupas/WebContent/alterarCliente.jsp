

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Cliente</title>
    </head>
    <body>
        <h1>Alteração de Cadastro: ${cliente.nome}</h1>
        <form action="AlterarCliente" method="POST">
            <p>Código do cliente</p>
            <input name="codcliente" value="${cliente.codcliente}" readonly="true"/><br/>
            <p>Nome</p>
            <input name="nome" class="form-control" required="true"/><br/>
            <p>CPF</p>
            <input name="cpf" value="${cliente.cpf}" readonly="true"/><br/>
            <p>Sexo</p>
            <input name="sexo" class="form-control" required="true"/><br/>
            <p>Data Nascimento</p>
            <input name="dataNascimento" class="form-control" required="true"/><br/>
            <p>Telefone</p>
            <input name="telefone" class="form-control" required="true"/><br/>
            <p>Email</p>
            <input name="email" class="form-control" required="true"/><br/>
            <p>Cep</p>
            <input name="cep" class="form-control" required="true"/><br/>
            <p>Endereço</p>
            <input name="endereco" class="form-control" required="true"/><br/>
            <p>Bairro</p>
            <input name="bairro" class="form-control" required="true"/><br/>
            <p>Número</p>
            <input name="numero" class="form-control" required="true"/><br/>
            <p>Complemento</p>
            <input name="complemento" class="form-control" required="true"/><br/>
            <p>Cidade</p>
            <input name="cidade" class="form-control" required="true"/><br/>
            <p>Estado</p>
            <input name="estado" class="form-control" required="true"/><br/>
            
            <button type="submit">Enviar</button>
            
        </form>
    </body>
</html>
