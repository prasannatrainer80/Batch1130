<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Demo.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/> 
			<input type="submit" value="Show" />
		</center>
	</form>
	<%
		if (request.getParameter("firstName") !=null && 
				request.getParameter("lastName") != null
				) {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String fullName = firstName + " " +lastName;
			out.println("First Name  " +firstName + "<br/>");
			out.println("Last Name  " +lastName + "<br/>");
			out.println("Full Name  " +fullName + "<br/>");
		}
	%>
</body>
</html>