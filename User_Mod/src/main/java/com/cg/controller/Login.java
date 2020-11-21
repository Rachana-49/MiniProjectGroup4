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

import com.cg.model.UserModule;
import com.cg.service.UserModuleServiceImp;

/**
 * Servlet implementation class Login
 */
@WebServlet("/check")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		String role = request.getParameter("userType");
		UserModuleServiceImp usi = new UserModuleServiceImp();
		UserModule um = new UserModule(uname,pass,role);
		boolean validation = false;
		try {
			validation =  usi.validateUserModule(um);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		if(validation) {
			session.setAttribute("roleCode", role);
			response.sendRedirect("NextPage.jsp"); 
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
