package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.LojaDeRoupas.Model.Cliente;
import br.com.LojaDeRoupas.Model.Vendedor;
import br.com.LojaDeRoupas.Model.funcionario;
import br.com.LojaDeRoupas.Model.gerente;
import br.com.LojaDeRoupas.Servlet.ServletBD;
import br.com.LojaDeRoupas.Util.ConexaoDB;

public class FuncionarioDAO {
	
	 public static List<funcionario> getFuncionarios() {
	        List<funcionario> listaClientes = new ArrayList<funcionario>();
	        try {
	            Connection con = ConexaoDB.getConnection();
	            String query = "select * from FUNCIONARIO";
	            PreparedStatement ps = con.prepareStatement(query);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	Integer idFuncionario = rs.getInt("ID_FUNCIONARIO");
	            	String nome = rs.getString("NOME");
	            	String cpf = rs.getString("CPF");
	            	String sexo = rs.getString("SEXO");
	            	String dataNascimento = rs.getString("DATANASCIMENTO");
	            	String telefone = rs.getString("TELEFONE");
	            	String email = rs.getString("EMAIL");
	            	String cep = rs.getString("CEP");
	            	String endereco = rs.getString("ENDERECO");
	            	String bairro = rs.getString("BAIRRO");
	            	Integer numero = Integer.parseInt(rs.getString("NUMERO"));
	            	String complemento = rs.getString("COMPLEMENTO");
	            	String cidade = rs.getString("CIDADE");
	            	String estado = rs.getString("ESTADO");
	            	String login = rs.getString("LOGIN");
	            	String senha = rs.getString("SENHA");
	            	String tipo = rs.getString("TIPO");
	               
	            	if(tipo.equals("G")) {
	            	listaClientes.add(new gerente(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
	            			numero, complemento, cidade, estado, login, senha,tipo));
	            	}else {
	            	listaClientes.add(new Vendedor(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
	            			numero, complemento, cidade, estado, login, senha,tipo));	
	            	}
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(ServletBD.class.getName()).
	                    log(Level.SEVERE, null, ex);
	        }
	        return listaClientes;
	 }
	 
	 public static void addFuncionario(funcionario funcionario) throws SQLException, ClassNotFoundException {
	        Connection con = ConexaoDB.getConnection();
	        String query = "INSERT INTO CLIENTE (NOME, CPF, SEXO , DATANASCIMENTO , TELEFONE , EMAIL , CEP , ENDERECO , BAIRRO , NUMERO , COMPLEMENTO , CIDADE , ESTADO)"
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
	        

	        PreparedStatement statement = con.prepareStatement(query);

	 }
	 
	 public static void updateFuncionario(funcionario funcionario) throws ClassNotFoundException, SQLException {
	        Connection con = ConexaoDB.getConnection();
	        String query = "UPDATE FUNCIONARIO SET NOME = ?, SEXO = ?, DATANASCIMENTO = ?, TELEFONE = ?, EMAIL = ?, CEP = ?, ENDERECO = ?, BAIRRO = ?, NUMERO = ?, COMPLEMENTO = ?, CIDADE = ?, ESTADO = ? WHERE (CPF = ?)";
	        PreparedStatement ps = con.prepareStatement(query);
	        
	        ps.execute();
	    }
	    
	    public static void deleteFuncionario(String cpf) throws ClassNotFoundException, SQLException {
	        Connection con = ConexaoDB.getConnection();
	        String query = "delete from FUNCIONARIO where cpf=?";
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, cpf);
	        ps.execute();
	    }
	    
	    public static funcionario getFuncionario(String cpf) {
	        funcionario funcionario = null;
	        try {
	            Connection con = ConexaoDB.getConnection();
	            String query = "select * from CLIENTE where cpf=?";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, cpf);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Integer idFuncionario = rs.getInt("ID_FUNCIONARIO");
	            	String nome = rs.getString("NOME");
	            	String sexo = rs.getString("SEXO");
	            	String dataNascimento = rs.getString("DATANASCIMENTO");
	            	String telefone = rs.getString("TELEFONE");
	            	String email = rs.getString("EMAIL");
	            	String cep = rs.getString("CEP");
	            	String endereco = rs.getString("ENDERECO");
	            	String bairro = rs.getString("BAIRRO");
	            	Integer numero = Integer.parseInt(rs.getString("NUMERO"));
	            	String complemento = rs.getString("COMPLEMENTO");
	            	String cidade = rs.getString("CIDADE");
	            	String estado = rs.getString("ESTADO");
	            	String login = rs.getString("LOGIN");
	            	String senha = rs.getString("SENHA");
	            	String tipo = rs.getString("TIPO");
	            	
	            	if(tipo.equals("G")) {
	                funcionario = new gerente(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
	            			numero, complemento, cidade, estado, login, senha,tipo);
	            	}else {
	            		funcionario = new Vendedor(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
		            			numero, complemento, cidade, estado, login, senha,tipo);
	            	}
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(ServletBD.class.getName()).
	                    log(Level.SEVERE, null, ex);
	        }
	        return funcionario;
	    }
	 
}
