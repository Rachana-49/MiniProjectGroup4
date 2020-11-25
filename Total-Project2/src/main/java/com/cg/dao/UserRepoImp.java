package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cg.model.User;

public class UserRepoImp implements IUserRepo {
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	public UserRepoImp() {
		try {
			con = DBUtility.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*Method to add new User into UserRole Table*/
	@Override
	public User addUser(User user) throws SQLException {
		psmt=con.prepareStatement("insert into UserRole values(?,?,?)");
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());;
		psmt.setString(3, user.getRoleCode());
		
		psmt.executeUpdate();
		return user;
	}
	
	/*Method to validate the credentials of the user to verify whether the user is authorized or not*/
	@Override
	public boolean validateUser(User user) throws SQLException {
		boolean validUser = false;
		psmt=con.prepareStatement("select * from UserRole where userName=? and password=?");
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());
		rs = psmt.executeQuery();
		validUser = rs.next();
		return validUser;
	}

	@Override
	public String getUserRole(User user) throws SQLException {
		String userRole;
		psmt=con.prepareStatement("select roleCode from UserRole where userName=? and password=?");
		psmt.setString(1, user.getUserName());
		psmt.setString(2, user.getPassword());
		rs = psmt.executeQuery();
		rs.next();
		userRole = rs.getString("roleCode");
		return userRole;
	}

	
	
}
