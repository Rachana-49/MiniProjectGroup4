package com.cg.dao;

import java.awt.List;
import java.sql.SQLException;

import com.cg.model.Claim;

public interface IinsuranceClaim {
	Claim addBusinessSegment(Claim businessSegment) throws SQLException;
	//List<Claim> getAllClaim() throws SQLException;
}
