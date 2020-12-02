package br.com.LojaDeRoupas.Filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.ha.ReplicationMySQLConnection;

import br.com.LojaDeRoupas.Model.Usuario;


//@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		long antes = System.currentTimeMillis();

		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		
		String paramAcao = request.getParameter("acao");
		
		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
		
		
		if(!Usuario.estaLogado(request, response) && ehUmaAcaoProtegida) {
			System.out.println("Não está logado!");
			
			response.sendRedirect("Blocked.jsp");
			return;	 
		}	
	  
		
		chain.doFilter(request, response);
		
		
		
	
	
		
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução: "+ (depois - antes));
		
		
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
