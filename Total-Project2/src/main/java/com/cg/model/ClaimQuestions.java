package com.cg.model;

public class ClaimQuestions {
	
	private int claimId;
	private String claimType;
	private String Question;
	private String Answer1;
	private String Answer2;
	public ClaimQuestions() {
		
	}
	public ClaimQuestions(int claimId, String claimType, String question, String answer1, String answer2) {
		super();
		this.claimId = claimId;
		this.claimType = claimType;
		Question = question;
		Answer1 = answer1;
		Answer2 = answer2;
	}
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getAnswer1() {
		return Answer1;
	}
	public void setAnswer1(String answer1) {
		Answer1 = answer1;
	}
	public String getAnswer2() {
		return Answer2;
	}
	public void setAnswer2(String answer2) {
		Answer2 = answer2;
	}
	@Override
	public String toString() {
		return "ClaimQuestions [claimId=" + claimId + ", claimType=" + claimType + ", Question=" + Question
				+ ", Answer1=" + Answer1 + ", Answer2=" + Answer2 + "]";
	}
	
}
	