<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanHello" class="com.java.jsp.HelloBean" />
	Default Message : 
	<b>
		<jsp:getProperty property="greeting" name="beanHello"/>
	</b>	
	<jsp:setProperty property="greeting" name="beanHello" value="Good Afternoon..."/> <br/>
	Updated Message is : 
	<b>
		<jsp:getProperty property="greeting" name="beanHello"/>
	</b>
</body>
</html>