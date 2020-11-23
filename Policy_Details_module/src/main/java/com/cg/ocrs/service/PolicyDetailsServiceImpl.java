package com.cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.ocrs.dao.IPolicyDetailsRepo;
import com.cg.ocrs.dao.PolicyDetailsRepoImpl;
import com.cg.ocrs.model.PolicyDetails;

public class PolicyDetailsServiceImpl implements IPolicyDetailsService {
	PolicyDetailsRepoImpl repo=new PolicyDetailsRepoImpl();
    
	

	@Override
	public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException {
		return repo.addPolicyDetails(policyDetails);
	}



	@Override
	public PolicyDetails getPolicyByNumber(int policy_num) throws SQLException {
		
		return repo.getPolicyByNumber(policy_num);
	}

	

	
	
       
}
