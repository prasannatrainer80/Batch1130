<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployForm.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <br/><br/>
			Department : 
			<input type="text" name="dept" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" /> <Br/><Br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<jsp:useBean id="beanEmploy" class="com.java.jsp.EmployBean" />
	<jsp:setProperty property="*" name="beanEmploy"/>
	Result is : 
	<b>
		<%=beanEmploy.showInfo() %>
	</b>
</body>
</html>