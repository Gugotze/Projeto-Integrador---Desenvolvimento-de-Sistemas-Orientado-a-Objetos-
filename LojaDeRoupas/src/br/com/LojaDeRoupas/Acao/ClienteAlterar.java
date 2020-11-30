package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDAO;
import br.com.LojaDeRoupas.Model.Cliente;

import br.com.LojaDeRoupas.Util.Utils;

public class ClienteAlterar implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String metodo = request.getParameter("metodo");
		
		if(metodo.equals("get")) {
		 String cpf = request.getParameter("cpf");
	        Cliente cliente = ClienteDAO.getCliente(cpf);
	        request.setAttribute("cliente", cliente);
	         
	         
	         return "forward:alterarCliente.jsp";
	         
		}else if(metodo.equals("post")) {
			String nome = request.getParameter("nome");
	    	String cpf = request.getParameter("cpf");
	    	String sexo = request.getParameter("sexo");
	    	String dataNascimento = request.getParameter("dataNascimento");
	    	String telefone = request.getParameter("telefone");
			telefone = telefone.replaceAll("[^0-9]", "");
	    	String email = request.getParameter("email");
	    	String cep = request.getParameter("cep");
	    	String endereco = request.getParameter("endereco");
	    	String bairro = request.getParameter("bairro");
	    	Integer numero = Integer.parseInt(request.getParameter("numero"));
	    	String complemento = request.getParameter("complemento");
	    	String cidade = request.getParameter("cidade");
	    	String estado = request.getParameter("estado");
	    	
	         Cliente cliente = ClienteDAO.getCliente(cpf);
	         cliente.setNome(nome);
	         cliente.setSexo(sexo);
	         cliente.setDataNascimento(dataNascimento);
	         cliente.setTelefone(telefone);
	         cliente.setEmail(email);
	         cliente.setCep(cep);
	         cliente.setEndereco(endereco);
	         cliente.setBairro(bairro);
	         cliente.setNumero(numero);
	         cliente.setComplemento(complemento);
	         cliente.setCidade(cidade);
	         cliente.setEstado(estado);
	        
	         
	         try {
	             ClienteDAO.updateCliente(cliente);
	             return "redirect:entrada?acao=ClienteConsultar";
	         } catch (ClassNotFoundException | SQLException ex) {
	            ex.getMessage();
	         } 
		}
		
		
		return null;
	}

}
