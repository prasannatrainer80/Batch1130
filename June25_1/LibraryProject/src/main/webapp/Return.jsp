<%@page import="com.java.lib.TranBook"%>
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
<%
	LibraryDaoImpl impl = new LibraryDaoImpl();
	String user = (String)session.getAttribute("user");
	List<TranBook> transList = impl.showBooksByUser(user);
%>
<form method="get" action="ReturnNext.jsp">
	<table border="3" align="center">
		<tr>
			<th>Book Id</th>
			<th>User Name</th>
			<th>Issued On</th>
			<th>Return</th>
		</tr>
	<%
		for(TranBook tb : transList) {
	%>
		<tr> 
			<td><%=tb.getBookId() %> </td>
			<td><%=tb.getUserName() %> </td>
			<td><%=tb.getFromDate() %> </td>
			<td>
			<input type="checkbox" name="bookid" value= <%=tb.getBookId() %> />
			</td>
		</tr>
	<%
		}
	%>
	</table> <br/>
	<input type="submit" value="Return Book(s)" />
</form>
</body>
</html>