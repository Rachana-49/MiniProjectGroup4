package com.cg.services;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Claim;

public interface IClaimService {
	public Claim addClaim(Claim claim)throws SQLException;
	public List<Claim> getAllClaim()throws SQLException;
}
