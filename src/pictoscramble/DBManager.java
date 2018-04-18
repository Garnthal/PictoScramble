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
import java.sql.Statement;
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
    
       public String[] getWords()
                   throws SQLException
   {
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Word_id FROM WORDS");

      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the words.
      String[] listData = new String[numRows];

      // Populate the array with words.
      for (int index = 0; index < numRows; index++)
      {
         // Store the words in the array.
         listData[index] = resultSet.getString(1);

         // Go to the next row in the result set.
         resultSet.next();
      }

      // Close the connection and statement objects.
      stmt.close();

      // Return the listData array.
      return listData;
   }
       
          public String[] getUsers()
                   throws SQLException
   {
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Name FROM USERS");

      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the names.
      String[] listData = new String[numRows];

      // Populate the array with  names.
      for (int index = 0; index < numRows; index++)
      {
         // Store the name in the array.
         listData[index] = resultSet.getString(1);

         // Go to the next row in the result set.
         resultSet.next();
      }

      // Close the connection and statement objects.
      stmt.close();

      // Return the listData array.
      return listData;
   }
    
   public String[] getAdminUser()
                   throws SQLException
   {
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Name FROM USR_ADMIN");

      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the names.
      String[] listData = new String[numRows];

      // Populate the array with names.
      for (int index = 0; index < numRows; index++)
      {
         // Store the name in the array.
         listData[index] = resultSet.getString(1);

         // Go to the next row in the result set.
         resultSet.next();
      }

      // Close the connection and statement objects.
      stmt.close();

      // Return the listData array.
      return listData;
   }
   
   
    public String[] getAdminLog()
                   throws SQLException
   {
      // Create a Statement object for the query.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);

      // Execute the query.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Name, Password FROM USR_ADMIN");

      // Get the number of rows
      resultSet.last();                 // Move to last row
      int numRows = resultSet.getRow(); // Get row number
      resultSet.first();                // Move to first row

      // Create an array for the Admins.
      String[] listData = new String[numRows];

      // Populate the array with Admins.
      for (int index = 0; index < numRows; index++)
      {
         // Store the Admins and passwords in the array.
         listData[index] = resultSet.getString(1);

         // Go to the next row in the result set.
         resultSet.next();
      }

      // Close the connection and statement objects.
      stmt.close();

      // Return the listData array.
      return listData;
   }
   
    @Override
    protected void finalize( ) throws Throwable
    {
        conn.close();
        super.finalize( );
    }
    
}
