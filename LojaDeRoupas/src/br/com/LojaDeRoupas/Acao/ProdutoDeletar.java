package br.com.LojaDeRoupas.Acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.Usuario;

public class ProdutoDeletar implements Acao{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(!Usuario.estaLogado(request, response)) {
			System.out.println("Não está logado!");
			response.sendRedirect("login.jsp");
			return;
			 
		}
		
		System.out.println("ESTOU NO DELETAR");
		
			
			Integer codProduto = Integer.valueOf(request.getParameter("id"));
			
			
			
			produtoDAO.deleteProduto(codProduto);
			
		
		
		response.sendRedirect("entrada?acao=ProdutoConsultar");
		
	}
	
	
}
