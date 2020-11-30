package br.com.LojaDeRoupas.Acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.Usuario;

public class ProdutoDeletar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		System.out.println("ESTOU NO DELETAR");
		
			
			Integer codProduto = Integer.valueOf(request.getParameter("id"));
			
			
			
			produtoDAO.deleteProduto(codProduto);
			
		
		
		return "redirect:entrada?acao=ProdutoConsultar";
		
	}
	
	
}
