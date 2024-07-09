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
	<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDaoImpl"/>
	<c:set var="genderList" value="${beanEmployDao.showGender()}" />
	<center>
		<form method="get" action="EmployGenderShow.jsp" onchange="submit()">
		Gender is : <select name="gender">
			<option value="Select Gender">Select Gender</option>
			<c:forEach var="gen" items="${genderList}">
				<option value="${gen}">${gen}</option>
			</c:forEach>
		</select>
		</form> <br/><br/><hr/>
		<c:if test="${param.gender!=null}">
			<c:set var="employList" value="${beanEmployDao.showByGender(param.gender)}" />
			<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Basic</th>
		</tr>
		<c:forEach var="employ" items="${employList}">
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