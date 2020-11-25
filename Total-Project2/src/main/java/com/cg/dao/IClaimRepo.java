package com.cg.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.model.Claim;

public interface IClaimRepo {
	public Claim addClaim(Claim claim)throws SQLException;
	public List<Claim> getAllClaim()throws SQLException;

}
