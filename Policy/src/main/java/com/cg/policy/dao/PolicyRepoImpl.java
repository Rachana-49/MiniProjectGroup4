package com.cg.policy.dao;
    import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import com.cg.policy.model.Policy;

	public  class PolicyRepoImpl implements IPolicyRepo{
		PreparedStatement psmt;
	       ResultSet pdResultSet;
	       Connection connection;
	       public PolicyRepoImpl() {
	    	   try {
				connection=DBUtil.createConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
	       public Policy addPolicy(Policy policy) throws SQLException{
	    	   psmt=connection.prepareStatement("insert into Policy  values(?,?,?)");
	    	   psmt.setInt(1, policy.getPolicyNumber());
	    	   psmt.setFloat(2, policy.getPolicyPremium());
	    	   psmt.setInt(3, policy.getAccountNumber());
	    	   
	    	   int count=psmt.executeUpdate();
	    	   return policy;
	    	   }
	       public List<Policy> getAllPolicyDetails() throws SQLException{
	    	   psmt=connection.prepareStatement("select * from Policy");
	    	   pdResultSet=psmt.executeQuery();
	    	   
	    	   List<Policy> p=new ArrayList<Policy>();
	    	   while(pdResultSet.next()) {
	    		   Policy  policy=new Policy();
	    		   policy.setPolicyNumber(pdResultSet.getInt("PolicyNumber"));
	    		   policy.setPolicyPremium(pdResultSet.getFloat("PolicyPremium"));
	    		   policy.setAccountNumber(pdResultSet.getInt("AccountNumber"));
	    		   p.add(policy);
	    		   
	    	   }
	    	   return p;
	       }
		@Override
		public List<Policy> getAllPolicy() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		}


