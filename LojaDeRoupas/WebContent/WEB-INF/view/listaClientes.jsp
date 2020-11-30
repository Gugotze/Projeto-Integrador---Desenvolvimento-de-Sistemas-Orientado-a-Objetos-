<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <!DOCTYPE html>
        <html >
        <%@include file="header.jsp" %>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Lista de Clientes</title>

                <script lang="text/javascript">
                $(document).ready( function () {
                	

                	var data = new Date();

                	
                	
                	var hora    = data.getHours();          // 0-23
                	var min     = data.getMinutes();        // 0-59
                	var seg     = data.getSeconds();        // 0-59
                	var mseg    = data.getMilliseconds();   // 0-999
                	var tz      = data.getTimezoneOffset(); // em minutos

                	var str_hora = hora + ':' + min + ':' + seg;
                	console.log(str_hora)
                	document.getElementById('horaAtual').innerHTML = str_hora;
         
                	
                	
                	var table = $('#minhaTabela').DataTable({
                		 aoColumns : [
                		      { "sWidth": "2%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		      { "sWidth": "5%"},
                		    ],
                		"language": {
                    	    "search": "Buscar:",
                    	    "sZeroRecords": "Nenhum item encontrado",
                    	    "processing":     "Carregando...",
                    	    "lengthMenu": "Mostrar _MENU_ linhas",
                    	    "info": "Mostrando página _PAGE_ de _PAGES_",
                    	    "paginate": {
                    	        "first":      "Primeira",
                    	        "last":       "Úlrima",
                    	        "next":       "Próxima",
                    	        "previous":   "Anterior"
                    	    },
                    	  }
                		
                	});
                   	
                       
                    
                } );	
                
                
                

                    function mostrarModalExclusao(cpf, nome) {
                        $("#nomeCliente").html(nome);
                        $("#cpfCliente").val(cpf);
                        $('#modalExclusao').modal('show');
                    }

                    function excluirCliente() {
                        var cpf = $("#cpfCliente").val();
                        $.get("/LojaDeRoupas/entrada?acao=ClienteDeletar&cpf=" + cpf, function(resposta) {
                            $('#modalExclusao').modal('hide')
                            if (resposta === "true") {
                                console.log("Funfou!");
                            } else {
                                console.log("Ops!");
                            }
                            window.location.reload();
                        });
                    }
                    
                    
                </script>
            </head>

            <body>
                <div>
                    <center>
                    <h1>Bem vindo, Bem vindo ${sessionScope.usuario.nome}</h1>
                        <h1>Lista de Clientes</h1>
                        <button class="btn btn-primary"><a href="/LojaDeRoupas/entrada?acao=NovoClienteForm" style="color: white;"> Adicionar novo Cliente</a></button>
                        <br/>
                        <br/>
                        <br/>
                    </center>
                </div>
                <div class="card mb-3">
	<div class="card-header">
            <i class="fa fa-users" aria-hidden="true"></i>
            Clientes</div>
        <div class="card-body">
        <div class="table-responsive">
					
                    <table  width="100%" style="font-size: 11px" id="minhaTabela">
                        <thead>
                            <tr>
                                <th >Cód. cliente</th>
                                <th>Nome</th>
                                <th>CPF</th>
                                <th>Sexo</th>
                                <th>Data Nascimento</th>
                                <th>Telefone</th>
                                <th>E-mail</th>
                                <th>CEP</th>
                                <th>Endereço</th>
                                <th>Bairro</th>
                                <th>N°</th>
                                <th>Complemento</th>
                                <th>Cidade</th>
                                <th>Estado</th>
                                <th>Editar</th>
                                <th>Excluir</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="cliente" items="${listaClientes}">
                                <tr>
                                    <td role="row" class="odd">${cliente.codcliente}</td>
                                    <td>${cliente.nome}</td>
                                    <td>${cliente.cpf}</td>
                                    <td>${cliente.sexo}</td>
                                    <td>${cliente.dataNascimento}</td>
                                    <td>${cliente.telefone}</td>
                                    <td>${cliente.email}</td>
                                    <td>${cliente.cep}</td>
                                    <td>${cliente.endereco}</td>
                                    <td>${cliente.bairro}</td>
                                    <td>${cliente.numero}</td>
                                    <td>${cliente.complemento}</td>
                                    <td>${cliente.cidade}</td>
                                    <td>${cliente.estado}</td>
                                    <td><a href="/LojaDeRoupas/entrada?acao=ClienteAlterar&metodo=get&cpf=${cliente.cpf}" style="font-size: 20px"><i class="fa fa-pencil" aria-hidden="true" ></i></a></td>
                                   <td><a href="#" onclick="mostrarModalExclusao(${cliente.cpf}, '${cliente.nome}')" style="font-size: 20px"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                    
                     </div>
          </div>
          <div class="card-footer small text-muted">Atualizado hoje ás <strong><label id="horaAtual"></label></strong></div>
		</div>
                    <div class="modal fade" id="modalExclusao" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Confirmar Exclusão</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                                </div>
                                <div class="modal-body">
                                    Confirmar exclusão do cliente <label id="nomeCliente"></label> ?
                                    <input id="cpfCliente" hidden="true" />

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    <button type="button" class="btn btn-primary" onclick="excluirCliente()">Confirmar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br/>
                    <a href="/LojaDeRoupas/Index">Voltar</a>
                
            </body>

        </html>