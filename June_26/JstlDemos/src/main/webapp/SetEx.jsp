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
	<c:set var="empno" value="1" />
	<c:set var="name" value="Prasanna" />
	<c:set var="gender" value="MALE" /> 
	<c:set var="dept" value="Java" />
	<c:set var="desig" value="Programmer" />
	<c:set var="basic" value="88323" />
	Employ No :  <b>
	<c:out value="${empno}" /> </b> <br/>
	Employ Name : <b>
		<c:out value="${name}" /> 
	</b> <br/>
	Gender : 
	<b>
		<c:out value="${gender}" />
	</b> <br/>
	Department : 
	<b>
		<c:out value="${dept}" />
	</b> <br/>
	Designation : 
	<b>
		<c:out value="${desig}" />
	</b> <br/>
	Basic : 
	<b>
		<c:out value="${basic}" />
	</b>
</body>
</html>