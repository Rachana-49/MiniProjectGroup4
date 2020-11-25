package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.model.Claim;

public class ClaimRepoImp implements IClaimRepo {
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;

	public ClaimRepoImp() {
		try {
			con = DBUtility.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Claim addClaim(Claim claim) throws SQLException {
		// TODO Auto-generated method stub
		psmt=con.prepareStatement("insert into claim values(claimNumber.nextval,?,?,?,?,?,?,?)");
		psmt.setString(1, claim.getClaimReason());
		psmt.setString(2, claim.getAccidentLocationStreet());;
		psmt.setString(3, claim.getAccidentCity());
		psmt.setString(4, claim.getAccidentState());
		psmt.setInt(5, claim.getAccidentZip());
		psmt.setString(6, claim.getClaimType());
		psmt.setLong(7, claim.getPolicyNumber());
		
		psmt.executeUpdate();
		return claim;
	}

	@Override
	public List<Claim> getAllClaim() throws SQLException {
		// TODO Auto-generated method stub
psmt=con.prepareStatement("select * from claim");
		
		rs=psmt.executeQuery();
		
		List<Claim> claimList=new ArrayList<>();
		Claim claim = new Claim();
		while(rs.next()) 
		{
		claim.setClaimNumber(rs.getInt("Claim_Number"));
		claim.setClaimReason(rs.getString("Claim_Reason"));
		claim.setAccidentLocationStreet(rs.getString("Accident_Location_Street"));
		claim.setAccidentCity(rs.getString("Accident_City"));
		claim.setAccidentState(rs.getString("Accident_State"));
		claim.setAccidentZip(rs.getInt("Accident_Zip"));
		claim.setClaimType(rs.getString("Claim_Type"));
		
		claimList.add(claim);
		}
		
		return claimList;
	}
	

}
