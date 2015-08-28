/**
 * 
 */

var app = angular.module('addTodoApp', []);

app.controller('generateEvents', function($scope, $http) {
      $http.get("http://localhost:50916/admin/event/get")
	    .success(function(response) {
	    	$scope.data = response.events;x
	    	console.log("nisud");
	    });
});