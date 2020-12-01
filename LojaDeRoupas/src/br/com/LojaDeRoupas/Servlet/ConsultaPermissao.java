package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Model.Usuario;

/**
 * Servlet implementation class ConsultaPermissao
 */
@WebServlet("/ConsultaPermissao")
public class ConsultaPermissao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = "YES";

	    response.setContentType("text/plain");  
	    response.setCharacterEncoding("UTF-8"); 
	    
	    
		if(!Usuario.podeAcessar(request, response)) {
			System.out.println("NÃO PODE ACESSAR!!");
			text = "NO";
		}
		
		response.getWriter().write(text);
	}

	
}
