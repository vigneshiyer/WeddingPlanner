
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.2.1.js"
  integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
  crossorigin="anonymous"></script>
<script
  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
  crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.15/datatables.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.15/datatables.min.css"/>

<script src="/ui/js/viewAllPersons.js"></script>
<script src="/ui/js/editPerson.js"></script>
<script src="/ui/js/addPerson.js"></script>
<script src="/ui/js/deletePerson.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View All Guests</title>
</head>
<body>
<div id="header" style="text-align:center">
	<h2> Wedding Planner for Sowmya and Vignesh </h2>
	<h4 id="countDown"></h4>
</div>
<p align="right">
<button id="addNewPerson" onclick="addPerson();">Add Person</button>
</p>
<div style="width:100%; text-align:center;">
	<table id="tblViewInvitees">
		<thead>
		<tr>
		<th> Name </th>
		<th> Relation </th>
		<th> Address </th>
		<th> Email(s) </th>
		<th> Phone </th>
		<th> 13th </th>
		<th> 14th </th>
		<th> 15th </th>
		<th> Printed </th>
		<th> Email Status </th>
		<th> Call Status </th>
		<th> Action </th>
		</tr>
		</thead>
	</table>
</div>

</body>
</html>