package com.cg.ocrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.ocrs.exception.PolicyDetailsNotFoundException;
import com.cg.ocrs.model.PolicyDetails;

public class PolicyDetailsRepoImpl implements IPolicyDetailsRepo {
       PreparedStatement psmt;
       ResultSet pdResultSet;
       Connection connection;
       
       public PolicyDetailsRepoImpl(){
    	   try {
			connection=DBUtil.createConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
       }
       @Override
       public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException{
    	   psmt=connection.prepareStatement("insert into Policy_Details values(?,?,?)");
    	   psmt.setInt(1, policyDetails.getPolicy_Number());
    	   psmt.setString(2, policyDetails.getQuestion_Id());
    	   psmt.setString(3, policyDetails.getAnswer());
    	   
    	   psmt.executeQuery();
    	   return policyDetails;
    	   }
       @Override
       public PolicyDetails getPolicyByNumber(int policy_num) throws SQLException{
    	   psmt=connection.prepareStatement("select * from Policy_Details where Policy_Number=?");
    	   psmt.setInt(1, policy_num);
    	   pdResultSet= psmt.executeQuery();
    	   if(!pdResultSet.next()) {
    		   throw new PolicyDetailsNotFoundException("Please check your Policy Number");
    	   }
    	   PolicyDetails pds=new PolicyDetails(); 
    	   pds.setPolicy_Number(pdResultSet.getInt("Policy_Number"));
    	   pds.setQuestion_Id(pdResultSet.getString("Question_Id"));
    	   pds.setAnswer(pdResultSet.getString("Answer"));
    	   
    	  
    	   return pds;
    	   }
	
       
       
      
       }
	
	

