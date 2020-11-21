package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.UserRepoImp;
import com.cg.model.UserModule;

public class UserModuleServiceImp implements IUserModuleService{
	UserRepoImp repo = new UserRepoImp();

	public UserModule addUser(UserModule userModule) throws SQLException {
		// TODO Auto-generated method stub
		return repo.addUser(userModule);
	}

	public List<UserModule> getAllUser() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllUser();
	}

	public boolean validateUserModule(UserModule userModule) throws SQLException {
		// TODO Auto-generated method stub
		return repo.validateUserModule(userModule);
	}

}
