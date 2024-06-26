<%@page import="com.java.lib.SendMail"%>
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
	<%
		LibraryDaoImpl impl = new LibraryDaoImpl();
		String[] bookId = request.getParameterValues("bookid");
		String user = (String)session.getAttribute("user");
		for(String s : bookId) {
			int id = Integer.parseInt(s);
			out.println(impl.issueBook(user, id));
		}
		SendMail.mail("v.rams1997@gmail.com", "Issue Book", "Books are issued Successfully...");
	%>
</body>
</html>