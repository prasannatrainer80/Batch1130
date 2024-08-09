<%@page import="com.java.lms.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="3">
	<tr>
		<th>My Details </th>
		<td>  <Br/>
			Employ Id : <b>
			${employList.get(0).getEmpId() } </b><br/>
			Employ Name : <b> ${employList.get(0).getEmpName() } </b><br/>
			Employ Email : <b> ${employList.get(0).getEmpEmail() } </b> <Br/>
			Mobile NO : <b> ${employList.get(0).getMobileNo() } </b> <Br/>
			Date Of Join : <b> ${employList.get(0).getDateOfJoin() } </b> <Br/>
			Manager Id : <b> ${employList.get(0).getManagerId() } </b> <Br/>
			Leave Avail <b> ${employList.get(0).getLeaveAvail() } </b> <Br/>
		</td>
		
		<th>My Manager Details </th>
		<td> <Br/>
		Manager Id : <b>
			${employList.get(1).getEmpId() } </b><br/>
			Employ Name : <b> ${employList.get(1).getEmpName() } </b><br/>
			Employ Email : <b> ${employList.get(1).getEmpEmail() } </b> <Br/>
			Mobile NO : <b> ${employList.get(1).getMobileNo() } </b> <Br/>
			Date Of Join : <b> ${employList.get(1).getDateOfJoin() } </b> <Br/>
			Manager Id : <b> ${employList.get(1).getManagerId() } </b> <Br/>
			Leave Avail <b> ${employList.get(1).getLeaveAvail() } </b> <Br/>
		</td>
	</tr>
	</table>
</body>
</html>