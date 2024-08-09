<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <table border="3" align="center">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Email</th>
			<th>MobileNo</th>
			<th>DateOfJoin</th>
			<th>Manager Id</th>
			<th>LeaveAvail</th>
			<th>Show Info</th>
		</tr>
		<c:forEach var="employ" items="${employList}">
			<tr>
					<td>${employ.getEmpId() } </td>	
					<td>${employ.getEmpName() } </td>
					<td>${employ.getEmpEmail() } </td>
					<td>${employ.getMobileNo() } </td>
					<td>${employ.getDateOfJoin() } </td>
					<td>${employ.getManagerId() } </td>
					<td>${employ.getLeaveAvail() } </td>
					<td><a href="dashBoard?empId=${employ.getEmpId()}">Show Info</a> </td>
			</tr>
		</c:forEach>
    </table>

    </body>
</html>
