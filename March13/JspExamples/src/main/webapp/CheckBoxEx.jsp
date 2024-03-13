<%@page import="java.util.ArrayList"%>
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
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("Harsha");
	arrayList.add("Satish");
	arrayList.add("Likthith");
	arrayList.add("Meghana");
	arrayList.add("Pradeep");
	for(String s : arrayList) {
%>
	<input type=checkbox name="chkStudent" value=<%=s %> /> <%=s %> <br/>
<%
	}
%>

</body>
</html>