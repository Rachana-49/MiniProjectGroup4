package com.cg.services;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.ClaimDetails;

public interface IClaimDetailsService {
	public ClaimDetails addClaimDetails(ClaimDetails claimDetails)throws SQLException;
	public List<ClaimDetails> getAllClaimDetails()throws SQLException;

}
