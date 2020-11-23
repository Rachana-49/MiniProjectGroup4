<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Insurance Claim Registration Page.</title>
</head>
<body style="background-color:powderblue">


<div>
<form action = "indexCheck" method = "post">
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
</div>
</body>
</html>