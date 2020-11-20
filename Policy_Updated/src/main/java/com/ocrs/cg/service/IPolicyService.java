package com.ocrs.cg.service;
import java.sql.SQLException;
import java.util.List;

import com.ocrs.cg.model.Policy;
public interface IPolicyService {
	public List<Policy> getAllPolicy() throws SQLException;
    public Policy addPolicy(Integer policynumber) throws SQLException;
}
