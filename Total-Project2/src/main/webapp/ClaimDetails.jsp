<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.cg.model.*" %>
    <%@page import = "com.cg.service.*" %>
    <%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "ClaimDetails.css">
</head>
<body>
<div class="navbar">
<a href="HomePage.jsp">Home</a>
 <a href="Logout.jsp">Logout</a>
 </div>
<%HttpSession Session = request.getSession();
String claimType = (String) session.getAttribute("claimType");
List<ClaimQuestions> ques = new ArrayList<>();
ClaimQuestionsServiceImp cs = new ClaimQuestionsServiceImp();
ques = cs.getClaimQuestions(claimType);
session.setAttribute("questionlst", ques);
				for(ClaimQuestions claimQues:(List<ClaimQuestions>)session.getAttribute("questionlst")){
%>
<table>
					<tr>
					<td><b><%=claimQues.getQuestion() %></b>
					<td><%=claimQues.getAnswer1() %>
					<input type = "radio" value = "answer1" name ="<%=claimQues.getQuestion() %>">
					<td>
					<td><%=claimQues.getAnswer2() %>
					<input type = "radio" value = "answer2" name ="<%= claimQues.getQuestion() %>">
					</td>
					</tr>
					<%} %>
</table>
<button type="button">Submit</button>
		
</body>
</html>