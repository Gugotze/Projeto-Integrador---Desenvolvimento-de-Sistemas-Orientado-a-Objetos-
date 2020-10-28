package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.filial;
import br.com.LojaDeRoupas.Model.produto;


@WebServlet("/atualizaProdutos")
public class atualizaProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String status = request.getParameter("action");
		Integer id = Integer.valueOf(request.getParameter("id"));
		List<filial> lista = produtoDAO.listarFiliais();
		
		if(status.equals("create")) {
			produto produto = null;	
			
			
			request.setAttribute("action", produto);
			request.setAttribute("filial", lista);
			
			RequestDispatcher rd = request.getRequestDispatcher("cadastrarProduto.jsp");
			
			rd.forward(request, response);
			
		}else if(status.equals("update")) {
			System.out.println("MEU ID"+id);
			produto produto = new produto(id,status);
			
			produto dadosProduto = produtoDAO.buscaProdutoPorId(id);
			
			request.setAttribute("action", produto);
			request.setAttribute("produto", dadosProduto);
			request.setAttribute("filial", lista);
			RequestDispatcher rd = request.getRequestDispatcher("cadastrarProduto.jsp");
			
			rd.forward(request, response);			
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Atualizando produto");
		try {
		Integer codFilial = Integer.valueOf(request.getParameter("codFilial"));
		System.out.println("Atualizando produto"+codFilial);
		Integer codProduto = Integer.valueOf(request.getParameter("codProduto"));
		System.out.println("Atualizando produto"+codProduto);
		String nome = request.getParameter("nome");
		System.out.println("Atualizando produto"+nome);
		String tipo = request.getParameter("tipoProduto");
		System.out.println("Atualizando produto"+tipo);
		Integer quantidade = Integer.valueOf(request.getParameter("quantidade"));
		System.out.println("Atualizando produto");
		double valorCompra = Double.parseDouble(request.getParameter("valorCompra"));
		System.out.println("Atualizando produto");
		double valorVenda = Double.parseDouble(request.getParameter("valorVenda"));
		System.out.println("Atualizando produto");
		System.out.println(codFilial+" "+codProduto+" "+nome+" "+tipo+" "+quantidade+" "+valorCompra+" "+valorVenda);
		
		produto produto = new produto(codFilial,codProduto, nome,tipo,quantidade,valorCompra, valorVenda);
		
		System.out.println("O produto é esse"+produto);
		
		produtoDAO.atualizarProduto(produto);
		
		
		
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		
		response.sendRedirect("listaProdutos");
		
		
		
		
		}
		
}
