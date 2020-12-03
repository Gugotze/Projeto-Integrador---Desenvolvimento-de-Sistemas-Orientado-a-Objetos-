package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.Carrinho;
import br.com.LojaDeRoupas.Model.filial;

public class Finalizacao implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double total = 0,produtos = 0;
		
		HttpSession sessao = request.getSession();
		
		List<Carrinho> listaCarrinho = (List<Carrinho>) sessao.getAttribute("carrinho");
		produtos = listaCarrinho.size();
		
		
		for (int i = 0; i < listaCarrinho.size(); i++) {
			total += listaCarrinho.get(i).get_preco();
			
		  }
		
		List<filial> lista = produtoDAO.listarFiliais();
		
		request.setAttribute("filial", lista);
		request.setAttribute("total", total);
		
		return "forward:FinalizacaoVenda.jsp";
	}
	
	
	
}
