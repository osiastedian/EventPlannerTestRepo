/**
 * jsonData = {
				data: JSON.stringify({
				title: TitleTest,
				description: DescriptionTest,
				finish_quantity: 1234;
				total_quantity : 12345,
				id: 123
				})
		};
		
		$.ajax({
			url: '/admin/todo/addTodo',
			type: 'GET',
			data: jsonData,
			dataType: 'json',
			success: function(data, status, jqXHR){
				if(data.errorList.length == 0) {
					alert("Test Sucessful")
				} else {
					alert("Test Unsucessful")
				}
			},
			error: function(jqXHR, status, error) {
				alert("Test Unsucessful");
			}
		});
 * 
 * 
 * 
 */

function testFunction()
{
	
	jsonData = {
			data: JSON.stringify({
			"description":"DescriptionTest",
			"total_quantity":12345,
			"finish_quantity":1234,
			"id":123,
			"title":"TitleTest"})
	};
	alert(jsonData.toString());
	$.ajax({
		url: '/admin/todo/addTodo',
		type: 'POST',
		data: jsonData,
		dataType: 'json',
		success: function(data, status, jqXHR){
			if(data.errorList.length == 0) {
				alert("Test Sucessful")
			} else {
				alert("Test Unsucessful")
			}
		},
		error: function(jqXHR, status, error) {
			alert("Test Unsucessful");
		}
	});
}
