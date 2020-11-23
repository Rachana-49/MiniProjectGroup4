package com.cg.ocrs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.ocrs.dao.PolicyDetailsRepoImpl;
import com.cg.ocrs.exception.PolicyDetailsNotFoundException;
import com.cg.ocrs.model.PolicyDetails;

@WebServlet("/policy")
public class PolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
		
			@Override
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int policy_num;
				  policy_num=Integer.parseInt(request.getParameter("Policy_Number")); 
				PolicyDetailsRepoImpl service=new PolicyDetailsRepoImpl();
			      PrintWriter out=response.getWriter();
			  try {
			  
		       System.out.println("i am in");
		     PolicyDetails ps=service.getPolicyByNumber(policy_num);
				  System.out.println("i am in");
				  out.println(ps);
			
			  } catch (SQLException e) {
					e.printStackTrace();
				}
			  catch (PolicyDetailsNotFoundException e) {
					System.err.println(e.getMessage());
				}
			  
			}
}
		
	
			