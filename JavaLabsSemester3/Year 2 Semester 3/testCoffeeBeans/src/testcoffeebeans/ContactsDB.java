/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcoffeebeans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x00125128
 */
public class ContactsDB {
    
    private Connection conn;
    private Statement stmt;
    private ResultSet rset;

    public void openDB() {

        try {
            // Load the Oracle JDBC driver
            OracleDataSource ords = new OracleDataSource();

            ords.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ords.setUser("X00125128");
            ords.setPassword("18Sep85");
            //ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            //ods.setUser("hr");
            //ods.setPassword("passhr");
            Connection conn = ords.getConnection();
            System.out.println("connected.");
        } catch (SQLException e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void buildContactsTable() {

        try {
            // Get a Statement object.
            stmt = conn.createStatement();

            // Create the table.
            stmt.executeUpdate("CREATE TABLE CONTACTS "
                    + "(Description MUMBER(10) NOT NULL PRIMARY KEY,NAME VARCHAR2(25), ADDRESS VARCHAR(255), PHONE NUMBER NOT NULL,EMAIL VARCHAR(255)");

            // Insert row #1.
            stmt.execute("INSERT INTO TABLE VALUES ( " + "'1', "
                    + "'pETER', " + "'23 Lime Lane '," + "'098787878'," + "'p.cassidy.gmail.com' )");

            // Insert row #2.
            stmt.execute("INSERT INTO TABLE VALUES ( " + "'2', "
                    + "'Donal', " + "'2 Shelbourne Road '," + "'09876755'," + "'donal.gmail.com' )");

            stmt.execute("INSERT INTO TABLE VALUES ( " + "'2', "
                    + "'Donal', " + "'2 Shelbourne Road '," + "'09876755'," + "'donal.gmail.com' )");

            stmt.execute("INSERT INTO TABLE VALUES ( " + "'2', "
                    + "'Donal', " + "'2 Shelbourne Road '," + "'09876755'," + "'donal.gmail.com' )");

        } catch (SQLException ex) {
            Logger.getLogger(ContactsDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
