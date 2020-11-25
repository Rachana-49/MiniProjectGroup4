package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.AgentRepoImp;
import com.cg.model.Agent;

public class AgentServiceImp implements IAgentService{
AgentRepoImp repo = new AgentRepoImp();
	@Override
	public List<Agent> getAllUsers(String agent) throws SQLException {
		
		return repo.getAllUsers(agent);
	}

}
