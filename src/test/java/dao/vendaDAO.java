/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.ConexaoDB;

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
