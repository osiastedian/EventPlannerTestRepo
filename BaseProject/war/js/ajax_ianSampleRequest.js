/**
 * Sample Request to Server
 * Author: Ian Osias
 */

$(document).ready(function() {
	$('#submitButton').click(function() {
		var title_html = $("#title").val();
		var description_html = $("#description").val();
		var totalQuantity_html = $("#quantity").val();
		var jsonData = {
				data: JSON.stringify({
					title : title_html, 
					description: description_html,
					total_quantity: totalQuantity_html
				})
		};
		alert('Adding your todo... Please wait...');
		$.ajax({
			url: '/admin/todo/addTodo',
			type: 'POST',
			data: jsonData,
			dataType: 'json',
			success: function(data, status, jqXHR){
				if(data.errorList.length == 0) {
					alert("Added Successfully!");
				} else {
					var msg = "";
					for (var i = 0; i < data.errorList.length; i++)
						msg += data.errorList[i] + "\n";
					// Place ErrorMessage Code here    before - > $('#errorDisplay').html(msg);
				}
			},
			error: function(jqXHR, status, error) {
				
			}
		});
	});
});



