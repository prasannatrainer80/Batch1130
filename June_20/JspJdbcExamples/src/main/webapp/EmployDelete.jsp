<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployDelete.jsp">
		<center>
			Employ Delete : 
			<input type="number" name="empno" /> <Br/><br/>
			<input type="submit" value="Delete" /> 
		</center>
	</form>
	<%
	if (request.getParameter("empno")!=null) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice", 
							"root", "root");
		String cmd = "Delete from Employ Where Empno = ?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(request.getParameter("empno")));
		pst.executeUpdate();
		out.println("Employ Record Deleted...");
	}
	%>
</body>
</html>