function addPerson() {
	var $dialog = $('<div></div>')
	.load('/ui/invitations/addPersonView')
	.dialog({
		autoOpen: false,
		title: 'Add Person',
		width: 300,
		height: 400,
		modal: true,
	});	
	$dialog.dialog('open');
	return false;
}