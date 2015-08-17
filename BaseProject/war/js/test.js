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
					$('#txtContent').val('');
					retrieveTweetList('Entry saved successfully!');
				} else {
					var msg = "";
					for (var i = 0; i < data.errorList.length; i++)
						msg += data.errorList[i] + "\n";
					$('#errorDisplay').html(msg);
				}
				if(data.errorList.length!=0 || data.errorList != null) {
					
					alert("Added Successfully!");
				} else {
					alert('Unsuccessful.');
				}
			},
			error: function(jqXHR, status, error) {
				
			}
		});
	});
	
});


