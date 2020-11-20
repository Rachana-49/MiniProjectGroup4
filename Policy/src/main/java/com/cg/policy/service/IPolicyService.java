package com.cg.policy.service;
import java.sql.SQLException;
import java.util.List;

import com.cg.policy.model.Policy;


public interface IPolicyService {
	

  public List<Policy> getAllPolicy() throws SQLException;
	         public Policy addPolicy(Integer policynumber) throws SQLException;
	         //Created interface
			
	         
	         
	}


