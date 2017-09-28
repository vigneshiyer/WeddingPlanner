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
	<td><form:label path="relation">Relation</form:label></td>
	<td><form:input path="relation"/></td>
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
	<td><form:label path="phone">Phone</form:label></td>
	<td><form:input path="phone"/></td>
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
	<td><form:label path="invited_13">Engagement</form:label></td>
	<td><form:select path="invited_13">
		<form:options items="${invitedMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="invited_14">Wedding</form:label></td>
	<td><form:select path="invited_14">
		<form:options items="${invitedMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="invited_15">Reception</form:label></td>
	<td><form:select path="invited_15">
		<form:options items="${invitedMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="email_status">Email Sent</form:label></td>
	<td><form:select path="email_status">
		<form:options items="${emailMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="phone_status">Phone Called</form:label></td>
	<td><form:select path="phone_status">
		<form:options items="${phoneMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="invitation_printed">Invitation Printed</form:label></td>
	<td><form:select path="invitation_printed">
		<form:options items="${printedMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td><form:label path="ignore_for_print">Ignore for print</form:label></td>
	<td><form:select path="ignore_for_print">
		<form:options items="${ignorePrintMap}" />
	</form:select>
	</td>
</tr>
<tr>
	<td align="center" colspan="2"><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>
</div>
</body>
</html>