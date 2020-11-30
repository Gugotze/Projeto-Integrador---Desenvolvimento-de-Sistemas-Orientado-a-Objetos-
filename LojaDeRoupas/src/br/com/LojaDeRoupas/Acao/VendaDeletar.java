package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.vendaDAO;

public class VendaDeletar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 Integer id_venda = Integer.parseInt(request.getParameter("id_venda"));
	       try {
	           vendaDAO.deletarVenda(id_venda);
	           
	           return "redirect:entrada?acao=VendaConsultar";
	       } catch (ClassNotFoundException | SQLException ex) {
	           Logger.getLogger(VendaDeletar.class.getName()).log(Level.SEVERE, null, ex);
	           response.getWriter().print(false);
	       } 
		
		
		
		
		return null;
	}

}
