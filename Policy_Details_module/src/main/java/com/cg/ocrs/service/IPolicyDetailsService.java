package com.cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.ocrs.model.PolicyDetails;

public interface IPolicyDetailsService {
         public PolicyDetails getPolicyByNumber(int policy_num) throws SQLException;
         public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
       
         
         
}
