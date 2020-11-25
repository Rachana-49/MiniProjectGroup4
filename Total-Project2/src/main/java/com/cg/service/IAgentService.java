package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Agent;

public interface IAgentService {
	public List<Agent> getAllUsers(String agent) throws SQLException;
}
