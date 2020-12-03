<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <%@include file="header.jsp" %>
                <title>Consultar Vendas</title>
                <script lang="text/javascript">
                    $(document).ready(function() {
                        $('#minhaTabela tfoot th').each(function() {
                            var title = $(this).text();
                            $(this).html('<input type="text" style="width: 110px" placeholder="' + title + '" />');
                        });


                        var data = new Date();



                        var hora = data.getHours(); // 0-23
                        var min = data.getMinutes(); // 0-59
                        var seg = data.getSeconds(); // 0-59
                        var mseg = data.getMilliseconds(); // 0-999
                        var tz = data.getTimezoneOffset(); // em minutos

                        var str_hora = hora + ':' + min + ':' + seg;
                        console.log(str_hora)
                        document.getElementById('horaAtual').innerHTML = str_hora;

                        // DataTable
                        var table = $('#minhaTabela').DataTable({



                            "language": {
                                "search": "Buscar:",
                                "sZeroRecords": "Nenhum item encontrado",
                                "lengthMenu": "Mostrar _MENU_ linhas",
                                "info": "Mostrando página _PAGE_ de _PAGES_",
                            },

                            initComplete: function() {

                                this.api().columns().every(function() {
                                    var that = this;

                                    $('input', this.footer()).on('keyup change clear', function() {
                                        if (that.search() !== this.value) {
                                            that
                                                .search(this.value)
                                                .draw();
                                        }
                                    });
                                });
                            }
                        });

                    });
                </script>
        </head>

        </head>

        <body>

            <center>
                <h1>Relatório de Vendas</h1>
                <button class="btn btn-primary"><a href="entrada?acao=NovaVendaForm" style="color: white;"> Realizar Nova Venda</a></button>
                <br>
                <br>
                <br>
            </center>
            
            <form action="/LojaDeRoupas/entrada?acao=VendaConsultar&consulta=S" method="post">
            
            <label >Data início</label>
            <input type="date" name="dataIni">
            <label >Data Fim</label>
            <input type="date" name="dataFim"> 

            <button class="btn btn-primary" type="submit">Buscar</button>
            </form>
            <br>
            
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fas fa fa-table" aria-hidden="true"></i> Vendas
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table id="minhaTabela" class="display">
                            <thead>
                                <tr>
                                    <th>Cod.Venda</th>
                                    <th>Nome Cliente</th>
                                    <th>Filial Estado</th>
                                    
                                    <th>Quantidade</th>
                                    <th>Valor total</th>
                                    <th>Data Venda</th>
                                    <th></th>
                                    <th></th>

                                </tr>
                                <thead>
                                    <tbody>
                                        <c:forEach var="venda" items="${listaVendas}">
                                            <tr>
                                                <td>${venda.id_venda}</td>
                                                <td>${venda.nome}</td>
                                                <td>${venda.estado}</td>
                                                <td>${venda.quantidade}</td>
                                                <td>${venda.valor_Total}</td>
                                                <td>${venda.data_venda}</td>
                                                <td><a href="/LojaDeRoupas/entrada?acao=VendaAlterar&metodo=get&id_venda=${venda.id_venda}"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
                                                <td><a href="/LojaDeRoupas/entrada?acao=VendaDeletar&id_venda=${venda.id_venda}"><i class="fa fa-trash" aria-hidden="true"></i></a></td>

                                            </tr>


                                        </c:forEach>
                                    </tbody>
                                    <tfoot>
                                        <tr>
                                            <th>Cod.Venda</th>
                                            <th>Nome Cliente</th>
                                            <th>Filial Estado</th>
                                            
                                            <th>Quantidade</th>
                                            <th>Valor total</th>
                                            <th>Data Venda</th>
                                            <th style="Display: none;"></th>
                                            <th style="Display: none;"></th>
                                        </tr>
                                    </tfoot>
                        </table>
                    </div>
                </div>
                <div class="card-footer small text-muted">Atualizado hoje ás <strong><label id="horaAtual"></label></strong></div>
            </div>

        </body>

        </html>