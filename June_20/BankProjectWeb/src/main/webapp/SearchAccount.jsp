<%@page import="com.java.bank.Bank"%>
<%@page import="com.java.bank.BankDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="SearchAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			<input type="submit" value="Search Account" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null) {
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			BankDaoImpl impl = new BankDaoImpl();
			Bank bank = impl.searchAccount(accountNo);
			if (bank!=null) {
				out.println("First Name  " +bank.getFirstName() + "<br/>");
				out.println("Last Name  " +bank.getLastName() + "<br/>");
				out.println("City  " +bank.getCity() + "<br/>");
				out.println("State  " +bank.getState() + "<br/>");
				out.println("Amount  " +bank.getAmount() + "<br/>");
				out.println("Cheq Facility  " +bank.getCheqFacil() + "<br/>");
				out.println("Account Type  " +bank.getAccountType() + "<br/><hr/>");
			}
		}
	%>
</body>
</html>