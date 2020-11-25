package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cg.model.ClaimQuestions;

public class ClaimQuestionsRepoImp implements IClaimQuestionsRepo{
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	
	public ClaimQuestionsRepoImp() {
		try {
			con = DBUtility.getConnection();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ClaimQuestions> getClaimQuestions(String claimType) throws SQLException {
		
		psmt=con.prepareStatement("select * from ClaimQuestions where claimType = ?");
		psmt.setString(1, claimType);
		rs=psmt.executeQuery();
		List<ClaimQuestions> claimQuesList =new ArrayList<ClaimQuestions>();
		while(rs.next()) {
			ClaimQuestions claimQues = new ClaimQuestions();
			claimQues.setClaimId(rs.getInt("claimId"));
			claimQues.setClaimType(rs.getString("claimType"));
			claimQues.setQuestion(rs.getString("claimQuestion"));
			claimQues.setAnswer1(rs.getString("claimAnswer1"));
			claimQues.setAnswer2(rs.getString("claimAnswer2"));
			claimQuesList.add(claimQues);
		}
		return claimQuesList;
	}




}
