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
    private static final String CONSULTAR_PRODUTO = "SELECT * FROM PRODUTO ";
 
    
    public List<produto> consultarProduto() throws SQLException{
    	List <produto> listaProdutos =  new ArrayList<>();
    	
    	try(Connection con = ConexaoDB.getConnection();
    		PreparedStatement ps = con.prepareStatement(CONSULTAR_PRODUTO);
    		ResultSet rs = ps.executeQuery();) {
    	
    	while(rs.next()) {
    	
    		//fazer código aqui 
    	
			
		listaProdutos.add(new produto());
			
    	}
    	
    	}catch (SQLException e) {
    		e.printStackTrace();
		}
    	return listaProdutos;
    }
    
    
      
}
