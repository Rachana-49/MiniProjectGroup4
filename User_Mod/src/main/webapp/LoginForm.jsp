<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "LoginForm.css">
<title>JSP Page</title>
</head>
<<<<<<< HEAD
<body style="background-color:powderblue">


<div>
<form action = "indexCheck">
<div align = "center">



  <h1>LOGIN</h1>
  <tr>
    <td><label for="username">USERNAME&nbsp;&nbsp;</label>
    <input type="text" name="uname" id="uname"><br></td>
  </tr>
  <br>
<tr>
    <td><label for="password">PASSWORD&nbsp;&nbsp;</label>
   <input type="password" name="password" id="password"><br></td>
   </tr>
   <br>
   <td>
   <label for = "userType">USER TYPE&nbsp;&nbsp;</label>
   <tr><select id="user" name="userType">
	<option value="none"></option>
	<option value="INSURED">Insured</option>
	<option value="CLAIM HANDLER">Claim Handler</option>
	<option value="CLAIM ADJUSTER">Claim Adjuster</option>
	
	</select>
	</tr>
	</td>
  </br><div align="center"><br>
   <button type="submit" value="Login">LOGIN </div>
   
  </div>
  
 
</form>
=======
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
>>>>>>> branch 'master' of https://github.com/Rachana-49/MiniProjectGroup4.git
</div>
</body>
</html>
