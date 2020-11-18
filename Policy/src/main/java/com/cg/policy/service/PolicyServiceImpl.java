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
			
			return repo.getAllPolicy();
		}

		@Override
		public Policy addPolicy(Policy policy) throws SQLException {
			return repo.addPolicy(policy);
		}

		
		
	       
	}


