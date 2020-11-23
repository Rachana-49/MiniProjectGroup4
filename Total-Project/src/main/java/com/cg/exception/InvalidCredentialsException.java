package com.cg.exception;

public class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException(String errorMessage){
		super(errorMessage);
	}

}
