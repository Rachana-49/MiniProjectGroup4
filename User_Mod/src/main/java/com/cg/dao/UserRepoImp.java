package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.model.UserModule;

public class UserRepoImp implements IUserRepo{

	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;

	public UserRepoImp() {
		try {
			con = DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public UserModule addUser(UserModule userModule) throws SQLException {
		// TODO Auto-generated method stub
		psmt=con.prepareStatement("insert into UserRole values(?,?,?)");
		psmt.setString(1, userModule.getUsername());
		psmt.setString(2, userModule.getPassword());;
		psmt.setString(3, userModule.getRoleCode());
		
		psmt.executeUpdate();
		return userModule;
	}

	public List<UserModule> getAllUser() throws SQLException {
		psmt=con.prepareStatement("select * from UserRole");
		
		rs=psmt.executeQuery();
		
		List<UserModule> userList = new ArrayList<UserModule>();
		UserModule user = new UserModule();
		while(rs.next()) 
		{
		user.setUsername(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setRoleCode(rs.getString("roleCode"));
		
		userList.add(user);
		}
		
		return userList;
		// TODO Auto-generated method stub
		
	}

	public boolean validateUserModule(UserModule userModule) throws SQLException {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
		psmt=con.prepareStatement("select * from UserRole where userName=? and password=? and roleCode = ?");
		psmt.setString(1, userModule.getUsername());
		psmt.setString(2, userModule.getPassword());
		psmt.setString(3, userModule.getRoleCode());
		rs = psmt.executeQuery();
		status = rs.next();
		}
		catch(Exception e) {
	            e.printStackTrace();
		}
        
		
		return status;
	}
	

}
