package com.cg.dao;

import java.sql.SQLException;
import com.cg.model.User;




public interface IUserRepo {
	public User addUser(User user)throws SQLException;
	public String getUserRole(User user)throws SQLException;
	public boolean validateUser(User user) throws SQLException;

	
	

}
