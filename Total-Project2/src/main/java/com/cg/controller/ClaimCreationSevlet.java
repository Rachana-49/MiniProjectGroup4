package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.model.Claim;
import com.cg.service.ClaimSeviceImp;

public class ClaimCreationSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClaimCreationSevlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClaimSeviceImp cs = new ClaimSeviceImp();
		Claim res = new Claim();
		String clReason = request.getParameter("reason");
		String location = request.getParameter("location");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zip = Integer.parseInt(request.getParameter("Zip"));
		String clType = request.getParameter("claimlist");
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		int policyNumber = (int) session.getAttribute("policyNumber");
		res.setClaimReason(clReason);
		res.setAccidentLocationStreet(location);
		res.setAccidentCity(city);
		res.setAccidentState(state);
		res.setAccidentZip(zip);
		res.setClaimType(clType);
		res.setPolicyNumber(policyNumber);
		Claim result = new Claim();
			 try {
				res = cs.addClaim(res);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 writer.println(res.getAccidentLocationStreet());
			 session.setAttribute("claimType", res.getClaimType());
			 response.sendRedirect("ClaimDetails.jsp"); 
		writer.close();
	}
	}
