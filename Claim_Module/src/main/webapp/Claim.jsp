<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "Claim.css">
<title>Claim</title>
</head>
<body style="background:powderblue">
	<div align="center"><h1>Register Your Claim</h1></div>
		<table class="center">
			<form action = "NewFile.jsp" method = "post">	
				<tr>
					<td>Claim Reason &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" name="reason" pattern="[A-za-z]{30}"></td>
				</tr>
				<tr>
					<td>Accident Location &nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" name="location"></td>
				</tr>
				<tr>
					<td>Accident City &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td>Accident State &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" name="state"></td>
				</tr>
				<tr>
					<td>Accident Zip &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="text" name="Zip"></td>
				</tr>
				<tr>
					<td>Claim Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><select id="claims" name="claimlist">
					<option value="none"></option>
				  	<option value="Accident">Accident</option>
				  	<option value="Home">Home</option>
				  	<option value="Vechile">Vechile</option>
				  	<option value="Education">Education</option>
					</select></td>
				</tr>
				<tr>
					<td><button type="Submit" form="NewFile.jsp" value="Submit">Submit</button>
					<button type="Reset" value="reset">Reset</button>
				</tr>
			</form>
		</table>
	</body>
</html>