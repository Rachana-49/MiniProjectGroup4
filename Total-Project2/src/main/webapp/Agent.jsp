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
<link rel = "stylesheet" href = "Agent.css">
</head>
<body>
<div class="navbar">
<a href="HomePage.jsp">Home</a>
 <a href="Logout.jsp">Logout</a>
 </div>
<%
	HttpSession Session = request.getSession();
	String userName = (String)session.getAttribute("userName"); 
	AgentServiceImp agentService = new AgentServiceImp();
	List<Agent> insureList = new ArrayList<Agent>();
	insureList = agentService.getAllUsers(userName);
	session.setAttribute("insureList", insureList);
%>
<%if(insureList != null){
	out.print("<h3> Your Insured Users Are.</h3>");
	}
	else{
	out.print("<h3>No Insured Users Assigned.</h3>");
	}%>
		<% for(Agent agent:(List<Agent>)session.getAttribute("insureList")){
		out.print("<table class = 'center'>");	
		out.print("<tr>");
		out.print("<td>"+agent.getUserName()+"</td>");
		out.print("<td><button>View Policy Details</button></td>");
		out.print("</tr>");
		out.print("</table>");
		}
			%>
			</tbody>
		</table>
</body>
</html>