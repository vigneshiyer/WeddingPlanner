$().ready(function() {
	var today = new Date();
	var theDay = new Date("2017/12/14");
	var diff = new Date(theDay - today);
	
	$("#countDown").text(Math.round(diff/1000/60/60/24) + " days to go");
	
	$.ajax({
		url: '/ui/invitations/getallpersons',
		method: 'get',
		dataType: 'json',
		success: function(data) {
			$("#tblViewInvitees").dataTable({
				data: data,
				columns: [
					{'data' : 'name'},
					{
						'data': 'streetAddress',
						'sorting': false,
						'render': function(data, type, full) {
							return data + ", " + full['city'] + ", " 
							+ full['state'] + ", " + full['pincode']
						}
					},
					{
						'data': 'email1',
						'sorting': false,
						'render': function(data, type, full) {
							if (!full['email2']) {
								return data;
							} else {
								return data + ", " + full['email2'];
							}
						}
					},
					{
						'data': 'mobilePhone',
						'sorting': false,
						'render': function(data, type, full) {
							if (!data && !full['landline']) {
								return "N/A";
							} else if (!full['landline']) {
								return data;
							} else {
								return data + ", " + full['landline'];
							}
						}
					},
					{
						'data': 'personId',
						'sorting': false,
						'render': function(data) {
							return "<button onClick='viewGuestsFor("+data+");'> Manage </button>";
						}
					},
					{
						'data': 'personId',
						'sorting': false,
						'render': function(data) {
							return "<button onClick='editPerson("+data+");'> " +
									"Edit </button> <br/> " +
									"<button onClick='deletePerson("+data+");'> " +
											"Delete </button>";
						}
					}
				]
			});
		}
	});
});