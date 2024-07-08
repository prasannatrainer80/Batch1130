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
	<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDaoImpl" />
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
<c:if test="${param.empno!=null}">
	<c:set var="empno" value="${param.empno}" />
	<c:set var="employFound" value="${beanEmployDao.searchByEmpno(empno)}" />
	<c:if test="${employFound!=null}">
	Employ No : <b>
		<c:out value="${employFound.empno}" /> </b> <br/>
	Employ Name : <b>
		<c:out value="${employFound.name}" /> </b> <br/>
	Gender : <b>
		<c:out value="${employFound.gender}" /> </b> <br/>
	Department : <b>
		<c:out value="${employFound.dept}" /> </b> <br/>
	Designation : <b>
		<c:out value="${employFound.desig}" /> </b> <br/>
	Basic : <b>
		<c:out value="${employFound.basic}" /> </b> <br/>
		
	</c:if>
</c:if>
</body>
</html>