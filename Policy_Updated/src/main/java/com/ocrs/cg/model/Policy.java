package com.ocrs.cg.model;

public class Policy {
	

	private int Policy_Number;
	private String Policy_Premium;
	private long Account_Number;
	
	
	public Policy() {
	
	}
	public Policy(int Policy_Number, String Policy_Premium, long Account_Number) {
		super();
		this.Policy_Number = Policy_Number;
		this.Policy_Premium = Policy_Premium;
		this.Account_Number = Account_Number;
	}


	

	public int getPolicy_Number() {
		return Policy_Number;
	}


	public void setPolicy_Number(int policy_Number) {
		Policy_Number = policy_Number;
	}


	public String getPolicy_Premium() {
		return Policy_Premium;
	}


	public void setPolicy_Premium(String policy_Premium) {
		Policy_Premium = policy_Premium;
	}


	public long getAccount_Number() {
		return Account_Number;
	}


	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}


	@Override
	public String toString() {
		return "Policy [Policy_Number=" + Policy_Number + ", Policy_Premium=" + Policy_Premium + ", Account_Number="
				+ Account_Number + "]";
	}
	
}
