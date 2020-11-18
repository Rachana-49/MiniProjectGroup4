package com.cg.services;

import java.sql.SQLException;
import java.util.List;

import com.cg.dao.ClaimRepoImp;
import com.cg.model.Claim;

public class ClaimSevicesImp implements IClaimService {
	ClaimRepoImp repo = new ClaimRepoImp();

	@Override
	public Claim addClaim(Claim claim) throws SQLException {
		// TODO Auto-generated method stub
		return repo.addClaim(claim);
	}

	@Override
	public List<Claim> getAllClaim() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllClaim();
	}

}
