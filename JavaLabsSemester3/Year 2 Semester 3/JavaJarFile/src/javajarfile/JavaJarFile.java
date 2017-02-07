/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajarfile;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author x00125128
 */
public class JavaJarFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private Connection conn;
        private Statement stat;
        private ResultSet rset;
        
        public void openDB() throws SQLException{
        
            
       try {
           OracleDataSource ods = new OracleDataSource();
       
       }
        
        }
    }
    
}
