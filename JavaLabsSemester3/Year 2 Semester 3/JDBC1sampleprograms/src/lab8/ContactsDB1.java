/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author x00125128
 */
public class ContactsDB1 {

    private Connection conn;
    private Statement stmt;
    private ResultSet rset;

    public void openDB() {

        try {
            // Load the Oracle JDBC driver
            OracleDataSource ords = new OracleDataSource();

            ords.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ords.setUser("X00125128");
            ords.setPassword("db18Sep85");
            //ords.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            //ords.setUser("hr");
            //ords.setPassword("passhr");
            conn = ords.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            
            stmt = conn.createStatement();

           
                // Drop the Coffee table.
                stmt.execute("DROP TABLE Contacts");
                System.out.println("Contacts table dropped.");
           
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    public void buildContactsTable() {

        try {
            // Get a Statement object.
            stmt = conn.createStatement();
            //System.out.println("hello");
            // Create the table.
            stmt.executeUpdate("CREATE TABLE Contacts "
                    + "(ID NUMBER(1) NOT NULL PRIMARY KEY,NAME VARCHAR2(255), ADDRESS VARCHAR(255), PHONE VARCHAR(255), EMAIL VARCHAR(255))");

            // Insert row #1.
            stmt.execute("INSERT INTO Contacts VALUES ( " + "'1', "
                    + "'Peter', " + "'23 Lime Lane '," + "'098787878'," + "'p.cassidy.gmail.com' )");

            // Insert row #2.
            stmt.execute("INSERT INTO Contacts VALUES ( " + "'2', "
                    + "'Donal', " + "'2 Shelbourne Road '," + "'09876755'," + "'donal.gmail.com' )");
            //System.out.println("hello hello");
             // Insert row #2.
            stmt.execute("INSERT INTO Contacts VALUES ( " + "'3', "
                    + "'howie', " + "'3 elbourne Road '," + "'0987675522'," + "'donal.gmail.com' )");

           
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
    public void showDB(){
             String sqlStatement = "SELECT * FROM cONTACTS";
        try {
            stmt = conn.createStatement();
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

			// Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("%.1s %25s %10s %10s %40s\n",
                        rset.getString("ID"),
                        rset.getString("Name"),
                        rset.getString("Address"),
                        rset.getString("Phone"),
                        rset.getString("Email")
                );
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    
    
    }
    
      public void closeDB() {
        try {
            stmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.print("Could not close connection ");
        }
    }
       
      public void queryDB() {

        String sqlStatement = "SELECT count(Name) FROM cONTACTS";
        try {
            stmt = conn.createStatement();
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

			// Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("The Total number of records in the table is %2s\n",
                        rset.getString("count(Name)"));
                        
                 
               
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

      public void queryDB1() {

        String sqlStatement = "SELECT * FROM cONTACTS Order by Name";
        try {
            stmt = conn.createStatement();
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

			// Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("%d %n",rset.getInt("ID"));
                System.out.printf("%2s %n",rset.getString("Name"));
                System.out.printf("%2s %n",rset.getString("Address"));
                System.out.printf("%2s %n",rset.getString("Phone"));
                System.out.printf("%2s %n",rset.getString("Email"));
                       
                     
                
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

      
      public void queryDB2() {

        String sqlStatement = "SELECT Name, Phone FROM cONTACTS where Name = 'Peter'";
        try {
            stmt = conn.createStatement();
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

			// Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("Name: %2s \n", rset.getString("Name"));
                 System.out.printf("Phone Number: %2s \n", rset.getString("Phone"));
                       
                       
                        //rset.getString("Phone")
                        
                
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
      
          public void insert(int id, String nameIn, String addressIn, String phoneIn, String emailIn) {
        try {
            // Create a string with an INSERT statement.
            String sqlStatement = "INSERT INTO Contacts VALUES ( "
                    + id + ", '"
                    + nameIn + "', '"
                    + addressIn + "', '"
                    + phoneIn + "', '"
                    + emailIn + "' )";

            
            // Send the statement to the DBMS.
            int rows = stmt.executeUpdate(sqlStatement);

            // Display the results.
            System.out.println(rows + " row(s) added to the table.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
      
      

}
