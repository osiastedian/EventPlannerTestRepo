//@File: ajax_searchtodo.js
//@Author: Arreglo CAF.
//@Date: August 15, 2015

$(document).ready(function() {
	
	var responseJSON = null;
	getAllTodoList();
	
	function getDummyData() {
		// Modify it... It's Dynamic!
		responseJSON = null;
		
		// Try an Empty Response!
		//responseJSON = {todoList:[]};
	}
	
	function getAllTodoList() {
		$("#TodoListContainer").empty();
		getDummyData();    // Remove the getDummyData function if URL is ready.
		$.ajax({
			url: 'http://localhost:8888/admin/todo/getAllTodos',//url: 'url?', // Supply the url? if URL ready. Or just try what happens if you un.comment this line.
			data: responseJSON,
			type: 'GET',
			success: function(data, status, jqXHR){				
				var htmlFormattedListString = "<table class='table' align='center' style='width:1200px;'>" +
				"<tr><th>Type</th><th>Name</th><th colspan='2'>Description</th></tr>";
				resposeJSON = data;
				$.each(data, function(index, value) {
					htmlFormattedListString += 	"<tr>" +
												"<td>" + value.total_quantity + "</td>" +
												"<td>" + value.title + "</td>" +
												"<td>" + value.description + "</td>" +
												"<td>" + //Need for implementation below...
												"<input type='submit' value='+' class='btn btn-primary form-control' style='background:#F05F40;color:white;width:50px;'>" +
												"</td></tr>"; 
				});	
				
				if(htmlFormattedListString == "<table class='table' align='center' style='width:1200px;'><tr><th>Type</th><th>Name</th><th colspan='2'>Description</th></tr>")
				{
					htmlFormattedListString += "<tr><td colspan='4'><br>There are no available todos right now.<br><br></td></tr><tr><td colspan='4'></td></tr>";
				}
				
				htmlFormattedListString += "</table>";
				
				$("#TodoListContainer").html(htmlFormattedListString);
			},
			error: function(jqXHR, status, error) {;
				$("#TodoListContainer").html("<div align='center'><h3>Oops! We're sorry.</h3><br>Something wrong happened, but we will assure we can fix it soon.</div><br><br><br>");
			}
		});
	}
});