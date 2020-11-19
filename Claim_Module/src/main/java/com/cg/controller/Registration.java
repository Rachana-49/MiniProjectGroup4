package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/Registration") 
public class Registration extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
		      throws ServletException, IOException { 
		   
			String reason = request.getParameter("r");
	        String claim = request.getParameter("cl");   
		    PrintWriter out = response.getWriter();
		    out.print(reason);
		      

}
}
