package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.result.StringValueFactory;

import br.com.LojaDeRoupas.Dao.FuncionarioDAO;
import br.com.LojaDeRoupas.Model.funcionario;

public class FuncionarioConsultar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("CONSULTAR FUNCIONARIO");
		 
		 List<funcionario> lista = FuncionarioDAO.getFuncionarios();




		request.setAttribute("funcionario", lista);

		//RequestDispatcher rd = request.getRequestDispatcher("listaFuncionarios.jsp");
		//rd.forward(request, response);
		
		//esse return no final vai fazer a mesma coisa que o de cima
		return "forward:listaFuncionarios.jsp";
	}

}
