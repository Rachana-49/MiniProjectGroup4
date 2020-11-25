package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.model.Agent;

public class AgentRepoImp implements IAgentRepo {
	Connection con;
	PreparedStatement psmt;
	ResultSet rs = null;
	public AgentRepoImp(){
		try {
			con = DBUtility.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Agent> getAllUsers(String agent) throws SQLException {
		List<Agent> Insurelst = new ArrayList<Agent>();
		psmt = con.prepareStatement("select * from Agent where userName=?");
		psmt.setString(1,agent );
		rs = psmt.executeQuery();
		while(rs.next()) {
			int agentId = rs.getInt("agentId");
			String agentName = rs.getString("userName");
			String Insure = rs.getString("insured");
			Agent insures = new Agent(agentId,agentName,Insure);
			Insurelst.add(insures);
		}
		return Insurelst;
	}

}
