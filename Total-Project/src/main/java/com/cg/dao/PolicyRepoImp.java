package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.model.Policy;

public class PolicyRepoImp implements IPolicyRepo {
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	public PolicyRepoImp(){
		try {
			con = DBUtility.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Policy> getPolicyDetails(int accountNumber) throws SQLException {
		List<Policy> policyDetails = new ArrayList<Policy>();
		psmt = con.prepareStatement("select * from policy where accountNumber=?");
		psmt.setLong(1, accountNumber);
		rs = psmt.executeQuery();
		while (rs.next()) {
			long number = rs.getLong("policyNumber");
			String policyType = rs.getString("policyType");
			float premium = rs.getFloat("premium");
			int accountNum = rs.getInt("accountNumber");
			Policy policy = new Policy(number,policyType,premium,accountNum);
			policyDetails.add(policy);
		}
		
		return policyDetails;
	}
	

}
