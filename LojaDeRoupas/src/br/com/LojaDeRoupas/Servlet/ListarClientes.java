/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.ClienteDAO;
import br.com.LojaDeRoupas.Model.Cliente;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ListarClientes extends HttpServlet {

    

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
		HttpSession sessao = request.getSession();
		
		sessao.setAttribute("nomeUsuario", "Caio");
		
		
        List<Cliente> listaClientes = ClienteDAO.getClientes();
        request.setAttribute("listaClientes", listaClientes);
        
         RequestDispatcher requestDispatcher = getServletContext()
                 .getRequestDispatcher("/listaClientes.jsp");
         requestDispatcher.forward(request, response);
    }

   


}
