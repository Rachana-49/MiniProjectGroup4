package com.cg.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Test;

import com.cg.exception.InvalidCredentialsException;
import com.cg.model.UserRole;

public class UserRoleRepoImpTest {

	UserRoleRepoImp repo = new UserRoleRepoImp();
	@Test
	public void testAddUser() throws SQLException {
		UserRole user = new UserRole("Meera","Meera123","CLAIM ADJUSTER");
		UserRole savedUser = repo.addUser(user);
		assertEquals(user,savedUser);
		
	}

}
