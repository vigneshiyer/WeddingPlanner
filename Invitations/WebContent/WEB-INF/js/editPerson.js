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


function editPersonForPrint(id, page) {
	$dialog = $('<div></div>')
	.load('/ui/invitations/editforprint/'+id+'/'+page)
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