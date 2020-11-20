package com.cg.model;

public class ClaimDetails {
	
	private int id;
	private String claimType;
	private String claimQuestion;
	public ClaimDetails() {
		
	}
	public ClaimDetails(int id, String claimType, String claimQuestion) {
		super();
		this.id = id;
		this.claimType = claimType;
		this.claimQuestion = claimQuestion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimQuestion() {
		return claimQuestion;
	}
	public void setClaimQuestion(String claimQuestion) {
		this.claimQuestion = claimQuestion;
	}
	@Override
	public String toString() {
		return "ClaimDetails [id=" + id + ", claimType=" + claimType + ", claimQuestion=" + claimQuestion + "]";
	}

}
