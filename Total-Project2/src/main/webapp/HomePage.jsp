<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="navbar">
 <a href="Logout.jsp">Logout</a>
 </div>
<%HttpSession Session = request.getSession();
String roleCode = (String) session.getAttribute("roleCode");
%>
<link rel = "stylesheet" href = "HomePage.css">

<div class="container">
<button id="btnCreateClaim" disabled onclick="window.location='PolicyDetails.jsp'">Create Claim</button>
<button id="btnViewClaim" disabled>View Claim</button>
<button id="btnCreateUser" disabled onclick="window.location='UserCreation.jsp'">Create New Profile</button>
<button id="btnGenerateReport" disabled>Generate Report</button>
</div>
<script type="text/javascript">
var roleCode='<%=roleCode%>';
switch(roleCode){
	case 'Insured':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'CLAIM HANDLER':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		break;
	case 'CLAIM ADJUSTER':
		document.getElementById('btnCreateClaim').disabled=false;
		document.getElementById('btnViewClaim').disabled=false;
		document.getElementById('btnCreateUser').disabled=false;
		document.getElementById('btnGenerateReport').disabled=false;
		break;
}


</script>
</body>
</html>