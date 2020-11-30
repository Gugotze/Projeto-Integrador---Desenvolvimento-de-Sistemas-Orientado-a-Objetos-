package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Acao.Acao;
import br.com.LojaDeRoupas.Acao.ProdutoAlterar;
import br.com.LojaDeRoupas.Acao.ProdutoConsultar;
import br.com.LojaDeRoupas.Acao.ProdutoDeletar;
import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Acao.ProdutoCadastrar;


@WebServlet("/entrada")
public class UnicaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrada!");
		
		String paramAcao = request.getParameter("acao");
		boolean ehUmaAcaoProtegida = paramAcao.equals("ProdutoConsultar");
		
		
		if(!Usuario.estaLogado(request, response) && ehUmaAcaoProtegida) {
			System.out.println("Não está logado!");
			response.sendRedirect("login.jsp");
			return;
			 
		}
		
		
		
		
		
		
		String nomeDaClasse = "br.com.LojaDeRoupas.Acao." + paramAcao;
		System.out.println(nomeDaClasse);
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome 
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEEndereco =  nome.split(":");
		
		if(tipoEEndereco[0].equals("forward")) {
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEEndereco[1]);
		rd.forward(request, response);
		
		} else {
			
			response.sendRedirect(tipoEEndereco[1]);
		}
		
	}

}
