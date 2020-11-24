package br.com.LojaDeRoupas.Servlet;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.LojaDeRoupas.Dao.FuncionarioDAO;
import br.com.LojaDeRoupas.Dao.produtoDAO;
import br.com.LojaDeRoupas.Model.Vendedor;
import br.com.LojaDeRoupas.Model.funcionario;
import br.com.LojaDeRoupas.Model.gerente;
import br.com.LojaDeRoupas.Model.produto;

/**
 * Servlet implementation class FuncionarioServlet
 */
@WebServlet("/Funcionario")
public class FuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String acao = request.getParameter("action");
			String id = request.getParameter("id");
			
			if(acao.equals("listar")) {
				 
				 List<funcionario> lista = FuncionarioDAO.getFuncionarios();




				request.setAttribute("funcionario", lista);

				RequestDispatcher rd = request.getRequestDispatcher("listaFuncionarios.jsp");
				rd.forward(request, response);
			}
			if(acao.equals("create")) {
				RequestDispatcher rd = request.getRequestDispatcher("cadastrarFuncionario.jsp");
				rd.forward(request, response);
				
			}
			if(acao.equals("update")) {
				funcionario funcionario = FuncionarioDAO.getFuncionario(id);
				RequestDispatcher rd = request.getRequestDispatcher("cadastrarFuncionario.jsp");
				rd.forward(request, response);
			}
			
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ENTREI NO POST FUNCIONARIO");
		funcionario Funcionario = null;
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
    	String login = request.getParameter("login");
    	String senha = request.getParameter("senha");
    	String tipo = request.getParameter("tipo");
    	
    	System.out.println(nome+" - "+cpf+" - "+sexo+" - "+dataNascimento+" - "+telefone+" - "+email+" - "+cep+" - "+endereco+" - "+bairro
    			+" - "+numero+" - "+complemento+" - "+cidade+" - "+estado+" - "+login+" - "+senha+" - "+tipo+" - ");
    	
    	senha = funcionario.convertToMd5(senha);
    	
    	
    	if(tipo.equals("Gerente")) {
    		tipo = "G";
    		Funcionario = new gerente(nome,cpf,sexo,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,cidade,estado,login,senha,tipo);
    	}else {
    		tipo = "V";
    		Funcionario = new Vendedor(nome,cpf,sexo,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,cidade,estado,login,senha,tipo);
    	}
    	
    	try {
    		System.out.println("meu funcionario---->"+Funcionario);
			FuncionarioDAO.addFuncionario(Funcionario);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//response.sendRedirect("funcionarios");
    	response.sendRedirect("Funcionario?action=listar");
	}
	
	
	

}
