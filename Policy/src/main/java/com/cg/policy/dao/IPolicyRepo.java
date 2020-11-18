package com.cg.policy.dao; 
import java.sql.SQLException;
import java.util.List;

import com.cg.policy.model.Policy;


public interface IPolicyRepo {
	
	Policy addPolicy(Policy policy) throws SQLException;
	List<Policy> getAllPolicy() throws SQLException;
 
}
