package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.produto;

/**
 * Servlet implementation class insereProdutos
 */
@WebServlet("/insereProdutos")
public class insereProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novoProduto");
		try {
			System.out.println("vou 1");
		String codFilial = request.getParameter("codFilial");
		String codProduto = request.getParameter("codProduto");
		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipoProduto");
		String quantidade = request.getParameter("quantidade");
		String valorCompra = request.getParameter("valorCompra");
		String valorVenda = request.getParameter("valorVenda");
		System.out.println("vou 2"+codFilial+" "+codProduto+" "+nome+" "+tipo+" "+quantidade+" "+valorCompra+" "+valorVenda);
		
		Integer idFilial = Integer.valueOf(codFilial);
		Integer idProduto = Integer.valueOf(codProduto);
		Integer quantidadeC = Integer.valueOf(quantidade);
		System.out.println("vou 3");
		double valorCompraC = Double.parseDouble(valorCompra);
		double valorVendaC = Double.parseDouble(valorVenda);
		System.out.println("vou 4");
		produto produto = new produto(idFilial,idProduto, nome,tipo,quantidadeC,valorCompraC, valorVendaC);
		System.out.println(produto);
		System.out.println("vou 5");
		produtoDAO.inserirProduto(produto);
		System.out.println("vou 6");
		} catch (SQLException e) {
			
			throw new ServletException(e.getMessage());
		}catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		
		response.sendRedirect("listaProdutos");
	}

}
