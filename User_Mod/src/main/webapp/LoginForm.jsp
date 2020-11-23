<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "NewFile.css">
<title>JSP Page</title>
</head>
<body>
<div class = "wrap">
	<form action="/any action" method="post">
		<div class="container">
			<h1>LOGIN</h1>
			<hr>
			<lable for="username"><b>User Name</b></lable>
			<input type="text" name="uname" id="uname">
			<lable for="psw"><b>Password</b></lable>
			<input type="text" name="password" id="password">
			<lable for="utype"><b>User Type</b></lable>
			<br></br>
			<select id="user" name="userType">
				<option value="none"></option>
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
</body>
</html>