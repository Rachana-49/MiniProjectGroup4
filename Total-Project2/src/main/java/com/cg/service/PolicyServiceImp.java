package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.PolicyRepoImp;
import com.cg.model.Policy;

public class PolicyServiceImp implements IPolicyService {
	PolicyRepoImp repo = new PolicyRepoImp();
	@Override
	public List<Policy> getPolicyDetails(int accountNumber) throws SQLException {
		
		return repo.getPolicyDetails(accountNumber);
	}

}
