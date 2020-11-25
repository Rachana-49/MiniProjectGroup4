package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
static Connection con;
	
	public static Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","Bhavitha06");
		return con;

}
}
