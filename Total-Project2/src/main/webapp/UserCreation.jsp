<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page Creation</title>
<style>
table.center {
  margin-left: auto; 
  margin-right: auto;
}
h1 {
  color: green;
}
body {
  color: maroon;
}
button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 17px;
  text-align: center;
  margin: 2px 1px;
  cursor: pointer;
}
</style>
</head>
<body style="background:pink">
<div align="center"><h1>Create Your User Page</h1></div>
<table class="center">
<form action="createUser" method="post">
<tr>
<td>User Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td>Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type="text" name="passw"></td>
</tr>
<tr>
<td>Role &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type="text" name="role"></td>
</tr>
<tr>
<td><div align="center"><button type="Submit" value="Register">Register</button></div>
</td>
</tr>
</form>
</table>
</body>
</html>