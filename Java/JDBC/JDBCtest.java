
package jdbctest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCtest {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

                Properties props = new Properties();
                try (InputStream input = insertDB.class.getResourceAsStream("/db.properties")) {
                    if (input == null) {
                        System.out.println("db.properties not found!");
                        return;
                    }
                    props.load(input);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Read properties
                String dbUrl = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String pass = props.getProperty("db.pass");
                
                Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user , pass);
			
			System.out.println("Database connection successful!\n");
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
