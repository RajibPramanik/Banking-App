package banking;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBConnection {
	private static final String url = "jdbc:mysql://localhost:3306/bank";
	private static final String user = "root";
	private static final String password = "Rajib@8018#";
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			// Load MySQL driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println("Database connection failed:");
			e.printStackTrace();
		}
		return con;
	}
}
