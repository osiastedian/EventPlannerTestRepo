//@File: ajax_profile.js
//@Author: AJC
//@Date: August 17, 2015

$(document).ready(function() {
	
	var responseJSON = null;
	
	getProfile();
	
	function getDummyData() {
		// Modify it... It's Dynamic!
		responseJSON = {person:[
		                       {name: 'James Suson',age: '20',email: 'jvsuson17@gmail.com',	birthday: 'January 17, 1995',address: 'Consolacion'}]
		                           
					   };
		
		// Try an Empty Response!
		//responseJSON = {eventList:[]};
	}
	
	function getProfile() {
		$("#ProfileContainer").empty();
		getDummyData();    // Remove the getDummyData function if URL is ready.
		$.ajax({
			//url: 'url?', // Supply the url? if URL ready. Or just try what happens if you un.comment this line.
			type: 'GET',
			success: function(data, status, jqXHR){
				var htmlFormattedListString = "";
				$.each(responseJSON.person, function(index, value) {
					htmlFormattedListString += "<div class='container text-center form-group'>" +
												"<p>"+
												"</p>"+
												"<p>"+
									            "Name:"+ value.name+
												"</p>"+
												"<p>"+
									           	"Age:"+ value.age+
												"</p>"+
												"<p>"+
									            "E-mail:"+ value.email+
												"</p>"+
												"<p>"+
									            "Birthday:"+value.birthday+
												"</p>"+
												"<p>"+
									            "Address:"+ value.address+
												"</p>"+
												"</div>";
    				   
    				   
    				   ;
				});
				
				if(htmlFormattedListString == "")
				{
					htmlFormattedListString = "<div><h3>That was wierd? (0.o)</h3><br>Profileis not available.</div>";
				}

				$("#ProfileContainer").html(htmlFormattedListString);
			},
			error: function(jqXHR, status, error) {;
				$("#ProfileContainer").html("<div><h3>Oops! We're sorry.</h3><br>Something wrong happened, but we will assure we can fix it soon.</div>");
			}
		});
	}
});