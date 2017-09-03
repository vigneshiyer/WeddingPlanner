<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div id="divAddPerson">
<form:form method="POST" action="/ui/invitations/addperson" modelAttribute="person">
<form:hidden path="personId"/>
<table>
<tr>
	<td><form:label path="name">Name</form:label></td>
	<td><form:input path="name"/></td>
</tr>
<tr>
	<td><form:label path="streetAddress">Street Address</form:label></td>
	<td><form:input path="streetAddress"/></td>
</tr>
<tr>
	<td><form:label path="city">City</form:label></td>
	<td><form:input path="city"/></td>
</tr>
<tr>
	<td><form:label path="state">State</form:label></td>
	<td><form:input path="state"/></td>
</tr>
<tr>
	<td><form:label path="pincode">Pincode</form:label></td>
	<td><form:input path="pincode"/></td>
</tr>
<tr>
	<td><form:label path="mobilePhone">Mobile</form:label></td>
	<td><form:input path="mobilePhone"/></td>
</tr>
<tr>
	<td><form:label path="landline">Landline</form:label></td>
	<td><form:input path="landline"/></td>
</tr>
<tr>
	<td><form:label path="email1">Email 1</form:label></td>
	<td><form:input path="email1"/></td>
</tr>
<tr>
	<td><form:label path="email2">Email 2</form:label></td>
	<td><form:input path="email2"/></td>
</tr>
<tr>
	<td align="center" colspan="2"><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>
</div>
</body>
</html>