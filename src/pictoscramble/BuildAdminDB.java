package pictoscramble;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author c0679269
 */
public class BuildAdminDB {
       public static void main(String[] args)
                      throws Exception
   {
      final String DB_URL =
            "jdbc:derby:EntertainmentDB;create=true";
            
      try
      {    
         // Create a connection to the database.
         Connection conn = 
                    DriverManager.getConnection(DB_URL);
            
         // Create a Statement object.
         Statement stmt = conn.createStatement();
            
         // Create the Dvd table.
         System.out.println("Creating the table...");
         stmt.execute("CREATE TABLE USR_ADMIN ("    +
                      "Admin_id INTEGER, "   +
                      "Name VARCHAR(10), " +
                 "Password, ");
      
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
