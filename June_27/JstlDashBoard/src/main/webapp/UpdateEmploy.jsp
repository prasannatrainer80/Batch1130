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
	<jsp:useBean id="beanEmployDao" class="com.java.jstl.EmployDaoImpl" />
	<c:set var="employFound" value="${beanEmployDao.searchEmployDao(param.empno)}" />
	<form method="get" action="UpdateEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" value=${employFound.empno} />
			<br/><br/>
			Employ Name : 
			<input type="text" name="name" value=${employFound.name} /> 
			<br/><br/>
			Gender : 
			<input type="text" name="gender" value=${employFound.gender} /> 
			<br/><br/>
			Department : 
			<input type="text" name="dept" value=${employFound.dept} /> 
			<br/><br/>
			Designation : 
			<input type="text" name="desig" value=${employFound.desig} />
			<br/><br/>
			Basic : 
			<input type="number" name="basic" value=${employFound.basic} />
			<br/><br/>
			<input type="submit" value="Update Employ" />
		</center>
	</form>
<c:if test="${param.empno!=null && param.basic !=null}">
	<jsp:useBean id="beanEmploy" class="com.java.jstl.Employ" />
	<jsp:setProperty property="*" name="beanEmploy"/>
	<c:out value="${beanEmployDao.updateEmployDao(beanEmploy)}" />
	<jsp:forward page="EmployTable.jsp" />
</c:if>
</body>
</html>