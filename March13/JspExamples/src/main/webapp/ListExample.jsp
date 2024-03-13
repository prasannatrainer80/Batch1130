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
	%>
	<select name="student">
		<option value="Select Item">Select Item</option>
		<%
			for(String s : arrayList) {
		%>
		<option value=<%=s%>><%=s %></option>
		<%		
			}
		%>
	</select>
</body>
</html>