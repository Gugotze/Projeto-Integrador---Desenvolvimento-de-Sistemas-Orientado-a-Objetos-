<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>Books Store Application</title>
</head>

<body>
    <center>
        <h1>Books Management</h1>
        <h2>
            <a href="/new">Adiciona Novo Cliente</a>

            <a href="/list">Lista todos Clientes</a>

        </h2>
    </center>
    <div align="center">
        <c:if test="${cliente != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${cliente == null}">
            <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${cliente != null}">
                        Editar Cliente
                    </c:if>
                    <c:if test="${cliente == null}">
                        Adiciona Novo Cliente
                    </c:if>
                </h2>
            </caption>
            <c:if test="${cliente != null}">
                <input type="hidden" name="id" value="<c:out value='${cliente.idCliente}' />" />
            </c:if>
                        
            <tr>
                <th>Nome: </th>
                <td>
                    <input type="text" name="title" size="45" value="<c:out value='${cliente.nomeCliente}' />" />
                </td>
            </tr>
            <tr>
                <th>CPF: </th>
                <td>
                    <input type="text" name="author" size="45" value="<c:out value='${cliente.cpfCliente}' />" />
                </td>
            </tr>
            <tr>
                <th>Sexo: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.sexoCliente}' />" />
                </td>
            </tr>
            
            <tr>
                <th>Data Nascimento: </th>
                <td>
                    <input type="text" name="title" size="45" value="<c:out value='${cliente.dataNascimento}' />" />
                </td>
            </tr>
            <tr>
                <th>Telefone: </th>
                <td>
                    <input type="text" name="author" size="45" value="<c:out value='${cliente.telefone}' />" />
                </td>
            </tr>
            <tr>
                <th>Email: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.email}' />" />
                </td>
            </tr>
            
            <tr>
                <th>Cep: </th>
                <td>
                    <input type="text" name="title" size="45" value="<c:out value='${cliente.cep}' />" />
                </td>
            </tr>
            <tr>
                <th>Endereço: </th>
                <td>
                    <input type="text" name="author" size="45" value="<c:out value='${cliente.endereco}' />" />
                </td>
            </tr>
            <tr>
                <th>Bairro: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.bairro}' />" />
                </td>
            </tr>
            <tr>
                <th>Número: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.numero}' />" />
                </td>
            </tr>
            <tr>
                <th>Complemento: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.complemento}' />" />
                </td>
            </tr>
            <tr>
                <th>Cidade: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.cidade}' />" />
                </td>
            </tr>
            <tr>
                <th>Estado: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${cliente.estado}' />" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>

        </table>
        </form>
    </div>
</body>

</html>