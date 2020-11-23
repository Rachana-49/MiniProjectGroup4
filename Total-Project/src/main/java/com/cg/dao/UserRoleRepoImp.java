package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.exception.InvalidCredentialsException;
import com.cg.model.UserRole;

public class UserRoleRepoImp implements IUserRoleRepo{
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	public UserRoleRepoImp() {
		try {
			con = DBUtility.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*Method to add new User into UserRole Table*/
	
	@Override
	public UserRole addUser(UserRole userRole) throws SQLException {
		psmt=con.prepareStatement("insert into UserRole values(?,?,?)");
		psmt.setString(1, userRole.getUserName());
		psmt.setString(2, userRole.getPassword());;
		psmt.setString(3, userRole.getRoleCode());
		
		psmt.executeUpdate();
		return userRole;
		
	}
	
	/*Method to get all Users from UserRole Table*/
	
	@Override
	public List<UserRole> getAllUser() throws SQLException {
		psmt=con.prepareStatement("select * from UserRole");
		rs=psmt.executeQuery();
		List<UserRole> userList = new ArrayList<UserRole>();
		UserRole user = new UserRole();
		while(rs.next()) 
		{
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setRoleCode(rs.getString("roleCode"));
		
		userList.add(user);
		}
		
		return userList;
	}
	
	/*Method to validate the credentials of the user to verify whether the user is authorized or not*/
	@Override
	public boolean validateUserRole(UserRole userRole) throws InvalidCredentialsException {
		boolean validUser = false;
		try {
		psmt=con.prepareStatement("select * from UserRole where userName=? and password=? and roleCode = ?");
		psmt.setString(1, userRole.getUserName());
		psmt.setString(2, userRole.getPassword());
		psmt.setString(3, userRole.getRoleCode());
		rs = psmt.executeQuery();
		validUser = rs.next();
		}
		catch(Exception e) {
	            e.printStackTrace();
		}
        
		
		return validUser;
	}

}
