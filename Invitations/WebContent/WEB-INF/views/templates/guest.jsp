<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="guest_${person.personId}">
	<div id="name"> 
		<span><strong>${person.name}</strong></span>	
	</div>
	<div id="streetaddress"> 
		<span>${person.streetAddress}</span>	
	</div>
	<div id="cityState"> 
		<span>${person.city}, ${person.state} </span>	
	</div>
	<div id="pincode">
		<span>${person.pincode}</span>
	</div>
	<c:choose>
	<c:when test="${not empty person.phone}">
	<div id="phone"> 
		<span>Phone: ${person.phone}</span>	
	</div>
	</c:when>	
	</c:choose>
	
</div>