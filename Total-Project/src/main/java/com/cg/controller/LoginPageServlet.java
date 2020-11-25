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

import com.cg.model.User;
import com.cg.service.UserServiceImp;
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
		UserServiceImp userService = new UserServiceImp();
		User user = new User();
		user.setUserName(uname);
		user.setPassword(pass);
		boolean validation = false;
		try {
			validation =  userService.validateUser(user);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
		HttpSession session = request.getSession();
		if(validation) {
			String role = null;
			try {
				role = userService.getUserRole(user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			session.setAttribute("roleCode", role);
			response.sendRedirect("HomePage.jsp"); 
		}
		else {
			}
	}

}
