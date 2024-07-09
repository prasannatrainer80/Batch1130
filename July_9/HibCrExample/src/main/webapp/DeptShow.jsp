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
<center>
	<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDaoImpl" />
	<c:set var="depts" value="${beanEmployDao.showDepts()}" />
	<form method="get" action="DeptShow.jsp" onchange="submit()">
		Select Department : <b><select name="dept">
			<option value="select">Select Department</option>
			<c:forEach var="d" items="${depts}">
				<option value="${d}">${d}</option>
			</c:forEach>
		</select> </b>
	</form>
	<c:if test="${param.dept!=null}">
		<c:set var="deptList" value="${beanEmployDao.showByDeptName(param.dept)}" />
			<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<c:forEach var="employ" items="${deptList}">
			<tr>
				<td>${employ.empno}</td>
				<td>${employ.name}</td>
				<td>${employ.gender}</td>
				<td>${employ.dept}</td>
				<td>${employ.desig}</td>
				<td>${employ.basic}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
</center>
</body>
</html>