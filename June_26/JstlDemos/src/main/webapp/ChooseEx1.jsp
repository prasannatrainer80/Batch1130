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
	<c:set var="sno" value="2" />
	<c:choose>
		<c:when test="${sno==1}">
			<c:out value="Hi I am Yegna Jayasimha" />
		</c:when>
		<c:when test="${sno==2}">
			<c:out value="Hi I am Ramesh" />
		</c:when>
		<c:when test="${sno==3}">
			<c:out value="Hi I am Jogesh" />
		</c:when>
		<c:when test="${sno==4}">
			<c:out value="Hi I am BabaSai" />
		</c:when>
		<c:otherwise>
			<c:out value="Invalid Choice..." />
		</c:otherwise>
	</c:choose>
</body>
</html>