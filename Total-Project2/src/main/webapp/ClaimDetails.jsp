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
</head>
<body>
<%HttpSession Session = request.getSession();
String claimType = (String) session.getAttribute("claimType");
List<ClaimQuestions> ques = new ArrayList<>();
ClaimQuestionsServiceImp cs = new ClaimQuestionsServiceImp();
ques = cs.getClaimQuestions(claimType);
session.setAttribute("questionlst", ques);
				for(ClaimQuestions claimQues:(List<ClaimQuestions>)session.getAttribute("questionlst")){
					%>

					<tr>
					<td><b><%=claimQues.getQuestion() %></b>&nbsp&nbsp&nbsp
					<td><%=claimQues.getAnswer1() %>
					<input type = "radio" value = "answer1" name ="<%=claimQues.getQuestion() %>">
					<td>
					&nbsp&nbsp&nbsp&nbsp
					<td><%=claimQues.getAnswer2() %>
					<input type = "radio" value = "answer2" name ="<%= claimQues.getQuestion() %>">
					</td>
					<br>
					</tr>
					<%} %>
					<button type="button">Submit</button>
					</form>
		
</body>
</html>