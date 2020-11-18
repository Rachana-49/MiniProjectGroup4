package com.cg.policy.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil { 
	
	
	
	
	static Connection connection;
	
	public static Connection createConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","system");
		return connection;
	}

}
