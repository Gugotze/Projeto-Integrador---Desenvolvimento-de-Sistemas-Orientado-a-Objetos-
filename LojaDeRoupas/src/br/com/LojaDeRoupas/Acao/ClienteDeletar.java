package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDAO;


public class ClienteDeletar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 String cpf = request.getParameter("cpf");
	       try {
	           ClienteDAO.deleteCliente(cpf);
	           return "redirect:entrada?acao=ClienteConsultar";
	       } catch (ClassNotFoundException | SQLException ex) {
	    	   ex.getMessage();
	       } 
		
		
		return null;
	}

}
