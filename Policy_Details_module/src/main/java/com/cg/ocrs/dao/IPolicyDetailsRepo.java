package com.cg.ocrs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.ocrs.model.PolicyDetails;


public interface IPolicyDetailsRepo {
          public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
          public PolicyDetails getPolicyByNumber(int policy_num)throws SQLException;
          
}
