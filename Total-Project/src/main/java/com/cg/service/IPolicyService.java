package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Policy;

public interface IPolicyService {
	public List<Policy> getPolicyDetails(int accountNumber) throws SQLException;
}
