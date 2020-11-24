package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.Account;
import com.cg.model.User;
import com.cg.service.AccountService;
import com.cg.service.UserServiceImp;
@WebServlet("/createUser")
public class UserCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserCreationServlet() {
        super();
     
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("passw");
		String role = request.getParameter("role");
		UserServiceImp userService = new UserServiceImp();
		User user1 = new User(uname,pass,role);
		User userCreated = null;
		String userRole = null;
		Account account = new Account();
		AccountService accService = new AccountService();
		Account newAccount = null;
		int accCreated = 0;
		
		try {
			userCreated = userService.addUser(user1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			userRole = userService.getUserRole(user1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(userRole.equalsIgnoreCase("INSURED")) {
			System.out.println("I am In");
			account.setUserName(uname);
			try {
				accCreated = accService.addAccount(account);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		if(accCreated == 1) {
			try {
				newAccount = accService.getAccountDetails();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			writer.println(userCreated.getUserName());
			writer.println(newAccount.getAccountNumber());
		
	}

}
