package br.com.LojaDeRoupas.Acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.FuncionarioDAO;
import br.com.LojaDeRoupas.Model.funcionario;

public class FuncionarioAlterar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		funcionario funcionario = FuncionarioDAO.getFuncionario(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("cadastrarFuncionario.jsp");
		rd.forward(request, response);
		
		
		return "forward:cadastrarFuncionario.jsp";
	}

}
