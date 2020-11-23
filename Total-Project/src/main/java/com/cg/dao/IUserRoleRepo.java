package com.cg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.exception.InvalidCredentialsException;

import com.cg.model.UserRole;



public interface IUserRoleRepo {
	public UserRole addUser(UserRole userRole)throws SQLException;
	public List<UserRole> getAllUser()throws SQLException;
	public boolean validateUserRole(UserRole userRole) throws InvalidCredentialsException;

	
	

}
