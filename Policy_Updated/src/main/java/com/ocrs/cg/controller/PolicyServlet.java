package com.ocrs.cg.controller;

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

import com.ocrs.cg.controller.*;
import com.ocrs.cg.dao.*;
import com.ocrs.cg.model.Policy;



@WebServlet("/view")
public class PolicyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PolicyRepoImpl service=new PolicyRepoImpl();
	  PrintWriter out=response.getWriter();
	  out.println("i am in");
	  try {
		  out.println("i am in");
		  List<Policy> ls=new ArrayList<Policy>();
		  ls=service.getAllPolicy();
		  for(int i=0; i<ls.size(); i++){
			  out.println( ls.get(i));
	}
	  }catch (SQLException e) {
		// TODO Auto-generated catch block
		

		e.printStackTrace();
	}
	}
}
	
	
	
	

	