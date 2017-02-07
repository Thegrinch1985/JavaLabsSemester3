/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabaseshw;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Howie
 */
public class DataBasesDB {
    
    
   private Connection conn;
   private Statement stmt;
   private ResultSet rset;
   
   public void openDB(){
       
       try {
           //Loads Oracle JDBC driver
           OracleDataSource ods = new OracleDataSource();
           
           //ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");               
            //ods.setUser("?????");
            //ods.setPassword("??????");
            ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            ods.setUser("hr");
            ods.setPassword("passhr");
            
            conn = ods.getConnection();
            System.out.println("The Datbases is now Connected");
    
       } catch (SQLException e) {
           System.out.println("Unable to load driver " + e);
           System.exit(1);
       }
 
   }
     public void queryHR()
    {
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery("select * from departments ");
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2));
            }
        } catch (SQLException e) {
            System.out.print("SQL Exception " + e);
            System.exit(1);
        }
    }
 

       
       
       
 
    
}
