/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.LojaDeRoupas.Servlet;


import br.com.LojaDeRoupas.Dao.vendaDAO;

import br.com.LojaDeRoupas.Model.Venda;
import br.com.LojaDeRoupas.Util.Utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author gusta
 */

public class VendaAlterar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
              Integer codvenda = Integer.parseInt(request.getParameter("codvenda"));
              Venda venda = vendaDAO.getVenda(codvenda);
              request.setAttribute("venda", venda);
              RequestDispatcher rd =
                      getServletContext().getRequestDispatcher("/ConsultarVenda.jsp");
              rd.forward(request, response);
         
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	Integer codvenda = Integer.parseInt(request.getParameter("codvenda"));
    	
    	String data_venda = request.getParameter("data_venda");
          
          Integer cod_cliente = Integer.parseInt(request.getParameter("cod_cliente"));
          
          Integer cod_produto = Integer.parseInt(request.getParameter("cod_produto"));
          
         Integer cod_filial = Integer.parseInt(request.getParameter("cod_filial"));
         
          Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
   
          Double desconto = Double.parseDouble(request.getParameter("desconto"));
         
          Double valor_Total = Double.parseDouble(request.getParameter("valor_Total"));
    	
         Venda venda = vendaDAO.getVenda(codvenda);
         venda.setData_venda(data_venda);
         venda.setCod_cliente(cod_cliente);
         venda.setCod_produto(cod_produto);
         venda.setCod_filial(cod_filial);
         venda.setQuantidade(quantidade);
         venda.setDesconto(desconto);
         venda.setValor_Total(valor_Total);
        
         
         try {
             vendaDAO.updateVenda(venda);
             response.sendRedirect("sucesso.jsp");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(VendaAlterar.class.getName()).log(Level.SEVERE, null, ex);
             Utils.mostrarTelaErro(ex, request, response);
         } 
        
    }
    
}