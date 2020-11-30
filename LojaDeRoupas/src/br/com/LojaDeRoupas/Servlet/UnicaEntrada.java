package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Acao.ProdutoAlterar;
import br.com.LojaDeRoupas.Acao.ProdutoConsultar;
import br.com.LojaDeRoupas.Acao.ProdutoDeletar;
import br.com.LojaDeRoupas.Acao.ProdutoCadastrar;


@WebServlet("/entrada")
public class UnicaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrada!");
		String paramAcao = request.getParameter("acao");
		
		
		
		if(paramAcao.equals("ProdutoConsultar")) {
			ProdutoConsultar acao = new ProdutoConsultar();
			acao.executa(request, response);
			
		}
		else if(paramAcao.equals("ProdutoAlterar")) {
			ProdutoAlterar acao = new ProdutoAlterar();
			acao.executa(request, response);
		}
		else if(paramAcao.equals("ProdutoCadastrar")) {
			ProdutoCadastrar acao = new ProdutoCadastrar();
			acao.executa(request, response);
		}
		else if(paramAcao.equals("ProdutoDeletar")) {
			System.out.println("AQUIIIIII");
			ProdutoDeletar acao = new ProdutoDeletar();
			acao.executa(request, response);
		}
		
		
		
	}

}
