<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="personRows" value="${personList}" scope="request"/>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.15/datatables.min.js"></script>
<script src="/ui/js/viewAllPersons.js"></script>
<script src="/ui/js/editPerson.js"></script>
<script src="/ui/js/addPerson.js"></script>
<script src="/ui/js/deletePerson.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.15/datatables.min.css"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<tr >
<c:forEach items="${personRows}" var="ele">
	<c:set var="person" value="${ele}" scope="request"/>
	<td> <jsp:include page="guest.jsp"/>
</c:forEach>
</tr>