package co.edu.poli.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con = null;

	static {
		String url = "jdbc:sqlserver://localhost:1433/company";
		String user = "root";
		String pass = "Admin123*";
		try {
			Class.forName("com.sqlserver.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
