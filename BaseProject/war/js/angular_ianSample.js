/**
 * 
 */

var app = angular.module('addTodoApp', []);

app.controller('generateEvents', function($scope, $http) {
      $http.get("http://localhost:50013/admin/event/get")
	    .success(function(response) {
	    	$scope.data = response.events;
	    	console.log("nisud");
	    });
});