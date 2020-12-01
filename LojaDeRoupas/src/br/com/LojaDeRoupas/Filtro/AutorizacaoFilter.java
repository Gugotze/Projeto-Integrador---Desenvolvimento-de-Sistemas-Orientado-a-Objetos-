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

import br.com.LojaDeRoupas.Model.Usuario;

/**
 * Servlet Filter implementation class AutorizacaoFilter
 */
//@WebFilter(urlPatterns = "/entrada")
public class AutorizacaoFilter implements Filter {

   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		
		chain.doFilter(request, response);
		
		
		System.out.println("AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		if(!Usuario.podeAcessar(request, response)) {
			//RequestDispatcher rd = request.getRequestDispatcher("Blocked.jsp");
			//rd.forward(request, response);
			//response.sendRedirect("Blocked.jsp");
			System.out.println("NAO PODEEEEEEEEEE");
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
