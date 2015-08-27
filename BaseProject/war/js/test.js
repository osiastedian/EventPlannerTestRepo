/**
 * 
 */
var app = angular.module('test', []);
app.controller('button', function($scope, $http) {
	$scope.addTodo = function(eventId, todoId ){
		var req = {
			url: "http://localhost:8888/admin/eventTodo/addEventTodo",
			method: "POST",
			params : {
						'data':
						JSON.stringify({
			
								'eventID':eventId,
								'todoID':todoId,	
						})
					}
			}
		$http(req).then(
				function(response){
					alert("Event Updated!");
				},
				function(response){
					alert("Event Update Failed!");
				}
		);
	}
});



