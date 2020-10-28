
package br.com.LojaDeRoupas.Dao;

import br.com.LojaDeRoupas.Model.Cliente;
import br.com.LojaDeRoupas.Servlet.ServletBD;
import br.com.LojaDeRoupas.Util.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {

    public static List<Cliente> getClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        try {
            Connection con = ConexaoDB.getConnection();
            String query = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	Integer ID_CLIENTE = rs.getInt("ID_CLIENTE");
            	String nome = rs.getString("nome");
            	String cpf = rs.getString("cpf");
            	String sexo = rs.getString("sexo");
            	String dataNascimento = rs.getString("dataNascimento");
            	String telefone = rs.getString("telefone");
            	String email = rs.getString("email");
            	String cep = rs.getString("cep");
            	String endereco = rs.getString("endereco");
            	String bairro = rs.getString("bairro");
            	Integer numero = Integer.parseInt(rs.getString("numero"));
            	String complemento = rs.getString("complemento");
            	String cidade = rs.getString("cidade");
            	String estado = rs.getString("estado");
               
            	listaClientes.add(new Cliente(ID_CLIENTE,nome,cpf,sexo,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,
        				cidade,estado));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }
    
    public static void addCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoDB.getConnection();
        String query = "INSERT INTO CLIENTE (NOME, CPF, SEXO , DATANASCIMENTO , TELEFONE , EMAIL , CEP , ENDERECO , BAIRRO , NUMERO , COMPLEMENTO , CIDADE , ESTADO)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, cliente.getNomeCliente());
        statement.setString(2, cliente.getCpfCliente());
        statement.setString(3, cliente.getSexoCliente());
        statement.setString(4, cliente.getDataNascimento());
        statement.setString(5, cliente.getTelefone());
        statement.setString(6, cliente.getEmail());
        statement.setString(7, cliente.getCep());
        statement.setString(8, cliente.getEndereco());
        statement.setString(9, cliente.getBairro());
        statement.setInt(10, cliente.getNumero());
        statement.setString(11, cliente.getComplemento());
        statement.setString(12, cliente.getCidade());
        statement.setString(13, cliente.getEstado());
        statement.execute();
    }
    
    public static void updateCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.getConnection();
        String query = "UPDATE LOJADEROUPAS.cliente SET NOME = ?, SEXO = ?, DATANASCIMENTO = ?, TELEFONE = ?, EMAIL = ?, CEP = ?, ENDERECO = ?, BAIRRO = ?, NUMERO = ?, COMPLEMENTO = ?, CIDADE = ?, ESTADO = ? WHERE (CPF = ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNomeCliente());
        ps.setString(2, cliente.getSexoCliente());
        ps.setString(3, cliente.getDataNascimento());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getCep());
        ps.setString(7, cliente.getEndereco());
        ps.setString(8, cliente.getBairro());
        ps.setInt(9, cliente.getNumero());
        ps.setString(10, cliente.getComplemento());
        ps.setString(11, cliente.getCidade());
        ps.setString(12, cliente.getEstado());
        ps.setString(13, cliente.getCpfCliente());
        ps.execute();
    }
    
    public static void deleteCliente(String cpf) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.getConnection();
        String query = "delete from cliente where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cpf);
        ps.execute();
    }
    
    public static Cliente getCliente(String cpf) {
        Cliente cliente = null;
        try {
            Connection con = ConexaoDB.getConnection();
            String query = "select * from cliente where cpf=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Integer CODCLIENTE = rs.getInt("ID_CLIENTE");
            	String nome = rs.getString("nome");
            	String sexo = rs.getString("sexo");
            	String dataNascimento = rs.getString("dataNascimento");
            	String telefone = rs.getString("telefone");
            	String email = rs.getString("email");
            	String cep = rs.getString("cep");
            	String endereco = rs.getString("endereco");
            	String bairro = rs.getString("bairro");
            	Integer numero = Integer.parseInt(rs.getString("numero"));
            	String complemento = rs.getString("complemento");
            	String cidade = rs.getString("cidade");
            	String estado = rs.getString("estado");
            	
                cliente = new Cliente(CODCLIENTE,nome,cpf,sexo,dataNascimento,telefone,email,cep,endereco,bairro,numero,complemento,
        				cidade,estado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

}
