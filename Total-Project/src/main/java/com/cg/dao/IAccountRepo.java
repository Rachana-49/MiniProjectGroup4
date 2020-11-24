package com.cg.dao;

import java.sql.SQLException;

import com.cg.model.Account;

public interface IAccountRepo {
	public Account addAccount(Account account)throws SQLException;
	public boolean validateAccount(Account account)throws SQLException;
	

}
