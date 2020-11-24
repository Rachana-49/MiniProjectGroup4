package com.cg.service;

import java.sql.SQLException;

import com.cg.model.Account;

public interface IAccountService {
	public Account addAccount(Account account)throws SQLException;
	public boolean validateAccount(Account account)throws SQLException;
}
