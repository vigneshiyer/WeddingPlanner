<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="noOfPersons" value="${listOfPersonsList}"></c:set>
<table class="table">
<c:forEach items="${listOfPersonsList}" var="list" varStatus="loop">
	<c:set var="personList" value="${list}" scope="request"/>
	<jsp:include page="guestRow.jsp"/>
</c:forEach>  
</table>