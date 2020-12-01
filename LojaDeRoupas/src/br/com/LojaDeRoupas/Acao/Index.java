package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.indexDAO;

public class Index implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		
		String listaDeData = "";
		String listaQtd = "";
	
		List<br.com.LojaDeRoupas.Model.Index> lista = indexDAO.consultarVenda();
		int totalProduto = indexDAO.consultarProduto();
		int totalCliente = indexDAO.consultarCliente();
		int totalVenda = indexDAO.consultarTotalVenda();
		
		
		for (br.com.LojaDeRoupas.Model.Index index : lista) {
			listaDeData += index.get_data() + ",";
			listaQtd += index.get_qtd() + ",";
		}
		
		int tamanho = listaDeData.length();
		listaDeData = listaDeData.substring(0, tamanho-1);
		
		int tamanho2 = listaQtd.length();
		listaQtd = listaQtd.substring(0, tamanho2-1);
		
		
		request.setAttribute("data", listaDeData);
		request.setAttribute("qtd", listaQtd);
		request.setAttribute("totalProduto", totalProduto);
		request.setAttribute("totalCliente", totalCliente);
		request.setAttribute("totalVenda", totalVenda);
		
		
		
		
		
		return "forward:index.jsp";
		
		
		
	}

}
