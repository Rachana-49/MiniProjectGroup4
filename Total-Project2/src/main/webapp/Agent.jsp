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
<%
	HttpSession Session = request.getSession();
	String userName = (String)session.getAttribute("userName"); 
	AgentServiceImp agentService = new AgentServiceImp();
	List<Agent> insureList = new ArrayList<Agent>();
	insureList = agentService.getAllUsers(userName);
	session.setAttribute("insureList", insureList);
%>
		<% for(Agent agent:(List<Agent>)session.getAttribute("insureList")){
		out.print("<tr>");
		out.print("<td>"+agent.getUserName()+"</td>");
		out.print("<td><button>View Claim Details</button></td>");
		out.print("</tr>");
		}
			%>
			</tbody>
		</table>
</body>
</html>