package com.cg.service;


import java.sql.SQLException;
import java.util.List;

import com.cg.dao.UserRoleRepoImp;
import com.cg.exception.InvalidCredentialsException;
import com.cg.model.UserRole;

public class UserRoleServiceImp implements IUserRoleService{
	UserRoleRepoImp repo = new UserRoleRepoImp();
	@Override
	public UserRole addUser(UserRole userRole) throws SQLException {
		
		return repo.addUser(userRole);
	}

	@Override
	public List<UserRole> getAllUser() throws SQLException {
	
		return repo.getAllUser();
	}

	@Override
	public boolean validateUserRole(UserRole userRole) throws  InvalidCredentialsException {
		
		return repo.validateUserRole(userRole);
	}

}
