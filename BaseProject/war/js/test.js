/**
 * 
 */

$(document).ready(function() {

	$('#test').click(function() {
		jsonData = {
				data: JSON.stringify({
					"description":"DescriptionTest",
					"finished_quantity":1234,
					"id":0,
					"key":"aglub19hcHBfaWRyGAsSCVRvZG9Nb2RlbCIJVGl0bGVUZXN0DA",
					"title":"TitleTest",
					"total_quantity":12345,
					"version":1
				})
		};
		alert('Test Remove');
		$.ajax({
			url: 'addTodo',
			type: 'POST',
			data: jsonData,
			dataType: 'json',
			success: function(data, status, jqXHR){
				if(data.errorList.length == 0) {
					alert('Successful');
				} else {
					alert('Unsuccessful');
				}
			},
			error: function(jqXHR, status, error) {
				
			}
		});
	});
	
});
