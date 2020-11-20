package com.ocrs.cg.dao;
import java.sql.SQLException;
import java.util.List;

import com.ocrs.cg.model.Policy;

public interface IPolicyRepo {
	Policy addPolicy(Policy policy) throws SQLException;
	List<Policy> getAllPolicy() throws SQLException;
}
