package com.cg.dao;

import java.sql.*;
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
			con = DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Claim addClaim(Claim claim) throws SQLException {
		// TODO Auto-generated method stub
		psmt=con.prepareStatement("insert into claim values(?,?,?,?,?,?,?,?)");
		psmt.setInt(1, claim.getClaimNumber());
		psmt.setString(2, claim.getClaimReason());
		psmt.setString(3, claim.getAccidentLocationStreet());;
		psmt.setString(4, claim.getAccidentCity());
		psmt.setString(5, claim.getAccidentState());
		psmt.setInt(6, claim.getAccidentZip());
		psmt.setString(7, claim.getClaimType());
		psmt.setInt(8, claim.getPolicyNumber());
		
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
