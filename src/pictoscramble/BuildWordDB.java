package pictoscramble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

/**
 *
 * @author c0679269
 */
public class BuildWordDB {
       public static void main(String[] args)
                      throws Exception
   {
      final String DB_URL =
            "jdbc:derby://Localhost:1527/PictoDB";
            
      try
      {    
         // Create a connection to the database.
         Connection conn = 
                    DriverManager.getConnection(DB_URL);
            
         // Create a Statement object.
         Statement stmt = conn.createStatement();
            
         // Create the Dvd table.
         System.out.println("Creating the table...");
         stmt.execute("CREATE TABLE WORDS ("    +

                      "Word_id INTEGER, "   +

                      "word VARCHAR(10), ");
      
         // Close the resources.
         stmt.close();     
         conn.close();
         System.out.println("Done");
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
