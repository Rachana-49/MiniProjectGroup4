package com.cg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Policy;

public interface IPolicyRepo {
	public List<Policy> getPolicyDetails(int accountNumber) throws SQLException;

}
