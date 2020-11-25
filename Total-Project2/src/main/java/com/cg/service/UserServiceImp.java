package com.cg.service;


import java.sql.SQLException;

import com.cg.controller.ClaimCreationSevlet;
import com.cg.dao.UserRepoImp;
import com.cg.model.User;


public class UserServiceImp implements IUserService{
	
	UserRepoImp repo = new UserRepoImp();
	@Override
	public User addUser(User user) throws SQLException {
		
		return repo.addUser(user);
	}

	@Override
	public String getUserRole(User user) throws SQLException {
		
		return repo.getUserRole(user);
	}

	@Override
	public boolean validateUser(User user) throws SQLException {
	
		return repo.validateUser(user);
	}
	

}
