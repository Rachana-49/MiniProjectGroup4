package com.cg.dao;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import com.cg.model.User;

public class UserRoleRepoImpTest {

	UserRepoImp repo = new UserRepoImp();
	@Test
	public void testValidateUser() throws SQLException {
		User user = new User("Geetha","Geetha123","CLAIM ADJUSTER");
		User savedUser = repo.addUser(user);
		assertEquals(user,savedUser);
		
	}

}
