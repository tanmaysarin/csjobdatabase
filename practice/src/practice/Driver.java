package practice;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. get a connection to the database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
			
			//2. create a statement
			
			//3. execute a sql query
			
			//4. process the result set
		}
		catch(Exception exe) {
			exe.printStackTrace();
		}

	}

}
