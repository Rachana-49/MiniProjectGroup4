package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.exception.InvalidCredentialsException;
import com.cg.model.UserRole;
import com.cg.service.UserRoleServiceImp;
@WebServlet("/indexCheck")
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginPageServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		String role = request.getParameter("userType");
		UserRoleServiceImp userService = new UserRoleServiceImp();
		UserRole user = new UserRole(uname,pass,role);
		boolean validation = false;
		try 
		{
			validation =  userService.validateUserRole(user);
			} 
		catch (InvalidCredentialsException e) 
		{
			e.printStackTrace();
		}
				
			
		
		HttpSession session = request.getSession();
		if(validation) {
			session.setAttribute("roleCode", role);
			response.sendRedirect("HomePage.jsp"); 
		}
		else {
			}
	}

}
