/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.vendaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gusta
 */
@WebServlet("/VendaDeletar")
public class VendaDeletar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id_venda = Integer.parseInt(request.getParameter("id_venda"));
       try {
           vendaDAO.deletarVenda(id_venda);
           response.sendRedirect("sucesso.jsp");
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(VendaDeletar.class.getName()).log(Level.SEVERE, null, ex);
           response.getWriter().print(false);
       } 
        
    }

}
