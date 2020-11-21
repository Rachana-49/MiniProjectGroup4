package com.cg.ocrs.model;

public class PolicyDetails {
    private int Policy_Number;
    private String Question_Id;
    private String Answer;
    
    public PolicyDetails() {
    	
    }
    
    public PolicyDetails(int Policy_Number, String Question_Id, String Answer) {
		super();
		this.Policy_Number = Policy_Number;
		this.Question_Id = Question_Id;
		this.Answer = Answer;
	}

	public int getPolicy_Number() {
		return Policy_Number;
	}

	public void setPolicy_Number(int policy_Number) {
		Policy_Number = policy_Number;
	}

	public String getQuestion_Id() {
		return Question_Id;
	}

	public void setQuestion_Id(String question_Id) {
		Question_Id = question_Id;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	@Override
	public String toString() {
		return "PolicyDetails [Policy_Number=" + Policy_Number + ", Question_Id=" + Question_Id + ", Answer=" + Answer
				+ "]";
	}
    
}
