package jdbctest;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class transaction {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
                
                Properties props = new Properties();
                try (InputStream input = transaction.class.getResourceAsStream("/db.properties")) {
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
			myConn.setAutoCommit(false);

			System.out.println("Salaries BEFORE\n");
			showSalaries(myConn, "HR");
			showSalaries(myConn, "Engineering");
                        
			myStmt = myConn.createStatement();
			myStmt.executeUpdate("delete from employees where department='HR'");

			myStmt.executeUpdate("update employees set salary=300000 where department='Engineering'");
			System.out.println("\n>> Transaction steps are ready.\n");

			boolean ok = askUserIfOkToSave();

			if (ok) {
				myConn.commit();
				System.out.println("\n>> Transaction COMMITTED.\n");
                        }
                        
                        else {
				myConn.rollback();
				System.out.println("\n>> Transaction ROLLED BACK.\n");
			}

			System.out.println("Salaries AFTER\n");
			showSalaries(myConn, "HR");
			showSalaries(myConn, "Engineering");

		} catch (Exception exc) {
			exc.printStackTrace();
		} 
                
                finally {
			close(myConn, myStmt, null);
		}
	}

	private static boolean askUserIfOkToSave() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Is it okay to save?  yes/no: ");
		String input = scanner.nextLine();

		scanner.close();

		return input.equalsIgnoreCase("yes");
	}

	private static void showSalaries(Connection myConn, String theDepartment)throws SQLException 
        {
            
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		System.out.println("Show Salaries for Department: " + theDepartment);

		try {
			myStmt = myConn.prepareStatement("select * from employees where department=?");
			myStmt.setString(1, theDepartment);
			myRs = myStmt.executeQuery();

			while (myRs.next()) {
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String department = myRs.getString("department");

				System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName,
						department, salary);
			}

			System.out.println();
                        
		} catch (Exception exc) {
			exc.printStackTrace();
		} 
                
                finally {
			close(myStmt, myRs);
		}

	}

	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
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

	private static void close(Statement myStmt, ResultSet myRs)throws SQLException {

		close(null, myStmt, myRs);
	}
}
