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
	<form method="get" action="DepositAccount.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Deposit Amount : 
			<input type="number" name="depositAmount" /> <Br/><Br/>
			<input type="submit" value="Deposit Amount" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo")!=null && request.getParameter("depositAmount")!=null) {
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
			BankDaoImpl impl = new BankDaoImpl();
			out.println(impl.depositAccount(accountNo, depositAmount));
		}
	%>
</body>
</html>