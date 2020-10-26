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
import java.util.List;
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

public class VendaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data_venda = request.getParameter("data_venda");
        String cod_clienteStr = request.getParameter("cod_cliente");
        int cod_cliente = Integer.parseInt(cod_clienteStr);
        String cod_produtoStr = request.getParameter("cod_produto");
        int cod_produto = Integer.parseInt(cod_produtoStr);
        String cod_filialStr = request.getParameter("cod_filial");
        int cod_filial = Integer.parseInt(cod_filialStr);
        String quantidadeStr = request.getParameter("quantidade");
        int quantidade = Integer.parseInt(quantidadeStr);
        String descontoStr= request.getParameter("desconto");
        Double desconto = Double.parseDouble(descontoStr);
        String valor_TotalStr = request.getParameter("valor_Total");
        Double valor_Total = Double.parseDouble(valor_TotalStr);
        
        Venda venda = new Venda(data_venda, cod_cliente, cod_produto, cod_filial, quantidade, desconto, valor_Total);
         
           try {
            vendaDAO.inserirVenda(venda);
            response.sendRedirect("ConsultarVenda.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VendaServlet.class.getName()).log(Level.SEVERE, null, ex);
            
        }
           
           
         }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            List<Venda> listaVenda = vendaDAO.consultarVenda();
            request.setAttribute("listaVenda", listaVenda);
            
            RequestDispatcher requestDispatcher = getServletContext()
                    .getRequestDispatcher("/ConsultarVenda.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(VendaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
        
    }
    

