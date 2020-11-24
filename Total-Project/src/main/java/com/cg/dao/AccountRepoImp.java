package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.model.Account;


public class AccountRepoImp implements IAccountRepo{
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	public AccountRepoImp() {
		try {
			con = DBUtility.getConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Account addAccount(Account account) throws SQLException {
		psmt=con.prepareStatement("insert into Account values(?,?)");
		psmt.setInt(1, account.getAccountNumber());
		psmt.setString(2, account.getUserName());
		
		psmt.executeUpdate();
		return account;
	}

	@Override
	public boolean validateAccount(Account account) throws SQLException {
		boolean validAccount = false;
		try {
		psmt=con.prepareStatement("select * from Account where accountNumber=? and userName=?");
		psmt.setInt(1, account.getAccountNumber());
		psmt.setString(2, account.getUserName());
		rs = psmt.executeQuery();
		validAccount = rs.next();
		}
		catch(Exception e) {
	            e.printStackTrace();
		}
        
		
		return validAccount;
		
	}
	
	

}
