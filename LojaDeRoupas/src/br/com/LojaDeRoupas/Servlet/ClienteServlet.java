package br.com.LojaDeRoupas.Servlet;

import br.com.LojaDeRoupas.Dao.ClienteDao;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Model.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servlet implementation class ClienteServlet
 */

public class ClienteServlet extends HttpServlet {
	
	    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nomeCliente = request.getParameter("nomeCliente");
	    	String cpfCliente = request.getParameter("cpfCliente");
	    	String sexoCliente = request.getParameter("sexoCliente");
	    	String dataNascimento = request.getParameter("dataNascimento");
                String telefoneStr = request.getParameter("telefone");
	    	int telefone = Integer.parseInt(telefoneStr);
	    	String email = request.getParameter("email");
	    	String cep = request.getParameter("cep");
	    	String endereco = request.getParameter("endereco");
	    	String bairro = request.getParameter("bairro");
	    	String numeroStr = request.getParameter("numero");
                int numero = Integer.parseInt(numeroStr);
	    	String complemento = request.getParameter("complemento");
	    	String cidade = request.getParameter("cidade");
	    	String estado = request.getParameter("estado");
	 
	        Cliente newCliente = new Cliente(nomeCliente,cpfCliente,sexoCliente,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,
	        						cidade,estado);
                try {
                    ClienteDao.inserirCliente(newCliente);
                    response.sendRedirect("index.jsp");
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
        }
    }


