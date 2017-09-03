<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<form:form method="POST" action="/ui/invitations/getaccommodation" modelAttribute="accommodation">
<form:hidden path="accId"/>
<table>
<tr>
	<td><form:label path="accDate">Date:</form:label></td>
	<td><form:input path="accDate"/></td>
</tr>
<tr>
	<c:forEach var="guest" items="${guests}" varStatus="status">
        <form:input path="guest[${status.index}].name" id="name" value="" />
        <form:input path="guest[${status.index}].gender" id="gender" value="" />
    </c:forEach>
</tr>
</table>
</form:form>
</body>
</html>