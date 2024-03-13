<%@page import="com.java.jsp.Customer"%>
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
<table border="3" align="center">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer City</th>
			<th>Customer State</th>
			<th>Customer Bill</th>
		</tr>
<%
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	customerList.add(new Customer(1, "Tarak","Hyderabad","TS",88423));
	customerList.add(new Customer(2, "Adi Lakshmi","Hyderabad","TS",90044));
	customerList.add(new Customer(3, "Pradeep","Chennai","TN",90003));
	customerList.add(new Customer(4, "Sanghavi","Bangalore","KA",88422));
	customerList.add(new Customer(5, "Akhil","Hyderabad","TS",89324));
	customerList.add(new Customer(6, "Ganesh","Bangalore","KA",90422));
	for(Customer customer : customerList) {
%>
			<tr>
				<td><%=customer.getCustomerId() %> </td>
				<td><%=customer.getCustomerName() %> </td>
				<td><%=customer.getCustomerCity() %> </td>
				<td><%=customer.getCustomerState() %> </td>
				<td><%=customer.getCustomerBill() %> </td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>