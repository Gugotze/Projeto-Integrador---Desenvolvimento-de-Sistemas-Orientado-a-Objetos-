package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.LojaDeRoupas.Model.produto;
import br.com.LojaDeRoupas.Dao.produtoDAO;


@WebServlet("/listaProdutos")
public class listaProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
