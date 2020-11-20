package com.ocrs.cg.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ocrs.cg.model.Policy;
public class PolicyRepoImpl implements IPolicyRepo {
	PreparedStatement psmt;
    ResultSet pdResultSet;
    Connection connection;
    public PolicyRepoImpl() {
 	   try {
			connection=DBUtil.createConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
   @Override
	public Policy addPolicy(Policy policy) throws SQLException{
  	   psmt=connection.prepareStatement("insert into Policy  values(?,?,?)");
  	   psmt.setInt(1, policy.getPolicy_Number());
  	   psmt.setString(2, policy.getPolicy_Premium());
  	   psmt.setLong(3, policy.getAccount_Number());
  	   
  	   int count=psmt.executeUpdate();
    
  	   return policy;
    }
    @Override
    public List<Policy> getAllPolicy() throws SQLException{
 	   psmt=connection.prepareStatement("select * from Policy");
 	   pdResultSet=psmt.executeQuery();
 	   
 	   List<Policy> p=new ArrayList<Policy>();
 	   while(pdResultSet.next()) {
 		   Policy  policy=new Policy();
 		   policy.setPolicy_Number(pdResultSet.getInt("Policy_Number"));
 		   policy.setPolicy_Premium(pdResultSet.getString("Policy_Premium"));
 		   policy.setAccount_Number(pdResultSet.getLong("Account_Number"));
 		   p.add(policy);
 		   
 	   }
 	   return p;
    }
	



	
}
