package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.vendaDAO;
import br.com.LojaDeRoupas.Model.Venda;

public class VendaConsultar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("VOU CONSULTAR");
	       
        List<Venda> listaVenda = vendaDAO.consultarVenda();
        request.setAttribute("listaVendas", listaVenda);
		
		return "forward:ConsultarVenda.jsp";
	}

}
