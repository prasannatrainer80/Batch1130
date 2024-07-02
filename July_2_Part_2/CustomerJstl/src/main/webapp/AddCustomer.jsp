<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="AddCustomer.jsp">
		<center>
			Customer Name : 
			<input type="text" name="custName" /> 
			<br/><br/>
			Customer User Name :
			<input type="text" name="custUserName" />
			<br/><br/>
			Customer Email : 
			<input type="email" name="custEmail" /> 
			<br/><br/>
			
			Customer Phone :
			<input type="text" name="custPhoneNo" /> <br/><br/>
			<input type="submit" value="Add Customer" />
		</center>
	</form>
	<c:if test="${param.custName !=null && param.custUserName !=null && param.custEmail !=null 
			&& param.custPhoneNo !=null}">
		<jsp:useBean id="beanCustomer" class="com.java.jstl.Customer" />
		<jsp:setProperty property="*" name="beanCustomer"/>
		<jsp:useBean id="beanCustomerDao" class="com.java.jstl.CustomerDaoImpl" />
		<c:out value="${beanCustomerDao.addCustomerDao(beanCustomer)}" />
	</c:if>
</body>
</html>