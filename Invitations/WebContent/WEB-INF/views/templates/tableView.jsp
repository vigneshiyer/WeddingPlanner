<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1" cellspacing="10" cellpadding="20">
<c:forEach items="${listOfPersonsList}" var="list" varStatus="loop">
	<c:set var="personList" value="${list}" scope="request"/>
	<jsp:include page="guestRow.jsp"/>
</c:forEach>  
</table>