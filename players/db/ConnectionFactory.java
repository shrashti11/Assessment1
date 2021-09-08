package com.hsbc.players.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static Connection conn = null;

	public static Connection getDBConnection() {
		
		String url = "jdbc:mysql://localhost:3306/hsbcdb";
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, "root", "root123");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}
}
