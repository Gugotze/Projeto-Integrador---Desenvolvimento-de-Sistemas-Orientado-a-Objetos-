package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import br.com.LojaDeRoupas.Model.produto;
import br.com.LojaDeRoupas.Util.ConexaoDB;

public class produtoDAO {
	private static final String DELETAR_PRODUTO = "DELETE FROM PRODUTO WHERE COD_PRODUTO= ? ";
    
    private static final String INSERIR_PRODUTO = "DELETE FROM PRODUTO WHERE COD_PRODUTO= ? ";
 
    


	public static List<produto> consultarProduto() throws SQLException, ServletException{
    	List <produto> listaProdutos =  new ArrayList<>();
    	
    	System.out.println("Estou na consulta");
    	
    	String sqlConsulta = "SELECT * FROM PRODUTO ";
    	
    	try {
    		
    		Connection con = ConexaoDB.getConnection();
    		PreparedStatement ps = con.prepareStatement(sqlConsulta);
    		ResultSet rs = ps.executeQuery();
    	
    	while(rs.next()) {
    		int codVenda = rs.getInt("COD_FILIAL");
    		int codProduto = rs.getInt("CODPRODUTO");
    		String nome = rs.getString("NOME");
    		String tipo = rs.getString("TIPO");
    		int quantidade = rs.getInt("QUANTIDADE");
    		double valorCompra = rs.getDouble("VALOR_COMPRA");
    		double valorVenda = rs.getDouble("VALOR_VENDA");
    		
    		System.out.println(codVenda +" "+codProduto+" "+nome);
			
		listaProdutos.add(new produto(codVenda,codProduto,nome,tipo,quantidade,valorCompra,valorVenda));
			
    	}
    	
    	}catch (SQLException e) {
    		throw new ServletException(e.getMessage());
		}
    	return listaProdutos;
    }
    
    public static void inserirProduto(produto produto) throws SQLException, ServletException{
    	System.out.println("vou inserir");
    	String sqlInsert = "insert into PRODUTO(COD_FILIAL,CODPRODUTO,NOME,TIPO,QUANTIDADE,VALOR_COMPRA,VALOR_VENDA) values(?,?,?,?,?,?,?)";
    	
    	try {
    		Connection con = ConexaoDB.getConnection();
    		PreparedStatement ps = con.prepareStatement(sqlInsert);
    		System.out.println("fiz conexao");
    		ps.setInt(1, produto.get_codFilial());
    		ps.setInt(2, produto.get_codProduto());
    		ps.setString(3, produto.get_nome());
    		ps.setString(4, produto.get_tipo());
    		ps.setInt(5, produto.get_quantidade());
    		ps.setDouble(6, produto.get_valorCompra());
    		ps.setDouble(7, produto.get_valorVenda());
    		System.out.println("vou executar");
    		System.out.println(ps);
    		
    		ps.execute();
    		
    	}catch (SQLException e) {
    		throw new ServletException(e.getMessage());
		}
    	System.out.println("executei");
    }
    
    public void atualizarProduto(produto produto) throws SQLException {
    	
    	String sqlUpdate = "update produto set COD_FILIAL = ?, NOME=?,TIPO =?,QUANTIDADE=?, VALOR_COMPRA =?,VALOR_VENDA=?";
    	
    	try(Connection con = ConexaoDB.getConnection();
        		PreparedStatement ps = con.prepareStatement(sqlUpdate)) {
			
    		ps.setInt(1, produto.get_codFilial());
    		ps.setString(2, produto.get_nome());
    		ps.setString(3, produto.get_tipo());
    		ps.setInt(4, produto.get_quantidade());
    		ps.setDouble(5, produto.get_valorCompra());
    		ps.setDouble(6, produto.get_valorVenda());
    		
    		
    		
		} catch (Exception e) {
			String erro = e.getMessage();
		}
    }
    
    
      
}
