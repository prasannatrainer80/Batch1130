<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	int a;
	double b;
	String str;
%>
<%
	a=15;
	b=22.5;
	str="Sonix Hyderabad";
	
	out.println("A value is  " +a+ "<br/>");
	out.println("B Value is  " +b+ "<br/>");
	out.println("Name is  " +str+ "<br/>");
%>
</body>
</html>