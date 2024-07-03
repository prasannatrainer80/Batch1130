<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/hello.tld" prefix="s" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:show>Hello EveryOne How are You</s:show>
	<s:break />
	<s:repeat>This is Test Case</s:repeat>
	<s:break />
	<s:upper>this will come in upper case</s:upper>
	<s:break />
	<s:split>Sudharshan Ramesh Shivakumar Jogeshwar Ramu Raja Naresh</s:split>
	<s:break />
	
	<s:employsearch>1</s:employsearch>
	<s:break />
	<s:employinsert>188 Yegna MALE Java Programmer 99423</s:employinsert>
	<s:employshow />
	<s:break />
</body>
</html>