package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.exception.InvalidCredentialsException;
import com.cg.model.UserRole;

public interface IUserRoleService {
	public UserRole addUser(UserRole userRole)throws SQLException;
	public List<UserRole> getAllUser()throws SQLException;
	public boolean validateUserRole(UserRole userRole) throws InvalidCredentialsException;

}
