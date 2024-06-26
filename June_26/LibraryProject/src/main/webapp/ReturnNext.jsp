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
		String user = (String)session.getAttribute("user");
		LibraryDaoImpl impl = new LibraryDaoImpl();
		String[] books= request.getParameterValues("bookid");
		for(String s  : books) {
			int id = Integer.parseInt(s);
			out.println(impl.returnBook(user, id));
		}
	%>
</body>
</html>