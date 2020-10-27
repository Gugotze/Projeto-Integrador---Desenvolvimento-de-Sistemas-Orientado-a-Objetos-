package br.com.LojaDeRoupas.Dao;

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
import br.com.LojaDeRoupas.Model.Venda;



/**
 *
 * @author gusta
 */
public class vendaDAO{
	
	private static final String DELETAR_VENDA = "DELETE FROM VENDA WHERE CODVENDA= ? ";
    private static final String CONSULTAR_VENDA = "SELECT * FROM VENDA ";
    private static final String GET_VENDA = "SELECT * FROM VENDA WHERE CODVENDA= ? ";
    private static final String UPDATE_VENDA = "UPDATE VENDA SET DATA_VENDA = ?, COD_CLIENTE = ?, COD_PRODUTO = ?, COD_FILIAL = ?, QUANTIDADE = ?, DESCONTO = ?, VALOR_TOTAL = ? WHERE CODVENDA = ? ";
    private static final String INSERIR_VENDA = "INSERT INTO VENDA (DATA_VENDA, COD_CLIENTE, COD_PRODUTO, COD_FILIAL, QUANTIDADE, DESCONTO, VALOR_TOTAL) VALUES (?, ?, ?, ?, ?, ?, ? ) ";
 
    
    public static List<Venda> consultarVenda() {
    	System.out.println("Entrei na CONSULTA");
    	List <Venda> listaVenda =  new ArrayList<Venda>();
    	
    	try {
    	
    	Connection con = ConexaoDB.getConnection();
    	String query = CONSULTAR_VENDA;
    	PreparedStatement ps = con.prepareStatement(query);
    	ResultSet rs = ps.executeQuery();
    	
    	
    	
    	while(rs.next()) {
    		Integer codvenda = rs.getInt("CODVENDA");
    		String data_venda =  rs.getString("DATA_VENDA");
			Integer cod_cliente = rs.getInt("COD_CLIENTE");
			Integer cod_produto = rs.getInt("COD_PRODUTO");
			Integer cod_filial = rs.getInt("COD_FILIAL");
			Integer quantidade = rs.getInt("QUANTIDADE");
			double desconto = rs.getDouble("DESCONTO");
			double valor_Total  = rs.getDouble("VALOR_TOTAL");
			
			System.out.println(rs);
			
			System.out.println(codvenda+" "+data_venda+" "+cod_cliente);
			
		listaVenda.add(new Venda(codvenda, data_venda, cod_cliente, cod_produto, cod_filial, quantidade, desconto, valor_Total));
			
    	}
    	
    	}catch (SQLException ex) {
    		  Logger.getLogger(ServletBD.class.getName()).
              log(Level.SEVERE, null, ex);
		}
    	return listaVenda;
    }
    
    public static Venda getVenda (int codvenda) {
    	
    	Venda venda = new Venda();
    	try {
    		
    		Connection con = ConexaoDB.getConnection();
    		String query = GET_VENDA;
    		PreparedStatement ps = con.prepareStatement(query);
    		
    		ps.setInt(1, codvenda);
    		
    		ResultSet rs = ps.executeQuery();
    		
    		if(rs.next()) {
    			String data_venda = rs.getString("DATA_VENDA");
    			Integer cod_cliente = rs.getInt("COD_CLIENTE");
    			Integer cod_produto = rs.getInt("COD_PRODUTO");
    			Integer cod_filial = rs.getInt("COD_FILIAL");
    			Integer quantidade = rs.getInt("QUANTIDADE");
    			double desconto = rs.getDouble("DESCONTO");
    			double valor_Total  = rs.getDouble("VALOR_TOTAL");
    			
    			venda = new Venda(data_venda, cod_cliente, cod_produto, cod_filial, quantidade, desconto, valor_Total);
    			
    		}
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
		}
    	
    	return venda;
    }
    
    public static void updateVenda (Venda venda) throws SQLException, ClassNotFoundException{
    	
    	
    		Connection con = ConexaoDB.getConnection();
    		String query = UPDATE_VENDA;
    		PreparedStatement ps = con.prepareStatement(query);
    		ps.setString(1, venda.getData_venda());
        	ps.setInt(2, venda.getCod_cliente());
        	ps.setInt(3, venda.getCod_produto());
        	ps.setInt(4, venda.getCod_filial());
        	ps.setInt(5, venda.getQuantidade());
        	ps.setDouble(6, venda.getDesconto());
        	ps.setDouble(7, venda.getValor_Total());
        	ps.setInt(8, venda.getCodvenda());
        	ps.execute();
        	
    		
    	    
    	
    }
    
    public static void inserirVenda (Venda venda) throws SQLException, ClassNotFoundException{
    	
    	try {
    	Connection con = ConexaoDB.getConnection();
    	String query= INSERIR_VENDA;
    	PreparedStatement ps = con.prepareStatement(query);
    	ps.setString(1, venda.getData_venda());
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
