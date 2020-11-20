package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.UserModule;

public interface IUserModuleService {
	public UserModule addUser(UserModule userModule)throws SQLException;
	public List<UserModule> getAllUser()throws SQLException;
	public boolean validateUserModule(UserModule userModule) throws SQLException;

}
