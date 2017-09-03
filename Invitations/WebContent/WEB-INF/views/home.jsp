<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wedding Invitations</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"> </script>
<script src="/ui/js/addPerson.js"></script>
</head>
<body>
<div>
	<display:table name="${menuList}">
		<display:column property="menuItem" title="" href="a"></display:column>
		<display:column property="url" title=""></display:column>
	</display:table>
</div>
</body>
</html>