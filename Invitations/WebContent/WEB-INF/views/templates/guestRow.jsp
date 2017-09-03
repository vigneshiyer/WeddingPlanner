<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="personRows" value="${personList}" scope="request"/>
<tr>
<c:forEach items="${personRows}" var="ele">
	<c:set var="person" value="${ele}" scope="request"/>
	<td> <jsp:include page="guest.jsp"/>
</c:forEach>
</tr>