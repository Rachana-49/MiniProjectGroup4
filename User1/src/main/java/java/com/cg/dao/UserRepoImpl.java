package java.com.cg.dao;
import java.sql.Connection;
import java.lang.Object;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import cg.ocrs.model.user;
public class UserRepoImpl implements IUserRepo{
	Connection con;
	PreparedStatement psmt;
	ResultSet rsuser;
	public UserRepoImpl(){
		try{
			con=ConnectionUtil.getConnection();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
public List<User> getAllusername() throws SQLException{
	psmt=con.prepareStatement("select * from User");
	rsuser=psmt.executeQuery();
	List<User> username=new ArrayList<User>();
	while(rsuser.next()){
		user user=new user();
	}
	return username;
	
	}

public User addUser(User user) throws SQLException {
	// TODO Auto-generated method stub
	psmt=con.prepareStatement("insert into student values(?,?,)");
	psmt.setString(1, user.getUsername());
	psmt.setString(2, user.getPassword());
	psmt.executeUpdate();
	return user;
}
}

