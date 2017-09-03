function editPerson(id) {
	var $dialog = $('<div></div>')
	.load('/ui/invitations/edit/'+id)
	.dialog({
		autoOpen: false,
		title: 'Edit Person',
		width: 300,
		height: 400,
		modal: true,
	});	
	$dialog.dialog('open');
	return false;
}