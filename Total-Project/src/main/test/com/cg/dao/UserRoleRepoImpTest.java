package com.cg.dao;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.cg.exception.InvalidCredentialsException;

public class UserRoleRepoImpTest {

	@Test(expected = InvalidCredentialsException .class)
	public void testValidateUserRole() {
		
		 System.out.println("Inside testPrintMessage()");
	}

}
