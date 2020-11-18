package com.cg.services;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.ClaimDetailsRepoImp;
import com.cg.model.ClaimDetails;

public class ClaimDetailsServicesImpl implements IClaimDetailsService {
	ClaimDetailsRepoImp repo = new ClaimDetailsRepoImp();

	@Override
	public ClaimDetails addClaimDetails(ClaimDetails claimDetails) throws SQLException {
		// TODO Auto-generated method stub
		
		return repo.addClaimDetails(claimDetails);
	}

	@Override
	public List<ClaimDetails> getAllClaimDetails() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllClaimDetails();
	}

}
