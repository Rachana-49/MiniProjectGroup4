package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.model.ClaimDetails;

public class ClaimDetailsRepoImp implements IClaimDetailsRepo{

	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	@Override
	public ClaimDetails addClaimDetails(ClaimDetails claimDetails) throws SQLException {
		// TODO Auto-generated method stub
		psmt=con.prepareStatement("insert into student values(?,?,?)");
		psmt.setInt(1, claimDetails.getId());
		psmt.setString(2, claimDetails.getClaimType());;
		psmt.setString(3, claimDetails.getClaimQuestion());
		
		psmt.executeUpdate();
		return claimDetails;
	}

	@Override
	public List<ClaimDetails> getAllClaimDetails() throws SQLException {
		// TODO Auto-generated method stub
		psmt=con.prepareStatement("select * from claim");
		
		rs=psmt.executeQuery();
		
		List<ClaimDetails> claimDetailsList=new ArrayList<>();
		ClaimDetails claimDetails = new ClaimDetails();
		while(rs.next()) 
		{
		claimDetails.setId(rs.getInt("id"));
		claimDetails.setClaimType(rs.getString("claimType"));
		claimDetails.setClaimQuestion(rs.getString("claimQuestion"));
		
		claimDetailsList.add(claimDetails);
		}
		
		return claimDetailsList;
	}

}
