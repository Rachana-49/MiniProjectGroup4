package java.com.cg.service;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.User;

import java.com.cg.dao.UserRepoImpl;

import cg.ocrs.model.user;
public class UserServiceImpl implements IUserService {
	//package com.cg.service;
	//implements IBusinessSegmentService {
		UserRepoImpl repo=new UserRepoImpl();

	public List<User> getAllUser() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllusername();
	}

	public User addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return repo.addUser(user);
	}
		
	
	}

