package br.com.LojaDeRoupas.Acao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDAO;
import br.com.LojaDeRoupas.Model.Cliente;

import br.com.LojaDeRoupas.Util.Utils;

public class ClienteCadastrar implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
    	String cpf = request.getParameter("cpf");
    	cpf = cpf.replaceAll("[^0-9]", "");
    	String sexo = request.getParameter("sexo");
    	String dataNascimento = request.getParameter("dataNascimento");
    	String telefone = request.getParameter("telefone");
    			telefone = telefone.replaceAll("[^0-9]", "");
    	String email = request.getParameter("email");
    	String cep = request.getParameter("cep");
    	cep = cep.replaceAll("[^0-9]", "");
    	String endereco = request.getParameter("endereco");
    	String bairro = request.getParameter("bairro");
    	Integer numero = Integer.parseInt(request.getParameter("numero"));
    	String complemento = request.getParameter("complemento");
    	String cidade = request.getParameter("cidade");
    	String estado = request.getParameter("estado");
        
    	Cliente cliente = new Cliente(nome,cpf,sexo,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,
				cidade,estado);
        try {
            ClienteDAO.addCliente(cliente);
            
            return "redirect:entrada?acao=ClienteConsultar";
        } catch (SQLException | ClassNotFoundException ex) {
        	System.out.println("ERROOOOOOOOOOOOOOO");
        	String erro = "";
        	if(ex.getMessage().contains("Duplicate")) {
        		erro = "Cliente já é cadastrado!";
        	}
        	request.setAttribute("erro", true);
        	request.setAttribute("mensagem", erro);
        	return "forward:cadastrarCliente.jsp";
        	//return "redirect:entrada?acao=ClienteConsultar";
        }
		//return null;
	}

}
