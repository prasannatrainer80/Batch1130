<%@page import="com.java.lib.LibraryDaoImpl"%>
<%@page import="com.java.lib.LibUsers"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddUser.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passWord" /> <br/><br/>
			ReType Password : 
			<input type="password" name="retypePassword" /> <br/><br/>
			<input type="submit" value="Add User" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passWord")!=null) {
			String pwd = request.getParameter("passWord").trim();
			String retype = request.getParameter("retypePassword").trim();
			if (pwd.equals(retype)) {
				LibUsers users = new LibUsers();
				users.setUserName(request.getParameter("userName"));
				users.setPassWord(request.getParameter("passWord"));
				LibraryDaoImpl impl = new LibraryDaoImpl();
				out.println(impl.createUser(users));
		%>
			<jsp:forward page="Login.jsp" />
		<%
			}
		}
	%>
</body>
</html>