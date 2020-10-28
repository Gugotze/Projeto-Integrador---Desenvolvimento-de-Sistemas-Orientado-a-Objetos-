package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;

@WebServlet("/deletarProduto")
public class ProdutoDeletar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			
			Integer codProduto = Integer.valueOf(request.getParameter("id"));
			
			
			
			produtoDAO.deleteProduto(codProduto);
			
		
		
		response.sendRedirect("listaProdutos");
		
		
	}

}
