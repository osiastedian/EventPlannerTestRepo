//@File: ajax_addTodo.js
//@Author: AJC
//@Date: August 17, 2015

$(document).ready(function() {
	
	var responseJSON = null;
	
	getAddToDo();
	
	
	function getAddToDo() {
		$("#AddToDoContainer").empty();
		$.ajax({
			//url: 'url?', // Supply the url? if URL ready. Or just try what happens if you un.comment this line.
			type: 'GET',
			success: function(data, status, jqXHR){
				var htmlFormattedListString = "";
					htmlFormattedListString += "<div class='container'>"+
				    
							        "<form class='form-horizontal'>"+
				
							            "<div class='row col-xs-6' style='margin-left:290px;'>"+
							               " <div class='input-group'>"+
							                  "<span class='input-group-addon' id='sizing-addon2'>"+"<i class='glyphicon glyphicon-dashboard'>"+"</i>"+"</span>"+
							                  "<select class='form-control' placeholder='Action' aria-describedby='sizing-addon2'>"+
							                    "<option>"+"Action"+"</option>"+
							                    "<option>"+"Quantitative"+"</option>"+
							                  "</select>"+
							                "</div>"+
							                "<br>"+
							                "<div class='input-group'>"+
							                  "<span class='input-group-addon' id='sizing-addon2'>"+"<i class='glyphicon glyphicon-list-alt'>"+"</i>"+"</span>"+
							                  "<input type='text' class='form-control' placeholder='Title' aria-describedby='sizing-addon2'>"+
							                "</div>"+
							                "<br>"+
							                "<div class='input-group'>"+
							                  "<span class='input-group-addon' id='sizing-addon2'>"+"<i class='glyphicon glyphicon-screenshot'>"+"</i>"+"</span>"+
							                  "<textarea class='form-control' placeholder='Description' aria-describedby='sizing-addon2'>"+"</textarea>"+
							                "</div>"+
							                "<br>"+
							                "<div class='input-group'>"+
							                  "<span class='input-group-addon' id='sizing-addon2'>"+"<i class='glyphicon glyphicon-dashboard'>"+"</i>"+"</span>"+
							                  "<select class='form-control' placeholder='To' aria-describedby='sizing-addon2'>"+
							                    "<option>"+"Event1"+"</option>"+
							                    "<option>"+"Event2"+"</option>"+
							                    "<option>"+"Event3"+"</option>"+
							                  "</select>"+
							                "</div>"+
							                "<br>"+
							                "<div class='input-group' style='margin-top:10px;'>"+
							                    "<input type='submit' value='Add' class='btn btn-primary form-control' style='background:#F05F40;color:white;border-radius:10px;'>"+
							                "</div>"+
							            "</div>"+
				
							        "</form>"+     
							    
							    "</div>";   				   
    				   
    				   
				//});
				
				if(htmlFormattedListString == "")
				{
					htmlFormattedListString = "<div><h3>That was wierd? (0.o)</h3><br>There is no profile available.</div>";
				}

				$("#AddToDoContainer").html(htmlFormattedListString);
			},
			error: function(jqXHR, status, error) {;
				$("#AddToDoContainer").html("<div><h3>Oops! We're sorry.</h3><br>Something wrong happened, but we will assure we can fix it soon.</div>");
			}
		});
	}
});