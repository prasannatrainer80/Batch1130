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
<form method="get" action="WithdrawAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Deposit Amount : 
			<input type="number" name="withdrawAmount" /> <Br/><Br/>
			<input type="submit" value="Withdraw Amount" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null && request.getParameter("withdrawAmount")!=null) {
			BankDaoImpl impl = new BankDaoImpl();
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
			out.println(impl.withdrawAccount(accountNo, withdrawAmount));
		}
	%>
</body>
</html>