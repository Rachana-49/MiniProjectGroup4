package com.ocrs.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.ocrs.cg.dao.PolicyRepoImpl;
import com.ocrs.cg.model.Policy;

public class PolicyServiceImpl implements  IPolicyService {
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
