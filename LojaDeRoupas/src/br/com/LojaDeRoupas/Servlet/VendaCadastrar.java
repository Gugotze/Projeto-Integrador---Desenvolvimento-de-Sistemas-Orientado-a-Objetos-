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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VendaCadastrar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data_venda = request.getParameter("data_venda");
       
        Integer cod_cliente = Integer.parseInt(request.getParameter("cod_cliente"));
        
        Integer cod_produto = Integer.parseInt(request.getParameter("cod_produto"));
        
       Integer cod_filial = Integer.parseInt(request.getParameter("cod_filial"));
       
        Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
 
        Double desconto = Double.parseDouble(request.getParameter("desconto"));
       
        Double valor_Total = Double.parseDouble(request.getParameter("valor_Total"));
        
        Venda venda = new Venda(data_venda, cod_cliente, cod_produto, cod_filial, quantidade, desconto, valor_Total);
         
           try {
            vendaDAO.inserirVenda(venda);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VendaCadastrar.class.getName()).log(Level.SEVERE, null, ex);
            Utils.mostrarTelaErro(ex, request, response);
        }
           
           
         }
    
   
        
    }
    

