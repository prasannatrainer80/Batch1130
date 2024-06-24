<%@page import="com.java.lib.Books"%>
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
<form method="get" action="Issue.jsp">
<table border="3">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Author</th>
		<th>Edition</th>
		<th>Department</th>
		<th>Total Books</th>
		<th>Issue Book</th>
	</tr>
<%
	int bid,copies;
	String type = request.getParameter("searchtype");
	String value = request.getParameter("searchvalue");
	LibraryDaoImpl impl = new LibraryDaoImpl();
	List<Books> booksList = impl.showBooks(type, value);
	for(Books book : booksList) {
		bid = book.getId();
		copies = book.getTotalBooks();
%>
	<tr>
		<td><%=book.getId() %> </td>
		<td><%=book.getName() %> </td>
		<td><%=book.getAuthor() %> </td>
		<td><%=book.getEdition() %> </td>
		<td><%=book.getDept() %> </td>
		<td><%=book.getTotalBooks() %> </td>
		<td>
		<%
			if (copies >= 1) {
		%>
		
			<input type="checkbox" name="bookid" value= <%=book.getId() %> />
		<%
			} else {
		%>
			<input type="checkbox" disabled="disabled" name="bookid" value= <%=book.getId() %> />
		
		<%
			}
			%>
			
	
		</td>
	</tr>
<%
	}
%>
</table>
<input type="Submit" value="Issue Books(s)" />
</form>
</body>
</html>