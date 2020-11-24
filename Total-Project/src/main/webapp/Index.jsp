<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "Index.css">
<title>JSP Page</title>
</head>
<body>
<div class = "wrap">
	<form action="indexCheck" method="post">
		<div class="container">
			<h1>LOGIN</h1>
			<hr>
			<lable for="username"><b>User Name</b></lable>
			<input type="text" name="uname" id="uname" pattern= "[A-Za-z]{5,30}"required>
			<lable for="psw"><b>Password</b></lable>
			<input type="password" name="password" id="password" pattern= "[A-Za-z0-9]{5,30}"required>
			<br>
			<lable for="utype"><b>User Type</b></lable>
			<br></br>
			<select id="user"class = "dropdown" name="userType" required>
				<option value=""></option>
				<option value="INSURED">Insured</option>
				<option value="CLAIM HANDLER">Claim Handler</option>
				<option value="CLAIM ADJUSTER">Claim Adjuster</option>
			</select>
			<br></br>
			<button type="submit" class="btn">Login</button>
		</div>
	</form>
</div>
</body>
</html>