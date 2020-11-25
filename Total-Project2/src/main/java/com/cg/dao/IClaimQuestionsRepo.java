package com.cg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.ClaimQuestions;


public interface IClaimQuestionsRepo {
	public List<ClaimQuestions> getClaimQuestions(String claimType) throws SQLException;
}
