package com.cg.policy.model;

public class Policy {
	private int PolicyNumber;
	private float PolicyPremium;
	private int AccountNumber;
	
	
	public Policy() {
	}
	public Policy(int PolicyNumber,float PolicyPremium,int AccountNumber) {
		super();
		this.PolicyNumber = PolicyNumber;
		this.PolicyPremium = PolicyPremium;
		this.AccountNumber = AccountNumber;
	}
	public int getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		PolicyNumber = policyNumber;
	}
	public float getPolicyPremium() {
		return PolicyPremium;
	}
	public void setPolicyPremium(float policyPremium) {
		PolicyPremium = policyPremium;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Policy [PolicyNumber=" + PolicyNumber + ", PolicyPremium=" + PolicyPremium + ", AccountNumber="
				+ AccountNumber + "]";
	}
}