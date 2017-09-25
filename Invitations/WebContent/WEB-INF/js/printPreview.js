function next() {
	var page = $("#page").text();
	btnState("#btnPrev", false);
	page = parseInt(page) + 1;
	$.ajax({
		url: '/ui/invitations/previewpage/'+page,
		success: function(data) {
			btnState("#btnNext", false);
			$("#previewContent").html(data);
			$("#page").text(page);
		},
		error: function(data) {
			btnState("#btnNext", true);
		}
	});	
	$("#page").val(page);
}

function prev() {
	var page = $("#page").val();
	page = parseInt(page) - 1;	
	if (page < 1) {
		btnState("#btnPrev", true);
		return true;
	}	
	btnState("#btnNext", false);
	$.ajax({
		url: '/ui/invitations/previewpage/'+page,
		success: function(data) {
			btnState("#btnPrev", false);
			$("#previewContent").html(data);
			$("#page").text(page);
		},
		error: function(data) {
			btnState("#btnPrev", true);
		}
	});	
	$("#page").val(page);
}

function btnState(btn, bool) {
	if (bool) {
		$(btn).addClass("disabled");
		$(btn).removeClass("btn-info");
		$(btn).prop("disabled", true);
	} else {
		$(btn).removeClass("disabled");
		$(btn).addClass("btn-info");
		$(btn).prop("disabled", false);
	}
}