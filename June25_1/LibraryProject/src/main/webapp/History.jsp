<%@page import="com.java.lib.TransReturn"%>
<%@page import="java.util.List"%>
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
	<br/>
	<%
		String user = (String)session.getAttribute("user");
		LibraryDaoImpl impl = new LibraryDaoImpl();
		List<TransReturn> listTrans = impl.showReturnedBooks(user);
	%>
	<table border="3" align="center">
		<tr>
			<th>User Name</th>
			<th>Book Id</th>
			<th>From Date</th>
			<th> To Date</th>
		</tr>
	<%
		for(TransReturn trs : listTrans) {
	%>
		<tr>
			<td><%=trs.getUserName() %> </td>
			<td><%=trs.getBookId() %> </td>
			<td><%=trs.getFromDate() %> </td>
			<td><%=trs.getToDate() %> </td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>