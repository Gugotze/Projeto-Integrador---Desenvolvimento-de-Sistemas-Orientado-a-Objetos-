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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gusta
 */

public class VendaDeletar extends HttpServlet {

    @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer codvenda = Integer.parseInt(request.getParameter("codvenda"));
       try {
           vendaDAO.deletarVenda(codvenda);
           response.getWriter().print(true);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(VendaDeletar.class.getName()).log(Level.SEVERE, null, ex);
           response.getWriter().print(false);
       } 
        
    }

}
