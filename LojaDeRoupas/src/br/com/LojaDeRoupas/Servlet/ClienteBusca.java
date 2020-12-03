package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDAO;
import br.com.LojaDeRoupas.Model.Cliente;

/**
 * Servlet implementation class ClienteBusca
 */
@WebServlet("/ClienteBusca")
public class ClienteBusca extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cpf = request.getParameter("cpf");
		cpf = cpf.replace("-", "").replace(".", "");
		
			Cliente cliente = ClienteDAO.getCliente(cpf);
			
			response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
		    response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
		    
		    response.getWriter().write(cliente.getNome()+';'+cliente.getID_CLIENTE());
			
			
	}

}
