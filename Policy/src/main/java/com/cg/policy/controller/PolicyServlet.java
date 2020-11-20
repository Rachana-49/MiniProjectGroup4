package com.cg.policy.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.policy.model.*;
import com.cg.policy.service.IPolicyService;
import com.cg.policy.service.PolicyServiceImpl;
import com.sun.tools.javac.util.List;

/**
 * Servlet implementation class PolicyServlet

 */
@WebServlet("/viewpolicylist")
public class PolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IPolicyService service;
	@Override
	public void init() throws ServletException {
		service = new PolicyServiceImpl();
	}
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		if(uri.contains("/viewpolicy")) {
			try {
				viewPolicy(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
			
		}
		else if(uri.contains("/view-all")) {
			try {
				viewAllPolicy(request, response);
			} catch (SQLException e) {
				response.sendError(500);
			}
		}
		}
		

protected void viewPolicy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			Integer policynumber=parseInt(request.getParameter("tpolicynumber"));
			Policy policy=service.addPolicy(policynumber);
			HttpSession ssn=request.getSession();
			ssn.setAttribute("policy", policy);
			response.sendRedirect("policy.jsp");	
	}


private Integer parseInt(String parameter) {
	// TODO Auto-generated method stub
	return null;
}
protected void viewAllPolicy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

List<Policy> policy=(List<Policy>) service.getAllPolicy();
HttpSession ssn=request.getSession();
ssn.setAttribute("policy", policy);
response.sendRedirect("policy.jsp");	
}
	
	
	
	
}

	
	
       
   