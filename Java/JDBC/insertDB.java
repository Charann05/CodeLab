// This program demonstrates how to insert a new employee record into a database using JDBC.

package jdbctest;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class insertDB {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
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

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// 2. Create a statement
			myStmt = myConn.createStatement();

			// 3. Insert a new employee
			System.out.println("Inserting a new employee to database\n");
			
			int rowsAffected = myStmt.executeUpdate(
				"insert into employees " +
				"(last_name, first_name, email, department, salary) " + 
				"values " + 
				"('Fandy', 'Alice', 'alice@foo.com', 'Manager', 23000.00)");
			
			// 4. Verify this by getting a list of employees
			myRs = myStmt.executeQuery("select * from employees order by last_name");
			
			// 5. Process the result set
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


