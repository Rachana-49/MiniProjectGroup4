<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession Session = request.getSession();
String roleCode = (String) session.getAttribute("roleCode");
%>
<button id="btnCreateClaim" disabled>Create Claim</button>
<button id="btnViewClaim" disabled>View Claim</button>
<button id="btnCreateUser" disabled>Create User</button>
<button id="btnGenerateReport" disabled>Generate Report</button>

<script type="text/javascript">
var roleCode='<%=roleCode%>';
switch(roleCode){
	case 'INSURED':
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