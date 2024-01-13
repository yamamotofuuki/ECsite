package com.diworksdev.ecsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	/**
	 * JDBC ドライバー名
	 */
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	
	/**
	 * データベース接続 URL
	 */
	private static String url = "jdbc:mysql://localhost/ecsite";
	
	/**
	 * データベース接続ユーザ名・パスワード
	 */
	private static String user = "root";
	private static String password = "mysql";
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e ) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
