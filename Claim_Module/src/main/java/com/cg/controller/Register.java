package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.Claim;
import com.cg.services.ClaimSevicesImp;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClaimSevicesImp cs = new ClaimSevicesImp();
		Claim res = new Claim();
		String r = request.getParameter("reason");
		String l = request.getParameter("location");
		String ct = request.getParameter("city");
		String s = request.getParameter("state");
		int z = Integer.parseInt(request.getParameter("Zip"));
		String cl = request.getParameter("claimlist");
		int cn = 1;
		int pn = 3;
		PrintWriter writer = response.getWriter();
		writer.println(r+l);
		Claim c = new Claim(cn,r,l,ct,s,z,cl,pn);
		writer.println(c.getAccidentCity());
		
			 try {
				res = cs.addClaim(c);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		writer.close();
	}

}
