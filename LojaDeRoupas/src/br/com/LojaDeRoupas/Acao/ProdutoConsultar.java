package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Model.produto;

public class ProdutoConsultar implements Acao {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		if(!Usuario.estaLogado(request, response)) {
			System.out.println("Não está logado!");
			response.sendRedirect("login.jsp");
			return;
			 
		}

		List<produto> lista = null;
		try {
			lista = produtoDAO.consultarProduto();
		} catch (SQLException e) {
			throw new ServletException(e.getMessage());
		}




		request.setAttribute("produtos", lista);

		RequestDispatcher rd = request.getRequestDispatcher("listaProdutos.jsp");
		rd.forward(request, response);
	
	}
	
	
	
}
