/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.vendaDAO;
import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Model.Venda;


import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaVendas")
public class VendaConsultar extends HttpServlet {

	private static final long serialVersionUID = 1L;
   
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		if(!Usuario.estaLogado(request, response)) {
			System.out.println("Não está logado!");
			response.sendRedirect("login.jsp");
			return;
			 
		}
        	
		System.out.println("VOU CONSULTAR");
       
            List<Venda> listaVenda = vendaDAO.consultarVenda();
            request.setAttribute("listaVendas", listaVenda);
            
            RequestDispatcher rd = request.getRequestDispatcher("ConsultarVenda.jsp");
            rd.forward(request, response);
      
        
    }

}
