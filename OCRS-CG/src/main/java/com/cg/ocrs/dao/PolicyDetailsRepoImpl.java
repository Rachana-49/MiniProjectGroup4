package com.cg.ocrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.ocrs.model.PolicyDetails;

public class PolicyDetailsRepoImpl implements IPolicyDetailsRepo {
       PreparedStatement psmt;
       ResultSet pdResultSet;
       Connection connection;
       
       public PolicyDetailsRepoImpl(){
    	   try {
			connection=DBUtil.createConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException{
    	   psmt=connection.prepareStatement("insert into Policy Details values(?,?,?)");
    	   psmt.setInt(1, policyDetails.getPolicy_Number());
    	   psmt.setString(2, policyDetails.getQuestion_Id());
    	   psmt.setString(3, policyDetails.getAnswer());
    	   
    	   int count=psmt.executeUpdate();
    	   return policyDetails;
    	   }
       public List<PolicyDetails> getAllPolicyDetails() throws SQLException{
    	   psmt=connection.prepareStatement("select * from Policy_Details");
    	   pdResultSet=psmt.executeQuery();
    	   
    	   List<PolicyDetails> p=new ArrayList<PolicyDetails>();
    	   while(pdResultSet.next()) {
    		   PolicyDetails  policyDetails=new PolicyDetails();
    		   policyDetails.setPolicy_Number(pdResultSet.getInt("Policy_Number"));
    		   policyDetails.setQuestion_Id(pdResultSet.getString("Question_Id"));
    		   policyDetails.setAnswer(pdResultSet.getString("Answer"));
    		   p.add(policyDetails);
    		   
    	   }
    	   return p;
       }
	
	}

