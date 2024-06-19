<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int firstNo = Integer.parseInt(request.getParameter("firstNo"));
			int secondNo = Integer.parseInt(request.getParameter("secondNo"));
			int result = firstNo + secondNo;
			out.println("Sum is  " +result+ "<br/>");
			result = firstNo - secondNo;
			out.println("Sub is  " +result + "<br/>");
			result = firstNo * secondNo;
			out.println("Mult is  " +result + "<br/>");
%>
</body>
</html>