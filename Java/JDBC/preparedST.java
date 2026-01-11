// This program demonstrates how to use a PreparedStatement to execute a parameterized query and reuse it with different values.

package jdbctest;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class preparedST {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
                Properties props = new Properties();
                try (InputStream input = preparedST.class.getResourceAsStream("/db.properties")) {
                    if (input == null) {
                        System.out.println("db.properties not found!");
                        return;
                    }
                    props.load(input);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String dbUrl = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String pass = props.getProperty("db.pass");
		
		try {
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			myStmt = myConn.prepareStatement("select * from employees where salary > ? and department=?");
                        
			myStmt.setDouble(1, 80000);
			myStmt.setString(2, "Legal");
			myRs = myStmt.executeQuery();
			
			display(myRs);
		

			System.out.println("\n\nReuse the prepared statement:  salary > 25000,  department = HR");

			myStmt.setDouble(1, 25000);
			myStmt.setString(2, "HR");
			myRs = myStmt.executeQuery();
			
			display(myRs);


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

	private static void display(ResultSet myRs) throws SQLException {
		while (myRs.next()) {
			String lastName = myRs.getString("last_name");
			String firstName = myRs.getString("first_name");
			double salary = myRs.getDouble("salary");
			String department = myRs.getString("department");
			
			System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
		}
	}
}


