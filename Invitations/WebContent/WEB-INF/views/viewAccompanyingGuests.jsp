<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/ui/js/viewGuests.js"></script>
</head>
<body onload="viewGuestsFor(${person.personId});">
<div style="width:100%; text-align:center;">
	<table id="tblViewGuests">
		<thead>
		<tr>
		<th> Name </th>
		<th> Gender </th>
		<th> Action </th>
		</tr>
		</thead>
	</table>
</div>
</body>
</html>