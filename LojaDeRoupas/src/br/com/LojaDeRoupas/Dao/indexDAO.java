package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.LojaDeRoupas.Model.Index;
import br.com.LojaDeRoupas.Servlet.ServletBD;
import br.com.LojaDeRoupas.Util.ConexaoDB;

public class indexDAO {
	
		public static List<Index> consultarVenda(){
			System.out.println("Entrei na CONSULTA");
	    	List <Index> listaGrafico =  new ArrayList<Index>();
	    	
	    	try {
	    	
	    	Connection con = ConexaoDB.getConnection();
	    	String query = "SELECT DATA_VENDA, count(*) as qtd FROM VENDA group by DATA_VENDA;";
	    	PreparedStatement ps = con.prepareStatement(query);
	    	ResultSet rs = ps.executeQuery();
	    	
	    	
	    	
	    	while(rs.next()) {
	    		String dataVenda = rs.getString("DATA_VENDA");
	    		int qtd = (int) rs.getInt("qtd");
				
	    		listaGrafico.add(new Index(dataVenda,qtd));
				
	    	}
	    	
	    	}catch (SQLException ex) {
	    		  Logger.getLogger(ServletBD.class.getName()).
	              log(Level.SEVERE, null, ex);
			}
	    	return listaGrafico;
		}
	
	
}