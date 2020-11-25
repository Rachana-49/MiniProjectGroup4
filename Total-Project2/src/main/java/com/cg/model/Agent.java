package com.cg.model;

public class Agent {
	private int AgentId;
	private String AgentName;
	private String UserName;
	public Agent(int agentId, String agentName, String userName) {
		super();
		AgentId = agentId;
		AgentName = agentName;
		UserName = userName;
	}
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", AgentName=" + AgentName + ", UserName=" + UserName + "]";
	}

}
