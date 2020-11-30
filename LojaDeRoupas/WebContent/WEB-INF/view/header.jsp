<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="Jquery/jquery.dataTables.min.css">
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    </head>
    <body>
        <script src="Jquery/jquery-3.5.1.min.js" ></script>
        <script src="Jquery/jquery.dataTables.min.js" ></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" ></script>
        <script src="jQueryMask/dist/jquery.mask.min.js" ></script>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="entrada?acao=Index"> <i class="fa fa-home" aria-hidden="true"></i> </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Camisetas <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Calçados</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Acessórios</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Cadastros
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="ListarClientes">Listar Clientes</a><br/>
          <a class="dropdown-item" href="cadastrarCliente.jsp">Cadastrar Clientes</a><br/>
	   	  <a class="dropdown-item" href="/LojaDeRoupas/listaVendas"> Consulta de Vendas</a><br/>
		  <a class="dropdown-item" href="RealizarVenda.jsp">Realizar Venda</a></br>
		  <a class="dropdown-item" href="/LojaDeRoupas/listaProdutos">Produtos</a>
		  
        </div>
      </li>
      
      <li class="nav-item dropdown no-arrow" >
        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-user-circle fa-fw"></i>
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
          <a class="dropdown-item" href="#">Configurações</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">Logout</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
<br>
<br>
        <nav></nav>
        
         <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Pronto para partir?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">${sessionScope.usuario.nome}, selecione "Logout" abaixo se você estiver pronto para encerrar sua sessão atual.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="/LojaDeRoupas/entrada?acao=Logout">Logout</a>
        </div>
      </div>
    </div>
  </div>
        
    </body>
</html>
