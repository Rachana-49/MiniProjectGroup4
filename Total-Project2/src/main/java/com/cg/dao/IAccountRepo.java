package com.cg.dao;

import java.sql.SQLException;

import com.cg.model.Account;

public interface IAccountRepo {
	public int addAccount(Account account)throws SQLException;
	public boolean validateAccount(Account account)throws SQLException;
	public Account getAccountDetails()throws SQLException;
	public int getAccountNumber(String userName)throws SQLException;
	

}
