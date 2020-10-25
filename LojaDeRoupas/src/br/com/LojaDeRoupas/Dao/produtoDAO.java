package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.LojaDeRoupas.Model.Venda;
import br.com.LojaDeRoupas.Model.produto;
import br.com.LojaDeRoupas.Util.ConexaoDB;

public class produtoDAO {
	private static final String DELETAR_PRODUTO = "DELETE FROM PRODUTO WHERE COD_PRODUTO= ? ";
    
    private static final String INSERIR_PRODUTO = "DELETE FROM PRODUTO WHERE COD_PRODUTO= ? ";
 
    
    public List<produto> consultarProduto() throws SQLException{
    	List <produto> listaProdutos =  new ArrayList<>();
    	
    	String sqlConsulta = "SELECT * FROM PRODUTO ";
    	
    	try(Connection con = ConexaoDB.getConnection();
    		PreparedStatement ps = con.prepareStatement(sqlConsulta);
    		ResultSet rs = ps.executeQuery();) {
    	
    	while(rs.next()) {
    		/*COD_FILIAL INT (10) NOT NULL,
    		CODPRODUTO INT (10) NOT NULL,
    		NOME VARCHAR (100) NOT NULL,
    		TIPO VARCHAR (30) NOT NULL,
    		QUANTIDADE INT (10) NOT NULL,
    		VALOR_COMPRA NUMERIC (10,2) NOT NULL,
    		VALOR_VENDA NUMERIC (10,2) NOT NULL*/
    		//fazer código aqui 
    		
    		int codVenda = rs.getInt("COD_FILIAL");
    		int codProduto = rs.getInt("CODPRODUTO");
    		String nome = rs.getString("NOME");
    		String tipo = rs.getString("TIPO");
    		int quantidade = rs.getInt("QUANTIDADE");
    		double valorCompra = rs.getDouble("VALOR_COMPRA");
    		double valorVenda = rs.getDouble("VALOR_VENDA");
    	
			
		listaProdutos.add(new produto(codVenda,codProduto,nome,tipo,quantidade,valorCompra,valorVenda));
			
    	}
    	
    	}catch (SQLException e) {
    		e.getMessage();
		}
    	return listaProdutos;
    }
    
    public void inserirProduto(produto produto) throws SQLException{
    	
    	String sqlInsert = "insert into PRODUTO(COD_FILIAL,CODPRODUTO,NOME,TIPO,QUANTIDADE,VALOR_COMPRA,VALOR_VENDA) values(?,?,?,?,?,?,?)";
    	
    	try(Connection con = ConexaoDB.getConnection();
    		PreparedStatement ps = con.prepareStatement(sqlInsert);
    		) {
    		
    		ps.setInt(1, produto.get_codFilial());
    		ps.setInt(2, produto.get_codProduto());
    		ps.setString(3, produto.get_nome());
    		ps.setInt(4, produto.get_quantidade());
    		ps.setDouble(5, produto.get_valorCompra());
    		ps.setDouble(6, produto.get_valorVenda());
    		ps.execute();
    		
    	}catch (SQLException e) {
			String erro = e.getMessage();
		}
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
