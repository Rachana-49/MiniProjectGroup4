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
	public int addAccount(Account account) throws SQLException {
		int status = 0;
		psmt=con.prepareStatement("insert into Account values(accountNumber.nextval,?)");
		psmt.setString(1, account.getUserName());
		
		status = psmt.executeUpdate();
		
		
		return status;
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

	@Override
	public Account getAccountDetails() throws SQLException {
		psmt=con.prepareStatement("select * from Account");
		rs = psmt.executeQuery();
		Account account = new Account();
		while(rs.next()) {
			int accNum = rs.getInt("accountNumber");
			String userName = rs.getString("userName");
			account.setAccountNumber(accNum);
			account.setUserName(userName);
		}
		return account;
	}

	@Override
	public int getAccountNumber(String userName) throws SQLException {
		int num = 0;
		psmt=con.prepareStatement("select * from Account where userName = ?");
		psmt.setString(1, userName);
		rs = psmt.executeQuery();
		while(rs.next()) {
			num = rs.getInt("accountNumber");
		}
		return num;
	}
	 
	
	

}
