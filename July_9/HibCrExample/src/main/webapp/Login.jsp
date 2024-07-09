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
	<form method="post" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<c:if test="${param.userName !=null && param.passCode !=null}">
		<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDaoImpl" />
		<c:set var="rowCount" value="${beanEmployDao.authenticate(param.userName, param.passCode)}" />
		<c:if test="${rowCount==1}">
			<c:out value="Correct Credentials..." />
		</c:if>
		<c:if test="${rowCount==0}">
			<c:out value="Invalid Credentials..." />
		</c:if>

	</c:if>
</body>
</html>