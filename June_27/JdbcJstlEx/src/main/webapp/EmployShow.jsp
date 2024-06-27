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
	<jsp:useBean id="beanDao" class="com.java.jstl.EmployDaoImpl" />
	<c:set var="employList" value="${beanDao.showEmployDao()}" />
	<table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
	<c:forEach var="emp" items="${employList}">
		<tr>
			<td><c:out value="${emp.empno}" /> </td>
			<td><c:out value="${emp.name}" /> </td>
			<td><c:out value="${emp.gender}" /> </td>
			<td><c:out value="${emp.dept}" /> </td>
			<td><c:out value="${emp.desig}" /> </td>
			<td><c:out value="${emp.basic}" /> </td>
		</tr>
	</c:forEach>
	</table>
</body> 
</html>