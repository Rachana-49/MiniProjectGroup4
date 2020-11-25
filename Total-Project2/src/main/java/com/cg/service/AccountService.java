package com.cg.service;

import java.sql.SQLException;

import com.cg.dao.AccountRepoImp;
import com.cg.model.Account;

public class AccountService implements IAccountService{
	AccountRepoImp repo = new AccountRepoImp();
	
	@Override
	public boolean validateAccount(Account account) throws SQLException {
	
		return repo.validateAccount(account);
	}

	@Override
	public Account getAccountDetails() throws SQLException {
		
		return repo.getAccountDetails();
	}

	@Override
	public int addAccount(Account account) throws SQLException {
		int result = repo.addAccount(account);
		return result;
	}

	@Override
	public int getAccountNumber(String userName) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAccountNumber(userName);
	}
	}
