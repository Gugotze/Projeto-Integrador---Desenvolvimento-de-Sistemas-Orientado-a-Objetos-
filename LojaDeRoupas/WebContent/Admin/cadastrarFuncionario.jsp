<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
    <html>
    <%@include file="../header.jsp" %>

        <head>
        <meta charset="UTF-8">
            <title>Cadastrar Cliente</title>
            
            <script lang="text/javascript">
            	$(document).ready( function () {
            		
            		$('#telefone').mask('(00) 00000-0000');
            		$('#cep').mask('00000-000');
            		$('#cpf').mask('000.000.000-00');
            		
            		var senha = $('#senha');
            		var olho= $("#olho");

            		olho.mousedown(function() {
            		  senha.attr("type", "text");
            		});

            		olho.mouseup(function() {
            		  senha.attr("type", "password");
            		});
            		// para evitar o problema de arrastar a imagem e a senha continuar exposta, 
            		//citada pelo nosso amigo nos comentários
            		$( "#olho" ).mouseout(function() { 
            		  $("#senha").attr("type", "password");
            		});
            		
            		
            		
            		} );
            	
            	
            	
            </script>


            
        </head>
        <div class="container">
            <h1>Cadastro de funcionário</h1>
            <form action="Funcionario" method="POST">
                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label for="nome">Nome</label>
                        <input name="nome" class="form-control" id="nome" name="nome" required="required" placeholder=" Nome do Funcionario">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="nome">CPF</label>
                        <input name="cpf" class="form-control" id="cpf"  required="required" placeholder=" CPF do Funcionário">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="sexo">Sexo</label>
                        <select name="sexo" id="sexo" class="form-control">
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                    </select>
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="dataNascimento">Data de Nascimento</label>
                        <input type="date" name="dataNascimento" class="form-control" placeholder="Ex.: dd/mm/aaaa" data-mask="00/00/0000" maxlength="10" autocomplete="true">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="telefone">Telefone</label>
                        <input type="text" id="telefone" name="telefone"  placeholder="Ex.: (99)12345-6789" class="form-control" />
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="email">Email</label>
                        <input type="email" id="email" name="email" placeholder="Ex.: exemplo@exemplo.com" class="form-control">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="cep">Cep</label>
                        <input type="text" id="cep" name="cep" placeholder="Ex.: 01311-000" class="form-control" />
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="endereco">Endereço</label>
                        <input type="text" class="form-control" id="endereco" name="endereco" required="required" placeholder="Ex: Av. Paulista">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="bairro">Bairro</label>
                        <input type="text" class="form-control" id="bairro" name="bairro" required="required" placeholder="Ex: Bela Vista">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="numero">Número</label>
                        <input type="number" class="form-control" id="numero" name="numero" placeholder="Ex: 609">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="complemento">Complemento</label>
                        <input type="text" class="form-control" id="complemento" name="complemento" required="required" placeholder="Ex: 5° andar">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="cidade">Cidade</label>
                        <input type="text" class="form-control" id="cidade" name="cidade" required="required" placeholder="Ex: São Paulo">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="estado">Estado</label>
                        <select name="estado" id="estado" class="form-control">
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                    </div>
                </div>
                
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="login">Login</label>
                        <input type="text" class="form-control" id="login" name="login" required="required">
                    </div>

                    <div class="form-group col-md-6">
                       <label for="senha">Senha</label>
                       <input type="password" class="form-control" id="senha" name="senha" required="required"><img id="olho" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABDUlEQVQ4jd2SvW3DMBBGbwQVKlyo4BGC4FKFS4+TATKCNxAggkeoSpHSRQbwAB7AA7hQoUKFLH6E2qQQHfgHdpo0yQHX8T3exyPR/ytlQ8kOhgV7FvSx9+xglA3lM3DBgh0LPn/onbJhcQ0bv2SHlgVgQa/suFHVkCg7bm5gzB2OyvjlDFdDcoa19etZMN8Qp7oUDPEM2KFV1ZAQO2zPMBERO7Ra4JQNpRa4K4FDS0R0IdneCbQLb4/zh/c7QdH4NL40tPXrovFpjHQr6PJ6yr5hQV80PiUiIm1OKxZ0LICS8TWvpyyOf2DBQQtcXk8Zi3+JcKfNafVsjZ0WfGgJlZZQxZjdwzX+ykf6u/UF0Fwo5Apfcq8AAAAASUVORK5CYII="/>
                    </div>
                </div>
                
                <div class="form-row">
                    <div class="form-group col-md-6">
                         <label for="tipo">Função</label>
                        <select name="tipo" id="tipo" class="form-control">
                        <option value="Gerente">Gerente</option>
                        <option value="Vendedor">Vendedor</option>
                    </select>
                    </div>
                </div>
                
                
                <button type="submit" class="btn btn-primary">Enviar</button>
                
            </form>
            
            
        </div>

    </html>