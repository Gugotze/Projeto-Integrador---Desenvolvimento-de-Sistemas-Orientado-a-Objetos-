package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import br.com.LojaDeRoupas.Model.Venda;
import br.com.LojaDeRoupas.Util.ConexaoDB;


/**
 *
 * @author gusta
 */
public class vendaDAO{
	
	private static final String DELETAR_VENDA = "DELETE FROM VENDA WHERE CODVENDA= ? ";
    private static final String CONSULTAR_VENDA = "SELECT * FROM VENDA ";
    private static final String GET_VENDA = "SELECT * FROM VENDA WHERE CODVENDA= ? ";
    private static final String UPDATE_VENDA = "UPDATE VENDA SET DATA_VENDA = ?, COD_CLIENTE = ?, COD_PRODUTO = ?, COD_FILIAL = ?, QUANTIDADE = ?, DESCONTO = ?, VALOR_TOTAL = ? WHERE CODVENDA = ? ";
    private static final String INSERIR_VENDA = "INSERT INTO VENDA VALUES (DATA_VENDA, COD_CLIENTE, COD_PRODUTO, COD_FILIAL, QUANTIDADE, DESCONTO, VALOR_TOTAL) VALUES (?, ?, ?, ?, ?, ?, ?)";
 
    
    public List<Venda> consultarVenda() throws SQLException{
    	List <Venda> listaVenda =  new ArrayList<>();
    	
    	try {
    	
    	Connection con = ConexaoDB.getConnection();
    	String query = CONSULTAR_VENDA;
    	PreparedStatement ps = con.prepareStatement(query);
    	ResultSet rs = ps.executeQuery();
    	
    	while(rs.next()) {
    		int codvenda = rs.getInt("CODVENDA");
    		Date data_venda = rs.getDate("DATA_VENDA");
			int cod_cliente = rs.getInt("COD_CLIENTE");
			int cod_produto = rs.getInt("COD_PRODUTO");
			int cod_filial = rs.getInt("COD_FILIAL");
			int quantidade = rs.getInt("QUANTIDADE");
			double desconto = rs.getDouble("DESCONTO");
			double valor_Total  = rs.getDouble("VALOR_TOTAL");
			
		listaVenda.add(new Venda(codvenda, data_venda, cod_cliente, cod_produto, cod_filial, quantidade, desconto, valor_Total));
			
    	}
    	
    	}catch (SQLException e) {
    		e.printStackTrace();
		}
    	return listaVenda;
    }
    
    public Venda getVenda (int codvenda) throws SQLException{
    	
    	Venda venda = new Venda();
    	try {
    		
    		Connection con = ConexaoDB.getConnection();
    		String query = GET_VENDA;
    		PreparedStatement ps = con.prepareStatement(query);
    		
    		ps.setInt(1, codvenda);
    		
    		ResultSet rs = ps.executeQuery();
    		
    		if(rs.next()) {
    			Date data_venda = rs.getDate("DATA_VENDA");
    			int cod_cliente = rs.getInt("COD_CLIENTE");
    			int cod_produto = rs.getInt("COD_PRODUTO");
    			int cod_filial = rs.getInt("COD_FILIAL");
    			int quantidade = rs.getInt("QUANTIDADE");
    			double desconto = rs.getDouble("DESCONTO");
    			double valor_Total  = rs.getDouble("VALOR_TOTAL");
    			
    			
    		}
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
		}
    	
    	return venda;
    }
    
    public static void updateVenda (Venda venda) throws SQLException, ClassNotFoundException{
    	
    	try {
    		Connection con = ConexaoDB.getConnection();
    		String query = UPDATE_VENDA;
    		PreparedStatement ps = con.prepareStatement(query);
    		ps.setDate(1, (java.sql.Date) venda.getData_venda());
        	ps.setInt(2, venda.getCod_cliente());
        	ps.setInt(3, venda.getCod_produto());
        	ps.setInt(4, venda.getCod_filial());
        	ps.setInt(5, venda.getQuantidade());
        	ps.setDouble(6, venda.getDesconto());
        	ps.setDouble(7, venda.getValor_Total());
        	ps.setInt(8, venda.getCodvenda());
        	ps.execute();
        	
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
		}
    
    	
    }
    
    public static void inserirVenda (Venda venda) throws SQLException, ClassNotFoundException{
    	
    	try {
    	Connection con = ConexaoDB.getConnection();
    	String query= INSERIR_VENDA;
    	PreparedStatement ps = con.prepareStatement(query);
    	ps.setDate(1, (java.sql.Date) venda.getData_venda());
    	ps.setInt(2, venda.getCod_cliente());
    	ps.setInt(3, venda.getCod_produto());
    	ps.setInt(4, venda.getCod_filial());
    	ps.setInt(5, venda.getQuantidade());
    	ps.setDouble(6, venda.getDesconto());
    	ps.setDouble(7, venda.getValor_Total());
    	ps.execute();
    	}catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
      public static void deletarVenda(int codvenda) throws ClassNotFoundException, SQLException {
        
    	try {  
    	Connection con = ConexaoDB.getConnection();
        String query = DELETAR_VENDA;
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, codvenda);
        ps.execute();
    	}catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
}
