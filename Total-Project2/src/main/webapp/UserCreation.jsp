<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "UserCreation.css">
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page Creation</title>
</head>
<body >
<div class="navbar">
<a href="HomePage.jsp">Home</a>
 <a href="Logout.jsp">Logout</a>
 </div>
<div class = "wrap">
	<form action="createUser" method="post">
		<div class="container">
			<h1>LOGIN</h1>
			<hr>
			<lable for="username"><b>User Name</b></lable>
			<input type="text" name="uname" id="uname">
			<lable for="psw"><b>Password</b></lable>
			<input type="text" name="passw" id="passw">
			<lable for="role"><b>Role</b></lable>
			<input type="text" name="role" id="role">
			<button type="submit" class="btn">Register</button>
		</div>
	</form>
</div>



</body>
</html>