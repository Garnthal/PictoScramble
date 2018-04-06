/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Joseph's Laptop
 */
public class DBManager {
    
    public final String DB_URL = "";
    
    private Connection conn;
    
    public DBManager() throws SQLException
    {
        conn = DriverManager.getConnection(DB_URL);
    }
    
    @Override
    protected void finalize( ) throws Throwable
    {
        conn.close();
        super.finalize( );
    }
    
}
