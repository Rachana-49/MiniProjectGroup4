<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,javax.servlet.*,javax.servlet.annotation.WebServlet"%>
<!DOCTYPE html>
<html>
<body>
<%
	   
		String reason = request.getParameter("r");
      String claim = request.getParameter("cl");   
	    PrintWriter out1 = response.getWriter();
	    out1.print(reason);
%>

</body>
</html>