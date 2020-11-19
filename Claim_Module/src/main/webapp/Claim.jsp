<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "stylesheet" href = "Claim.css">
<title>Insert title here</title>
<style>
body{
padding : 25px;
}
</style>
</head>
<body>
	<form action = "/Registration" method = "post">
		
			<table border="1" width="30%" cellpadding="5">
				<thead>
					<tr>
						<th colspan="2">Enter Information Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Claim Reason</td>
						<td><input type="text" name="r" value="" /></td>
					</tr>
					<tr>
						<td>Claim Location</td>
						<td><input type="text" name="cl" value="" /></td>
					</tr>
					<tr>
						<td>Claim City</td>
						<td><input type="text" name="cc" value="" /></td>
					</tr>
					<tr>
						<td>Claim State</td>
						<td><input type="text" name="cs" value="" /></td>
					</tr>
					<tr>
						<td>Zip Code</td>
						<td><input type="text" name="z" value="" /></td>
					</tr>
					<tr>
						<td>Claim Type</td>
						<td><input type="text" name="ct" value="" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit" /></td>
						<td><input type="reset" value="Reset" /></td>
					</tr>
				</tbody>
			</table>
	</form>

</body>
</html>