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


					
					<h3><b><%=claimQues.getQuestion() %></b></h3>
					
					<h4><input type = "radio" value = "answer1" name ="<%=claimQues.getQuestion() %>">
					<%=claimQues.getAnswer1() %></h4>
					<h4><input type = "radio" value = "answer2" name ="<%=claimQues.getQuestion() %>">
					<%=claimQues.getAnswer2() %></h4>
					<%} %>

<button type="button">Submit</button>
		
</body>
</html>