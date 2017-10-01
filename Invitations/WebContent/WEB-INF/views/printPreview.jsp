<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guest Entries</title>
<script
  src="https://code.jquery.com/jquery-3.2.1.js"
  integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
  crossorigin="anonymous"></script>

<!-- Bootstrap
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/ui/css/main.css"> -->

<script src="/ui/js/printPreview.js"></script>
</head>
<body>
<p align=right>
<c:out value="Showing ${numberOfPersons} persons on a page"/> <br/> 
Page: <span id="page">${pagenum}</span> <br/>
<button id="brnPrint" class="btn-info" onclick="window.print();">Print</button> &nbsp;
<button id="btnPrev" value ="<- Previous" class="btn-info" onclick="prev();"><- Previous</button> &nbsp;
<button id="btnNext" value ="Next ->" class="btn-info" onclick="next();">Next -></button>
</p>
<div id="previewContent">
<jsp:include page="templates/tableView.jsp"></jsp:include>
</div>
</body>
</html>