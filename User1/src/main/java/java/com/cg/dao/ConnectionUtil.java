package java.com.cg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil {
static Connection con;
public static Connection getConnection() throws SQLException{
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:","system","4105");
	return con;
}
}