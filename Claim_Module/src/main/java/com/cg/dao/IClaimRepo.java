package com.cg.dao;

import java.util.*;
import java.sql.SQLException;

import com.cg.model.Claim;

public interface IClaimRepo {
	public Claim addClaim(Claim claim)throws SQLException;
	public List<Claim> getAllClaim()throws SQLException;

}
