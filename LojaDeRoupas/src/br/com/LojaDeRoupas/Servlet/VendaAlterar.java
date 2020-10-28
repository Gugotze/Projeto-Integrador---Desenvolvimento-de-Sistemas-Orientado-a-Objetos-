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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author gusta
 */

@WebServlet("/VendaAlterar")
public class VendaAlterar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
    	
              Integer id_venda = Integer.parseInt(request.getParameter("id_venda"));
              Venda venda = vendaDAO.getVenda(id_venda);
              request.setAttribute("venda", venda);
              RequestDispatcher rd =
                      getServletContext().getRequestDispatcher("/AlterarVenda.jsp");
              rd.forward(request, response);
         
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	System.out.println("Estou na alteração de venda");
    
    	
    	Integer id_venda = Integer.parseInt(request.getParameter("id_venda"));
    	
    	String data_venda = request.getParameter("data_venda");
          
          Integer cod_cliente = Integer.parseInt(request.getParameter("cod_cliente"));
          
          Integer cod_produto = Integer.parseInt(request.getParameter("cod_produto"));
          
         Integer cod_filial = Integer.parseInt(request.getParameter("cod_filial"));
         
          Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
   
          Double desconto = Double.parseDouble(request.getParameter("desconto").replace("R$", ""));
         
          Double valor_Total = Double.parseDouble(request.getParameter("valor_Total").replace("R$", ""));
    	
         Venda venda = vendaDAO.getVenda(id_venda);
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
