package java.com.cg.service;
import java.sql.SQLException;
import java.util.List;
import cg.ocrs.model.user;
import org.apache.catalina.User;
public interface IUserService {
	//package com.cg.service;
	

	
	public List<User> getAllUser() throws SQLException;
	public User addUser(User user) throws SQLException;

	}


