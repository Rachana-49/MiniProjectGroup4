package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.ClaimQuestionsRepoImp;
import com.cg.model.ClaimQuestions;

public class ClaimQuestionsServiceImp implements IClaimQuestionsService{
	ClaimQuestionsRepoImp repo = new ClaimQuestionsRepoImp();

	@Override
	public List<ClaimQuestions> getClaimQuestions(String claimType) throws SQLException {
		
		return repo.getClaimQuestions(claimType);
	}


	}
