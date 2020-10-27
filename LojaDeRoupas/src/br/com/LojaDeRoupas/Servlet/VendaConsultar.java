/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.vendaDAO;
import br.com.LojaDeRoupas.Model.Venda;


import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author gusta
 */

public class VendaConsultar extends HttpServlet {

	private static final long serialVersionUID = 1L;
   
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
            List<Venda> listaVenda = vendaDAO.consultarVenda();
            request.setAttribute("listaVenda", listaVenda);
            
            RequestDispatcher requestDispatcher = getServletContext()
                    .getRequestDispatcher("ConsultarVenda.jsp");
            requestDispatcher.forward(request, response);
      
        
    }

}
