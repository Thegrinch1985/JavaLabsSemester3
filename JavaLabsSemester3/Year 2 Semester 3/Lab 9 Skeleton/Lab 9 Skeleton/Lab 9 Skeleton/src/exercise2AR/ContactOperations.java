package exercise2AR;

import java.sql.*; // Needed for JDBC classes
import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.jdbc.pool.OracleDataSource;

public class ContactOperations {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rset;

    public void openDB() {

        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
            ods.setUser("x00125128");
            ods.setPassword("18Sep85");
            //ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
            //ods.setUser("hr");
            //ods.setPassword("passhr");

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (Exception e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void buildContactsTable() {
        try {
            String sql1 = "CREATE TABLE Contacts "
                    + "(id NUMBER PRIMARY KEY,name VARCHAR2(35) , address VARCHAR2(35),pnumber  VARCHAR2(20), email VARCHAR2(30))";
            // Get a Statement object.
            pstmt = conn.prepareStatement(sql1);
            // Create the table.
            pstmt.executeUpdate();

            String sql2 = "INSERT INTO Contacts VALUES (?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql2);

            // Insert row #1.
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Peter");
            pstmt.setString(3, "23 Lime Lane");
            pstmt.setString(4, "018976543");
            pstmt.setString(5, "p.cassidy@b.com");
            pstmt.executeUpdate();

            // Insert row #2.
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Donal");
            pstmt.setString(3, "2 Shelbourne rd");
            pstmt.setString(4, "012446578\t");
            pstmt.setString(5, "d.oreilly@b.com");
            pstmt.executeUpdate();

            // Insert row #3.
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Mary");
            pstmt.setString(3, "4 Richmond rd");
            pstmt.setString(4, "019887654");
            pstmt.setString(5, "m.lawlor@b.com");
            pstmt.executeUpdate();

            // Insert row #4.
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Glen");
            pstmt.setString(3, "4 Richmond Lane");
            pstmt.setString(4, "011223876");
            pstmt.setString(5, "g.whelan@b.com");
            pstmt.executeUpdate();

            System.out.println("Contacts table created.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void queryDB() {
        String sqlStatement = "SELECT * FROM Contacts";
        try {
            pstmt = conn.prepareStatement(sqlStatement);
            // Send the statement to the DBMS.
            rset = pstmt.executeQuery(sqlStatement);

            // Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.printf("%-2d %-10s %-30s %-15s%-15s\n",
                        rset.getInt(1),
                        rset.getString(2),
                        rset.getString(3),
                        rset.getString(4),
                        rset.getString(5));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }

    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            pstmt = conn.prepareStatement("DROP TABLE Contacts");

            try {
                // Drop the Contacts table.
                pstmt.execute();
                System.out.println("Contacts table dropped.");
            } catch (SQLException ex) {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void closeDB() {
        try {
            pstmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.print("Could not close connection ");
        }
    }
    


    public void updateRecord(int id, String newNum) {

        try {
            String s1 = "select id, name, address, pnumber, email FROM Contacts WHERE id = " + "'" + id + "'";

            pstmt = conn.prepareStatement(s1, ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                rset.updateString(4, newNum);
                System.out.println("Updating......");
                rset.updateRow();
                System.out.println("Record Updated");

            } else {
                System.out.println("Record Not Found");
            }
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    void deleteRecord(int idDelete) {

        String s1 = "select id, name, address,pnumber,email from contacts where id =" + "'" + idDelete + "'";

        try {
            pstmt = conn.prepareStatement(s1,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                System.out.println("Deleting.....");
                rset.deleteRow();
                System.out.println("Row Deleted");

            } else {
                System.out.println("Record Not Found");
            }
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    void add(int idAdd, String nameAdd, String addAdd, String numAdd, String emailAdd) {

        try {
            String s1 = "select id, name ,address, pnumber, email from Contacts";

            pstmt = conn.prepareStatement(s1,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE);

            rset = pstmt.executeQuery();

            rset.moveToInsertRow();
            rset.updateInt(1, idAdd);
            rset.updateString(2, nameAdd);
            rset.updateString(3, addAdd);
            rset.updateString(4, numAdd);
            rset.updateString(5, emailAdd);
            rset.insertRow();
            System.out.println("Contact being added ................");
            System.out.println("Contact Succesfully Added");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
