<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>policy</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
ul{
display: inline;
}
li{
display: inline;
list-style: none;
}
header{
background-color: gray;
}
h1{
color: white;
}
</style>
</head>
<body>
<header>
<h1>policy</h1>
<ul>
<li><a href="policy.jsp">Add policy</a></li>

<li><a href="view-all">View all policy</a></li>
<li><form action="view-Policy" method="get" class="form-inline"><input type="text" name="tpolicynumber"><button type="submit" class="btn-dark">Search policy</button></form></li>
</ul>
</header>
</body>
</html>