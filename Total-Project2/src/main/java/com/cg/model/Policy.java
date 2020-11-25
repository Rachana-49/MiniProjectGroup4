package com.cg.model;

public class Policy {
	
	private long policyNumber;
	private String policyType;
	private float premium;
	private int accountNumber;
	public Policy() {
		
	}
	public Policy(long policyNumber, String policyType, float premium, int accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyType = policyType;
		this.premium = premium;
		this.accountNumber = accountNumber;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public float getPremium() {
		return premium;
	}

	public void setPremium(float premium) {
		this.premium = premium;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyType=" + policyType + ", premium=" + premium
				+ ", accountNumber=" + accountNumber + "]";
	}
	

}
