function viewGuestsFor(personId) {
	
	$.ajax({
		url: '/ui/invitations/viewaccompanyingguestsforperson/'+personId,
		method: 'get',
		dataType: 'json',
		success: function(data) {
			$("#tblViewGuests").dataTable({
				data: data,
				columns: [
					{'data' : 'name'},
					{'data': 'gender'}
				]
			});
			
			var $dialog = $("#tblViewGuests")
			.dialog({
				autoOpen: false,
				title: 'View Guests',
				width: 300,
				height: 400,
				modal: true,
			});	
			$dialog.dialog('open');
			
			
		}
	});
}