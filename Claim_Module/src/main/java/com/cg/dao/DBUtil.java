package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
<<<<<<< HEAD
	static Connection connection;
	public static Connection createConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","password");
		return connection;
	}
}
=======
static Connection con;
	
	public static Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","rachana");
		return con;

}
}
>>>>>>> branch 'master' of https://github.com/Rachana-49/MiniProjectGroup5.git
