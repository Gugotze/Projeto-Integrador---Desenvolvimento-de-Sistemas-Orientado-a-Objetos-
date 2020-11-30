package br.com.LojaDeRoupas.Acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.LojaDeRoupas.Dao.LoginDAO;
import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Model.funcionario;
import br.com.LojaDeRoupas.Util.Utils;

public class Login implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("LoginServlet");
		
		Usuario usuario = new Usuario();
		
		usuario.set_usuario( request.getParameter("usuario"));
		usuario.set_senha(Utils.convertToMd5(request.getParameter("senha")));
		
		funcionario funcionario = LoginDAO.consultaUsuario(usuario);
		
		if(funcionario == null) {
			request.setAttribute("erro", true);
			
			
			return "forward:entrada?acao=Login";
		}else {
			System.out.println("Tem o user");
			HttpSession sessao = request.getSession();
			
			sessao.setAttribute("usuario",funcionario);
			return "redirect:entrada?acao=Index";
		}
		
		
		

		
		
		
	}

}
