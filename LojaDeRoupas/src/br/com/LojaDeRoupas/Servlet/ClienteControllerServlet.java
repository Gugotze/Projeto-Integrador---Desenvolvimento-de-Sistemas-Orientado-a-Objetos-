package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDao;
import br.com.LojaDeRoupas.Model.Cliente;

public class ClienteControllerServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClienteDao clienteDao;
	
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        clienteDao = new ClienteDao(jdbcURL, jdbcUsername, jdbcPassword);
 
    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
 
        try {
            switch (action) {
            case "/new":
                showNewForm(request, response);
                break;
            case "/insert":
                inserirCliente(request, response);
                break;
//            case "/delete":
//                deleteBook(request, response);
//                break;
//            case "/edit":
//                showEditForm(request, response);
//                break;
//            case "/update":
//                updateBook(request, response);
//                break;
//            default:
//                listBook(request, response);
//                break;
            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
	
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("ClienteForm.jsp");
        dispatcher.forward(request, response);
    }
    
    private void inserirCliente(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String nomeCliente = request.getParameter("nomeCliente");
    	String cpfCliente = request.getParameter("cpfCliente");
    	String sexoCliente = request.getParameter("sexoCliente");
    	String dataNascimento = request.getParameter("dataNascimento");
    	String telefone = request.getParameter("telefone");
    	String email = request.getParameter("email");
    	String cep = request.getParameter("cep");
    	String endereco = request.getParameter("endereco");
    	String bairro = request.getParameter("bairro");
    	String numero = request.getParameter("numero");
    	String complemento = request.getParameter("complemento");
    	String cidade = request.getParameter("cidade");
    	String estado = request.getParameter("estado");
 
        Cliente newCliente = new Cliente(nomeCliente,cpfCliente,sexoCliente,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,
        						cidade,estado);
        clienteDao.inserirCliente(newCliente);

    	}
    
}
    
