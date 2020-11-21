package com.cg.policy.service;
import java.sql.SQLException;
import java.util.List;
import com.cg.policy.dao.IPolicyRepo;
import com.cg.policy.dao.PolicyRepoImpl;
import com.cg.policy.model.Policy;

public class PolicyServiceImpl implements IPolicyService {
	PolicyRepoImpl repo=new PolicyRepoImpl();

	@Override
	public List<Policy> getAllPolicy() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy addPolicy(Integer policynumber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	    
		
		

		
		
	   }


