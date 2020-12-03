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
		
		String consulta = "";
		
		consulta = request.getParameter("consulta");
		
		System.out.println("TIPO CONSULTA"+consulta);
	    if(consulta == null) {
        List<Venda> listaVenda = vendaDAO.consultarVenda();
        request.setAttribute("listaVendas", listaVenda);
	    }else {
	    	System.out.println();
	    	String dataIni = request.getParameter("dataIni");
	    	String dataFim = request.getParameter("dataFim");
	    	
	    	List<Venda> listaVenda = vendaDAO.consultarVenda(dataIni,dataFim);
	        request.setAttribute("listaVendas", listaVenda);
	    	
	    }
		return "forward:ConsultarVenda.jsp";
		
		
	}

}
