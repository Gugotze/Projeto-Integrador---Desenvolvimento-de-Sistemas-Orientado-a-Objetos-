<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Venda</h1>
        </center>
        <div align="center">
        <c:if test="${Venda != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${Venda == null}">
            <form action="VendaServlet" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                   
                    <c:if test="${cliente == null}">
                        Adicionar Nova Venda
                    </c:if>
                </h2>
            </caption>
            <c:if test="${Venda != null}">
                <input type="hidden" name="codvenda" value="<c:out value='${venda.codvenda}' />" />
            </c:if>
                        
            <tr>
                <th>Data: </th>
                <td>
                    <input type="text" name="data_venda" size="45" value="<c:out value='${venda.data_venda}' />" />
                </td>
            </tr>
            <tr>
                <th>Cod.Cliente: </th>
                <td>
                    <input type="text" name="cod_cliente" size="45" value="<c:out value='${venda.cod_cliente}' />" />
                </td>
            </tr>
            <tr>
                <th>Cod.Produto: </th>
                <td>
                    <input type="text" name="price" size="5" value="<c:out value='${venda.cod_venda}' />" />
                </td>
            </tr>
            
            <tr>
                <th>Cod.Filial: </th>
                <td>
                    <input type="text" name="cod_filial" size="45" value="<c:out value='${venda.cod_filial}' />" />
                </td>
            </tr>
            <tr>
                <th>Quantidade: </th>
                <td>
                    <input type="text" name="quantidade" size="45" value="<c:out value='${venda.quantidade}' />" />
                </td>
            </tr>
            <tr>
                <th>Desconto: </th>
                <td>
                    <input type="text" name="desconto" size="5" value="<c:out value='${Venda.desconto}' />" />
                </td>
            </tr>
            
            <tr>
                <th>Valor Total: </th>
                <td>
                    <input type="text" name="valor_Total" size="45" value="<c:out value='${venda.valor_Total}' />" />
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
