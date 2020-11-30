<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body class="container">
        <h1>Cadastro de Cliente</h1>
        <form action="entrada?acao=ClienteAlterar&metodo=post" method="POST">
        <table border="1" cellpadding="5">
           <tr>
                <th>Nome: </th>
                <td>
                    <input name="nomeCliente" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>CPF: </th>
                <td>
                    <input name="cpfCliente" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Sexo: </th>
                <td>
                    <input name="sexoCliente" class="form-control" required="true"/><br/>
                </td>
            </tr>
            
            <tr>
                <th>Data Nascimento: </th>
                <td>
                    <input name="dataNascimento" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Telefone: </th>
                <td>
                    <input name="telefone" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Email: </th>
                <td>
                    <input name="email" class="form-control" required="true"/><br/>
                </td>
            </tr>
            
            <tr>
                <th>Cep: </th>
                <td>
                    <input name="cep" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Endereço: </th>
                <td>
                    <input name="endereco" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Bairro: </th>
                <td>
                    <input name="bairro" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Número: </th>
                <td>
                    <input name="numero" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Complemento: </th>
                <td>
                    <input name="complemento" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Cidade: </th>
                <td>
                    <input name="cidade" class="form-control" required="true"/><br/>
                </td>
            </tr>
            <tr>
                <th>Estado: </th>
                <td>
                    <input name="estado" class="form-control" required="true"/><br/>
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