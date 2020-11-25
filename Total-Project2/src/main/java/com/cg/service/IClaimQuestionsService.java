package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.ClaimQuestions;

public interface IClaimQuestionsService {
	public List<ClaimQuestions> getClaimQuestions(String claimType) throws SQLException;
}
