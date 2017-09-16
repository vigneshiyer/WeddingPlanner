<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guest View for ${person.name}</title>
</head>
<body>
<table>
<tr>
<th> Guest Name </th>
<th> Gender </th>
<th> 12-DEC-17 </th>
<th> 13-DEC-17 </th>
<th> 14-DEC-17 </th>
<th> 15-DEC-17 </th>
</tr>
<c:forEach var="guest" items="${person.guest}">
<tr>
<td> ${guest.name}
<td> ${guest.gender} ${guest.accommodations[1].accDate}
<td> 
<c:choose>
<c:when test='${guest.accommodations[0].accDate == "12-DEC-17"}'>
	<input type="checkbox" id="guest${guest.guestId}_12" checked />
</c:when>
<c:otherwise>
	<input type="checkbox" id="guest${guest.guestId}_12" />
</c:otherwise>
</c:choose>
<td> 
<c:choose>
<c:when test='${guest.accommodations[1].accDate == "13-DEC-17"}'>
	<input type="checkbox" id="guest${guest.guestId}_13" checked />
</c:when>
<c:otherwise>
	<input type="checkbox" id="guest${guest.guestId}_131" />
</c:otherwise>
</c:choose>
<td> <input type="checkbox" id="guest${guest.guestId}_14" checked="${guest.accommodations[2].accDate ? true : false}"/>
<td> <input type="checkbox" id="guest${guest.guestId}_15" checked="${guest.accommodations[3].accDate ? true : false}"/>
</tr>
</c:forEach>

</table>
</body>
</html>