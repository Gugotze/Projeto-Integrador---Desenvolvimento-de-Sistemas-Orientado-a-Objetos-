package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.LojaDeRoupas.Dao.LoginDAO;
import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Model.funcionario;
import br.com.LojaDeRoupas.Util.Utils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginServlet");
		
		Usuario usuario = new Usuario();
		
		usuario.set_usuario( request.getParameter("usuario"));
		usuario.set_senha(Utils.convertToMd5(request.getParameter("senha")));
		
		funcionario funcionario = LoginDAO.consultaUsuario(usuario);
		
		if(funcionario == null) {
			request.setAttribute("erro", true);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("Tem o user");
			HttpSession sessao = request.getSession();
			
			sessao.setAttribute("nome", funcionario.getNome());
			sessao.setAttribute("nomeUsuario", funcionario.getLogin());
			//response.sendRedirect("/LojaDeRoupas/index");
			RequestDispatcher rd = request.getRequestDispatcher("/index");
			rd.forward(request, response);
			
		}
		
		
		
		
		
		
		//fazer login
		//sessao.setAttribute("user", usuario);
		
		//sessao.removeAttribute("usuario");
		
		
		
		
	}


}
