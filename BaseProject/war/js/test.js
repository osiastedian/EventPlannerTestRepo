/**
 * 
 */
$(document).ready(function() {

	$('#test').click(function() {
		jsonData = {
				data: JSON.stringify({
					address: "address test",
					age : 123456,
					email:"asdfgh@gmail",
					name: "Noville"
		            //user.setBirthday(Date.parse(json.getString("date"));
		            //user.setKey(null);
		            //user.setImgSrc(json.getString("imgSrc"));
				})
		};
		alert('Test Add');
		$.ajax({
			url: 'getUser',
			type: 'POST',
			data: jsonData,
			dataType: 'json',
			success: function(data, status, jqXHR){
				if(data.errorList.length == 0) {
					alert(data.name);
				} else {
					alert('Unsuccessful');
				}
			},
			error: function(jqXHR, status, error) {
				
			}
		});
	});
	
});


