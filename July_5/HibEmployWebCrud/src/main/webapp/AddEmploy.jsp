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
	<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/> <br/>
			Employ Name :
			<input type="text" name="name" /> <br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			Department : 
			<select name="dept">
				<option value="Dotnet">Dotnet</option>
				<option value="Java">Java</option>
				<option value="Sql">Sql</option>
			</select> <br/><br/>
			Designation : 
			<select name="desig">
				<option value="Junior">Junior</option>
				<option value="Senior">Senior</option>
				<option value="Head">Head</option>
			</select> <br/><Br/>
			Basic : 
			<input type="number" name="basic" /> <br/><Br/>
			<input type="submit" value="Add Employ" />
		</center>
	</form>
	<c:if test="${param.empno!=null && param.basic!=null}">
		<jsp:useBean id="beanEmployDao" class="com.java.hib.EmployDaoImpl" />
		<jsp:useBean id="beanEmploy" class="com.java.hib.Employ" />
		<jsp:setProperty property="*" name="beanEmploy"/>
		<c:out value="${beanEmployDao.addEmployDao(beanEmploy)}" />
		<jsp:forward page="EmployShow.jsp" />
	</c:if>
</body>
</html>