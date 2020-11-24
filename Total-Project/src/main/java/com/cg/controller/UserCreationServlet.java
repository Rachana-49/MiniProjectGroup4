package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.UserRole;
import com.cg.service.UserRoleServiceImp;
@WebServlet("/createUser")
public class UserCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserCreationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("passw");
		String role = request.getParameter("role");
		UserRoleServiceImp userService = new UserRoleServiceImp();
		UserRole user1 = new UserRole(uname,pass,role);
		UserRole userCreated = null;
		try {
			userCreated = userService.addUser(user1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			writer.println(userCreated.getUserName());
		
	}

}
