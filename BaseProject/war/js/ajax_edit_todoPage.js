//@File: ajax_searchtodo.js
//@Author: Arreglo CAF.
//@Date: August 15, 2015

$(document).ready(function() {
	
	var responseJSON = null;
	getAllTodoList();
	
	function getDummyData() {
		// Modify it... It's Dynamic!
		responseJSON = {todoList:[
		                           {todoType:"Action", todoName:"Arrange Chairs", todoDescription:"A good party comes with good chairs."},
		                           {todoType:"Action", todoName:"Buy a Cake",  todoDescription:"Nothing is better than a cake."},
		                           {todoType:"Quantitative", todoName:"Buy 13 Kinds of Round Fruits",  todoDescription:"To prosper your new year's life."},
		                           {todoType:"Quantitative", todoName:"Buy 5 Cans of Soda",  todoDescription:"Party with friends is fun with poping sodas."},
		                           {todoType:"Action", todoName:"Setup Wifi Network",  todoDescription:"Everybody loves to share their moments online."}
		                           ]
					   };
		
		// Try an Empty Response!
		//responseJSON = {todoList:[]};
	}
	
	function getAllTodoList() {
		$("#TodoListContainer").empty();
		getDummyData();    // Remove the getDummyData function if URL is ready.
		$.ajax({
			//url: 'url?', // Supply the url? if URL ready. Or just try what happens if you un.comment this line.
			url: 'http://localhost:8888/admin/todo/getAllTodos',//MODIFIED
			data: responseJSON,//MODIFIED
			type: 'GET',
			success: function(data, status, jqXHR){				
				var htmlFormattedListString = "<table class='table' align='center' style='width:1200px;'>" +
				"<tr><th>Quantity</th><th>Name</th><th>Description</th></tr>";
				$.each(data, function(index, value) {// MODIFIED
					htmlFormattedListString += 	"<tr>" +
												"<td>" + value.total_quantity + "</td>" + 	// MODIFIED
												"<td>" + value.title + "</td>" +  			//MODIFIED
												"<td>" + value.description + "</td></tr>"; 	//MODIFIED
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