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
	<form method="get" action="EmployUpdate.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <Br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<input type="text" name="gender" /> <br/><br/>
			Department : 
			<input type="text" name="dept" /> <Br/><br/>
			Designation : 
			<input type="text" name="desig" /> <Br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><Br/>
			<input type="submit" value="Update Employ" />
		</center>
	</form>
	<%
	if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice", 
							"root", "root");
		String cmd = "Update Employ Set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? "
				 + " Where Empno = ?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setInt(6, Integer.parseInt(request.getParameter("empno")));
		pst.setString(1, request.getParameter("name"));
		pst.setString(2, request.getParameter("gender"));
		pst.setString(3, request.getParameter("dept"));
		pst.setString(4, request.getParameter("desig"));
		pst.setDouble(5, Double.parseDouble(request.getParameter("basic")));
		pst.executeUpdate();
		out.println("Employ Record Updated...");
	}
	%>
</body>
</html>