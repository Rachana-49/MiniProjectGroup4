<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page Creation</title>
<link rel = "stylesheet" href = "UserCreate.css">
</head>
<body>
<div class="navbar">
  <a href="#logout">Logout</a>
  <a href="#home">Home</a>
</div>
<div class = "wrap">
	<form action="/any action" method="post">
		<div class="container">
			<h1>LOGIN</h1>
			<hr>
			<lable for="username"><b>User Name</b></lable>
			<input type="text" name="uname" id="uname">
			<lable for="psw"><b>Password</b></lable>
			<input type="text" name="password" id="password">
			<lable for="role"><b>Role</b></lable>
			<input type="text" name="role" id="role">
			<button type="submit" class="btn">Register</button>
		</div>
	</form>
</div>
</body>
</html>