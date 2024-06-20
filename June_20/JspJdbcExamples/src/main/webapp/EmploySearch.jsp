<%@page import="java.sql.ResultSet"%>
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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No :
			<input type="number" name="empno" /> <br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		int empno=0;
		if (request.getParameter("empno")!=null) {
			empno = Integer.parseInt(request.getParameter("empno"));
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice", 
							"root", "root");
			String cmd = "select * from Employ Where Empno = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				out.println("Employ No   " +rs.getInt("empno") + "<br/>");
				out.println("Employ Name   " +rs.getString("name") + "<br/>");
				out.println("Gender   " +rs.getString("gender") + "<br/>");
				out.println("Department   " +rs.getString("dept") + "<br/>");
				out.println("Designation   " +rs.getString("desig") + "<br/>");
				out.println("Basic   " +rs.getDouble("basic") + "<br/><hr/>");
			} else {
				out.println("*** Record Not Found ***");
			}
		}
		
	%>
</body>
</html>