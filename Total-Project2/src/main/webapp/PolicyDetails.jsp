<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.cg.service.*"%>
    <%@ page import = "java.util.*" %>
     <%@ page import = "com.cg.model.*" %>
     <%@page import = "javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "PolicyDetails.css">
</head>
<body>
<div class="navbar">
<a href="HomePage.jsp">Home</a>
 <a href="Logout.jsp">Logout</a>
 </div>
<%
	HttpSession Session = request.getSession();
	String userName = (String)session.getAttribute("userName"); 
	String roleCode = (String)session.getAttribute("roleCode"); 
	System.out.println(userName);
	if(roleCode.equalsIgnoreCase("Claim Adjuster")){
		System.out.println("I am In.");
		response.sendRedirect("Agent.jsp");
	}
	PolicyServiceImp policyService = new PolicyServiceImp();
	List<Policy> policiesList = new ArrayList<Policy>();
	AccountService accountService = new AccountService();
	int accNum = accountService.getAccountNumber(userName);
	//System.out.println(accNum);
	policiesList = policyService.getPolicyDetails(accNum);
	System.out.println(policiesList);
	session.setAttribute("policyList", policiesList);
%>
			<table class = "center">
		
				<tr>
					<th>Policy Number &nbsp;&nbsp;&nbsp;</th>
					<th>Policy Type &nbsp;&nbsp;&nbsp;</th>
					<th>Policy Premium &nbsp;&nbsp;&nbsp;</th>
					<th>Account Number &nbsp;&nbsp;&nbsp;</th>
					<th>CREATE &nbsp;</th>
				</tr>
			
			
			<% 
				for(Policy policy:(List<Policy>)session.getAttribute("policyList")){
		out.print("<tr>");
		out.print("<td>"+policy.getPolicyNumber()+"</td>");
		out.print("<td>"+policy.getPolicyType() +"</td>");
		out.print("<td>"+policy.getPremium()+"</td>");
		out.print("<td>"+policy.getAccountNumber()+"</td>");
		out.print("<td><button onclick=\"window.location='ClaimCreation.jsp?policyNum="+policy.getPolicyNumber()+"'\">Create Claim</button></td>");
		out.print("</tr>");
		}
			%>
		
		</table>
</body>
</html>