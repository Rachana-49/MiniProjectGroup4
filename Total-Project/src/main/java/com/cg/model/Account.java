package com.cg.model;

public class Account {
	private int accountNumber;
	private String UserName;
	public Account(int accountNumber, String userName) {
		super();
		this.accountNumber = accountNumber;
		UserName = userName;
	}
	public Account() {
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", UserName=" + UserName + "]";
	}
	

}
