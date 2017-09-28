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
				lengthMenu: ["50", "100", "200"],
				data: data,
				columns: [
					{'data' : 'name'},
					{'data' : 'relation',
						'sorting': false
					},
					{
						'data': 'streetAddress',
						'sorting': false,
						'render': function(data, type, full) {
							var str = data + ", " + full['city'] + ", " 
							+ full['state'] + ", " + full['pincode'];
							return "<p style='word-break: break-all;white-space: normal;'>"+str+"</p>";
						}
					},
					{
						'data': 'email1',
						'sorting': false,
						'render': function(data, type, full) {
							if (!full['email2']) {
								return "<p style='word-break: break-all;white-space: normal;'>"+data+"</p>";
							} else {
								return "<p style='word-break: break-all;white-space: normal;'>"+data + ", " + full['email2']+"</p>";
							}
						}
					},
					{
						'data': 'phone',
						'sorting': false
						
					},
					{'data': 'invitation_printed',
									'sorting': false},
					{'data': 'email_status',
										'sorting': false},
					{'data': 'phone_status',
					 'sorting': false
					 },
					 {'data': 'ignore_for_print',
						 'sorting': false
						 },
					/*{
						'data': 'personId',
						'sorting': false,
						'render': function(data) {
							return "<a href='/ui/invitations/guestsFor("+data+");'> Manage </a>";
						}
					}*/
					{
						'data': 'personId',
						'sorting': false,
						'render': function(data) {
							return "<button onClick='editPerson("+data+");'> " +
									"Edit </button> <br/> " +
									"<button style='visibility:hidden;' onClick='deletePerson("+data+");'> " +
											"Delete </button>";
						}
					}
				]
			});
		}
	});
});