package com.cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.ocrs.dao.IPolicyDetailsRepo;
import com.cg.ocrs.dao.PolicyDetailsRepoImpl;
import com.cg.ocrs.model.PolicyDetails;

public class PolicyDetailsServiceImpl implements IPolicyDetailsService {
	PolicyDetailsRepoImpl repo=new PolicyDetailsRepoImpl();
    
	@Override
	public List<PolicyDetails> getAllPolicyDetails() throws SQLException {
		
		return repo.getAllPolicyDetails();
	}

	@Override
	public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException {
		return repo.addPolicyDetails(policyDetails);
	}

	
	
       
}
