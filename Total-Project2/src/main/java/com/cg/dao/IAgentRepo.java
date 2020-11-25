package com.cg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Agent;
import com.cg.model.Policy;

public interface IAgentRepo {
	public List<Agent> getAllUsers(String agent) throws SQLException;

}
