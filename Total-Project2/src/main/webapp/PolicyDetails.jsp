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
</head>
<body>
<%
	HttpSession Session = request.getSession();
	String userName = (String)session.getAttribute("userName"); 
	//System.out.println(userName);
	PolicyServiceImp policyService = new PolicyServiceImp();
	List<Policy> policiesList = new ArrayList<Policy>();
	AccountService accountService = new AccountService();
	int accNum = accountService.getAccountNumber(userName);
	//System.out.println(accNum);
	policiesList = policyService.getPolicyDetails(accNum);
	System.out.println(policiesList);
	session.setAttribute("policyList", policiesList);
%>
<table class="table">
			<thead>
				<tr>
					<th>Policy Number        </th>
					<th>Policy Type          </th>
					<th>Policy Premium       </th>
					<th>Account Number       </th>
					<th>CREATE               </th>
				</tr>
			</thead>
			<tbody>
			<% 
				for(Policy policy:(List<Policy>)session.getAttribute("policyList")){
		out.print("<tr>");
		out.print("<td>"+policy.getPolicyNumber()+"</td>");
		out.print("<td>"+policy.getPolicyType() +"</td>");
		out.print("<td>"+policy.getPremium()+"</td>");
		out.print("<td>"+policy.getAccountNumber()+"</td>");
		out.print("<td><button onclick=\"window.location='ClaimCreation.jsp'\">Create Claim</button></td>");
		out.print("</tr>");
		}
			%>
			</tbody>
		</table>
</body>
</html>