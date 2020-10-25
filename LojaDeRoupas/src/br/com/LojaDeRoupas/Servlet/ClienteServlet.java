package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.ClienteDao;
import br.com.LojaDeRoupas.Model.Cliente;
import br.com.LojaDeRoupas.Util.ConexaoDB;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet(name = "cliente" ,urlPatterns = "/")
public class ClienteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
private ConexaoDB conexaoDB;
private ClienteDao  clienteDao;
	
@Override
public void init(ServletConfig config) throws ServletException {
        String url = getServletContext().getInitParameter("url");
        String user = getServletContext().getInitParameter("user");
        String password = getServletContext().getInitParameter("password");
 
        conexaoDB = new ConexaoDB(url, user, password);
 
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
