package project;

import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blood_Bank_Management_System",
					"root", "Kshitiz123@");
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
}
