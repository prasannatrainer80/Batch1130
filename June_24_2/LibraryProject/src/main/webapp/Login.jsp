<%@page import="com.java.lib.LibraryDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp" />
	<form method="get" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="user" /> <br/><br/>
			Password : 
			<input type="password" name="pwd" /> <Br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("user")!=null && request.getParameter("pwd")!=null) {
			String user = request.getParameter("user").trim();
			String pwd = request.getParameter("pwd").trim();
			LibraryDaoImpl impl = new LibraryDaoImpl();
			int count = impl.authenticateUser(user, pwd);
			if (count==1) {
				session.setAttribute("user", user);
	%>
		<jsp:forward page="Menu.jsp" />
	<%
			} else {
				out.println("Invalid Credentials...");
			}
		}
	%>
</body>
</html>