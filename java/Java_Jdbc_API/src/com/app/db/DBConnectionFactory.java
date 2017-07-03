package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactory {

	static {
		// 1. Register 'JDBC-Driver' to JDBC API
		// DriverManager.registerDriver(new Driver());
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		// 2. Create connection
		String url = "jdbc:mysql://localhost:3306/pm";
		String user = "root";
		String password = "admin";

		return DriverManager.getConnection(url, user, password);

	}

}
