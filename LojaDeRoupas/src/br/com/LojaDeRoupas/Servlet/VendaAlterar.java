/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.vendaDAO;
import br.com.LojaDeRoupas.Model.Venda;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gusta
 */

public class VendaAlterar extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try {
              int cod_filial = Integer.parseInt(request.getParameter("cod_filial"));
              Venda venda = vendaDAO.getVenda(cod_filial);
              request.setAttribute("cod_filial", venda);
              RequestDispatcher rd =
                      getServletContext().getRequestDispatcher("/ConsultarVenda.jsp");
              rd.forward(request, response);
          } catch (SQLException ex) {
              Logger.getLogger(VendaAlterar.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(VendaAlterar.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }
}
