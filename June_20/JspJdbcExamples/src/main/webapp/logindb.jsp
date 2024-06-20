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
<form method="get" action="logindb.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" />
			<br/><br/>
			Password :
			<input type="password" name="passCode" />
			<br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passCode")!=null) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passCode");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice", 
								"root", "root");
			String cmd = "select count(*) cnt from UserData Where UserName = ? AND PassCode = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			int count = rs.getInt("cnt");
			out.println("Count is  " +count);
			if (count==1) {
				out.println("Correct Credentials...");
			} else {
				out.println("Invalid Credentials...");
			}
		}
	%>
</body>
</html>