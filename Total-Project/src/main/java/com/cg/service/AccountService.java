package com.cg.service;

import java.sql.SQLException;

import com.cg.dao.AccountRepoImp;
import com.cg.model.Account;

public class AccountService implements IAccountService{
	AccountRepoImp repo = new AccountRepoImp();
	@Override
	public Account addAccount(Account account) throws SQLException {
		// TODO Auto-generated method stub
		return repo.addAccount(account);
	}

	@Override
	public boolean validateAccount(Account account) throws SQLException {
		// TODO Auto-generated method stub
		return repo.validateAccount(account);
	}
	

}
