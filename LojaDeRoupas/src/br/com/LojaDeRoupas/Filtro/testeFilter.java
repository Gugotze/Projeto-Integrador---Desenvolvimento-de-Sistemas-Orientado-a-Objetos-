package br.com.LojaDeRoupas.Filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class testeFilter
 */
@WebFilter(filterName = "/testeFilter",urlPatterns = "/Admin/cadastrarCliente.jsp" )
public class testeFilter implements Filter {
	
	private static final boolean debug = true;
	
	private FilterConfig filterConfig = null;

   private void doBeforeProcessing(ServletRequest request, ServletResponse response) {
	   //esta logado
	   
	   
	   
	   
	  HttpServletRequest httpRequest = (HttpServletRequest) request;
	  String url = httpRequest.getRequestURI();
	  
	  if(url.contains("/Admin/")) {
		  System.out.println("somente admin");
		  
		  System.out.println("Filtro");
		  System.out.println("Filtro");
		  System.out.println("Filtro");
		  System.out.println("Filtro");
		  System.out.println("Filtro");
		  System.out.println("Filtro");
		  System.out.println("Filtro");
	  }
	  System.out.println("MINHA URL"+url);
   }
   
   

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {

	 System.out.println("Filtro");
	   
	  HttpServletRequest httpRequest = (HttpServletRequest) request;
	  String url = httpRequest.getRequestURI();
	  
	  if(url.contains("/Admin")) {
		  System.out.println("somente admin");
	  }
	  System.out.println("MINHA URL"+url);
}

@Override
public void init(FilterConfig filterConfig) throws ServletException {
	// TODO Auto-generated method stub
	
}

@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}

}
