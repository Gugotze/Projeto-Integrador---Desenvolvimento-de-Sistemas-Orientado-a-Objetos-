package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.LojaDeRoupas.Util.ConexaoDB;

/**
 *
 * @author gusta
 */
public class vendaDAO {
    
    
      public static void deleteVenda(String codvenda) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.getConnection();
        String query = "delete from venda where codvenda=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, codvenda);
        ps.execute();
    }
    
}
