package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.LojaDeRoupas.Model.Usuario;
import br.com.LojaDeRoupas.Model.Vendedor;
import br.com.LojaDeRoupas.Model.funcionario;
import br.com.LojaDeRoupas.Model.gerente;
import br.com.LojaDeRoupas.Util.ConexaoDB;

public class LoginDAO {
		
	
	public static funcionario consultaUsuario(Usuario usuario) {
        funcionario funcionario = null;
        
        String select = "SELECT * FROM FUNCIONARIO where LOGIN = ? and senha = ?;";

        try {
        	Connection conexao = ConexaoDB.getConnection();
            PreparedStatement SQL = conexao.prepareStatement(select);
            		
            SQL.setString(1, usuario.get_usuario());
            SQL.setString(2, usuario.get_senha());

            try (ResultSet rs = SQL.executeQuery()) {
                if (rs.next()) {
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
		                funcionario = new gerente(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
		            			numero, complemento, cidade, estado, login, senha,tipo);
		            }
	            	else {
		            		funcionario = new Vendedor(idFuncionario, nome, cpf, sexo, dataNascimento, telefone, email, cep, endereco, bairro,
			            			numero, complemento, cidade, estado, login, senha,tipo);
		            }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao Consultar funcionario: " + e.getMessage());
        }

        return funcionario;
    }
	
}
