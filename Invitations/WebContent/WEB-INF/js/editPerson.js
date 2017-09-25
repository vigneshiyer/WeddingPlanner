var $dialog;
function editPerson(id) {
	$dialog = $('<div></div>')
	.load('/ui/invitations/edit/'+id)
	.dialog({
		autoOpen: false,
		title: 'Edit Person',
		width: 500,
		height: 500,
		modal: true,
	});	
	$dialog.dialog('open');
	return false;
}